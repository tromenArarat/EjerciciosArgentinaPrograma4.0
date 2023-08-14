setTimeout(() => console.log("pasaron 3 segundos"),3000);

function resolverEn4Seg(){
    return new Promise(function (resolve,reject){
        setTimeout(()=>{
            resolve(console.log("resuelto"));
        },3000);
        setTimeout(()=>{
            reject(new Error(console.log("Oops")));
        },4000);
    });
};

resolverEn4Seg();

let fxSuma = async (a,b) => a+(a+b)-(b-a)-b;

// let asyncValue = await fxSuma(2,3);

fxSuma(5,6).then(valor=>{
    console.log(`El resultado es: ${valor}`)
    
}).finally(console.log(`Terminado`));

// let fxRara = setTimeout(()=>fxSuma(3,4),3000)){
//     .then()
// };

// }

// fxSuma(2,3);

/*
Crear y llamar a una función flecha que recibe un número 
y muestre su cubo con un console.log.
*/

var fxCubo = a => a*a;
console.log(fxCubo(5));


/*
Crear y llamar a una función flecha que recibe la 
velocidad en Km/hora y la devuelva en en metros/hora. 
Recoger el valor devuelto y mostrarlo con un console.log.
*/
var cambioUnidades = async vel => vel*10000;
cambioUnidades(4).then(velEnMtsHora => {console.log(velEnMtsHora)});


/*
Crea y llamar a una función flecha que recibe el ancho y 
el alto de un rectángulo y devuelva su área.

Recoger el valor devuelto y mostrarlo con un console.log.

Cuando una función recibe varios parámetros, estos irán 
separados por coma.

*/