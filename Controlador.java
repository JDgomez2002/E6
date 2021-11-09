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

    /**
     * Metodo para ejecutar la simulacion de la tienda
     * 
     * @author Grupo 9
     * @version ElectronicaLatinoamericana 1.1
     */
    public void ElectronicaLatinoamericana(){
        try{
            Vista interfaz = new Vista();
            Tienda simulador = new Tienda();
            
            interfaz.bienvenida();

            boolean continuar = true;
            int opcion_usuario = 0;

            while(continuar){
                opcion_usuario = interfaz.Menuprincipal(simulador);

                switch (opcion_usuario) {
                    //probar productos
                    case 1:
                        interfaz.productos();
                        break;
                
                    //agregar producto al carrito
                    case 2:
                        boolean continuar_agregando = true;
                        while(continuar_agregando){
                            Carrito c = simulador.get_carrito();
                            String id = interfaz.obtener_id(c);
                            simulador.agregar_producto(id);
                            interfaz.producto_agregado();
                            String s1 = "Desea seguir agregando? (si/no): ";
                            String s2 = interfaz.solicitar_string(s1);
                            s2 = s2.toLowerCase();
                            if(s2.equals("no")){
                                interfaz.volviendo_al_menu();
                                continuar_agregando = false;
                            }
                        }

                        break;

                    //eliminar producto
                    case 3:
                    boolean continuar_eliminando = true;
                    while(continuar_eliminando){
                        Carrito c = simulador.get_carrito();
                        String id = interfaz.obtener_id_eliminar(c);
                        simulador.eliminar_producto(id);
                        interfaz.producto_eliminado();
                        String s3 = "Desea seguir eliminando? (si/no): ";
                        String s4 = interfaz.solicitar_string(s3);
                        s4 = s4.toLowerCase();
                        if(s4.equals("no")){
                            interfaz.volviendo_al_menu();
                            continuar_eliminando = false;
                        }
                    }
                        break;

                    //finalizar compra
                    case 4:
                        interfaz.generando_factura();
                        Carrito c = simulador.get_carrito();
                        Factura f = simulador.generar_factura();
                        interfaz.mostrar_factura(f, c);
                        String s3 = "Desea realizar una nueva compra? (si/no): ";
                        String s4 = interfaz.solicitar_string(s3);
                        s4 = s4.toLowerCase();
                        if(s4.equals("si")){
                            simulador = new Tienda();
                            interfaz.volviendo_al_menu();
                        }
                        else{
                            continuar = false;
                        }
                        
                        break;

                    //cambiar datos tienda
                    case 5:
                        String[] new_datos = interfaz.solicitar_datos_tienda();
                        simulador.escribir_datos_tienda(new_datos);
                        interfaz.volviendo_al_menu();
                        break;

                    //salir
                    default:
                        continuar = false;
                        break;
                }
            }
            simulador.cerrar_tienda();
            interfaz.despedida();
        }
        catch(Exception e){
            String s = "Controlador: "+e.getMessage();
            throw new RuntimeException(s);
        }
    }
}