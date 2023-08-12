/*
Evita usar un bucle.
https://www.youtube.com/watch?v=4_g-TMSjBx0
*/

let obj = { a: 11, b: 22};

let { a: aliasA, b: aliasB, c: aliasC = 9999} = obj;

console.log(`${aliasA} ${aliasB} ${aliasC}`);

// lo mismo en arrays
let arr = [1, 2, 3];

let [x, ...otros] = arr;

console.log(otros);

const perraCompa = {
    nombre:"Lahsa",
    raza: "chivera"
};
const persona = {
    domicilio: "ns"
};


function soloNombre( { nombre = "nn"} ){
    console.log(nombre);
}

soloNombre(perraCompa);
soloNombre(persona);

fetch(`https://rickandmortyapi.com/api/character`)
    .then(response => response.json())
    .then(data => {
        const {results} = data;
        console.log(results.name);
    });

