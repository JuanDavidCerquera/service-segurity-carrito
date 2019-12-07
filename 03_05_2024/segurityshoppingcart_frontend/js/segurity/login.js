function loadData() {
    username = $("#Username").val();
    password = $("#Password").val();
    console.log("ejecutando loadData");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/user/login/" + username + "/" + password,
        method: "GET",
        dataType: "json",
        success: function (response) {
            console.log(response.data);
            var data = response.data;
            var userId = data.id;
            console.log("user: ", data.id);
            localStorage.setItem("user_id", userId)
            console.log(localStorage.getItem("user_id"));
            window.location.href = "../navbar.html";
            $("#Username").val("");
            $("#Password").val("");
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            alert("las credenciales no son correctas");
            console.error("Error en la solicitud:", error);
        },
    });
}


