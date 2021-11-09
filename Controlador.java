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

import java.util.*;

/**
 * Clase Controlador
 * 
 * @author Grupo 9
 * @version Controlador Class 1.1
 */

public class Controlador {
    public void ElectronicaLatinoamericana(){
        try{
            Vista interfaz = new Vista();
            
            interfaz.bienvenida();

            boolean continuar = true;
            int opcion_usuario = 0;

            while(continuar){
                opcion_usuario = interfaz.Menuprincipal();

                switch (opcion_usuario) {
                    //probar productos
                    case 1:
                        int producto = interfaz.productos();
                        break;
                
                    //agregar producto al carrito
                    case 2:
                        
                        break;

                    //finalizar compra
                    case 3:

                        break;

                    //salir
                    default:
                        interfaz.despedida();
                        continuar = false;
                        break;
                }
            }
        }
        catch(Exception e){
            String s = "Controlador: "+e.getMessage();
            throw new RuntimeException(s);
        }
    }
}