
function loadmunicipality() {
    console.log("Ejecutando loadmunicipality");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/municipality",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.name,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#municipality").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
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
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

function loadperson() {
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/person",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.firstName,
                        value: item.id,
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#person").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#person_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#person").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}


function loadmodule() {
    console.log("Ejecutando loadmodule");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/module",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.name,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#module").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#module_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#module").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

function loadcontinent() {
    console.log("Ejecutando loadcontinent");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/continent",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.name,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#continent").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#continent_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#continent").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

function loadcountry() {
    console.log("Ejecutando loadcountry");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/country",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.name,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#country").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#country_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#country").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

function loadstatus() {
    console.log("Ejecutando loadstatus");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/status",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.name,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#status").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#status_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#status").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

function loadlocation() {
    console.log("Ejecutando loadlocation");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/location",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.name,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#location").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#location_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#location").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

function loadclient() {
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/Client",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.person.firstName,
                        value: item.id,
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#client").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#client_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la clienta seleccionada
                        $("#client").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

function loademployed() {
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/employed",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.person.firstName,
                        value: item.id,
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#employed").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#employed_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la employeda seleccionada
                        $("#employed").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

function loadproduct() {
    console.log("Ejecutando loadproduct");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/product",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
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
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#product_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#product").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

function loadsupplies() {
    console.log("Ejecutando loadsupplies");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/supplies",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.name,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#supplies").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#supplies_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#supplies").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

function loadunitmeasure() {
    console.log("Ejecutando loadunitmeasure");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/unitmeasure",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.name,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#unitmeasure").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#unitmeasure_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#unitmeasure").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

function loadstore() {
    console.log("Ejecutando loadstore");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/store",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.name,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#store").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#store_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#store").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}

function loadbook() {
    console.log("Ejecutando loadbook");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/book",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    console.log(item.title);
                    return {
                        label: item.title,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#book").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#book_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#book").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}
function loadview() {
    console.log("Ejecutando loadview");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/view",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.name,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#view").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#view_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#view").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}
function loadrole() {
    console.log("Ejecutando loadrole");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/role",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.name,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#role").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#role_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#role").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}
function loaduser() {
    console.log("Ejecutando loaduser");
    $.ajax({
        url: "http://localhost:9000/service-segurity-carrito/v1/api/user",
        method: "GET",
        dataType: "json",
        success: function (response) {
            if (response.status && Array.isArray(response.data)) {
                var data = response.data.map(function (item) {
                    return {
                        label: item.username,
                        value: item.id
                    };
                });
                // Inicializar el autocompletado en el campo de entrada de texto
                $("#user").autocomplete({
                    source: function (request, response) {
                        var results = $.ui.autocomplete.filter(data, request.term);
                        if (!results.length) {
                            results = [{ label: 'No se encontraron resultados', value: null }];
                        }
                        response(results);
                    },
                    select: function (event, ui) {
                        // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
                        $("#user_id").val(ui.item.value);
                        // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
                        $("#user").val(ui.item.label);
                        console.log("ID de autocomplete seleccionada: " + ui.item.value);
                        return false; // Evita la propagación del evento y el formulario de envío
                    }
                });
            } else {
                console.error("Error: No se pudo obtener la lista de autocompletees.");
            }
        },
        error: function (error) {
            // Función que se ejecuta si hay un error en la solicitud
            console.error("Error en la solicitud:", error);
        },
    });
}
