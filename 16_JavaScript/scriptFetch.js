const ul = document.getElementById("lista");
const boton = document.getElementById("btn");

async function buscarEquipos(){
    let response = await fetch("");
    let { equipos } = await response.json();
    return equipos;
}