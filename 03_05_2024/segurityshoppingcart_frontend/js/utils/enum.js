function TypeDocument() {
    const Selectid = $('#TypeDocument'); //toma el id
    $.ajax({
        url: 'http://localhost:9000/service-segurity-carrito/v1/api/enum/TypeDocument',
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            //recorre la lista "data"
            $.each(data, function (index, value) {//no quitar el index
                const optionElement = $('<option></option>').attr('value', value).text(value);
                Selectid.append(optionElement);//me llena el Select que llame por el id con los datos de la lista
            });
        },
        error: function (errorThrown) {
            console.error('Error al obtener datos desde el endpoint:', errorThrown);
        }
    });
}

//lo mismo pero con dias. es necesario cambiar el id y la url
function Days() {
    const Selectid = $('#Days');
    $.ajax({
        url: 'http://localhost:9000/service-segurity-carrito/v1/api/enum/Days',
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            $.each(data, function (index, value) {
                //forma abreviada
                Selectid.append($('<option></option>').attr('value', value).text(value));
            });
        },
        error: function (errorThrown) {
            console.error('Error al obtener datos desde el endpoint:', errorThrown);
        }
    });
}

function Months() {
    const Selectid = $('#Months');
    $.ajax({
        url: 'http://localhost:9000/service-segurity-carrito/v1/api/enum/Months',
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            $.each(data, function (index, value) {
                Selectid.append($('<option></option>').attr('value', value).text(value));
            });
        },
        error: function (errorThrown) {
            console.error('Error al obtener datos desde el endpoint:', errorThrown);
        }
    });
}


function Address() {
    const Selectid = $('#Address');
    $.ajax({
        url: 'http://localhost:9000/service-segurity-carrito/v1/api/enum/Address',
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            $.each(data, function (index, value) {
                Selectid.append($('<option></option>').attr('value', value).text(value));
            });
        },
        error: function (errorThrown) {
            console.error('Error al obtener datos desde el endpoint:', errorThrown);
        }
    });
}