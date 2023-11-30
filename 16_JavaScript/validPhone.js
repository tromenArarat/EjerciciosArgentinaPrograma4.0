/*
const regex = /\d/

function telephoneCheck(str) {
    let arr = [...str]
    let newArr = []

    newArr = arr.filter(function (e){
        if(regex.test(e)===true){
            return e
        }
    })

    let result = false;
    let provoleta = str.match(/-/g)|| [];
    let x = provoleta.length < 3

    if((newArr[0]==1&&newArr.length==11&&x)){
        result=true
    }
    if(newArr.length==10&&x){
        result = true
    }
    if(arr[0]=="("||arr[0]==")"||arr[0]=="-"){
        result=false
    }
    
//let reggianito = /\)[^(]/
  //  result = !reggianito.test(str)

   

    return result
  }
console.log(telephoneCheck("1 (555) 555-5555"));

*/

  /*

  1 555)555-5555

  555)-555-5555

  (555)5(55?)-5555

Failed:telephoneCheck("1 (555) 555-5555") should return true.
Failed:telephoneCheck("(555)555-5555") should return true.
Failed:telephoneCheck("1(555)555-5555") should return true.
Failed:telephoneCheck("555-5555") should return false.
Failed:telephoneCheck("5555555") should return false.
Failed:telephoneCheck("123**&!!asdf#") should return false.
Failed:telephoneCheck("55555555") should return false.
Failed:telephoneCheck("(6054756961)") should return false.
Passed:telephoneCheck("2 (757) 622-7382") should return false.
Passed:telephoneCheck("0 (757) 622-7382") should return false.
Passed:telephoneCheck("-1 (757) 622-7382") should return false.
Failed:telephoneCheck("2 757 622-7382") should return false.
Passed:telephoneCheck("10 (757) 622-7382") should return false.
Failed:telephoneCheck("27576227382") should return false.
Passed:telephoneCheck("(275)76227382") should return false.
Passed:telephoneCheck("2(757)6227382") should return false.
Passed:telephoneCheck("2(757)622-7382") should return false.
Passed:telephoneCheck("555)-555-5555") should return false.
Failed:telephoneCheck("(555-555-5555") should return false.
Passed:telephoneCheck("(555)5(55?)-5555") should return false.
Failed:telephoneCheck("55 55-55-555-5") should return false.
Failed:telephoneCheck("11 555-555-5555") should return false.
 

function diffArray(arr1, arr2) {
    let newArr = [];
    let moreNewArr = []

    console.log(arr1.indexOf(4))

  newArr = arr1.filter(function (e){ 
    return arr2.indexOf(e)==-1
    }
)

moreNewArr = arr2.filter(function (e){ 
    return arr1.indexOf(e)==-1
    }
)
  
    return newArr.concat(moreNewArr);
  }
  
  console.log(diffArray([1, 2, 3, 5], [1, 2, 3, 4, 5]));
*/

/*
  function destroyer(arr,...args) {

       
    console.log(arr)
    console.log(args)

    let newArr=[]

    args.forEach(function(e){
        console.log("e: ".concat(e))
        arr.filter((f)=> {
            console.log("f: ".concat(f))
            if(e==f){
                console.log(e+" "+f)
                arr.splice(arr.indexOf(f),1)
            }
        })
    })

    args.forEach(function(e){
        console.log("e: ".concat(e))
        arr.filter((f)=> {
            console.log("f: ".concat(f))
            if(e==f){
                console.log(e+" "+f)
                arr.splice(arr.indexOf(f),1)
            }
        })
    })

    return arr

    }
    
    console.log(destroyer([3, 5, 1, 2, 2], 2, 3, 5));

    */
/*
checkCashRegister(19.5, 20, 
    [["PENNY", 1.01], ["NICKEL", 2.05], 
    ["DIME", 3.1], ["QUARTER", 4.25], 
    ["ONE", 90], ["FIVE", 55], ["TEN", 20], 
    ["TWENTY", 60], ["ONE HUNDRED", 100]]) 
    should return 
    {status: "OPEN", change: [["QUARTER", 0.5]]}.

    3.26, 100
    {status: "OPEN", change: [["TWENTY", 60], 
    ["TEN", 20], ["FIVE", 15], ["ONE", 1], 
    ["QUARTER", 0.5], ["DIME", 0.2], ["PENNY", 0.04]]}


    [
        ["PENNY", 0.01], 
        ["NICKEL", 0.05], 
        ["DIME", 0.1], 
        ["QUARTER", 0.25], 
        ["ONE", 1], 
        ["FIVE", 5], 
        ["TEN", 10], 
        ["TWENTY", 20], 
        ["ONE HUNDRED", 100]
    ]

let userActivity = {
  id: 23894201352,
  date: 'January 1, 2017',
  data: {
    totalUsers: 51,
    online: 42
  }
};

userActivity.data.online=45;



    
    function checkCashRegister(price, cash, cid) {
        let change = 0.00;

        let vuelto = cash-price;



        return change;
      }
      
      checkCashRegister(19.5, 20, [["PENNY", 1.01], 
      ["NICKEL", 2.05], ["DIME", 3.1], 
      ["QUARTER", 4.25], ["ONE", 90], 
      ["FIVE", 55], ["TEN", 20], 
      ["TWENTY", 60], ["ONE HUNDRED", 100]]);

*/

/*
      let users = {
        Alan: {
          age: 27,
          online: false
        },
        Jeff: {
          age: 32,
          online: true
        },
        Sarah: {
          age: 48,
          online: false
        },
        Ryan: {
          age: 19,
          online: true
        }
      };
     
      function getArrayOfUsers(obj) {
        // Only change code below this line
        return Object.keys(obj);
        // Only change code above this line
      }
      
      console.log(getArrayOfUsers(users));
 */
/*
      function whatIsInAName(collection, source) {

        let prop = "";
        let props = []
        let arr = []
        for(let property in source){
            prop = property
            props.push(prop)
            console.log(prop)
            console.log(source[prop])
        }

        collection.forEach((e)=>{
          let bandera = false
          let banderaFinal = true
          props.forEach( (f) => {
            
            if(e[f]===source[f]){
              bandera=true
            }else{
              banderaFinal=false
            }
            console.log(e[f]===source[f])
          })
          if(bandera==true&&banderaFinal!==false){
            arr.push(e)
          }
        })
        return arr
      }
      
      console.log(whatIsInAName([{ "apple": 1, "bat": 2 }, 
      { "bat": 2 }, { "apple": 1, "bat": 2, "cookie": 2 }], 
      { "apple": 1, "bat": 2 }))

      */
// Nada de lo que sigue es la solución pero es el camino que hice
/*
      function spinalCase(str) {
        str = str.split(" ")
        let rgx = /[A-Z+]/
      
        let mayIndex = -1;
        
        let newStr = "";
      
        for(let i=0;i<str.length;i++){
          mayIndex = str[i].match(rgx).index;
          str[i].splice(mayIndex," ")
        }
        
      
        console.log(mayIndex)
        console.log(str[0])
        return str.join("-").toLowerCase();
      }
      
      spinalCase('thisIsSpinalTap');

      */