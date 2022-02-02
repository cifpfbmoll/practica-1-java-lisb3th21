
import java.util.ArrayList;
import java.util.Scanner;


public class ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //JOptionPane info= new JOptionPane(message);
        System.out.println("Ingrese el ejercicio que desee ejecutar: ");
        String respuesta = "";
        
            System.out.println("Ingrese un numero del 1 al 9");
            respuesta = input.next();

       input.nextLine();
       input.close();
        switch (respuesta) {
            case "1":
                ejercicioA();
                break;
            case "2":
                ejercicioB();
                break;
            case "3":
                ejercicioC();
                break;
            case "4":
                System.out.println("Ingrese un texto y le le devolvemos su longitud: ");
                String frase = input.nextLine();
                System.out.println("Su texto tiene " + ejercicioD(frase));
                break;
            case "5":
                System.out.println("Ingrese un texto y le le devolvemos el texto invertido");
                frase = input.nextLine();
                System.out.println(ejercicioE(frase));
                break;
            case "6":
                System.out.println("Ingrese un texto y le le devolvemos el texto sin espacios");
                frase = input.nextLine();
                System.out.println(ejercicioF(frase));
                break;
            case "7":
                System.out.println("Ingrese una frase: ");
                String frase1 = input.nextLine();
                System.out.println("Ingrese otra frase: ");
                String frase2 = input.nextLine();
                System.out.println(ejercicioG(frase1, frase2));
                break;
            case "8":
                System.out.println("Ingrese una vocal:");
                char vocal = input.nextLine().charAt(0);
                System.out.println("Ingrese la frase que quiere modificar:");
                frase = input.nextLine();
                ejercicioH(frase, vocal);
                break;
            case "9":
            System.out.println("Ingrese una frase y le devolveremos su codigo ASCII");
            frase=input.nextLine();
                ejercicioI(frase);
                break;
        }
    }

    public static void ejercicioA() {
        // Leer 5 números (con bucle por favor, no pongáis 5 scanner consecutivos) y
        // mostrarlos en el mismo orden introducido. Los 5 números se deben almacenar en
        // un array.
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        int numero = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero: ");
            numero = input.nextInt();
            listaNumeros.add(numero);
        }
        System.out.println("Los numeros que ha ingresado son: ");
        String numeros = "";
        for (int i = 0; i < listaNumeros.size(); i++) {
            numeros += listaNumeros.get(i) + "   ";
        }
        System.out.println(numeros);
        input.close();
    }

    public static void ejercicioB() {
        // Leer 5 números y mostrarlos en orden inverso al introducido.
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        int numero = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero: ");
            numero = input.nextInt();
            listaNumeros.add(numero);
        }
        System.out.println("Los numeros que ha ingresado son: ");
        String numeros = "";
        for (int i = listaNumeros.size() - 1; i >= 0; i--) {
            numeros += listaNumeros.get(i) + "   ";
        }
        System.out.println(numeros);
        input.close();
    }

    public static void ejercicioC() {
        // Leer 5 números por teclado y a continuación realizar la media de los números
        // positivos, la media de los negativos y contar el número de ceros que se han
        // introducido por teclado.
        ArrayList<Integer> listaPositivos = new ArrayList<Integer>();
        ArrayList<Integer> listaNegativos = new ArrayList<Integer>();
        int numero = 0;
        int cantidadCero = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero: ");
            numero = input.nextInt();
            if (numero > 0) {
                listaPositivos.add(numero);
            } else if (numero < 0) {
                listaNegativos.add(numero);
            } else {
                cantidadCero++;
            }
        }
        float mediaPositivos = 0f;
        // media de los positivos
        for (int i = 0; i < listaPositivos.size(); i++) {
            mediaPositivos += listaPositivos.get(i);
        }
        System.out.println(
                "La media de los numeros positivos que ha ingresado es " + (mediaPositivos / listaPositivos.size()));
        float mediaNegativo = 0f;
        // media de los negativos
        for (int i = 0; i < listaNegativos.size(); i++) {
            mediaNegativo += listaNegativos.get(i);
        }
        System.out.println(
                "La media de los numeros positivos que ha ingresado es " + (mediaNegativo / listaNegativos.size()));
        System.out.println("Los ceros que ha ingresado son:" + cantidadCero);
        input.close();
    }

    public static int ejercicioD(String frase) {
        //Reciba como parámetro un texto y devuelva la cantidad de caracteres que incorpora el texto.
        int cantidad = frase.length();
        return cantidad;
    }

    public static String ejercicioE(String frase) {
        //Reciba como parámetro un texto y devuelva el texto invertido.
        String textoInvertido = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            char caracter = frase.charAt(i);
            textoInvertido += caracter;
        }
        return textoInvertido;
    }

    public static String ejercicioF(String frase) {
        //Reciba como parámetro un texto y lo devuelva sin espacios en blanco.
        String sinEspacios = "";
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter != ' ') {
                sinEspacios += frase.charAt(i);
            }
        }
        return sinEspacios;
    }

    public static String ejercicioG(String frase1, String frase2) {
        // Reciba como parámetro dos cadenas y las devuelva concatenadas.
        frase1 += " ";
        String concatenada = frase1.concat(frase2);
        return concatenada;
    }

    public static void ejercicioH(String frase, char vocal) {
        // Reciba como parámetro una cadena y una vocal, el método sustituye todas las
        // vocales de la cadena por la vocal que se ha pasado como parámetro (no
        // devuelve nada).
        String fraseModificada = "";
        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                fraseModificada += vocal;
            } else {
                fraseModificada += caracter;
            }
        }
        System.out.println("La frase con las vocales cambiadas es: ");
        System.out.println(fraseModificada);
    }

    public static void ejercicioI(String frase) {
        //Reciba como parámetro una cadena, y muestre el código ASCII de cada uno de los caracteres de la cadena (no devuelve nada el método).
        String codigo="";
        for (int i=0; i<frase.length(); i++){
            int ascii= frase.charAt(i);
            codigo+= ascii+" ";
        }
        System.out.println(codigo);
    }

}
