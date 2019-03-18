import DAOs.DAO_Autor;
import DTOS.DTO_Autor;

import java.util.List;

public class Main {
    public static void main (String []args){
        DAO_Autor dao_autor = new DAO_Autor();
        DTO_Autor AutorRecuperado = null;
        int EliminarId = 0;


        /**
         * Instancias de autor
         * */

        DTO_Autor autor1 = new DTO_Autor("Victor Manuel","Chan","Cauich","Alumno");
        DTO_Autor autor2 = new DTO_Autor("Victor Manuel","Chan","Cauich","Alumno");
        DTO_Autor autor3 = new DTO_Autor("Victor Manuel","Chan","Cauich","Alumno");

        /**
         * Guardamos las instancias
         * */
        EliminarId =  dao_autor.guardaAutor(autor1);
        dao_autor.guardaAutor(autor2);
        dao_autor.guardaAutor(autor3);

        /**
         * Recuperar 1 autor de la BD
         * */
        AutorRecuperado = dao_autor.obtenerAutor(EliminarId);
        System.out.println("Recuperamos a: " + AutorRecuperado.getNombreAutor());

        /**
         * Recuperar autores restantes en la BD
         * */
        List<DTO_Autor> listaAutor = dao_autor.obtenerListaAutores();
        System.out.println("Existen " + listaAutor.size() + "autores en la BD");

        for (DTO_Autor c: listaAutor){
            System.out.println("->" + c.getNombreAutor() + c.getApellidoPaternoAutor() + c.getApellidoMaternoAutor());
        }
    }
}
