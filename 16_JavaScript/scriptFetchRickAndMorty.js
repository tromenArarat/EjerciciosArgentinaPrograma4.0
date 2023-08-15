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

function agregar(nombre,imgSrc) {
    let li = document.createElement("li");
    li.innerHTML = nombre;
    let img = document.createElement("img");
    img.setAttribute("src", imgSrc);
    img.setAttribute("alt", "Character Image");
    li.appendChild(img);
    ul.appendChild(li); 
}

function agregarNombre(nombre) {
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

        // Function to fetch episode details by URL
        async function getEpisodeDetails(episodeURL) {
            let response = await fetch(episodeURL);
            let episodeData = await response.json();
            return episodeData;
        }

        results.forEach(async e => {
            let caps = e.episode;
            if (caps.length > 2) {
                let episodeDetails = [];
                for (let i = 0; i < caps.length; i++) {
                    let episodeData = await getEpisodeDetails(caps[i]);
                    episodeDetails.push(episodeData);
                }

                let episodeNames = episodeDetails.map(episode => episode.name).join(", ");
                
                agregar(`${e.name} aparece en ${caps.length} episodios: ${episodeNames}`, e.image);
            }
        });
    } catch (error) {
        console.error("Error fetching characters:", error);
    }
}

// perCap.onclick = async function () {
//     try {
//         let numPag = inputPag.value; 
//         let results = await getAllCharacters(numPag);

//         ul.innerHTML = '';

//         results.forEach(e => {
//             let caps = [];
//             caps = e.episode;
//             if(caps.length>2){
//                 agregar(`${e.name} aparece en ${caps.length} episodios:
//                 ${caps[0].name}, ${caps[1].name}, etc.`,e.image);
//             }
            
//         });
//     } catch (error) {
//         console.error("Error fetching characters:", error);
//     }
// }

boton.onclick = async function () {
    try {
        let numPag = inputPag.value; 
        let results = await getAllCharacters(numPag);

        ul.innerHTML = ''; // Clear the existing list before adding new characters

        results.forEach(e => {
            agregarNombre(e.name);
        });
    } catch (error) {
        console.error("Error fetching characters:", error);
    }
};