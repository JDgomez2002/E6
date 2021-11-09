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
 * Clase SmartDevice
 * 
 * @author Grupo 9
 * @version SmartDevice Class 1.1
 */
abstract class SmartDevice implements Producto{
    protected String tipo_producto;
    protected String id = "";
    protected String precio = "";
    protected String serie = "";
    protected String marca = "";
    protected String fecha_fabricacion = "";
    protected String marcador_ar = "";
    protected boolean portabilidad;

    abstract String navegar_internet();

    abstract String reproducir_video();
    
    public SmartDevice(String[] datos, boolean portable){
        this.tipo_producto = "Smart_device";
        this.id = datos[0];
        this.precio = datos[1];
        this.serie = datos[2];
        this.marca = datos[3];
        this.fecha_fabricacion = datos[4];
        this.marcador_ar = datos[5];
        this.portabilidad = portable;
    }

    public String probar_producto(){
        String s = "El dispositivo "+this.serie+" de la marca "+this.marca+" se esta probando...";
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

    public String get_tipo_producto(){
        return this.tipo_producto;
    }

    public String get_id(){
        return this.id;
    }

}
