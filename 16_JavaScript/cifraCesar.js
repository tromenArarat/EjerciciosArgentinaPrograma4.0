
/*
Caesars Cipher
One of the simplest and most widely known ciphers 
is a Caesar cipher, also known as a shift cipher. 
In a shift cipher the meanings of the letters are 
shifted by some set amount.

A common modern use is the ROT13 cipher, 
where the values of the letters are shifted by 13 places. 
Thus A ↔ N, B ↔ O and so on.

Write a function which takes a ROT13 encoded string
 as input and returns a decoded string.

All letters will be uppercase.
Do not transform any non-alphabetic character 
(i.e. spaces, punctuation), but do pass them on.

*/

function rot13(str){
    
    str.toUpperCase;

    let arr = [...str]

    let letras = []

    for (let alfa=0;alfa<26;alfa++){
        letras.push(String.fromCharCode('A'.charCodeAt(0)+alfa))
    }

    console.log(letras)

    const regex = /\W*/

    let newStr = []


    newStr = arr.map(function (e){
        let index = letras.indexOf(e);
        if(letras.indexOf(e)!==-1){
            console.log(letras[saltar13(index)])
            return letras[saltar13(index)]
        }else{
            return e;
        }
    }
    )


    return newStr.join("")
}

console.log(rot13("SERR CVMMN!"))


function saltar13(index){
    let newIndex = 0;
    let j = index;
    if(j<13){
     newIndex = index+13;
        }
    if(j==13){
        newIndex==0;
    }
    if (j>13){
     newIndex = (index+13)-26
        }
    return newIndex
}