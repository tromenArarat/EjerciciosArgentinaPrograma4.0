/*
https://www.youtube.com/watch?v=VLElmkz7eHA
*/
const ul = document.getElementById("lista");
const boton = document.getElementById("btn");
const reset = document.getElementById("btnRst");
const perCap = document.getElementById("btnPerCap");

const inputPag = document.getElementById("123");

async function getAllCharacters(pageNumber) {
    let response = await fetch(`https://rickandmortyapi.com/api/character?page=${pageNumber}`);
    let { results } = await response.json();
    return results;
}

function agregar(nombre) {
    let li = document.createElement("li");
    li.innerHTML = nombre;
    ul.appendChild(li); 
}
reset.onclick = () => ul.innerHTML = '';

perCap.onclick = async function () {
    try {
        let numPag = inputPag.value; 
        let results = await getAllCharacters(numPag);

        ul.innerHTML = '';

        results.forEach(e => {
            let caps = [];
            caps = e.episode;
            if(caps.length>2){
                agregar(`${e.name}: aparece en ${caps.length} episodios`);
            }
            
        });
    } catch (error) {
        console.error("Error fetching characters:", error);
    }
}

boton.onclick = async function () {
    try {
        let numPag = inputPag.value; 
        let results = await getAllCharacters(numPag);

        ul.innerHTML = ''; // Clear the existing list before adding new characters

        results.forEach(e => {
            agregar(e.name);
        });
    } catch (error) {
        console.error("Error fetching characters:", error);
    }
};