package chalenger.alura;

import org.json.JSONObject;

public class Moneda {
    private float cantidad;
    private JSONObject taxas;
    private String nombre;

    public Moneda(JSONObject json) {
        this.taxas=json;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public JSONObject getTaxas() {
        return taxas;
    }

    public void setTaxas(JSONObject taxas) {
        this.taxas = taxas;
    }
    
    public Moneda converterMoneda(String nombre, float valor, int taxa){
        Moneda moneda = new Moneda(ConnectorApi.connect(nombre, taxa));
        moneda.setCantidad(valor*this.taxas.getFloat(nombre));
        moneda.setNombre(nombre);
        return moneda;
    }

    @Override
    public String toString() {
        String str=
        "Nombre: "+this.nombre+"\n"+
        "valor: "+this.cantidad;
        return str;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      
}
