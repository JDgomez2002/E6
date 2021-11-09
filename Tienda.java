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
import java.io.*;
import java.time.LocalTime;

/**
 * Clase Tienda
 * 
 * @author Grupo 9
 * @version Tienda Class 1.1
 */

public class Tienda {
    private ArrayList<Producto> productos_disponibles = new ArrayList<Producto>();
    private String direccion;
    private String codigo_tienda;
    private String pais;
    private String ciudad;
    private Carrito carrito_compras;

    public Producto[] get_productos_ordenados(){
        Producto[] productos = this.carrito_compras.get_productos_ordenados();
        return productos;
    }

    public Tienda(){
        try{
            leer_productos();
            this.carrito_compras = new Carrito();
            String[] info_tienda = leer_info_tienda();
            this.direccion = info_tienda[0];
            this.codigo_tienda = info_tienda[1];
            this.pais = info_tienda[2];
            this.ciudad = info_tienda[3];
        }
        catch(Exception e){
            String s = "Tienda: "+e.getMessage();
            throw new RuntimeException(s);
        }
    }

    private void leer_productos(){
        try{
            String file = "productos.txt";
            File myFile = new File(file);
            Scanner scan = new Scanner(myFile);
            while(scan.hasNextLine()){
                Producto producto = null;
                String linea = scan.nextLine();
                String[] info = linea.split(",");
                String id = info[0];
                switch (id) {
                    case "TEL1":
                        producto = new SmartPhone(info);
                        break;

                    case "TEL2":
                        producto = new Celular(info);
                        break;

                    case "TEL3":
                        producto = new TelefonoFijo(info);
                        break;

                    case "CAM1":
                        producto = new Camara(info);
                        break;
                        
                    case "PC1":
                        producto = new Desktop(info);
                        break;

                    case "PC2":
                        producto = new Laptop(info);
                        break;

                    case "TV1":
                        producto = new SmartTV(info);
                        break;

                    case "TB1":
                        producto = new Tablet(info);
                        break;
                
                    default://SW1
                        producto = new SmartWatch(info);
                        break;
                }
                this.productos_disponibles.add(producto);
            }
        }
        catch(Exception e){
            String s = "leer_productos(): "+e.getMessage();
            throw new RuntimeException(s);
        }
    }

    public ArrayList<Producto> get_productos_disponibles(){
        return this.productos_disponibles;
    }

    public String[] leer_info_tienda(){
        String[] info = new String[4];
        try{
            String file = "infoTienda.txt";
            File myFile = new File(file);
            Scanner scan = new Scanner(myFile);
            String s = scan.nextLine();
            info = s.split(",");
        }
        catch(Exception e){
            String s = "leer_info_tienfa(): "+e.getMessage();
            throw new RuntimeException(s);
        }
        return info;
    }

    public String[] get_info_tienda(){
        String[] datos = new String[4];
        datos[0] = this.direccion;
        datos[1] = this.codigo_tienda;
        datos[2] = this.pais;
        datos[3] = this.ciudad;
        return datos;
    }

    public String agregar_producto(String s){
        String nombre = "";
        try{
            Producto p = get_producto(s);
            if(!(p==null)){
                this.carrito_compras.agregar_producto(p);
                nombre = p.get_tipo_producto();
            }
        }
        catch(Exception e){
            String t = "Tienda: agregar_producto(): "+e.getMessage();
            throw new RuntimeException(t);
        }
        return nombre;
    }

    private Producto get_producto(String id){
        Producto p = null;
        boolean continuar = true;
        int contador = 0;
        while((continuar)&&(contador<this.productos_disponibles.size())){
            if(this.productos_disponibles.get(contador).get_id().equals(id)){
                p = this.productos_disponibles.get(contador);
                continuar = false;
            }
            else{
                contador += 1;
            }
        }
        return p;
    } 

    public String eliminar_producto(String id){
        String s = carrito_compras.eliminar_producto(id);
        return s;
    }

    public void cerrar_tienda(){
        try{
            String file = "infoTienda.txt";
            String s = this.direccion+","+this.codigo_tienda+","+this.pais+","+this.ciudad;
            FileWriter lapiz = new FileWriter(file);
            lapiz.write(s);
            lapiz.close();
        }
        catch(Exception e){
            String s = "cerrar_tienda(): "+e.getMessage();
            throw new RuntimeException(s);
        }
    }

    public Factura generar_factura(){
        String[] datos = new String[5];
        datos[0] = "No. de Cliente: 10580";
        datos[1] = "NIT: 1045455695-8";
        datos[2] = "- Hora Facturacion: "+LocalTime.now().getHour()+" horas con "+LocalTime.now().getMinute()+" minutos.";
        datos[3] = "No. factura: 15458465";

        int c = 0;

        for(int k = 0; k<this.carrito_compras.get_productos_ordenados().length ;k++){
            c += this.carrito_compras.get_productos_ordenados()[k].get_precio();
        }

        datos[4] = Integer.toString(c);

        Factura f = new Factura(datos);

        return f;
    }

    public Carrito get_carrito(){
        return this.carrito_compras;
    }
}
