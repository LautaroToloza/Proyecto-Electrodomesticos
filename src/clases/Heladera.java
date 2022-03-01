package clases;

public class Heladera extends Electrodomestico {

    // Campos 
    private String color;
    private int peso;
    private double alto;
    private int ancho;

    // Constructor
    public Heladera(String color, int peso, double alto, int ancho, String marca, double precio) {
        super(marca, precio);
        this.color = color;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
    }

    // Getter y Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    //Metodo
    @Override
    public void usoElectrodomestico() {
        System.out.println("Utilidad: Conservar productos alimenticios. ");
    }

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Heladera{");
        sb.append(super.toString());
        sb.append(", Color= ").append(color);
        sb.append(", Peso= ").append(peso).append(" Kg");
        sb.append(", Alto= ").append(alto).append(" cm");
        sb.append(", Ancho= ").append(ancho).append(" cm");
        sb.append('}');
        return sb.toString();
    }

}
