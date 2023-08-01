

function miFuncion() {
    document.getElementById("demo").innerHTML = 
    "Parrafo cambiado!";}
function suFuncion() {
    document.getElementById("demo").innerHTML = 
    "Parrafo alterado!";}

    // uso de window.prompt p. 48 de la guía

function cerrar() {
    let rta = prompt("Seguro?","si o no");
    reaccion = (rta==="no") ? window.alert("Que tenga buen dia") : window.close();
}

var saludin;

    function otraFuncion(){
    saludin = window.prompt('Holines!');
}



let movidas = ["Active","Membrillo","Nueces"];

for (let i = 0; i < movidas.length; i++) {
    let element = movidas[i];
    console.log(movidas[i]);
}

function mostrarElementosArray(elemento, indice, movidas) {
    console.log("a[" + indice + "] = " + elemento);
    }

movidas.forEach(mostrarElementosArray);

for (v of movidas){
    console.log(v);
}


function relleno(saludo){
    var rta = (saludo=='Qué acelga') ? 'Cómo dice que la cuenta?' : 'Qué acelga';
    return rta;
}


function Hermanos(nombre,saludo,comentario){
    this.nombre = nombre;
    this.saludo = saludo;
    this.comentario = comentario;
    this.mostrarHermano = function(){
        return `${this.nombre}, un valioso ejemplar
        de ser humano`;
    };
}

var mellizo = new Hermanos('Juan','Qué acelga',relleno('Qué acelga'));
var clari = new Hermanos('Clara','Qué aceituna',relleno('Todo viento?'));
var hermanxs = [new Hermanos('Miguel','Qué se cuenta',relleno('Qué se cuenta?')),mellizo,clari]

for (let p of hermanxs){
    console.log(p.mostrarHermano());
}

for (let hmno of hermanxs) {
    for (let dato in hmno) {
        console.log(hmno[dato]);
    }
}



function alerta(){
    var nombre = mellizo.nombre;
    var saludo = mellizo.saludo;
    var comentario = mellizo.comentario;
    window.alert(`${saludo} ${nombre} 
    ${comentario}`);
}


movidas.splice(0,1,'cafe');

movidas.forEach(e => {
    console.log(e);
});

let algo = movidas.slice([1],[3]);

algo.forEach(e => {
    console.log(e);
});

let bajon = 'chocolate, alfajor", donas';

let bajones = bajon.split(', ');

bajones.reverse();

for (let opcion of bajones){
console.log(`Mejor andá a lavarte los dientes
y dejá de pensar en ${opcion}`);
}

let vector = [2,8,1,5];

function compararNumero(a,b){
    if(a>b)return 1;
    if(a==b)return 0;
    if(a<b)return -1;
};

vector.sort(compararNumero);

vector.forEach(e => {
    console.log(e);    
});

let personajes = ["Bilbo", "Gandalf", "Nazgul"];
let longitud = personajes.map(function(elemento){
    return elemento.length;
    });
console.log(longitud);

console.log('prueba flat');

var arr1 = [1, 2, [3, 4]];
arr1.flat();

arr1.forEach(e => {
    console.log(e);
});

var arr2 = [1, 2, [3, 4, [5, 6]]];
arr2.flat();

arr2.forEach(e => {
    console.log(e);
});
    
let parrafo = document.getElementById("demo");

console.log(parrafo);

let botones = document.getElementsByTagName("button");
console.log(`Cantidad de botones: ${botones.length}`);
console.log(`Botón 1: ${botones[0].textContent}`);
console.log(`Botón 2: ${botones[1].textContent}`);
console.log(`Botón 3: ${botones[2].textContent}`);

let testo = botones[0].hasAttributes();
console.log(testo);

let atributosDeBoton = botones[0].getAttributeNames();

atributosDeBoton.forEach(e => {
    console.log(e);
});

botones[0].setAttribute(onclick,suFuncion());

var nombre = document.getElementById("inputNombre").getAttribute("value");
if(nombre == " "){
nombre = document.getElementById("inputNombre").setAttribute("value","Ermindo");
}

var trago = inputNombre.value;
console.log(trago);

console.log(demo.innerHTML);
b1.innerHTML = "Pulse";
console.log(b1.innerHTML);

// appendChild(node)
// Añade como hijo el nodo node. Devuelve el nodo
// insertado.
// .insertAdjacentElement(pos, elem)
// Inserta el elemento elem en la posición pos. Si
// falla, null.
// .insertAdjacentHTML(pos, str) Inserta el código HTML str en la posición pos.
// .insertAdjacentText(pos, text) Inserta el texto text en la posición pos.
// .insertBefore(new, node)
// Inserta el nodo new antes de node y como hijo
// del nodo actual.
// .appendChild(node)
// Añade como hijo el nodo node. Devuelve el nodo
// insertado.


const img = document.getElementById("ima");
img.src = "https://i.ebayimg.com/images/g/UE4AAOSwKENdhFJy/s-l500.png";
img.alt = "Logo Javascript";
img.id = "oma";
document.body.appendChild(img);

// .remove() Elimina el propio nodo de su elemento padre.
// .removeChild(node) Elimina y devuelve el nodo hijo node.
// .replaceChild(new, old)
// Reemplaza el nodo hijo old por new. Devuelve
// old

const ironman = document.getElementById("oma");
ironman.remove();

function mensajero(){
    console.log("epaa");
}
document.getElementById("b2").onclick = mensajero;

setTimeout(function() {
    console.log("He ejecutado la función");
    }, 10000);

