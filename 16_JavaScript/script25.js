/*
Escriba una función de JavaScript para obtener los valores 
de Nombre y Apellido del siguiente formulario.
*/
  var nom = document.getElementById("nombre").value;
  var ape = document.getElementById("apellido").value;
  var boton = document.getElementById("boton");
  boton.onclick = getFormValores;
  

function getFormValores(){
    var titulo = document.createElement("h3");
    titulo.innerHTML = `${nom} ${ape}`;
    document.body.appendChild(titulo)  
    boton.disabled = true;
}
