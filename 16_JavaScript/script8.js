/*
Escribir un programa que lea números enteros hasta 
teclear 0 (cero). Al finalizar el programa se debe 
mostrar el máximo número ingresado, el mínimo, 
y el promedio de todos ellos
*/

// Armo un tablero de ajedrez
const chessboardContainer = document.querySelector(".chessboard");

// Función para crear casilla
function createSquare(id, isWhite) {
    const square = document.createElement("div");
    square.classList.add(isWhite ? "white" : "black");
    square.setAttribute("id", id);
    return square;
};
var x=1;
// Bucle para crear tablero
function crearTablero() {
    for (let i = 1; i <= 8; i++) {
        for (let j = 1; j <= 8; j++) {
            const isWhite = i%2==0&&j%2==0 || i%2!=0&&j%2!=0 ;
            const square = createSquare(x, isWhite);
            chessboardContainer.appendChild(square);
            x++;
        }
    }
};

// Llama a la función de crearTablero cuando se carga la página
window.addEventListener("load", crearTablero);

document.getElementById("b1").onclick = crearNum;

function crearNum(){
    let min = 1;
    let max = 64;
    let numRandom = Math.floor(Math.random() * (max - min + 1)) + min;
    document.getElementById(numRandom).innerHTML = numRandom;
}

document.getElementById("b2").onclick = hacerCuentas;

var numMax = 0;
var numMin = 64;
var promedio = 0;
var anterior = 0;
var suma = 0;
function hacerCuentas(){
    for (let i = 1; i < 65; i++) {
        let este = document.getElementById(i).innerHTML
        if(este>anterior){
            numMax = este;
        }
        if(este<numMin){
            numMin = este;
        }
        suma = suma + este;
        anterior = este;
        promedio = i/suma;
    }
    const resultContainer = document.querySelector(".resultados");
    const result = document.createElement("p");
    const result2 = document.createElement("p");
    const result3 = document.createElement("p");
    var rta = `El número máximo ingresado es ${numMax}`;
    var rta2 = `El número mínimo ingresado es ${numMin}`;
    var rta3 = `El promedio es ${promedio}`;
    result.textContent = rta;
    result2.textContent = rta2;
    result3.textContent = rta3;
    resultContainer.appendChild(result);
    resultContainer.appendChild(result2);
    resultContainer.appendChild(result3);
    
}