package clases;

public class Notebook extends Electrodomestico {

    // Campos
    private String procesador;
    private int ram;

    // Constructor
    public Notebook(String procesador, int ram, String marca, double precio) {
        super(marca, precio);
        this.procesador = procesador;
        this.ram = ram;
    }

    // Getter y Setter
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    // Metodo
    @Override
    public void usoElectrodomestico() {
        System.out.println("Utilidad: De uso laboral, aprendizaje y entretenimiento. ");
    }

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Notebook{");
        sb.append(super.toString());
        sb.append(", Procesador= ").append(procesador);
        sb.append(", RAM= ").append(ram).append(" GB");
        sb.append("}");
        return sb.toString();
    }

}
