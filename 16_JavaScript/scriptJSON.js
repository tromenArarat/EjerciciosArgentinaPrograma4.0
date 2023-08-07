var personas = [ {
    apellido : "Manoukian",
    nombre : "Tomás",
    nacimiento : new Date("09-14-1985"),
    dni : 31805329,
    mascotas : [{
        apodo : "Potoka",
        nacimiento : new Date("09-11-2015"),
    },{
        apodo : "Purrán",
        nacimiento : new Date("05-25-2016"),
    },{
        apodo : "India",
        nacimiento : new Date("01-13-2015"),
    }
]
},{
    apellido : "Vidal",
    nombre : "Jorge",
}];

console.log(personas[0].mascotas[0]);

// del video Funciones en Arrays
personas[0].mascotas.forEach( (e)=>console.log(e.apodo));

var arr = [1,2,3,4,5];
var numerosPares = arr.filter((e)=>e%2==0);
console.log(numerosPares);

var numerosMultiplicados = arr.map((e)=>e*3);
console.log(numerosMultiplicados);

personas.filter(
    function(e){
        if(e.nombre !== "Tomás"){
            console.log(e.nombre);
        }
    }
);