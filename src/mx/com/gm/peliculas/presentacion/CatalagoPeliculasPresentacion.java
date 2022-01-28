package mx.com.gm.peliculas.presentacion;

import mx.com.gm.peliculas.servicio.CatalogoPeliculas;
import mx.com.gm.peliculas.servicio.CatalogoPeliculasImpl;

import java.util.Scanner;

public class CatalagoPeliculasPresentacion {
    public static void main(String[] args) {
        var opcion = -1;
        var scaner = new Scanner(System.in);
        CatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0){
            System.out.println("Elige una opcion: \n"
            + "1. Iniciar catalogo peliculas\n"
            + "2. Agregar pelicula\n"
            + "3. Listar pelicula\n"
            + "4. Buscar pelicula\n"
            + "0. Salir");
            opcion=Integer.parseInt(scaner.nextLine());

            switch (opcion){
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula");
                    var nombrePelicula = scaner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce una pelicula a buscar");
                    var buscar = scaner.nextLine();
                    catalogo.buscarPeliculas(buscar);
                    break;
                case 0:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }

        }
    }
}
