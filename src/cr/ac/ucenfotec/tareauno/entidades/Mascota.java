package cr.ac.ucenfotec.tareauno.entidades;

public class Mascota {

    private String nombre;
    private Dueno dueno;
    private boolean foto;
    private int edad;
    private int ranking;
    private String observaciones;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dueno getDueno() {
        return this.dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    public Boolean getFoto() {
        return this.foto;
    }

    public void setFoto(boolean Foto) {
        this.foto = foto;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Mascota(String nombre, Dueno dueno, boolean foto, int edad, int ranking, String observaciones) {
        this.nombre = nombre;
        this.dueno = dueno;
        this.foto = foto;
        this.edad = edad;
        this.ranking = ranking;
        this.observaciones = observaciones;
    }

    public Mascota() {}

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", dueno=" + dueno +
                ", foto=" + foto +
                ", edad=" + edad +
                ", ranking=" + ranking +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}