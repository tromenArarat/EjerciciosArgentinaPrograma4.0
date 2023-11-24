// chequear si una palabra es un palíndromo

function palindrome(str) {
    const strLimpia = str.replace(/\W/g, "").toLowerCase();

    let j = strLimpia.length - 1;
    for (let i = 0; i < strLimpia.length; i++) {
        if (strLimpia.charAt(i) !== strLimpia.charAt(j)) {
            return false
        }
        j--;
    }
    return true;
}

  //console.log(palindrome("Anili (&/na"));


  function findLongestWordLength(str) {
    const palabras = str.split(' ');
    console.log(palabras)
    let palabraMayor = "";
    for (let palabra of palabras){
        if(palabra.length>palabraMayor.length){
            palabraMayor=palabra;
        }
    }
     
    return palabraMayor.length;
  }
  
  //console.log(findLongestWordLength("The quick sparrow shall leave the village because of the weather"));

  function largestOfFour(arr) {
  
    let newArr = [];
    for (let a of arr){
        let numMay = 0;
      for(let i=0;i<a.length;i++){
        if(a[i]>numMay){
          numMay=a[i];
            }
        }
        newArr.push(numMay);
    }
  return newArr;
  }
  
  //console.log(largestOfFour([[4, 5, 1, 3], [13, 27, 18, 26], [32, 35, 37, 39], [1000, 1001, 857, 1]]));

  function findElement(arr, func) {
    let num = 0;
  
  for (let i=0;i<arr.length;i++){
    if(func(arr[i])===true){
      num = arr[i];
    }
  }
  if(num!==0){
    return num;
  }else{
  return undefined;
  }
  }
  //console.log(findElement([1, 3, 5, 8, 9, 10], num => num % 2 === 0));

  function titleCase(str) {
    var arr = str.split(" ");
    var newStr = "";
    var frase = "";
    for(let a of arr){
      newStr = a.substring(0,1).toUpperCase().concat(a.substring(1,a.length+1).toLowerCase());
      if(arr.length-1===arr.indexOf(a)){
        frase = frase.concat(newStr);
      }else{
        frase = frase.concat(newStr+"-")
      }
    }
    return frase;
  }

  
 // console.log(titleCase("sHoRt AnD sToUt"));

 function frankenSplice(arr1, arr2, n) {
  console.log(arr2[n])
  let arr3 = arr2;
  arr3.splice(arr2.indexOf(arr2[n])+1,0,...arr1);
    return arr3;
}

//console.log(frankenSplice([1, 2, 3], [4, 5, 6], 1));

function isFalsy(value) {
    if(isNaN(value)||value==false||value==null||value==0
    ||value===undefined){
      return true;
    }else{
      return false;
    }
}

function bouncer(arr) {
const trulyValues = arr.filter(function(value){
return !isFalsy(value);
});
return trulyValues;
}

//console.log(bouncer([7, "atefsdfsd", 10, "", false, 9]));

function compareNumeric(a, b) {
  if (a > b) return 1;
  if (a == b) return 0;
  if (a < b) return -1;
  }

function getIndexToIns(arr, num) {
  let ind = 0;
  const arrSort = arr.sort(compareNumeric);
  console.log(arrSort)
  for (let i=0;i<arr.length;i++){
    if(arrSort[i]==num){
      ind = i;
      return ind;
    }
    if(arrSort[i]<num&&(arrSort[i+1]>=num||!arrSort[i+1])){
        ind = i+1;
    }
  } 
  return ind;
}

//console.log(getIndexToIns([3, 10, 5], 3));

function extirpa(cadena,posicion){
  const letras = [];
    if(posicion===cadena.length){
      return letras;
    }else{
      letras.unshift(cadena.substring(posicion,(posicion+1)));
      return letras.concat(extirpa(cadena,posicion+1))
    }
  }

  function mutation(arr) {
    const a = extirpa(arr[1],0)
    for (let i=0;i<a.length;i++){

      if(arr[0].indexOf(a[i])===(-1)){
        return false;
      }
    }
    return true;
   }  
  
 // console.log(mutation(["Tiger", "Zebra"]));

//  function chunkArrayInGroups(arr, size) {
//   let num = Math.ceil(arr.length / size); 
//   let newArr = [];

//   for (let i = 0; i < num; i++) {
//     newArr.push(arr.slice(i * size, i * size + size));
//   }

//   return newArr;
// }

//ESTA ES LA MEJOR SOLUCIÓN QUE VI
//ES LA DE LA NAVAJA SUIZA
function chunkArrayInGroups(arr, size) {
  const newArr = [];
  while (arr.length > 0) {
    newArr.push(arr.splice(0, size));
  }
  return newArr;
}

chunkArrayInGroups(["a", "b", "c", "d","e"], 2);

const h2 = document.getElementById("h2")
const h3 = document.getElementById("h3")
const h4 = document.getElementById("h4")
const h5 = document.getElementById("h5")

h2.innerHTML = chunkArrayInGroups(["a", "b", "d"], 2);

// console.log(chunkArrayInGroups(["a", "b", "c", "d"], 2))

let arr = ["t", "e", "s", "t"];

h3.textContent = arr.slice(1, 3)


const switcher =(num,i,j,f)=>{
  switch(num){
        case 0:
        return i;
        case 1:
        return i.concat(j);
        case 2:
        return i.concat(j).concat(j);
        case 3:
        return i.concat(j).concat(j).concat(j);
        case 4:
        return j.concat(f)
        }
  }
const conversor = (num) =>{
  if(num<5){
    return switcher(num,"","I","V")
  }
  if(num>=5&&num<10){
    return switcher(num-5,"V","I","X")
  }
  if(num>=10&&num<15){
    return switcher(num-10,"X","I","V")
  }
}

//console.log(conversor(3))



const switchealo = (este,uno,penta,diez) => {
  switch (este){
    case 1:
      return uno;
    case 2:
      return uno.concat(uno);
    case 3:
      return uno.concat(uno).concat(uno);
    case 4:
      return uno.concat(penta);
    case 5:
      return penta;
    case 6:
      return penta.concat(uno);
    case 7:
      return penta.concat(uno).concat(uno);
    case 8:
      return penta.concat(uno).concat(uno).concat(uno);
    case 9:
      return uno.concat(diez);
  }
}

const vivaNeron = (arabigo) => {

  let palito = "I"
  let victoria = "V"
  let equis = "X"
  let cincuenta = "L"
  let cien = "C"
  let quinientos = "D"
  let mil = "M"

  let milena = Math.floor(arabigo/1000);
  let centena = Math.floor(arabigo%1000/100);
  let decena = Math.floor(((arabigo%1000)%100)/10);
  let unidad = ((arabigo%1000)%100)%10;

  let primero = ""
  let segundo = ""
  let tercero = ""
  let cuarto = ""

  if(milena!=0){
    primero = switchealo(milena, mil, "K", "W");
  }
  if(centena!=0){
    segundo = switchealo(centena, cien, quinientos, mil);
  }
  if(decena!=0){
    tercero = switchealo(decena, equis, cincuenta, cien);
  }
  if(unidad!=0){
    cuarto = switchealo(unidad, palito, victoria, equis);
  }
  return primero.concat(segundo).concat(tercero).concat(cuarto)
}
console.log(vivaNeron(2500))

h4.textContent = vivaNeron(2500);