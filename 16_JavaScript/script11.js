/*
11.
Escribir una función que reciba una frase 
y devuelva la palabra más larga.
String Ejemplo: “Guia de JavaScript”
Resultado esperado : “JavaScript"
*/
var frase = "Mejor que de nuestro juicio, debemos fiarnos del cálculo algebraico.";
var comaIndex = frase.lastIndexOf(",");
var ptoIndex = frase.indexOf(".");

/*
La función replace() toma dos argumentos: 
el primero es la expresión regular /,/g, 
que busca todas las ocurrencias de comas en el string 
    /   indica que es una expresión regular, 
    ,   es la coma y 
    g   es una bandera para que busque 
        todas las ocurrencias); 
        y el segundo argumento es el string 
        con el que se reemplazarán las comas, 
        en este caso, una cadena vacía ''.
*/

var fraseSinComa = frase.replace(/,/g,"");
var fraseSinPtoNiComa = fraseSinComa.replace('.',"");

let palabras = fraseSinPtoNiComa.split(' ');
var palabreja = "una";
for(let palabra of palabras) {
    if(palabra.length>palabreja.length){
        palabreja = palabra;
    }
}

console.log(palabreja);

;
