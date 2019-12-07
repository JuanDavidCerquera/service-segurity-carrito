function save() {
    try {
        var selectedCityId = parseInt($("#municipality_id").val());
        if (isNaN(selectedCityId) || selectedCityId === null) {
            console.error("ID de municipio no válido");
            return;
        }

        var personData = {
            "person": {
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
            },
            "username": $("#Username").val(),
            "password": $("#Password").val()
        };
        var jsonData = JSON.stringify(personData);

        $.ajax({
            url: "http://localhost:9000/service-segurity-carrito/v1/api/user/userPerson",
            method: "POST",
            dataType: "json",
            contentType: "application/json",
            data: jsonData,
            success: function (data) {
                var id = data.id;
                console.log(data.data);
                alert("Registro agregado con éxito: " + id);
                clearData();
                window.location.href = "./login.html";
            },
            error: function (error) {
                alert("Error: No se pudo agregar el registro. Por favor, inténtelo nuevamente.");
            },
        });
    } catch (error) {
        console.error("Error obteniendo el cliente:", error);
    }
}
function clearData() {
    $("#inputs input").val("");
    $(".address-container input").val("");
}
