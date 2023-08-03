/*
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