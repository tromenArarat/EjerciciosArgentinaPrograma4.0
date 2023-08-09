/*
Escribir un programa de JavaScript que al clickear 
un botón muestre un mensaje a elección.
*/

var boton = document.getElementById("btn");
boton.innerHTML = "Pulse";

function mostrarMensaje(){
    document.getElementById("parr").innerHTML = "Mensaje a elección";
}

