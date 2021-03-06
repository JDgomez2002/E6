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
 * Clase Tablet
 * 
 * @author Grupo 9
 * @version Tablet Class 1.1
 */
public class Tablet extends SmartDevice{
    
    public Tablet(String[] datos){
        super(datos, true);
        this.tipo_producto = "Tablet";
    }
 /**
 * metodo para navegar por internet
 * 
 * @author Grupo 9
 * @version navegar_internet 1.1
 * @return string
 */ 
    public String navegar_internet(){
        String s = "Se esta navegando en internet con la tablet en el link: ";
        return s;
    }
 /**
 * metodo para reproducir video
 * 
 * @author Grupo 9
 * @version reproducir_video 1.1
 * @return string
 */     
    public String reproducir_video(){
        String s = "Se esta reproduciendo video con la tablet...";
        return s;
    }
 /**
 * metodo para tomar una foto
 * 
 * @author Grupo 9
 * @version tomar_foto 1.1
 * @return string
 */ 
    public String tomar_foto(){
        String s = "Se esta tomando una foto con la tablet...";
        return s;
    }
}
