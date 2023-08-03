/*
Escriba un programa en el cual se ingrese 
un valor límite positivo(VLP) y, a 
continuación, solicite números al usuario 
hasta que la suma de los números 
introducidos supere 
el límite inicial.
*/

// Traigo los elementos que voy a modificar
const boton = document.getElementById("b1");
const numField = document.getElementById("numField");
const label = document.getElementById("lb");
const numSum = document.getElementById("numSum");
boton.onclick = llamada;
var suma = 0;

// Generación de un número random para simular el VLP
function llamada() {
    let min = 10;
    let max = 100;
    let VLP = Math.floor(Math.random() * (max - min + 1)) + min;
    numField.setAttribute("value", VLP);
    boton.innerHTML = `JUEGUE`;
    boton.disabled = true;
};

// Función para manejar la suma de los números ingresados
function onEnterKeyPressed() {
    const inputValue = parseInt(numSum.value);
    suma = suma + inputValue;
    numSum.value = "";
    label.innerHTML = `Ingrese otro número`;
    if (suma > parseInt(numField.value)) {
        label.innerHTML = `La suma supera el límite`;
        numSum.remove();

    }
}

// Agregar el evento al campo de entrada para detectar la tecla Enter
numSum.addEventListener('keydown', handleEnterKey);

function handleEnterKey(event) {
    if (event.key === 'Enter') {
        onEnterKeyPressed();
    }
}



// Hacer un append img al final con un tipito haciendo pulgar arriba






// const textInput = document.getElementById('numSum');

// function onEnterKeyPressed() {
//   const inputValue = textInput.value;
//   console.log('Enter key pressed. Input value:', inputValue);
// }

// function handleEnterKey(event) {
//   if (event.key === 'Enter') {
//     onEnterKeyPressed();
//   };
