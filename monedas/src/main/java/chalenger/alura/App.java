package chalenger.alura;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Scanner scn;
    public static int taxa=1;
    public static Moneda usd=new Moneda( ConnectorApi.connect("USD",taxa));//dollar
    public static Moneda brl=new Moneda( ConnectorApi.connect("BRL",taxa));;//real
    public static Moneda cop=new Moneda( ConnectorApi.connect("COP",taxa));;//peso colombiano
    public static Moneda ars=new Moneda( ConnectorApi.connect("ARS",taxa));;//peso argentino

    public static void menu(){
        int opcion;
        do {
            String mensaje=
                "1) Dolar para Peso Argentino\n"+
                "2) Peso Argentino para Dolar\n"+
                "3) Dolar para Reales Brasileños\n"+
                "4) Reales Brasileños para Dolar\n"+
                "5) Dolar para Pesos Colombianosz\n"+
                "6) Pesos Comlombianos para Dolar\n"+
                "7)Salir";
        
        System.out.println(mensaje);
        opcion=scn.nextInt();
        float valor=0;
        if(opcion!=7){
            System.out.println("Ingrese el monto a convertir");
            valor= scn.nextFloat();
        }
        
        Moneda m;
        switch (opcion) {
            case 1:
                m=usd.converterMoneda("ARS", valor, taxa);
                System.out.println(m);
                break;
            case 2:
                m=ars.converterMoneda("USD", valor, taxa);
                System.out.println(m);
                break;
            case 3:
                m=usd.converterMoneda("BRL", valor, taxa);
                System.out.println(m);
                break;
            case 4:
                m=brl.converterMoneda("USD", valor, taxa);
                System.out.println(m);
                break;
            case 5:
                m=usd.converterMoneda("COP", valor, taxa);
                System.out.println(m);
                break;
            case 6:
                m=cop.converterMoneda("USD", valor, taxa);
                System.out.println(m);
                break;
            case 7:
                break;  
            default:
                System.out.println("Opcion invalida");
                break;
            }
        } while (opcion!=7);
    }

    public static void main( String[] args )
    {   
        scn=new Scanner(System.in);
        menu();
        System.out.println("Fin programa");
        scn.close();
    }
}
