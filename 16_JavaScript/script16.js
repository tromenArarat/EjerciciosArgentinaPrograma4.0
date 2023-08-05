/*
Realizar un programa que rellene dos vectores al 
mismo tiempo, con 5 valores aleatorios
y los muestre por pantalla.
*/

var arr1 = [];
var arr2 = [];

for(let i=0;i<5;i++){
    arr1[i] = parseInt((Math.random() * (10 - 1)) + 1);
    arr2[i] = parseInt((Math.random() * (10 - 1)) + 1);
}

for (let i=0;i<5;i++) {
    console.log(arr1[i]);
    console.log(arr2[i]);
}

