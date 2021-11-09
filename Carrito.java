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
 * Clase Carrito
 * 
 * @author Grupo 9
 * @version Carrito Class 1.1
 */
public class Carrito {
    private ArrayList<Producto> carrito_compras = new ArrayList<Producto>();

    public void ordenar_carrito(){
        for(int k = 0; k<(this.carrito_compras.size()) ;k++){
            
        }
    }

    public String agregar_producto(Producto product){
        this.carrito_compras.add(product);
        String nombre_producto = product.get_tipo_producto();
        return nombre_producto;
    }

    public String eliminar_producto(String id){
        String producto_eliminado = null;
        boolean continuar = true;
        int contador = 0;
        while((continuar)&&(contador<(this.carrito_compras.size()))){
            if(this.carrito_compras.get(contador).get_id().equals(id)){
                String s = carrito_compras.get(contador).get_tipo_producto();
                producto_eliminado = s;
                this.carrito_compras.remove(contador);
                continuar = false;
            }
            else{
                contador += 1;
            }
        }
        return producto_eliminado;
    }

}
