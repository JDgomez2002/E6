//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//Grupo 9:
//José Daniel Gómez Cabrera
//Carné 21429
//Abner Iván García Alegría
//Carné 21285
//Sección 11
//Actividad: Ejercicio 6

/**
 * Clase Laptop
 * 
 * @author Grupo 9
 * @version Laptop Class 1.1
 */

public class Laptop extends SmartDevice{
 /**
 * metodo para datos de la laptop
 * 
 * @author Grupo 9
 * @version Laptop 1.1
 */    
    public Laptop(String[] datos){
        super(datos, true);
        this.tipo_producto = "Laptop";
    }
/**
 * metodo para navegar por internet
 * 
 * @author Grupo 9
 * @version navegar_internet 1.1
 * @return string
 */ 
    public String navegar_internet(){
        String s = "Se esta navegando en internet con la Laptop en el link: ";
        return s;
    }
 /**
 * metodo para reproducir un video
 * 
 * @author Grupo 9
 * @version reproducir_video 1.1
 * @return string
 */    
    public String reproducir_video(){
        String s = "Se esta reproduciendo video con la Laptop...";
        return s;
    }
/**
 * metodo para ejecutar un juego
 * 
 * @author Grupo 9
 * @version ejecutar_juego 1.1
 * @return string
 */ 
    public String ejecutar_juego(){
        String s = "Se esta esta jugando en la Laptop el juego: ";
        return s;
    }
}
