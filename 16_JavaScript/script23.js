/*
Resalte todas las palabras de más de 8 caracteres 
en el texto del párrafo (con un fondo
amarillo, por ejemplo)
*/

var cadena = document.querySelector("p").innerHTML;


var vector = cadena.split(" ");

for (let i = 0; i < vector.length; i++) {
    if (vector[i].length > 8) {
        vector[i] = `<span class="resaltado">${vector[i]}</span>`;
    }
}

var cadenaNueva = vector.join(" ");

document.querySelector("p").innerHTML = cadenaNueva;