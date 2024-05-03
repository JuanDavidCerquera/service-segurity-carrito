
function loadData() {
    console.log("ejecutando loadData");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/person",
        method: "GET",
        dataType: "json",
        success: function (response) {
            console.log(response.data);
            var html = "";
            var data = response.data;
            data.forEach(function (item) {
                // Construir el HTML para cada objeto
                // if (!item.deletedAt) { // Verificar si el campo deletedAt es nulo (no eliminado lógicamente)
                html +=
                    `<tr>
                    <td>${item.firstName}</td>
                    <td>` + item.lastName + `</td>
                    <td>` + item.typeDocument + `</td>
                    <td>` + item.document + `</td>
                    <td>` + item.email + `</td>
                    <td>` + item.phone + `</td>
                    <td>` + item.dateBirth + `</td>
                    <td>` + item.gender + `</td>
                    <td>` + item.address + `</td>
                    <td>` + item.municipality.name + `</td>
                    <td>` + (item.state == true ? "Activo" : "Inactivo") + `</td>
                    <td><button class='edit' data-id='${item.id}'>Edit</button>
                        <button class='delete' onclick="deleteById(${item.id})" >Delete</button></td>
                    </tr>`;

                // };
            });

            $("#resultData").html(html);
            // Agregar evento de clic para el botón de editar
            $(".edit").click(function () {
                var personId = $(this).data("id");
                // Aquí debes implementar la lógica para llenar el formulario del modal con los detalles de la persona seleccionada usando el ID
                // También debes abrir el modal
                // Te mostraré cómo abrir el modal, pero la lógica para llenar el formulario depende de cómo esté implementado tu backend
                findById(personId);
                $("#id").val(personId);
                $("#modalbutton").text("update");
                $("#modalbutton").attr("onclick", "update()");
                $("#modal").show();
            });
            // boton agregar
            $("#openModalBtn").click(function () {
                $("#modalbutton").text("save");
                $("#modalbutton").attr("onclick", "savesas()");
                $("#modal").show();
            });

            //boton cerrar
            $(".close").click(function () {
                clearData();
                $("#modal").hide();
            });
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}


function deleteById(id) {
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/person/" + id,
        method: "delete",
        headers: {
            "Content-Type": "application/json",
        },
    }).done(function (result) {
        alert("Registro eliminado con éxito");
        loadData();
    });
}



function findById(id) {
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/person/" + id,
        method: "GET",
        dataType: "json",
        success: function (response) {
            var data = response.data;
            //separar address como corresponde
            var frase = data.address;
            var palabras = frase.split(" ");
            console.log(palabras);
            $("#firstname").val(data.firstName);
            $("#lastname").val(data.lastName);
            $("#email").val(data.email);
            $("#phone").val(data.phone);
            $("#document").val(data.document);
            $("#TypeDocument").val(data.typeDocument);
            $("#municipality").val(data.municipality.name);
            $("#municipality_id").val(data.municipality.id);
            $("#datebirth").val(data.dateBirth);
            $("#gender").val(data.gender);
            $("#Address").val(palabras[0]);
            $("#numeral1").val(palabras[2]);
            $("#numeral2").val(palabras[4]);
            $("#numeral3").val(palabras[6]);
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}




function loadmunicipality() {
    console.log("Ejecutando loadmunicipality");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/municipality",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var cities = response.data.map(function (municipality) {
                    return {
                        label: municipality.name,
                        value: municipality.id // Agrega el ID como valor
                    };
                });

                // Inicializar el autocompletado en el campo de entrada de texto
                $("#municipality").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(cities, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#municipality_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#municipality").val(ui.item.label);
                        console.log("ID de ciudad seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de ciudades.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}






function clearData() {
    $("#firstname").val("");
    $("#lastname").val("");
    $("#email").val("");
    $("#phone").val("");
    $("#document").val("");
    $("#municipality_id").val("");
    $("#datebirth").val("");
    $("#gender").val("");
    $(".address-container input").val(""); // Limpia los campos de dirección
    $("#Address").val(""); // Limpia el campo de dirección
    $("#TypeDocument").val(""); // Limpia el campo de tipo de documento
}


function save() {
    try {
        var selectedCityId = parseInt($("#municipality_id").val());
        if (isNaN(selectedCityId) || selectedCityId === null) {
            console.error("ID de municipio no válido");
            return;
        }

        var personData = {
            "firstName": $("#firstname").val(),
            "lastName": $("#lastname").val(),
            "typeDocument": $("#TypeDocument").val(),
            "document": $("#document").val(),
            "email": $("#email").val(),
            "phone": $("#phone").val(),
            "dateOfBirth": $("#datebirth").val(),
            "gender": $("#gender").val(),
            "address": $("#Address").val() + ' No ' + $("#numeral1").val() + ' - ' + $("#numeral2").val() + ' - ' + $("#numeral3").val(),
            "municipality": {
                "id": selectedCityId
            },
            "state": true
        };

        var jsonData = JSON.stringify(personData);

        $.ajax({
            url: "http://localhost:9000/service-segurity-carrito/v1/api/person",
            method: "POST",
            dataType: "json",
            contentType: "application/json",
            data: jsonData,
            success: function (data) {
                var id = data.id;
                console.log(data.data);

                alert("Registro agregado con éxito: " + id);
                clearData();
                loadData();
            },
            error: function (error) {
                alert("Error: No se pudo agregar el registro. Por favor, inténtelo nuevamente.");
            },
        });
    } catch (error) {
        console.error("Error obteniendo el cliente:", error);
    }
}

function update() {
    var selectedCityId = parseInt($("#municipality_id").val());
    if (isNaN(selectedCityId) || selectedCityId === null) {
        console.error("ID de municipio no válido");
        console.log(selectedCityId);
        return;
    }
    console.log(selectedCityId);

    var personData = {
        "firstName": $("#firstname").val(),
        "lastName": $("#lastname").val(),
        "typeDocument": $("#TypeDocument").val(),
        "document": $("#document").val(),
        "email": $("#email").val(),
        "phone": $("#phone").val(),
        "dateBirth": $("#datebirth").val(),
        "gender": $("#gender").val(),
        "address": $("#Address").val() + ' No ' + $("#numeral1").val() + ' - ' + $("#numeral2").val() + ' - ' + $("#numeral3").val(),
        "municipality": {
            "id": selectedCityId
        },
        "state": true
    };

    var id = $("#id").val();
    var jsonData = JSON.stringify(personData);

    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/person/" + id,
        method: "PUT",
        contentType: "application/json",
        data: jsonData,
        success: function (response) {
            alert("Registro actualizado con éxito: " + response.id);
            clearData();
            loadData();
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.error("Error en la solicitud AJAX:", textStatus, errorThrown);
            alert("Error: No se pudo actualizar el registro. Por favor, intente nuevamente.");

            loadData();
            clearData();
        }
    });
}