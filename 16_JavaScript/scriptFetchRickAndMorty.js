/*
https://www.youtube.com/watch?v=VLElmkz7eHA
*/

const ul = document.getElementById("lista");
const boton = document.getElementById("btn");

async function getAllCharacters(){
    let response = await fetch("https://rickandmortyapi.com/api/character");
    let {results} = await response.json();
    return results;
}   

function agregar(nombre){
    let li  = document.createElement("li");
    li.innerHTML = nombre;
    ul.append(li);
}

boton.onclick = async function () {
    let results = getAllCharacters;

    results.forEach(e => {
        agregar(e.name);
    });
}
