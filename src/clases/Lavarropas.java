package clases;

public class Lavarropas extends Electrodomestico {

    // Campos
    private int cargaMaxRopa;
    private int velocidad;

    // Constructor
    public Lavarropas(int cargaMaxRopa, int velocidad, String marca, double precio) {
        super(marca, precio);
        this.cargaMaxRopa = cargaMaxRopa;
        this.velocidad = velocidad;
    }

    // Getter y Setter
    public int getCargaMaxRopa() {
        return cargaMaxRopa;
    }

    public void setCargaMaxRopa(int cargaMaxRopa) {
        this.cargaMaxRopa = cargaMaxRopa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // Metodo
    @Override
    public void usoElectrodomestico() {
        System.out.println("Utilidad: Desinfectar y quitar manchas de la ropa. ");
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lavarropas{");
        sb.append(super.toString());
        sb.append(", Carga máxima de ropa= ").append(cargaMaxRopa).append(" Kg");
        sb.append(", Velocidad= ").append(velocidad).append(" RPM");
        sb.append('}');
        return sb.toString();
    }

}
