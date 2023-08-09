/*
Realizar un programa que obtenga la siguiente matriz: 
[[3], [6], [9], [12], [15]] 
y devuelve y muestre el siguiente array: 
[6, 9, 12, 15, 18]
*/
var matriz = [[3], [6], [9], [12], [15]];
var vector = matriz.flat();
vector.shift();
vector.push(18);

console.log(vector);
