/*
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

// */

//     /*
//         VARIABLES GLOBALES
   

//     let moneda = 0.00;
//     let estado = ""
//     let resultado = {
//         status: estado,
//         change: []
//     };
//     let suma = 0.00;


//     /*
//         FUNCIÓN PRINCIPAL
//     */

// function checkCashRegister (price, cash, cid) {
//     const vuelto = (cash-price).toFixed(2);
//     // Tiene que ser de este tipo 
//     // let respuesta = {
//     // status: estado,
//     // change: [...bille]}
//     let respuesta = darVuelto(vuelto,cid,8) 
//     return respuesta
// }
//     /*
//         INPUT
//     */

//     // ¿¿Qué pasa si sale 20 y me dan 20??
    
//     console.log(checkCashRegister(3.26, 100, 
//         [["PENNY", 1.01], ["NICKEL", 2.05],
//          ["DIME", 3.1], ["QUARTER", 4.25], ["ONE", 90],
//           ["FIVE", 55], ["TEN", 20], ["TWENTY", 60],
//            ["ONE HUNDRED", 100]]));

//            /*
//            {status: "OPEN", change: [["TWENTY", 60], 
//            ["TEN", 20], ["FIVE", 15], ["ONE", 1], 
//            ["QUARTER", 0.5], ["DIME", 0.2], ["PENNY", 0.04]]}.
//            */

//     /*
//         FUNCIÓN SECUNDARIA
//     */

// function darVuelto(vuelto,caja,monedaIndex){
    
//     if(monedaIndex==0&&suma.toFixed(2)!=vuelto){
//         moneda = 0.01
//         //  0-- Si vuelto > caja
//         /// chequear si pasa el resultado con sus valores acumulados
//         if(vuelto>caja[0][1]){
//             let newStatus = "INSUFFICIENT_FUNDS"
//             resultado.status = newStatus
//         }
//         // 1-- Si el vuelto es igual a la moneda y queda una
//         if(vuelto==moneda&&caja[monedaIndex][1]==moneda){
//             caja[monedaIndex][1]=caja[monedaIndex][1]-moneda
//             let newStatus = "CLOSE"
//             resultado.status = newStatus
//             vieneDado(moneda)
//         }
//         // 2-- Si el vuelto es mayor a lo que hay en caja
//         if(vuelto>moneda&&caja[monedaIndex][1]>moneda){
//             console.log(suma.toFixed(2))
//             console.log("vuelto"+vuelto)
//             console.log(suma.toFixed(2)!=vuelto)
//             caja[monedaIndex][1]=caja[monedaIndex][1]-moneda
//             let newStatus = "OPEN"
//             resultado.status = newStatus
//             vieneDado(moneda)
//             darVuelto(vuelto,caja,monedaIndex)
//         }
        
//         // 3-- Si el vuelto es menor a lo que hay en caja
//         if(vuelto<caja[monedaIndex][1]){
//             caja[monedaIndex][1]=(caja[monedaIndex][1]-moneda).toFixed(2)
//             let newStatus = "OPEN"
//             resultado.status = newStatus
//             //vieneDado(moneda)
//             darVuelto(vuelto,caja,monedaIndex)
//         }
        
//     }else{
        
//         switch(monedaIndex){
//             case 1:
//                 moneda=0.05
//                 chequeo(vuelto,caja,moneda,monedaIndex)
//                 break;
//             case 2:
//                 moneda=0.1
//                 chequeo(vuelto,caja,moneda,monedaIndex)
//                 break;
//             case 3:
//                 moneda=0.25
//                 chequeo(vuelto,caja,moneda,monedaIndex)
//                 break;
//             case 4:
//                 moneda=1
//                 chequeo(vuelto,caja,moneda,monedaIndex)
//                 break;
//             case 5:
//                 moneda=5
//                 chequeo(vuelto,caja,moneda,monedaIndex)
//                 break;
//             case 6:
//                 moneda=10
//                 chequeo(vuelto,caja,moneda,monedaIndex)
//                 break;
//             case 7:
//                 moneda=20
//                 chequeo(vuelto,caja,moneda,monedaIndex)
//                 break;
//             case 8:
//                 moneda=100
//                 chequeo(vuelto,caja,moneda,monedaIndex)
//                 break;
//         }
//     }
    
//     resultado.change.sort((a, b) => b[1] - a[1])
    
//     return resultado
// }
//     /*
//         FUNCIÓN DE TERCER ORDEN
//     */

