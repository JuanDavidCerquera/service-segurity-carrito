function loadView() {
    setTimeout(() => {


        const id = localStorage.getItem("user_id")
        console.log("Ejecutando loadData");
        $.ajax({
            url: "http://localhost:9000/service-segurity-carrito/v1/api/user/view/" + id,
            method: "GET",
            dataType: "json",
            success: function (response) {
                console.log(response.data);
                var html = "";

                var data = response.data;
                data.forEach(function (item) {
                    html = `<li class="navbar-view"><a href="#" onclick="changeFrame('${item.route}')">${item.viewName}</a></li>`;
                    var module = "#" + item.moduleName;
                    $(module).append(html);
                });
            },
            error: function (error) {
                // Función que se ejecuta si hay un error en la solicitud
                console.error("Error en la solicitud:", error);
            },
        });
    }, 100);
}
function loadmodule() {
    const id = localStorage.getItem("user_id")
    console.log("Ejecutando loadData");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/user/module/" + id,
        method: "GET",
        dataType: "json",
        success: function (response) {
            console.log(response.data);
            var html = "";
            var data = response.data;
            data.forEach(function (item) {
                html += `<ul class="navbar-module" id="${item.moduleName}" >${item.moduleName}</ul>`;

            });

            $("#navbarSupportedContent").html(html);
            console.log(html);
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

// Función para cargar contenido en el iframe
function changeFrame(page) {
    document.getElementById("contentFrame").src = page;
}

function exist() {
    localStorage.clear("user_id");
    console.log("borrado el user");
    window.location.href = "security/login.html";

}