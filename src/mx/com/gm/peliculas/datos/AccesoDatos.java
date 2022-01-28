package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.exepciones.AccesoDatosEx;
import mx.com.gm.peliculas.exepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.exepciones.LecturaDatosEx;

import java.util.List;

public interface AccesoDatos {
    Boolean existe(String nombreArchivo) throws AccesoDatosEx;

    List<Pelicula> Listar(String nombreArchivo) throws LecturaDatosEx;

    void escribir(Pelicula pelicula,String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    String buscar (String nombreArchivo, String buscar) throws LecturaDatosEx;

    void crear(String nombreArchivo) throws AccesoDatosEx;

    void borrar(String nombreArchivo) throws AccesoDatosEx;

}
