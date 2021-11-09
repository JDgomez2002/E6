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
 * Clase Desktop
 * 
 * @author Grupo 9
 * @version Desktop Class 1.1
 */
public class Desktop extends SmartDevice{

    public Desktop(String[] datos){
        super(datos, false);
    }

    public String navegar_internet(){
        String s = "Se esta navegando en internet con la Desktop en el link: ";
        return s;
    }
    
    public String reproducir_video(){
        String s = "Se esta reproduciendo video con la Desktop...";
        return s;
    }

    public String ejecutar_juego(){
        String s = "Se esta esta jugando en la Desktop el juego: ";
        return s;
    }
}
