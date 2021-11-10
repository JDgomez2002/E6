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
/**
 * metodo solicitar datos del smartDevice
 * 
 * @author Grupo 9
 * @version SmartDevice 1.1
 */  
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
/**
 * metodo para probar productos
 * 
 * @author Grupo 9
 * @version probar_producto 1.1
 */
    public String probar_producto(){
        String s = "El dispositivo "+this.serie+" de la marca "+this.marca+" se esta probando...";
        return s;
    }
/**
 * metodo to string de productos
 * 
 * @author Grupo 9
 * @version to_String_producto 1.1
 * @return string
 */
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
/**
 * metodo get para portabilidad
 * 
 * @author Grupo 9
 * @version get_portabilidad 1.1
 * @return boolean 
 */
    public boolean get_portabilidad(){
        return this.portabilidad;
    }
/**
 * metodo get para el tipo de producto
 * 
 * @author Grupo 9
 * @version get_tipo_producto 1.1
 * @return string
 */
    public String get_tipo_producto(){
        return this.tipo_producto;
    }
/**
 * metodo get para el id
 * 
 * @author Grupo 9
 * @version get_id 1.1
 * @return string
 */
    public String get_id(){
        return this.id;
    }
/**
 * metodo get para el precio
 * 
 * @author Grupo 9
 * @version get_precio 1.1
 * @return int
 */
    public int get_precio(){
        int precio = 0;
        try{
            precio = Integer.parseInt(this.precio);
        }
        catch(Exception e){
            String s = "get_precio(): "+e.getMessage();
            throw new RuntimeException(s);
        }
        return precio;
    }

}
