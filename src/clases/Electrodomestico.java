package clases;

public abstract class Electrodomestico {

    // Campos
    protected int idElectrodomestico;
    protected static int contadorElectrodomestico;
    protected String marca;
    protected double precio;

    // Constructor
    public Electrodomestico(String marca, double precio) {
        this.idElectrodomestico = ++Electrodomestico.contadorElectrodomestico;
        this.marca = marca;
        this.precio = precio;
    }

    //Metodo
    public abstract void usoElectrodomestico();

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID Electrodomestico= ").append(idElectrodomestico);
        sb.append(", Marca= ").append(marca);
        sb.append(", Precio= ").append(precio).append(" $");
        return sb.toString();
    }

}
