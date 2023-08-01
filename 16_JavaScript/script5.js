function sum(){
    var valor1 = document.getElementById("valor1").value;
    var valor2 = document.getElementById("valor2").value;
    var suma = parseInt(valor1)+parseInt(valor2);
    document.getElementById("resultado").setAttribute("value",suma);
};
function restar(){
    var valor1 = document.getElementById("valor1").value;
    var valor2 = document.getElementById("valor2").value;
    var resta = parseInt(valor1)-parseInt(valor2);
    document.getElementById("resultado").setAttribute("value",resta);
};
function multi(){
    var valor1 = document.getElementById("valor1").value;
    var valor2 = document.getElementById("valor2").value;
    var multi = parseInt(valor1)*parseInt(valor2);
    document.getElementById("resultado").setAttribute("value",multi);
};
function div(){
    var valor1 = document.getElementById("valor1").value;
    var valor2 = document.getElementById("valor2").value;
    var div = parseInt(valor1)/parseInt(valor2);
    document.getElementById("resultado").setAttribute("value",div);
};

