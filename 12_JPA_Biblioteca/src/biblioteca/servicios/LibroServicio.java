
package biblioteca.servicios;

import biblioteca.entidades.Autor;
import biblioteca.entidades.Editorial;
import biblioteca.entidades.Libro;
import biblioteca.persistencia.DAOLibro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class LibroServicio {
    
    private final DAOLibro DAO;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public LibroServicio(){
        this.DAO = new DAOLibro();
    }
    
    public void crearLibro() throws Exception{
        Libro codice = new Libro();
        System.out.println("ISBN:");
        long isbn = sc.nextLong();
        
        // Validación del ISBN. Que no exista en la base de datos
        long anterior = 0;
        try{
            anterior = DAO.buscarPorISBN(isbn).getIsbn();
        }catch(Exception e){
            System.out.println("Ningún libro cargado aún con este ISBN");
        }
        
        if(isbn==anterior){
            System.out.println("Un libro con este ISBN ya fue cargado. El libro es " + DAO.buscarPorISBN(isbn).getIsbn());
            crearLibro();
        }else{
            codice.setIsbn(isbn);
        }
        
        System.out.println("Título:");
        String titulo = sc.next();
        codice.setTitulo(titulo);
        System.out.println("Ejemplares:");
        Integer ejemplares = sc.nextInt();
        codice.setEjemplares(ejemplares);
        
        AutorServicio representante = new AutorServicio();
        Autor autor = new Autor();
        int contador = 1;
        System.out.println("Seleccione el autor de la lista");
        System.out.println("Ingrese 0 (cero) para ingresar un nuevo autor");
        for (Autor escritor : representante.listarAutores()) {
            System.out.println("("+contador+")"+escritor.getNombre());
            contador++;
        }
        System.out.println("(0) Otro");
        int opcion = sc.nextInt();
        if(opcion==0){
            System.out.println("Nombre y apellido del/a autor/a:");
            String nombreAutor = sc.next();
            autor.setNombre(nombreAutor);
            representante.cargarAutor(autor);
            codice.setAutor(autor);
        }else{
            autor = representante.buscarPorNombre(representante.listarAutores().get(opcion-1).getNombre());
            codice.setAutor(autor);
        }
        
        EditorialServicio editor = new EditorialServicio();
        Editorial editorial = new Editorial();
        int contadorx = 1;
        System.out.println("Seleccione la editorial de la lista");
        System.out.println("Ingrese 0 (cero) para ingresar una nueva editorial");
        for (Editorial editoriale : editor.listarEditoriales()) {
             System.out.println("("+contadorx+")"+editoriale.getNombre());
             contador++;
        }
        System.out.println("(0) Otra");
       int opcione = sc.nextInt();
        if(opcione==0){
            System.out.println("Nombre de la editorial:");
            String nombreEditorial = sc.next();
            editorial.setNombre(nombreEditorial);
            editor.crearEditoriale(editorial);
            codice.setEditorial(editorial);
        }else{
            editorial = editor.buscarPorNombre(editor.listarEditoriales().get(opcion-1).getNombre());
            codice.setEditorial(editorial);
        }
       
        codice.setAlta(new Date());
        DAO.guardar(codice);
        
        
    }
    
    public void mostrarLibros() throws Exception{
        List<Libro> libros = DAO.listarTodos();
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo()+"\n");
        }
    }
    
}
