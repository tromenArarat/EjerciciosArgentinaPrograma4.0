/*
Realizar un programa en Java(?) donde se creen dos arreglos: 

el primero será un arreglo A de 50 números reales, 

y el segundo B, un arreglo de 20 números, también reales. 

El programa deberá inicializar el arreglo A con números 
aleatorios y mostrarlo por pantalla. Luego, el arreglo A 
se debe ordenar de menor a mayor y copiar los primeros 10 
números ordenados al arreglo B de 20 elementos, y rellenar 
los 10 últimos elementos con el valor 0.5. 

Mostrar los dos arreglos resultantes: el ordenado de 50 
elementos y el combinado de 20.
*/

var arrA = [];

for(let i=0;i<50;i++){
    arrA[i] = (Math.random()*256);
}
for(a of arrA){
    console.log(a);
}

var arrB = [];
function compareNum(a, b) {
    if (a > b) return 1;
    if (a == b) return 0;
    if (a < b) return -1;
    }
var arrAord = arrA.sort(compareNum);


for(let i=0;i<10;i++){
    arrB[i] = arrAord[i];
}
for(let i=10;i<20;i++){
    arrB[i] = 0.5;
}
console.log("Array de 50 Ordenado");
for(a of arrAord){
    console.log(a);
}
console.log("Array de 20 Resultante");
for(b of arrB){
    console.log(b);
}