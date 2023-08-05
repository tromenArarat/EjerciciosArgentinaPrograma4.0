/*
Escribe un programa JavaScript para calcular el área y 
el perímetro de un objeto Círculo con la propiedad radio. 
Nota: Cree dos métodos para calcular el área y el perímetro. 
El radio del círculo lo proporcionará el usuario.
*/

// var area = window.prompt("Ingrese el área del perímetro");

var radio = parseInt(window.prompt("Ingrese el radio del círculo"));

var area = r => {
    var resultado = 3.14*(r*r);
    return resultado;
};

var perimetro = r => {
    var result = 2*3.14*r;
    return result;
};
console.log(perimetro(4));
console.log(area(4));

window.alert(`El círculo tiene un área de ${area(radio)}
y un perímetro de ${perimetro(radio)}`);



