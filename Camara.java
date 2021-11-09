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
 * Clase Camara
 * 
 * @author Grupo 9
 * @version Camara Class 1.1
 */
public class Camara implements Producto{
    private String tipo_producto;
    private String id;
    private String precio;
    private String serie;
    private String marca;
    private String fecha_fabricacion;
    private String marcador_ar;
    private boolean portabilidad;
    
    public Camara(String[] datos){
        this.tipo_producto = "Camara";
        this.id = datos[0];
        this.precio = datos[1];
        this.serie = datos[2];
        this.marca = datos[3];
        this.fecha_fabricacion = datos[4];
        this.marcador_ar = datos[5];
        this.portabilidad = true;
    }

    public String probar_producto(){
        String s = "La camara "+this.serie+" de la marca "+this.marca+" se esta probando...";
        return s;
    }

    public String[] to_String_producto(){
        String[] datos = new String[7];
        datos[0] = this.id;
        datos[1] = this.precio;
        datos[2] = this.serie;
        datos[3] = this.marca;
        datos[4] = this.fecha_fabricacion;
        datos[5] = this.marcador_ar;
        datos[6] = this.tipo_producto;
        return datos;
    }

    public boolean get_portabilidad(){
        return this.portabilidad;
    }

    public String tomar_foto(){
        String s = "La camara "+this.serie+" de la marca "+this.marca+" esta tomando una foto...";
        return s;
    }

    public String reproducir_video(){
        String s = "La camara "+this.serie+" de la marca "+this.marca+" esta reproduciendo video...";
        return s;
    }

    public String get_tipo_producto(){
        return this.tipo_producto;
    }

    public String get_id(){
        return this.id;
    }
}
