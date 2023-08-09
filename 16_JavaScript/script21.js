/*
Escribir un programa para obtener un array de las 
propiedades de un objeto Persona.
Las propiedades son nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura.
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
};

var ginobili = new Persona('Manu',40,hombre,75,1.87);

var manuArray = [
    ginobili.nombre,
    ginobili.edad,
    ginobili.sexo.sexo,
    ginobili.peso,
    ginobili.altura
];

console.log(manuArray);