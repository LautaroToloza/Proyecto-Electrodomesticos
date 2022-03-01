package principal;

import clases.*;
import java.util.*;

/**
 * @author Lautaro Toloza
 */
public class Principal {

    public static void main(String[] args) {
        menu();
        System.out.println("\nGracias por utilizar el programa de electrodomesticos.");

    }

    public static String cargarTexto(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.print(texto);
        String ingrese = leer.nextLine();

        return ingrese;
    }

    public static int cargarNumero(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.print(texto);
        int numero = leer.nextInt();

        return numero;
    }

    public static double cargarNumeroDou(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.print(texto);
        double num = leer.nextDouble();

        return num;
    }

    public static void menu() {

        boolean flag = true;
        int opcion;
        String tex = "-------------------\n"
                + "Menú de opciones..\n"
                + "(1) Para mostrar los electrodomesticos disponibles y puede ver su utilidad.\n"
                + "(2) Para realizar una carga de una Notebook.\n"
                + "(3) Para realizar la carga de una Heladera\n"
                + "(4) Para hacer la carga de un Lavarropas\n"
                + "(0) para salir\n"
                + "En caso de ingresar una opción no valida el programa terminara!!"
                + "-------------------";
        System.out.println(tex);
        try {
            while (flag) {
                System.out.println("\n*****************************************************");
                String texto = "Ingrese una opción con (0) sale del programa: ";
                opcion = cargarNumero(texto);
                switch (opcion) {
                    case 1:
                        System.out.println("Muestra de productos disponibles..\n");
                        disponible();
                        break;
                    case 2:
                        System.out.println("Realiza la carga de una Notebook..");
                        hacerNotebook();
                        break;
                    case 3:
                        System.out.println("Realiza una carga de un Heladera..");
                        hacerHeladera();
                        break;
                    case 4:
                        System.out.println("Realiza la carga de un Lavarropas..");
                        hacerLavarropas();
                        break;
                    case 0:
                        flag = false;
                        break;
                }
            }
        } catch (InputMismatchException nombreExcepcion) {
            String texto = "Error: " + nombreExcepcion;
            System.out.println(texto);
        }
    }

    public static void disponible() {
        Electrodomestico n1 = new Notebook("i7", 32, "Asus", 135000);
        Electrodomestico n2 = new Notebook("i5", 8, "Lenovo", 55950);
        Electrodomestico n3 = new Notebook("M1", 64, "Apple", 195890);
        Electrodomestico h1 = new Heladera("Negro", 57, 163.5, 60, "Samsung", 77990);
        Electrodomestico h2 = new Heladera("Blanco", 63, 150.5, 58, "Sigma", 66780);
        Electrodomestico l1 = new Lavarropas(6, 600, "Dream", 66999);
        // Muestra de productos
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(l1.toString());
        int op = cargarNumero("\nIngrese (1) si quiere ver la utilidad de los productos: ");
        if (op == 1) {
            System.out.println("\nNOTEBOOK:");
            n1.usoElectrodomestico();
            System.out.println("\nHELADERA:");
            h1.usoElectrodomestico();
            System.out.println("\nLAVARROPAS:");
            l1.usoElectrodomestico();
        }
    }

    public static void hacerNotebook() {
        String proc = cargarTexto("Ingrese un procesador: ");
        int ram = cargarNumero("Ingrese la cantidad de memoria ram: ");
        String marca = cargarTexto("Ingrese la marca de la notebook: ");
        double precio = cargarNumeroDou("Ingrese el precio de la notebook: ");
        Electrodomestico n1 = new Notebook(proc, ram, marca, precio);
        System.out.println("La carga realizada quedo con los siguientes datos..\n");
        System.out.println(n1.toString());
    }

    public static void hacerHeladera() {
        String color = cargarTexto("Ingrese el color de la heladera: ");
        int peso = cargarNumero("Ingrese el peso de la heladera: ");
        double alto = cargarNumeroDou("Ingrese el alto de la heladera en cm: ");
        int ancho = cargarNumero("Ingrese el ancho de la heladera en cm: ");
        String marca = cargarTexto("Ingrese la marca de la heladera: ");
        double precio = cargarNumeroDou("Ingrese el precio de la heladera: ");
        Electrodomestico h1 = new Heladera(color, peso, alto, ancho, marca, precio);
        System.out.println("La carga realizada quedo con los siguientes datos..\n");
        System.out.println(h1.toString());
    }

    public static void hacerLavarropas() {
        int ropa = cargarNumero("Ingrese el peso de la heladera: ");
        int velocidad = cargarNumero("Ingrese el peso de la heladera: ");
        String marca = cargarTexto("Ingrese el color de la heladera: ");
        double precio = cargarNumeroDou("Ingrese el precio del lavarropas: ");
        Electrodomestico l1 = new Lavarropas(ropa, velocidad, marca, precio);
        System.out.println(l1.toString());
    }

}
