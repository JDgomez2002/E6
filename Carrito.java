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
    private Producto[] productos_ordenados = null;

    public void ordenar_carrito(){
        try{
            if(!(this.carrito_compras.isEmpty())){
                int longitud_array = this.carrito_compras.size();
                Producto[] array_productos = new Producto[longitud_array];
                for(int k = 0; k<longitud_array ;k++){
                    array_productos[k] = this.carrito_compras.get(k);
                }
                Producto p = null;
                for(int i = 0; i<longitud_array-1 ;i++){
                    for(int j = 0; j<longitud_array-1 ;j++){
                        p = array_productos[j];
                        array_productos[j] = array_productos[j+1];
                        array_productos[j+1] = p;
                    }
                }
                this.productos_ordenados = array_productos;
            }                
        }
        catch(Exception e){
            String s = "ordenar_carrito(): "+e.getMessage();
            throw new RuntimeException(s);
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

    public Producto[] get_productos_ordenados(){
        return this.productos_ordenados;
    }

}
