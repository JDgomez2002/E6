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
import java.time.LocalTime;

/**
 * Clase Vista
 * 
 * @author Grupo 9
 * @version Vista Class 1.1
 */

public class Vista {
    private Scanner sn = new Scanner(System.in);

    /**
     * Metodo para solicitar un entero al usuario
     * se ingresan el numero minimo y maximo requerido
     * 
     * @author Grupo 9
     * @version solicitar_int 1.1
     * @return int
     * @param String,int,int
     */
    public int solicitar_int(String s, int inferior, int superior){
        inferior -= 1;
        superior += 1;
        int entero = 0;
        boolean continuar = true;
            while(continuar){
                try{
                System.out.print(s);
                this.sn = new Scanner(System.in);
                int numero = sn.nextInt();
                if((numero>inferior)&&(numero<superior)){
                    entero = numero;
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    continuar = false; 
                }
                else{
                    System.out.println("\t Error: debe de ingresar un entero valido.");   
                    System.out.println();              
                }
                }
                catch(Exception e){
                    System.out.println("\t Error: debe de ingresar un entero valido.");
                    System.out.println();
                }
            }
        
        return entero;
    }

    /**
     * Metodo para solicitar string al usuario
     * 
     * @author Grupo 9
     * @version solicitar_string 1.1
     * @return String
     */
    public String solicitar_string(String s){
        String txt = "";
            boolean continuar = true;
            while(continuar){
                try{
                System.out.print(s);
                this.sn = new Scanner(System.in);
                String texto = sn.nextLine();
                if(texto.equals("")){
                    System.out.println("\t Error: debe de ingresar un texto valido.");
                    System.out.println();
                }
                else{
                    txt = texto;
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    continuar = false;                   
                }
                }
                catch(Exception e){
                    System.out.println("\t Error: debe de ingresar un texto valido.");
                    System.out.println();
                }
            }
        
        return txt;
    }    

