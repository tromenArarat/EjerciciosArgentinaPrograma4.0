/*
Crear un objeto persona, con las propiedades nombre, 
edad, sexo ('H' hombre, 'M' mujer, 'O' otro), 
peso y altura. 
A continuación, muestre las propiedades del 
objeto JavaScript.
*/

function Sexo(sexo){
    this.sexo = sexo;
};
var hombre = new Sexo('H');
var mujer = new Sexo('M');
var otro = new Sexo('O');

function Persona(nombre,edad,sexo,peso,altura){
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
}
var ginobili = new Persona('Manu',40,hombre,75,1.87);

console.log(ginobili);

