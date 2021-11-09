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
 * Clase SmartTV
 * 
 * @author Grupo 9
 * @version SmartTV Class 1.1
 */
public class SmartTV extends SmartDevice{
    
    public SmartTV(String[] datos){
        super(datos, false);
    }

    public String navegar_internet(){
        String s = "Se esta navegando en internet con la Smart TV en el link: ";
        return s;
    }
    
    public String reproducir_video(){
        String s = "Se esta reproduciendo video con la Smart TV...";
        return s;
    }
}
