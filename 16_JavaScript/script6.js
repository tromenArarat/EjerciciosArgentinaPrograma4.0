var min = 0;
var max = 10;
function getRandomNumber(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

var mensaje = " ";
var numAzar = 0;
function numRandom() {
    numAzar = getRandomNumber(min, max);
    document.getElementById("numRandom").setAttribute("value", numAzar);
}

document.getElementById("comprob").onclick = parOimpar;

console.log(`Valor ingresado: ${numAzar}`);

function parOimpar() {

    if ((parseInt(numAzar)) == 0) {
        mensaje = "el número no es par ni impar";
    } else if ((parseInt(numAzar)) % 2 != 0) {
        mensaje = "el número es impar";
    } else if ((parseInt(numAzar)) % 2 == 0) {
        mensaje = "el número es par";
    }

    window.alert(mensaje);
}




