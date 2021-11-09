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
 * Clase SmartWatch
 * 
 * @author Grupo 9
 * @version SmartWatch Class 1.1
 */
public class SmartWatch extends Telefono{
    
    public SmartWatch(String[] datos){
        super(datos, true);
        this.tipo_producto = "SmartWatch";
    }

    public String tomar_foto(){
        String s = "Se esta tomando una foto con el SmartWatch...";
        return s;
    }

    public String llamar(){
        String s = "Se esta llamando al numero: ";
        return s;
    }

}
