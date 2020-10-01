package cr.ac.ucenfotec.tareauno.entidades;

public class Cita {

    private String fecha;
    private String hora;
    private String observaciones;
    private Mascota mascota;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Cita(String fecha, String hora, String observaciones, Mascota mascota) {
        this.fecha = fecha;
        this.hora = hora;
        this.observaciones = observaciones;
        this.mascota = mascota;
    }

    public Cita () {}

    @Override
    public String toString() {
        return "Cita{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", mascota=" + mascota +
                '}';
    }
}
