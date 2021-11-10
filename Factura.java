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
 * Clase Factura
 * 
 * @author Grupo 9
 * @version Factura Class 1.1
 */
public class Factura {
    private String no_cliente;
    private String nit;
    private String fecha;
    private String no_factura;
    private int monto_total;
    private Producto[] productos;

    public Factura(String[] datos){
        this.no_cliente = datos[0];
        this.nit = datos[1];
        this.fecha = datos[2];
        this.no_factura = datos[3];
        this.monto_total = set_monto(datos[4]);
    }

    private int set_monto(String monto_total){
        int monto = 0;
        try{
            monto = Integer.parseInt(monto_total);
        }
        catch(Exception e){
            String s = "Factura: set_monto() "+e.getMessage();
            throw new RuntimeException(s);
        }
        return monto;
    }

    public String[] get_info_factura(){
        String[] info = new String[5];
        info[0] = this.no_cliente;
        info[1] = this.nit;
        info[2] = this.fecha;
        info[3] = this.no_factura;
        info[4] = "TOTAL: Q"+Integer.toString(this.monto_total);  
        return info;
    }
}
