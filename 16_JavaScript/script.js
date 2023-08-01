function miFuncion() {
    document.getElementById("demo").innerHTML = 
    "Parrafo cambiado!.";}

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

let bajon = 'chocolate, alfajor", dona';

let bajones = bajon.split(', ');

for (let opcion of bajones){
console.log(`Mejor andá a lavarte los dientes
y dejá de pensar en ${opcion}`);
}

