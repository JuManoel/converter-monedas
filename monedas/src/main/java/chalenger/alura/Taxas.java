package chalenger.alura;

public class Taxas {
    public static String nombres(int i){
        switch (i) {
            case 1: return "conversion_rates";
            default: throw new IllegalArgumentException("Ingresaste un valor que no existe");
        }
    }
}
