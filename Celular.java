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
 * Clase Celular
 * 
 * @author Grupo 9
 * @version Celular Class 1.1
 */
public class Celular extends Telefono{

    public Celular(String[] datos){
        super(datos, true);
        this.tipo_producto = "Celular";
    }
    
    public String llamar(){
        String s = "Se esta llamando con el SmartPhone al numero: ";
        return s;
    }
}