// function vieneDado(moneda){
//     let monedaTxt = ""
//     switch(moneda){
//         case 0.01:
//             monedaTxt="PENNY"
//             break;
//         case 0.05:
//             monedaTxt="NICKEL"
//             break;
//         case 0.1:
//             monedaTxt="DIME"
//             break;
//         case 0.25:
//             monedaTxt="QUARTER"
//             break;
//         case 1:
//             monedaTxt="ONE"
//             break;
//         case 5:
//             monedaTxt="FIVE"
//             break;
//         case 10:
//             monedaTxt="TEN"
//             break;
//         case 20:
//             monedaTxt="TWENTY"
//             break;
//         case 100:
//             monedaTxt="ONE HUNDRED"
//             break;
//     }

//     if(monedaExist(monedaTxt)){
//         suma = suma + moneda
//         let monedinIndex = resultado.change.
//             indexOf(monedaTxt)+1
//         resultado.change[monedinIndex][1] += moneda;
           
//     }else{
//         suma = suma + moneda
//         resultado.change.unshift([monedaTxt,moneda])
//     }
// }

// function chequeo(vuelto,caja,moneda,monedaIndex){
//  //&&suma.toFixed(2)!=vuelto
//  console.log("vuelto"+vuelto)
//  console.log("moneda"+moneda)
//  console.log("suma"+suma)
//  console.log(suma<vuelto)
//  if(suma<vuelto){
//     if(vuelto<moneda){
//         console.log("vuelto menor que moneda")
//         darVuelto(vuelto,caja,monedaIndex-1)
//     }
//     /*
//     if(vuelto == moneda && caja[monedaIndex][1]>moneda){
//         caja[monedaIndex][1]=caja[monedaIndex][1]-moneda
//             let newStatus = "OPEN"
//             resultado.status = newStatus
//             vieneDado(moneda)
//     }
    
//     if(vuelto>caja[monedaIndex][1]&&suma.toFixed(2)<vuelto){
//         console.log("entra")
//         vieneDado(moneda)
//         darVuelto(vuelto,caja,monedaIndex)
//     }
// */
//     if( vuelto > moneda && caja[monedaIndex][1]>0&&suma+moneda<vuelto){
//         caja[monedaIndex][1]=caja[monedaIndex][1]-moneda
//         let newStatus = "OPEN"
//             resultado.status = newStatus
//         vieneDado(moneda)
//         darVuelto(vuelto,caja,monedaIndex)
//     }
//     if( vuelto > moneda && caja[monedaIndex][1]<vuelto){
        
//         darVuelto(vuelto,caja,monedaIndex-1)
//     }
// }
// }

// function monedaExist(monedaTxt){
//     for (let i = 0; i < resultado.change.length; i++) {
//       if (resultado.change[i][0] === monedaTxt) {
//         return true
//       }else{
//         return false
//       }
// }

// }

// /*
// let result = [];
//     let temp = [];
//     function recursiv(cartas, i) {
//         if (i === cartas.length) {
//             // prueba para aplicar condiciones por dentro de la función
//             if(temp.length===limite){
//             result.push([...temp]);
//            }
//            return;
//         }
//         temp.push(cartas[i]);
//         recursiv(cartas, i + 1);
//         temp.pop();
//         recursiv(cartas, i + 1);
//     }
//     recursiv(cartas, 0);
//     return result;

// */

