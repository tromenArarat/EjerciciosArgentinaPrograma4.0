const isbn = document.getElementById("isbn");
const titulo = document.getElementById("titulo");
const autor = document.getElementById("autor");
const numeroPaginas = document.getElementById("paginas");

var listado = [];
function crearLibro() {
    var libro = new Object;
    libro.isbnField = isbn.value;
    libro.tituloField = titulo.value;
    libro.autorField = autor.value;
    libro.numeroPaginasField = numeroPaginas.value;
    listado.push(libro);
}

function mostrarLibros() {
    const listadoFieldViejo = document.getElementById("listado");
    listadoFieldViejo.remove;
    const listadoField = document.getElementById("listado");
    for (const libro of listado) {
        let lib = document.createElement("div");
        lib.innerHTML = `Título: ${libro.tituloField}
        Autor: ${libro.autorField}`;
        listadoField.appendChild(lib);
    }
}





