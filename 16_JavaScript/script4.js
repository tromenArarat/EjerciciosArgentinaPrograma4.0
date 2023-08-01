function guardarInput(){
    var relleno = document.getElementById("ip").value;
    reaccion = (relleno==="SI"||relleno==="NO") ? `CORRECTOU` : `INCORRECTOU`;
    window.alert(reaccion);
}
 
