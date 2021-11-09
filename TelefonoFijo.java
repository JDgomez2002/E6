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
 * Clase TelefonoFijo
 * 
 * @author Grupo 9
 * @version TelefonoFijo Class 1.1
 */
public class TelefonoFijo extends Telefono{

    public TelefonoFijo(String[] datos){
        super(datos, false);
    }

    public String llamar(){
        String s = "Se esta llamando con el SmartPhone al numero: ";
        return s;
    }
}
