const apiKey = '73464944d9f94a8e99245ec4c4449b65'; // Reemplaza esto con tu propia API key de Football-Data.org
const leagueCode = 'AR1'; // Código de la liga de Argentina en la API

// URL para consultar los resultados de la fecha en la API
const url = `https://api.football-data.org/v2/competitions/${leagueCode}/matches`;

// Opciones para la solicitud Fetch
const options = {
  method: 'GET',
  headers: {
    'X-Auth-Token': apiKey
  }
};

// Realizar la solicitud Fetch
fetch(url, options)
  .then(response => response.json())
  .then(data => {
    // Manipular los datos recibidos (ejemplo: mostrar resultados en la consola)
    console.log(data);
  })
  .catch(error => {
    console.error('Error:', error);
  });

// fetch("https://api.football-data.org/v4/matches")
// .then(response => response.json())
// .then(data => console.log(data))
// .catch(error => console.error(error));


// function resolverEn3seg() {
//     return new Promise(function (resolve, reject) {
//     // setTimeout(() => {
//     // resolve('2-Resuelto');
//     // }, 3000);
//     setTimeout(() => {
//     reject(new Error("2-Oops i did it again"));
//     }, 3000);
//     });
//     }

// Hacemos una solicitud GET a la API de Random User para obtener 10 usuarios
// fetch("https://randomuser.me/api/?results=10")
//   // Si la solicitud tiene éxito, convertimos la respuesta en un objeto JSON
//   .then(response => response.json())
//   // Si la conversión tiene éxito, mostramos los datos en la consola
//   .then(data => console.log(data))
//   // Si hay algún error, lo capturamos y lo mostramos en la consola
//   .catch(error => console.error(error));