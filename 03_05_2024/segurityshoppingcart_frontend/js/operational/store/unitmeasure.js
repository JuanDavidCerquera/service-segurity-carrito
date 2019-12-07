
function loadData() {
    console.log("ejecutando loadData");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/unitmeasure",
        method: "GET",
        dataType: "json",
        success: function (response) {
            console.log(response.data);
            var html = "";
            var data = response.data;
            data.forEach(function (item) {
                html +=
                    `<tr>
                    <td>` + item.name + `</td>
                    <td>` + item.code + `</td>
                    <td><button class='edit' data-id='${item.id}'>Edit</button>
                        <button class='delete' onclick="deleteById(${item.id})" >Delete</button></td>
                    </tr>`;
            });

            $("#resultData").html(html);
            // Agregar evento de clic para el botón de editar
            $(".edit").click(function () {
                var itemId = $(this).data("id");
                // Aquí debes implementar la lógica para llenar el formulario del modal con los detalles de la persona seleccionada usando el ID
                // También debes abrir el modal
                // Te mostraré cómo abrir el modal, pero la lógica para llenar el formulario depende de cómo esté implementado tu backend
                findById(itemId);
                $("#id").val(itemId);
                $("#modalbutton").text("update");
                $("#modalbutton").attr("onclick", "update()");
                $("#modal").show();
            });
            // boton agregar
            $("#openModalBtn").click(function () {
                $("#modalbutton").text("save");
                $("#modalbutton").attr("onclick", "save()");
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
        url: "http://localhost:9000/service-segurity-carrito/v1/api/unitmeasure/" + id,
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
        url: "http://localhost:9000/service-segurity-carrito/v1/api/unitmeasure/" + id,
        method: "GET",
        dataType: "json",
        success: function (response) {
            var data = response.data;
            $("#name").val(data.name);
            $("#code").val(data.code);

        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

function clearData() {
    $(".inputs-modal input").val("");
}


function save() {
    try {


        var Data = {
            "name": $("#name").val(),
            "code": $("#code").val(),

            "state": true
        };

        var jsonData = JSON.stringify(Data);

        $.ajax({
            url: "http://localhost:9000/service-segurity-carrito/v1/api/unitmeasure",
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
                $("#modal").hide();
            },
            error: function (error) {
                alert("Error: No se pudo agregar el registro. Por favor, inténtelo nuevamente.");
                loadData();
                $("#modal").hide();
            },
        });
    } catch (error) {
        console.error("Error obteniendo el modulo:", error);
    }
}

function update() {

    var Data = {
        "name": $("#name").val(),
        "code": $("#code").val(),

        "state": true
    };

    var id = $("#id").val();
    var jsonData = JSON.stringify(Data);

    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/unitmeasure/" + id,
        method: "PUT",
        contentType: "application/json",
        data: jsonData,
        success: function (response) {
            alert("Registro actualizado con éxito: " + response.id);
            clearData();
            loadData();
            $("#modal").hide();
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.error("Error en la solicitud AJAX:", textStatus, errorThrown);
            alert("Error: No se pudo actualizar el registro. Por favor, intente nuevamente.");

            clearData();
            $("#modal").hide();
        }
    });
}