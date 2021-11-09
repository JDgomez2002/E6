//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//Grupo 9:
//José Daniel Gómez Cabrera
//Carné 21429
//Abner Iván García Alegría
//21285
//Sección 11
//Actividad: Ejercicio 6

/**
 * Clase MAIN
 * 
 * @author Grupo 9
 * @version Main Class 1.1
 */

public class MAIN {
    public static void main(String[] args) {
        try{
            Controlador simulador = new Controlador();
            simulador.ElectronicaLatinoamericana();
        }
        catch(Exception e){
            System.out.println("- Lo sentimos, ha ocurrido un error: "+e.getMessage());
        }
        
    }
}