    /**
     * Bienvenida al usuario.
     * 
     * @author Grupo 9
     * @version bienvenida 1.1
     */
    public void bienvenida(){
        System.out.println();
        System.out.println();
        System.out.println("------------ Electronica Latinoamericana ------------");
        System.out.println();
        System.out.println("------------ BIENVENIDO ------------");
        System.out.println("- Hora de Entrada: "+LocalTime.now().getHour()+" horas con "+LocalTime.now().getMinute()+" minutos.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("- Esta es la tienda en linea de Electronica Latinoamericana!");
        System.out.println("- Podra realizar compras y probar productos...");
        System.out.println("- Que empiece las compras!!!");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }

    /**
     * Menu principal para el usuario.
     * 
     * @author Grupo 9
     * @version Menuprincipal 1.1
     * @return int
     */
    public int Menuprincipal(Tienda t){
        boolean continuar = true;
        int desicion = 0;
        while(continuar){
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------- MENU PRINCIPAL ------------------");
        System.out.println("--------------------------------------------------------");
        mostrar_info_tienda(t);
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.println("¿Que accion desea ejecutar?");
        System.out.println("1. Probar y ver productos");
        System.out.println("2. Agregar producto al carrito");
        System.out.println("3. Eliminar producto del carrito");
        System.out.println("4. Finalizar Compra y generar factura");
        System.out.println("5. Cambiar datos de Tienda");
        System.out.println("6. Salir");
        System.out.println();
        String s = " Ingrese su desicion: ";
        desicion = solicitar_int(s, 1, 6);
        System.out.println();
        continuar = false;
        }
        return desicion;
    }

    /**
     * Menu de probar productos para el usuario.
     * 
     * @author Grupo 9
     * @version productos 1.1
     */
    public void productos(){
        boolean continuar = true;
        int desicion = 0;
        while(continuar){
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------- PRODUCTOS ------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("- Si desea probar un producto, digite la opcion del menu.");
        System.out.println("- Para agregar un producto al carrito, debe volver al menu principal.");
        System.out.println("- Cuando vaya a agregar el producto, digite el ID del producto.");
        System.out.println("- Podra finalizar su compra desde el menu principal.");
        System.out.println("");
        System.out.println("¿Que producto desea probar?");
        System.out.println("1. Smartphones (ID: TEL1)");
        System.out.println("2. Telefonos Celulares (ID: TEL2)");
        System.out.println("3. Telefonos fijos (ID: TEL3)");
        System.out.println("4. Camaras fotograficas (ID: CAM1)");
        System.out.println("5. Computador Personal-Desktop (ID: PC1)");
        System.out.println("6. Computador Personal-Laptop (ID: PC2)");
        System.out.println("7. Smart TV (ID: TV1)");
        System.out.println("8. Tablets (ID: TB1)");
        System.out.println("9. Smartwatch (ID: SW1)");
        System.out.println("10. Salir");
        System.out.println();
        String s = " Ingrese su desicion: ";
        desicion = solicitar_int(s, 1, 10);

        switch (desicion) {
            //smartphone
            case 1:
                MenuSmartphones();
                break;

            case 2:
                MenuTelCelular();
                break;

            case 3:
                MenuTelFijo();
                break;

            case 4:
                MenuCamara();
                break;

            case 5:
                MenuCompuDesk();
                break;

            case 6:
                MenuCompuLaptop();
                break;

            case 7:
                MenuTV();
                break;

            case 8:
                MenuTablet();
                break;

            case 9:
                MenuSmartwatch();
                break;
        
            default:
                continuar = false;
                break;
        }

        
        System.out.println();
        
        }
    }

    /**
     * Menu para SmartPhones
     * 
     * @author Grupo 9
     * @version MenuSmartphones 1.1
     */
    private void MenuSmartphones(){
        boolean continuar = true;
        while(continuar){
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------SmartPhones------------------");
        System.out.println("- Los Smartphones son telefonos inteligentes...");
        System.out.println("- Pueden realizar mas funciones que un telefono comun...");
        System.out.println("--------------------------------------------------------");
        System.out.println(); //INFORMACION DEL PRODUCTO telefono.get_info
        System.out.println("--------------------------------------------------------");
        System.out.println();
        System.out.println("¿Que accion desea ejecutar?");
        System.out.println("1. Hacer llamada");
        System.out.println("2. Tomar Fotografia");
        System.out.println("3. Navegar por internet");
        System.out.println("4. Reproducir video");
        System.out.println("5. Salir");
        System.out.println();
        String s = "- Digite su desicion: ";
        int prueba = solicitar_int(s, 1, 5);
        switch (prueba) {
            //hacer llamada
            case 1:
                String s1 = "Ingrese el numero para realizar la llamada: ";
                String numero_tel = solicitar_string(s1);
                System.out.println("- Realizando llamada al numero "+numero_tel+"...");
                System.out.println();
                break;

            //tomar foto
            case 2:
                System.out.println();
                System.out.println("- El SmartPhone esta tomando una foto.");
                System.out.println();
                break;

            //navegar 
            case 3:
                String s2 = "Ingrese el link del sitio web a visitar: ";
                String link = solicitar_string(s2);
                System.out.println("- Visitando la direccion web "+link+" desde mi SmartPhone...");
                System.out.println();
                break;

            //reproducir video
            case 4:
                System.out.println();
                System.out.println("- El SmartPhone esta reproduciendo un video.");
                System.out.println();
                break;
        
            //salir
            default:
                continuar = false;
                System.out.println("\t\tVolviendo al Menu Principal...");
                break;
        }
}
    }

    /**
     * Menu de telefonos celulares.
     * 
     * @author Grupo 9
     * @version MenuTelCelular 1.1
     */
    private void MenuTelCelular(){
        boolean continuar = true;
        while(continuar){
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------Telefonos Celulares------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("- Los Telefonos celulares sirven para muchas cosas...");
        System.out.println("- Este no puede realizar muchas acciones...");
        System.out.println("--------------------------------------------------------");
        System.out.println(); //INFORMACION DEL PRODUCTO telefono.get_info
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.println("¿Que acción desea ejecutar?");
        System.out.println("1. Hacer llamada");
        System.out.println("2. Salir"); 
        System.out.println();
        String s = "- Digite su desicion: ";
        int cel = solicitar_int(s, 1, 2);
        switch (cel) {
            //hacer llamada
            case 1:
                String s1 = "Ingrese el numero para realizar la llamada: ";
                String numero_tel = solicitar_string(s1);
                System.out.println("- Realizando llamada al numero "+numero_tel+"...");
                System.out.println();
            break;
            //salir
            default:
                continuar = false;
                System.out.println("\t\tVolviendo al Menu Principal...");
            break;
    }
}
}
    /**
     * Menu de telefonos celulares fijos.
     * 
     * @author Grupo 9
     * @version MenuTelFijo 1.1
     */
private void MenuTelFijo(){
    boolean continuar = true;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("--------------------Telefono Fijo------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("- Los Telefonos celulares nos ayudan a comunucarnos...");
    System.out.println("- Con otras personas, pero no realiza muchas acciones...");
    System.out.println("--------------------------------------------------------");
    System.out.println(); //INFORMACION DEL PRODUCTO telefono.get_info
    System.out.println("--------------------------------------------------------");
    System.out.println("");
    System.out.println("");
    System.out.println("¿Que acción desea ejecutar?");
    System.out.println("1. Hacer llamada");
    System.out.println("2. Salir");
    System.out.println();
        String s = "- Digite su desicion: ";
        int fij = solicitar_int(s, 1, 2);
        switch (fij) {
            //hacer llamada
            case 1:
            String s1 = "Ingrese el numero para realizar la llamada: ";
            String numero_tel = solicitar_string(s1);
            System.out.println("- Realizando llamada al numero "+numero_tel+"...");
            System.out.println();
        break;
        //salir
        default:
            continuar = false;
            System.out.println("\t\tVolviendo al Menu Principal...");
        break;
}
    }
}
    /**
     * Menu de camaras.
     * 
     * @author Grupo 9
     * @version MenuCamara 1.1
     */
private void MenuCamara(){
    boolean continuar = true;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("--------------------Camara fotografica------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("- La camara es un producto genial para tomar fotosgrafias...");
    System.out.println("- Con otras personas, aparte reproduce videos puedes creer...");
    System.out.println("--------------------------------------------------------");
    System.out.println(); //INFORMACION DEL PRODUCTO camara.get_info
    System.out.println("--------------------------------------------------------");
    System.out.println("");
    System.out.println("¿Que acción desea ejecutar?");
    System.out.println("1. Tomar Fotografía");
    System.out.println("2. Reproducir video");
    System.out.println("3. Salir");
    String s = "- Digite su desicion: ";
        int cam = solicitar_int(s, 1, 3);
        switch (cam) {
            //Tomar fotografia
            case 1:
                System.out.println();
                System.out.println("- La camará esta tomando una foto.");
                System.out.println();
            break;

            //Reproducir video
            case 2:
            System.out.println();
            System.out.println("- La camará esta reproduciendo un video.");
            System.out.println();
            break;
            //salir
            default:
            continuar = false;
            System.out.println("\t\tVolviendo al Menu Principal...");
            break;
}
}
}
    /**
     * Menu de computadoras-Deskop.
     * 
     * @author Grupo 9
     * @version MenuCompuDesk 1.1
     */
private void MenuCompuDesk(){
    boolean continuar = true;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("--------------------Computadora-Deskop------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("- La computadora es una herramienta muy util para muchos...");
    System.out.println("- Lo cual permite realizar tareas muy complicadas...");
    System.out.println("--------------------------------------------------------");
    System.out.println(); //INFORMACION DEL PRODUCTO computadora.get_info
    System.out.println("--------------------------------------------------------");
    System.out.println("");
    System.out.println("¿Que acción desea ejecutar?");
    System.out.println("1. Navegar por internet");
    System.out.println("2. Reproducir video");
    System.out.println("3. Ejecutar Videojuego");
    System.out.println("4. Salir");
    String s = "- Digite su desicion: ";
    int com = solicitar_int(s, 1, 4);
    switch (com) {
        //Navegar
        case 1:
        String s1 = "Ingrese el link del sitio web a visitar: ";
        String link = solicitar_string(s1);
        System.out.println("- Visitando la direccion web "+link+" desde mi Computadora-Deskop...");
        System.out.println();
        break;

        //Reproducir video
        case 2:
        System.out.println();
        System.out.println("- La coputadora esta reproduciendo un video.");
        System.out.println();
        break;

        //Ejecutar videojuego
        case 3:
        String s2 = "Ingrese el Nombre el juego a ejecutar: ";
        String juego = solicitar_string(s2);
        System.out.println("- Ejecutando el juego: "+juego+" desde mi Computadora-Deskop...");
        System.out.println();
        break;

        //salir
        default:
        continuar = false;
        System.out.println("\t\tVolviendo al Menu Principal...");
        break;  
}
}
}
    /**
     * Menu de computadoras-Laptop.
     * 
     * @author Grupo 9
     * @version MenuCompuLaptop 1.1
     */
private void MenuCompuLaptop(){
    boolean continuar = true;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("--------------------Computadora-Laptop------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("- La camara es un producto genial para tomar fotosgrafias...");
    System.out.println("- Con otras personas, aparte reproduce videos puedes creer...");
    System.out.println("--------------------------------------------------------");
    System.out.println(); //INFORMACION DEL PRODUCTO camara.get_info
    System.out.println("--------------------------------------------------------");
    System.out.println("");
    System.out.println("¿Que acción desea ejecutar?");
    System.out.println("1. Navegar por internet");
    System.out.println("2. Ejecutar Videojuego");
    System.out.println("3. Reproducir video");
    System.out.println("4. Salir");
    String s = "- Digite su desicion: ";
    int coml = solicitar_int(s, 1, 4);
    switch (coml) {
        //Navegar
        case 1:
        String s1 = "Ingrese el link del sitio web a visitar: ";
        String link = solicitar_string(s1);
        System.out.println("- Visitando la direccion web "+link+" desde mi Computadora-Laptop...");
        System.out.println();
        break;

        //Ejecutar videojuego
        case 2:
        String s2 = "Ingrese el Nombre el juego a ejecutar: ";
        String juego = solicitar_string(s2);
        System.out.println("- Ejecutando el juego: "+juego+" desde mi Computadora-Laptop...");
        System.out.println();
        break;

        //Reproducir video
        case 3:
        System.out.println();
        System.out.println("- La coputadora esta reproduciendo un video.");
        System.out.println();
        break;

        //salir
        default:
        continuar = false;
        System.out.println("\t\tVolviendo al Menu Principal...");
        break;    
}
}
}
    /**
     * Menu de televisores.
     * 
     * @author Grupo 9
     * @version MenuTV 1.1
     */
private void MenuTV(){
    boolean continuar = true;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("--------------------Televisor------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("- La televisión es un medio de comunicacion importante...");
    System.out.println("- Nos mantiene comunicados de todo lo que pasa en el pais...");
    System.out.println("--------------------------------------------------------");
    System.out.println(); //INFORMACION DEL PRODUCTO tv.get_info
    System.out.println("--------------------------------------------------------");
    System.out.println("");
    System.out.println("¿Que acción desea ejecutar?");
    System.out.println("1. Navegar por internet");
    System.out.println("2. Reproducir video");
    System.out.println("3. Salir");
    String s = "- Digite su desicion: ";
    int tv = solicitar_int(s, 1, 3);
    switch (tv) {
        //Navegar
        case 1:
        String s1 = "Ingrese el link del sitio web a visitar: ";
        String link = solicitar_string(s1);
        System.out.println("- Visitando la direccion web "+link+" desde mi Televisor...");
        System.out.println();
        break;

        //Reproducir video
        case 2:
        System.out.println();
        System.out.println("- El televisor esta reproduciendo un video.");
        System.out.println();
        break;
        //salir
        default:
        continuar = false;
        System.out.println("\t\tVolviendo al Menu Principal...");
        break;    
}
}
}
    /**
     * Menu de tablets.
     * 
     * @author Grupo 9
     * @version MenuTablet 1.1
     */
private void MenuTablet(){
    boolean continuar = true;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("--------------------Tablet------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("- Las tablets son dispositivos inteligentes con pantalla...");
    System.out.println("- Enorme que ayuda a comunicarse con otras pesonas...");
    System.out.println("--------------------------------------------------------");
    System.out.println(); //INFORMACION DEL PRODUCTO tablet.get_info
    System.out.println("--------------------------------------------------------");
    System.out.println("");
    System.out.println("¿Que acción desea ejecutar?");
    System.out.println("1. Tomar Fotografía");
    System.out.println("2. Navegar por internet");
    System.out.println("3. Reproducir video");
    System.out.println("4. Salir"); 
    String s = "- Digite su desicion: ";
    int ta = solicitar_int(s, 1, 4);
    switch (ta) {
        //Foto
        case 1:
                System.out.println();
                System.out.println("- La tablet esta tomando una foto.");
                System.out.println();
        break;

        //Navegar
        case 2:
        String s1 = "Ingrese el link del sitio web a visitar: ";
        String link = solicitar_string(s1);
        System.out.println("- Visitando la direccion web "+link+" desde mi Tablet...");
        System.out.println();
        
        break;

        //Reproducir video
        case 3:
        System.out.println();
        System.out.println("- La tablet esta reproduciendo un video.");
        System.out.println();
        break;

        //salir
        default:
        continuar = false;
        System.out.println("\t\tVolviendo al Menu Principal...");
        break; 
}
}
}
    /**
     * Menu de Smartwatch.
     * 
     * @author Grupo 9
     * @version MenuSmartwatch 1.1
     */
private void MenuSmartwatch(){
    boolean continuar = true;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("--------------------Smartwatch------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("- Es un reloj inteligente que almacena mucha informacion...");
    System.out.println("- Se dice que es una obra de arte con la que puedes...");
    System.out.println("- Realizar muchas cosas...");
    System.out.println("--------------------------------------------------------");
    System.out.println(); //INFORMACION DEL PRODUCTO Smartwatch.get_info
    System.out.println("--------------------------------------------------------");
    System.out.println("");
    System.out.println("¿Que acción desea ejecutar?");
    System.out.println("1. Tomar Fotografía");
    System.out.println("2. Hacer llamadas");
    System.out.println("3. Salir");
    String s = "- Digite su desicion: ";
    int sm = solicitar_int(s, 1, 3);
    switch (sm) {
        //Foto
        case 1:
                System.out.println();
                System.out.println("- El Smartwatch esta tomando una foto.");
                System.out.println();
        break;

        //llamada
        case 2:
            String s1 = "Ingrese el numero para realizar la llamada: ";
            String numero_tel = solicitar_string(s1);
            System.out.println("- Realizando llamada al numero "+numero_tel+"...");
            System.out.println();
        break;
        //salir
        default:
            continuar = false;
            System.out.println("\t\tVolviendo al Menu Principal...");
        break;  
}
}
}

    /**
     * Despedida para el usuario
     * 
     * @author Grupo 9
     * @version despedida 1.1
     */
public void despedida(){
    System.out.println();
    System.out.println("\tSaliendo de Electronica Latinoamericana...");
    System.out.println();
    System.out.println("\t\tGracias por utilizar la Tienda Online...");
    System.out.println("\t\tEsperamos que vuelva pronto!!!");
    System.out.println();
    System.out.println("---------------------------------------------------------------------------------------------------------------------");
}
    /**
     * Metodo para agregar producto por id.
     * 
     * @author Grupo 9
     * @version obtener_id 1.1
     * @return String
     */
public String obtener_id(Carrito c){
    System.out.println();
    System.out.println("---------------------------------------------------------------------------------------------------------------------");
    System.out.println("--- Agregar Producto al Carrito ---");
    System.out.println("- Para agregar un producto al carrito ingrese su ID.");
    System.out.println("---------------------------------------------------------------------------------------------------------------------");
    System.out.println(" Smartphones (ID: TEL1)");
    System.out.println(" Telefonos Celulares (ID: TEL2)");
    System.out.println(" Telefonos fijos (ID: TEL3)");
    System.out.println(" Camaras fotograficas (ID: CAM1)");
    System.out.println(" Computador Personal-Desktop (ID: PC1)");
    System.out.println(" Computador Personal-Laptop (ID: PC2)");
    System.out.println(" Smart TV (ID: TV1)");
    System.out.println(" Tablets (ID: TB1)");
    System.out.println(" Smartwatch (ID: SW1)");
    System.out.println("---------------------------------------------------------------------------------------------------------------------");
    mostrar_carrito(c);
    System.out.println("---------------------------------------------------------------------------------------------------------------------");
    System.out.println();

    ArrayList<String> ids = new ArrayList<String>();
    ids.add("TEL1");
    ids.add("TEL2");
    ids.add("TEL3");
    ids.add("CAM1");
    ids.add("PC1");
    ids.add("PC1");
    ids.add("TV1");
    ids.add("TB1");
    ids.add("SW1");

    String id = "";

    boolean continuar = true;

    while(continuar){
        String s = "Ingrese el ID de su producto: ";
        id = solicitar_string(s);
        if(ids.contains(id)){
            continuar = false;
        }   
        else{
            System.out.println();
            System.out.println("\t\tID no encontrado en los productos, por favor ingrese nuevamente...");
            System.out.println();
        }
    }
    return id;
}
    /**
     * Metodo para eliminar producto por id.
     * 
     * @author Grupo 9
     * @version obtener_id_eliminar 1.1
     * @return String
     */
public String obtener_id_eliminar(Carrito c){
    System.out.println();
    System.out.println("---------------------------------------------------------------------------------------------------------------------");
    System.out.println("--- Eliminar Producto al Carrito ---");
    System.out.println("- Para Eliminar un producto al carrito ingrese su ID.");
    System.out.println("---------------------------------------------------------------------------------------------------------------------");
    System.out.println(" Smartphones (ID: TEL1)");
    System.out.println(" Telefonos Celulares (ID: TEL2)");
    System.out.println(" Telefonos fijos (ID: TEL3)");
    System.out.println(" Camaras fotograficas (ID: CAM1)");
    System.out.println(" Computador Personal-Desktop (ID: PC1)");
    System.out.println(" Computador Personal-Laptop (ID: PC2)");
    System.out.println(" Smart TV (ID: TV1)");
    System.out.println(" Tablets (ID: TB1)");
    System.out.println(" Smartwatch (ID: SW1)");
    System.out.println("---------------------------------------------------------------------------------------------------------------------");
    mostrar_carrito(c);
    System.out.println("---------------------------------------------------------------------------------------------------------------------");
    System.out.println();

    ArrayList<String> ids = new ArrayList<String>();
    ids.add("TEL1");
    ids.add("TEL2");
    ids.add("TEL3");
    ids.add("CAM1");
    ids.add("PC1");
    ids.add("PC1");
    ids.add("TV1");
    ids.add("TB1");
    ids.add("SW1");

    String id = "";

    boolean continuar = true;

    while(continuar){
        String s = "Ingrese el ID del producto a eliminar: ";
        id = solicitar_string(s);
        if(ids.contains(id)){
            continuar = false;
        }   
        else{
            System.out.println();
            System.out.println("\t\tID no encontrado en los productos, por favor ingrese nuevamente...");
            System.out.println();
        }
    }
    return id;
}
    /**
     * Mensaje para agregar un producto al carro.
     * 
     * @author Grupo 9
     * @version producto_agregado 1.1
     */
public void producto_agregado(){
    System.out.println();
    System.out.println("\tProducto agregado al carrito correctamente!");
    System.out.println();
}
    /**
     * Mensaje para eliminar un producto al carro.
     * 
     * @author Grupo 9
     * @version producto_eliminado 1.1
     */
public void producto_eliminado(){
    System.out.println();
    System.out.println("\tProducto eliminado del carrito correctamente!");
    System.out.println();
}
    /**
     * Metodo para mostrar carrito
     * 
     * @author Grupo 9
     * @version mostrar_carrito 1.1
     */
private void mostrar_carrito(Carrito c){ //ERROOOOOOOOOOOOOOOR
    Producto[] productos = c.get_productos_ordenados();
    // for(int k = 0; k<productos.length ;k++){
    //     System.out.println();
    //     System.out.println("PRODUCTO "+(k+1));
    //     String[] info = productos[k].to_String_producto();
    //     System.out.println("- "+productos[k].get_tipo_producto()+" -");
    //     for(int i = 0; i<info.length ;i++){
    //         System.out.println(info[i]);
    //     }
    //     System.out.println();
    // }
    if(!((productos==null)||(productos.length==0))){
        for(int k = 0; k<productos.length ;k++){
            System.out.println();
            System.out.println("PRODUCTO "+(k+1));
            String[] info = productos[k].to_String_producto();
            System.out.println("- "+productos[k].get_tipo_producto()+" -");
            for(int i = 0; i<info.length ;i++){
                System.out.println(info[i]);
            }
            System.out.println();
        }
    }
    else{
        System.out.println();
        System.out.println("\tLo sentimos, aun no tiene productos en su carrito...");
        System.out.println();
    }
}
    /**
     * Mensaje para volver al menu
     * 
     * @author Grupo 9
     * @version volviendo_al_menu 1.1
     */
public void volviendo_al_menu(){
    System.out.println();
    System.out.println("\tVolviendo al Menu...");
    System.out.println();
}
    /**
     * Mensaje para generar factura
     * 
     * @author Grupo 9
     * @version generando_factura 1.1
     */
public void generando_factura(){
    System.out.println();
    System.out.println("\tgenerando factura...");
    System.out.println();
}
    /**
     * Metodo para mostrar factura
     * 
     * @author Grupo 9
     * @version mostrar_factura 1.1
     */
public void mostrar_factura(Factura f, Carrito c){
    String[] datos = f.get_info_factura();
    System.out.println();
    System.out.println("- - FACTURACION - -");
    for(int k = 0; k<datos.length ;k++){
        System.out.println(datos[k]);
    }
    System.out.println();
    mostrar_carrito(c);
    System.out.println();
}
    /**
     * Metodo para solicitar datos a  tienda
     * 
     * @author Grupo 9
     * @version solicitar_datos_tienda 1.1
     * @return string
     */
public String[] solicitar_datos_tienda(){
    String[] datos = new String[4];
    System.out.println();
    System.out.println("--- Cambiar datos de tienda ---");
    String s1 = "Ingrese la direccion de la tienda: ";
    datos[0] = solicitar_string(s1);
    String s2 = "Ingrese el codigo de la tienda: ";
    datos[1] = solicitar_string(s2);
    String s3 = "Ingrese el pais de la tienda: ";
    datos[2] = solicitar_string(s3);
    String s4 = "Ingrese la ciudad de ka tienda: ";
    datos[3] = solicitar_string(s4);
    System.out.println();
    System.out.println("\tDatos de la tienda cambiados correctamente!!");
    System.out.println();
    return datos;

}
    /**
     * Metodo para mostrar datos de la tienda
     * 
     * @author Grupo 9
     * @version mostrar_info_tienda 1.1
     * @return string
     */
public void mostrar_info_tienda(Tienda t){
    String[] info = t.get_info_tienda();
    System.out.println("-- Informacion de la tienda --");
    for(int k = 0; k<info.length ;k++){
        System.out.println(info[k]);
    }
}


}