
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese el ejercicio que desee ejecutar: ");
        Scanner input= new Scanner(System.in);
        int respuesta=input.nextInt();
        switch (respuesta){
            case 1:ejercicioA();break;
            case 2:ejercicioB();break;
            case 3:ejercicioC();break;
            case 4: ejercicioD();break;
            case 5:ejercicioE();break;
            case 6:ejercicioF();break;
            case 7:ejercicioG();break;
            case 8:ejercicioH();break;
            case 9:ejercicioI();break;
        }
    }

    public static void ejercicioA(){
        //Leer 5 números (con bucle por favor, no pongáis 5 scanner consecutivos) y mostrarlos en el mismo orden introducido. Los 5 números se deben almacenar en un array.
        ArrayList<Integer> listaNumeros=new ArrayList<Integer>();
        int numero=0;
        Scanner input= new Scanner(System.in);
        for (int i=0; i<5;i++){
            System.out.println("Ingrese un numero: ");
            numero=input.nextInt();
            listaNumeros.add(numero);            
        }
        System.out.println("Los numeros que ha ingresado son: ");
        String numeros="";
        for (int i=0; i<listaNumeros.size(); i++){
            numeros+=listaNumeros.get(i)+"   ";
        }
        System.out.println(numeros);
        input.close();
    }



    public static void ejercicioB(){
        //Leer 5 números y mostrarlos en orden inverso al introducido.
        ArrayList<Integer> listaNumeros=new ArrayList<Integer>();
        int numero=0;
        Scanner input= new Scanner(System.in);
        for (int i=0; i<5;i++){
            System.out.println("Ingrese un numero: ");
            numero=input.nextInt();
            listaNumeros.add(numero);            
        }
        System.out.println("Los numeros que ha ingresado son: ");
        String numeros="";
        for (int i=listaNumeros.size()-1; i>=0; i--){
            numeros+=listaNumeros.get(i)+"   ";
        }
        System.out.println(numeros);
        input.close();
    }



    public static void ejercicioC(){
        //Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros que se han introducido por teclado.
        ArrayList<Integer> listaPositivos=new ArrayList<Integer>();
        ArrayList<Integer> listaNegativos=new ArrayList<Integer>();
        int numero=0;
        int cantidadCero=0;
        Scanner input= new Scanner(System.in);
        for (int i=0; i<5;i++){
            System.out.println("Ingrese un numero: ");
            numero=input.nextInt();
            if (numero>0){
                listaPositivos.add(numero);
            }else if(numero<0){
                listaNegativos.add(numero);
            }else{
                cantidadCero++;
            }
        }
float mediaPositivos=0f;
        //media de los positivos
        for (int i=0; i<listaPositivos.size(); i++){
            mediaPositivos+=listaPositivos.get(i);
        }
        System.out.println("La media de los numeros positivos que ha ingresado es "+(mediaPositivos/listaPositivos.size()));
        float mediaNegativo=0f;
        //media de los negativos
        for (int i=0; i<listaNegativos.size(); i++){
            mediaNegativo+=listaNegativos.get(i);
        }
        System.out.println("La media de los numeros positivos que ha ingresado es "+(mediaNegativo/listaNegativos.size()));
        System.out.println("Los ceros que ha ingresado son:"+cantidadCero);

    }



    
    public static void ejercicioD(){

    }
    public static void ejercicioE(){

    }
    public static void ejercicioF(){

    }
    public static void ejercicioG(){

    }
    public static void ejercicioH(){

    }
    public static void ejercicioI(){

    }


    
}