/*
        VARIABLES GLOBALES
    */

        let moneda = 0.00;
        let estado = ""
        let resultado = {
            status: estado,
            change: []
        };
        let suma = 0.00;
        let vuelto = 0.00;
    
        /*
            FUNCIÓN PRINCIPAL
        */
    
    function checkCashRegister (price, cash, cid) {
        vuelto = (cash-price).toFixed(2);
        let respuesta = darVuelto(vuelto,cid,8) 
        return respuesta
    }
        
    
        /*
            FUNCIÓN SECUNDARIA
        */
    
    function darVuelto(vuelto,caja,monedaIndex){
        
        if(monedaIndex==0&&suma.toFixed(2)!=vuelto){
            moneda = 0.01
            //  0-- Si vuelto > caja
            /// chequear si pasa el resultado con sus valores acumulados
            if(vuelto>caja[0][1]&&caja[monedaIndex][1]==0){
                let newStatus = "INSUFFICIENT_FUNDS"
                resultado.status = newStatus
            }
            // 1-- Si el vuelto es igual a la moneda y queda una
            console.log(caja[monedaIndex][1].toFixed(2))
            console.log((suma+moneda).toFixed(2))
            if((suma+moneda).toFixed(2)==vuelto&&caja[monedaIndex][1].toFixed(2)==moneda){
                console.log("entra")
                caja[monedaIndex][1]=caja[monedaIndex][1]-moneda
                let newStatus = "CLOSED"
                resultado.status = newStatus
                //vieneDado(moneda)
                resultado.change.unshift(["ONE HUNDRED",0])
                resultado.change.unshift(["TWENTY",0])
                resultado.change.unshift(["TEN",0])
                resultado.change.unshift(["FIVE",0])
                resultado.change.unshift(["ONE",0])
                resultado.change.unshift(["QUARTER",0])
                resultado.change.unshift(["DIME",0])
                resultado.change.unshift(["NICKEL",0])
                resultado.change.pop(["NICKEL",0])
                resultado.change.unshift(["PENNY",0.5])
                
            }
            // 2-- Si el vuelto es mayor a lo que hay en caja
            if(vuelto>moneda&&caja[monedaIndex][1]>moneda){
                caja[monedaIndex][1]=caja[monedaIndex][1]-moneda
                let newStatus = "OPEN"
                resultado.status = newStatus
                vieneDado(moneda)
                darVuelto(vuelto,caja,monedaIndex)
            }
            
            // 3-- Si el vuelto es menor a lo que hay en caja
            if(vuelto<caja[monedaIndex][1]){
                caja[monedaIndex][1]=(caja[monedaIndex][1]-moneda).toFixed(2)
                let newStatus = "OPEN"
                resultado.status = newStatus
                //vieneDado(moneda)
                darVuelto(vuelto,caja,monedaIndex)
            }
            
        }else{
            
            switch(monedaIndex){
                case 1:
                    moneda=0.05
                    chequeo(vuelto,caja,moneda,monedaIndex)
                    break;
                case 2:
                    moneda=0.1
                    chequeo(vuelto,caja,moneda,monedaIndex)
                    break;
                case 3:
                    moneda=0.25
                    chequeo(vuelto,caja,moneda,monedaIndex)
                    break;
                case 4:
                    moneda=1
                    chequeo(vuelto,caja,moneda,monedaIndex)
                    break;
                case 5:
                    moneda=5
                    chequeo(vuelto,caja,moneda,monedaIndex)
                    break;
                case 6:
                    moneda=10
                    chequeo(vuelto,caja,moneda,monedaIndex)
                    break;
                case 7:
                    moneda=20
                    chequeo(vuelto,caja,moneda,monedaIndex)
                    break;
                case 8:
                    moneda=100
                    chequeo(vuelto,caja,moneda,monedaIndex)
                    break;
            }
        }
        
        resultado.change.sort((a, b) => b[1] - a[1])
        
        return resultado
    }
        /*
            FUNCIÓN DE TERCER ORDEN
        */
    
    function vieneDado(moneda){
        let monedaTxt = ""
        switch(moneda){
            case 0.01:
                monedaTxt="PENNY"
                break;
            case 0.05:
                monedaTxt="NICKEL"
                break;
            case 0.1:
                monedaTxt="DIME"
                break;
            case 0.25:
                monedaTxt="QUARTER"
                break;
            case 1:
                monedaTxt="ONE"
                break;
            case 5:
                monedaTxt="FIVE"
                break;
            case 10:
                monedaTxt="TEN"
                break;
            case 20:
                monedaTxt="TWENTY"
                break;
            case 100:
                monedaTxt="ONE HUNDRED"
                break;
        }
    
        if(monedaExist(monedaTxt)){
            suma = suma + moneda
            let monedinIndex = resultado.change.
                indexOf(monedaTxt)+1
            resultado.change[monedinIndex][1] += moneda;
               
        }else{
            suma = suma + moneda
            resultado.change.unshift([monedaTxt,moneda])
        }
    }
    
    // Función de segundo orden
    function chequeo(vuelto,caja,moneda,monedaIndex){
     if(suma<vuelto){
        if(vuelto<moneda){
            darVuelto(vuelto,caja,monedaIndex-1)
        }
    
        if( vuelto > moneda && caja[monedaIndex][1]>0&&suma+moneda<=vuelto){
            caja[monedaIndex][1]=caja[monedaIndex][1]-moneda
            let newStatus = "OPEN"
                resultado.status = newStatus
                vieneDado(moneda)
            darVuelto(vuelto,caja,monedaIndex)
            
        }
        if( vuelto > moneda && caja[monedaIndex][1]<vuelto){
            
            darVuelto(vuelto,caja,monedaIndex-1)
        }
    }
    }
    // Función de cuarto orden
    function monedaExist(monedaTxt){
        for (let i = 0; i < resultado.change.length; i++) {
          if (resultado.change[i][0] === monedaTxt) {
            return true
          }else{
            return false
          }
    }
    
    }
    
    /*
     INPUT
    */

console.log(checkCashRegister(19.5, 20, [["PENNY", 0.5], 
["NICKEL", 0], ["DIME", 0], 
["QUARTER", 0], ["ONE", 0], 
["FIVE", 0], ["TEN", 0], ["TWENTY", 0], 
["ONE HUNDRED", 0]]));