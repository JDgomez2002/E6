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
/**
 * metodo para datos del telefono fijo
 * 
 * @author Grupo 9
 * @version TelefonoFijo 1.1
 */ 
    public TelefonoFijo(String[] datos){
        super(datos, false);
        this.tipo_producto = "Telefono Fijo";
    }
/**
 * metodo para llamar
 * 
 * @author Grupo 9
 * @version llamar 1.1
 * @return string
 */ 
    public String llamar(){
        String s = "Se esta llamando con el SmartPhone al numero: ";
        return s;
    }
}
