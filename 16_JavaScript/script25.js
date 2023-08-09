/*
Escriba una función de JavaScript para obtener los valores de Nombre y Apellido del
siguiente formulario.
*/

var boton = document.getElementById("btn");
var radio = document.getElementById("rdo");

function mostrar(){
    boton.innerHTML = `Listo`;
    boton.disabled = true;
    const img = document.getElementById("img");
    img.src = "https://e7.pngegg.com/pngimages/878/945/png-clipart-thumb-signal-computer-icons-emoticon-thumbs-up-miscellaneous-hand.png";
    img.alt = "Pulgar Arriba";
    img.width = 150;
    img.height = 100;
    document.body.appendChild(img);
};
boton.onclick = mostrar;
