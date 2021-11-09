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
    
    public Laptop(String[] datos){
        super(datos, true);
    }

    public String navegar_internet(){
        String s = "Se esta navegando en internet con la Laptop en el link: ";
        return s;
    }
    
    public String reproducir_video(){
        String s = "Se esta reproduciendo video con la Laptop...";
        return s;
    }

    public String ejecutar_juego(){
        String s = "Se esta esta jugando en la Laptop el juego: ";
        return s;
    }
}
