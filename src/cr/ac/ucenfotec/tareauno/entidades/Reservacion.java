package cr.ac.ucenfotec.tareauno.entidades;

public class Reservacion {

    private String entrada;
    private String salida;
    private Mascota mascota;

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Reservacion(String entrada, String salida, Mascota mascota) {
        this.entrada = entrada;
        this.salida = salida;
        this.mascota = mascota;
    }

    public Reservacion() {}

    @Override
    public String toString() {
        return "Reservacion{" +
                "entrada='" + entrada + '\'' +
                ", salida='" + salida + '\'' +
                ", mascota=" + mascota +
                '}';
    }
}
