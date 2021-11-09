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

/**
 * Clase Tienda
 * 
 * @author Grupo 9
 * @version Tienda Class 1.1
 */

public class Tienda {
    private ArrayList<Producto> productos_disponibles = new ArrayList<Producto>();

    public Tienda(){
        leer_productos();

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
            String s = "Tienda: leer_productos(): "+e.getMessage();
            throw new RuntimeException(s);
        }
    }

    public ArrayList<Producto> get_productos_disponibles(){
        return this.productos_disponibles;
    }

}
