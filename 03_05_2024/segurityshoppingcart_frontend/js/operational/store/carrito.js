
function loadproductbill() {
    console.log("Ejecutando loadproduct");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/product",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        price: item.price,
                        label: item.name,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#product").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        $("#price").val(ui.item.price)
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        if (ui.item.value != 'No se encontraron resultados') {
                            $("#product_id").val(ui.item.value);
                        }
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#product").val(ui.item.label);
                        console.log("ID de ciudad seleccionada: " + ui.item.value);

                        console.log("Precio del producto seleccionado: " + ui.item.price);
                        //actualizar precio
                        var subtotal = $("#price").val() * $("#amount").val();
                        $("#pricesubtotal").val(subtotal);
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
//actualizar precio
$("#amount").on("input", function () {
    var subtotal = $("#price").val() * $(this).val();
    $("#pricesubtotal").val(subtotal);
});



// boton agregar
$("#openModalBtn").click(function () {
    $("#modal").show();
});
//boton cerrar
$("#closemodal").click(function () {
    $("#modal").hide();
    clearData();
});

$("#modalbuttonBill").click(function () {
    $("#modalbill").show();
    $("#modal").hide();
});

$("#closemodalbill").click(function () {
    $("#modalbill").hide();
    clearData();
});

function clearData() {
    $(".inputs-modal input").val("")
}

var details = [];

function listproduct() {
    try {

        // Obtener los valores de los campos
        var productId = $("#product_id").val();
        var amount = $("#amount").val();
        var price = $("#pricesubtotal").val();

        // Verificar si algún campo está vacío
        if (!productId || !amount || !price) {
            throw new Error("Todos los campos deben ser completados");
        }
        if (amount <= 0) {
            throw new Error("la cantidad debe ser mayor a cero");
        }

        var productData = {
            "product": {
                "id": $("#product_id").val()
            },
            "amount": $("#amount").val(),
            "price": $("#pricesubtotal").val(),

        }

        details.push(productData); // Agregar productData al array details
        console.log(details);
        clearData();
        alert("producto añadido al carrito");
    } catch (error) {
        alert("no se pudo añadir producto: " + error.message);
    }
}

function saveDetailsBill(billid) {
    try {
        details.forEach(function (product, index) {
            var data = {
                "product": {
                    "id": product.product.id,
                },
                "bill": {
                    "id": billid
                },
                "amount": product.amount,
                "price": product.price,
                "state": true
            };

            var jsonData = JSON.stringify(data);

            $.ajax({
                url: "http://localhost:9000/service-segurity-carrito/v1/api/billdetails",
                method: "POST",
                dataType: "json",
                contentType: "application/json",
                data: jsonData,
                success: function (data) {

                    console.log("Producto guardado exitosamente:", data);
                    alert("Producto guardado exitosamente");
                    saveprice(billid);
                },
                error: function (error) {
                    console.error("Error al guardar el producto:", error);
                    alert("Error al guardar el producto. Por favor, inténtelo nuevamente.");
                },
            });
        });
        details = [];
    } catch (error) {
        console.error("Error obteniendo el modulo:", error);
        alert("Error obteniendo el módulo. Por favor, inténtelo nuevamente.");
    }
}




function savebill() {
    try {
        var Data = {
            "date": $("#date").val(),
            "price": 0,
            "client": { "id": $("#client_id").val() },
            "employed": { "id": $("#employed_id").val() },
            "state": true
        };
        var jsonData = JSON.stringify(Data);
        $.ajax({
            url: "http://localhost:9000/service-segurity-carrito/v1/api/bill",
            method: "POST",
            dataType: "json",
            contentType: "application/json",
            data: jsonData,
            success: function (response) {
                var data = response.data;
                const id = data.id;
                console.log(id);
                alert("Registro agregado con éxito: " + id);
                clearData();
                saveDetailsBill(id)
                $("#modal").hide();
                $("#modalbill").hide();
            },
            error: function (error) {
                alert("Error: No se pudo agregar el registro. Por favor, inténtelo nuevamente.");
                $("#modal").hide();
                $("#modalbill").hide();
            },
        });
    } catch (error) {
        console.error("Error obteniendo el modulo:", error);
    }
}


function saveprice(id) {
    console.log(id);
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/billdetails/price/" + id,
        method: "PUT",
        dataType: "json",
    })
}
