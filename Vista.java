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
    private Scanner stringscan = new Scanner(System.in);
    private Scanner sn = new Scanner(System.in);

    /**
     * Metodo para solicitar un entero al usuario
     * se ingresan el numero minimo y maximo requerido
     * 
     * @author José Daniel Gómez Cabrera
     * @version solicitar_int 1.1
     * @return int
     * @param int,int
     */
    private int solicitar_int(String s, int inferior, int superior){
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
     * @author José Daniel Gómez Cabrera
     * @version solicitar_string 1.1
     * @return String
     */
    private String solicitar_string(){
        String txt = "";
            boolean continuar = true;
            while(continuar){
                try{
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
     * @author José Daniel Gómez Cabrera
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

    public int Menuprincipal(){
        boolean continuar = true;
        int desicion = 0;
        while(continuar){
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------- MENU PRINCIPAL ------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.println("¿Que accion desea ejecutar?");
        System.out.println("1. Probar y ver productos...");
        System.out.println("2. Agregar producto al carrito...");
        System.out.println("3. Finalizar Compra");
        System.out.println("4. Salir");
        System.out.println();
        String s = " Ingrese su desicion: ";
        desicion = solicitar_int(s, 1, 4);
        System.out.println();
        continuar = false;
        }
        return desicion;
    }

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
        System.out.println("2. Teléfonos Celulares (ID: TEL2)");
        System.out.println("3. Teléfonos fijos (ID: TEL3)");
        System.out.println("4. Cámaras fotográficas (ID: CAM1)");
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

    public void MenuSmartphones(){
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
                System.out.print("Ingrese el numero para realizar la llamada: ");
                String numero_tel = solicitar_string();
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
                System.out.print("Ingrese el link del sitio web a visitar: ");
                String link = solicitar_string();
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

    public void MenuTelCelular(){
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
                System.out.print("Ingrese el numero para realizar la llamada: ");
                String numero_tel = solicitar_string();
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

public void MenuTelFijo(){
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
            System.out.print("Ingrese el numero para realizar la llamada: ");
            String numero_tel = solicitar_string();
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

public void MenuCamara(){
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
public void MenuCompuDesk(){
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
        System.out.print("Ingrese el link del sitio web a visitar: ");
        String link = solicitar_string();
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
        System.out.print("Ingrese el Nombre el juego a ejecutar: ");
        String juego = solicitar_string();
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
public void MenuCompuLaptop(){
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
        System.out.print("Ingrese el link del sitio web a visitar: ");
        String link = solicitar_string();
        System.out.println("- Visitando la direccion web "+link+" desde mi Computadora-Laptop...");
        System.out.println();
        break;

        //Ejecutar videojuego
        case 2:
        System.out.print("Ingrese el Nombre el juego a ejecutar: ");
        String juego = solicitar_string();
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
public void MenuTV(){
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
        System.out.print("Ingrese el link del sitio web a visitar: ");
        String link = solicitar_string();
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

public void MenuTablet(){
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
        System.out.print("Ingrese el link del sitio web a visitar: ");
        String link = solicitar_string();
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
public void MenuSmartwatch(){
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
            System.out.print("Ingrese el numero para realizar la llamada: ");
            String numero_tel = solicitar_string();
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


public void despedida(){
    System.out.println();
    System.out.println("\tSaliendo de Electronica Latinoamericana...");
    System.out.println();
    System.out.println("\t\tGracias por utilizar la Tienda Online...");
    System.out.println("\t\tEsperamos que vuelva pronto!!!");
    System.out.println();
    System.out.println("---------------------------------------------------------------------------------------------------------------------");
}

}