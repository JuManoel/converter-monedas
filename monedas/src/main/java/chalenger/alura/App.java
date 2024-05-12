package chalenger.alura;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Scanner scn;

    public static int menu(){
        String mensaje=
                "1) Dolar para Peso Argentino\n"+
                "2) Peso Argentino para Dolar\n"+
                "3) Dolar para Reales Brasileños\n"+
                "4) Reales Brasileños para Dolar\n"+
                "5) Dolar para Pesos Colombianosz\n"+
                "6) Pesos Comlombianos para Dolar\n"+
                "7)Salir";
        
        System.out.println(mensaje);
        switch (scn.nextInt()) {
            case 1:
                
                return menu();
            case 2:
                
                return menu();
            case 3:
                
                return menu();
            case 4:
                
                return menu();
            case 5:
                
                return menu();
            case 6:
                
                return menu();
            case 7:
                return 0;  
            default:
                System.out.println("Opcion invalida");
                return menu();
        }
    }

    public static void main( String[] args )
    {   
        scn=new Scanner(System.in);
        Moneda dolar;//dollar
        Moneda brl;//real
        Moneda col;//peso colombiano
        Moneda ars;//peso argentino
        /*
         * Dolar=>Ars
         * Ars=>Dolar
         * Dolar=>Br
         * Br=>Dolar
         * Dolar=>Real
         * Dolar=>Col
         * Col=>Dolar
         */
        scn.close()
    }
}
