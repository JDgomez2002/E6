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
 * Clase SmartPhone
 * 
 * @author Grupo 9
 * @version SmartPhone Class 1.1
 */
public class SmartPhone extends Telefono{
    
    public SmartPhone(String[] datos){
        super(datos, true);
    }

    public String tomar_foto(){
        String s = "Se esta tomando una foto con el Smartphone...";
        return s;
    }

    public String llamar(){
        String s = "Se esta llamando con el SmartPhone al numero: ";
        return s;
    }

    public String navegar_internet(){
        String s = "Se esta navegando en internet con el SmartPhone al link: ";
        return s;
    }

    public String reproducir_video(){
        String s = "Se esta reproduciendo un video...";
        return s;
    }
}
