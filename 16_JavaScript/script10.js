/*
10.
Escribir una función flecha 
que reciba una palabra y 
la devuelva al revés.
*/
var palabra = "jubilado";
var arbalap = "";
let revertir = n => {
    for (let i=n.length-1;i>=0;i--){
        let car = n.charAt(i);
        arbalap = arbalap.concat(car);
     } 
     return arbalap;
};
console.log(revertir(palabra));
/*
11.
Escribir una función que reciba una frase 
y devuelva la palabra más larga.
String Ejemplo: “Guia de JavaScript”
Resultado esperado : “JavaScript"
*/
var frase = "Mejor que de nuestro juicio, debemos fiarnos del cálculo algebraico.";

let arr = [];
for(let i=0;i<frase.length;i++){
    arr.push(frase.charAt(i));
}


// Recorrer arr y concatenar letras hasta que haya espacio
// cuando llegue al espacio que agregue la palabra resultante en un 
// vector de palabras

let palabras = [];

for(let i=0;i<arr.length;i++){
    let letra = arr[i];
    let letras = "";
    while(letra != " "){
        letras = letras.concat(letra);
    }
    if(letra == " "){
        palabras.push(letras);
    }
}

for(let p of palabras){
    console.log(p);
}



// var palabras = new Array();
// for(let i=0;i>arr.length;i++){
//     let a = arr[i];
//     let letras = "";
//     while(a!=" "){
//         letras = letras.concat(a);
//     }
//     palabras.add(letras);
// }

// palabras.forEach(e => {
//     console.log(e);
// });

