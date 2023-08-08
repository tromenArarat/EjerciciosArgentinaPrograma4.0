/*
A partir del siguiente array: 

var valores = [true, 5, false, "hola", "adios", 2]:

a) Determinar cual de los dos elementos de texto es mayor.
*/
var valores = [true, 5, false, "hola", "adios", 2];

var txtMayor = "a";
for(v of valores){
    if(typeof v === "string"){
        if(v.length>txtMayor.length){
            txtMayor = v;
        }
    }
}
console.log(txtMayor);

/*
b) Utilizando exclusivamente los dos valores booleanos 
del array, determinar los operadores necesarios para 
obtener un resultado true y otro resultado false.
*/
for(v of valores){
    if(typeof v === "boolean"){
        v = !v;
        console.log(v);
    }
};

/*
c) Determinar el resultado de las cinco operaciones 
matemáticas realizadas con los dos elementos numéricos.
*/

var numeros =[];
for(v of valores){
    if(typeof v === "number"){
        numeros.push(v);
    }
};


console.log(`El resultado de sumar ${numeros[0]} más ${numeros[1]} es ${numeros[0]+numeros[1]}`);
console.log(`El resultado de restar ${numeros[0]} menos ${numeros[1]} es ${numeros[0]-numeros[1]}`);
console.log(`El resultado de multiplicar ${numeros[0]} por ${numeros[1]} es ${numeros[0]*numeros[1]}`);
console.log(`El resultado de dividir ${numeros[0]} por ${numeros[1]} es ${numeros[0]/numeros[1]}`);
console.log(`El resto de la división entre ${numeros[0]} y ${numeros[1]} es ${numeros[0]%numeros[1]}`);

