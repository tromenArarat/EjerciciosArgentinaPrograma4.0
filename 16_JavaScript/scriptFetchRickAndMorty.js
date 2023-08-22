const url = 'https://api-football-beta.p.rapidapi.com/fixtures?date=2023-08-20';
const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': '76460cea6emsha88cb53df3d75e8p13bc1ajsn5c6bdccdbd94',
		'X-RapidAPI-Host': 'api-football-beta.p.rapidapi.com'
	}
};

async function fetchear(){
        let response = await fetch(url,options);
        let data = await response.json();
        return data;
}
const ul = document.getElementById("lista");
async function imprimir(){
    const resultados = await fetchear();
    // console.log(resultados.response[0].teams.away);
    let img = document.createElement("img");
    img.setAttribute("src", resultados.response[0].league.logo);
    img.setAttribute("alt", "Character Image");
    let li = document.createElement("li");
    li.appendChild(img);
    ul.appendChild(li); 
}

imprimir();
/*

https://www.youtube.com/watch?v=VLElmkz7eHA


// Llamada a los elementos del html
const inputPag = document.getElementById("pagNum");
const boton = document.getElementById("btnMstr");
const reset = document.getElementById("btnRst");
const perCap = document.getElementById("btnPerCap");
const perUni = document.getElementById("btnPerUni");

const ul = document.getElementById("lista");

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

        async function getEpisodeDetails(episodeURL) {
            let response = await fetch(episodeURL);
            let episodeData = await response.json();
            return episodeData;
        }

        async function getOriginDetails(origin){
            let response = await fetch(origin);
            let originData = await response.json();
            return originData;
        }
        async function getLocationDetails(location){
            let response = await fetch(location);
            let locationData = await response.json();
            return locationData;
        }

        results.forEach(async e => {
            let caps = e.episode;
           
            if (caps.length > 2) {

              

                let origin = await getOriginDetails(e.origin.url);
                let originName = origin.name;
                
                let location = await getLocationDetails(e.location.url);
                let locationName = location.name;

                let episodeDetails = [];
                for (let i = 0; i < 3; i++) {
                    let episodeData = await getEpisodeDetails(caps[i]);
                    episodeDetails.push(episodeData);
                }

                let episodeNames = episodeDetails.map(episode => episode.name).join(", ");
                
                agregar(`${e.name}, de ${originName} aparece en: ${caps.length} episodios.
                Por ejemplo: ${episodeNames}. Fue visto por última vez en:
                ${locationName}`, e.image);
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

*/