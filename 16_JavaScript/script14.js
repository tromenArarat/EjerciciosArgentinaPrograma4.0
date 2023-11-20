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

function bouncer(arr) {
  let arr2=[...arr]
  for(let i=0;i<arr2.length;i++){
    console.log(arr2[i])
    if(arr2[i]==false||arr2[i]==null||arr2[i]==0||arr2[i]==""||arr2[i]==undefined||arr2[i]===NaN){
      arr2.splice(i,arr2[i]);
    }
  }
  
  return arr2;
}

console.log(bouncer([7, "ate", "", false, 9]));