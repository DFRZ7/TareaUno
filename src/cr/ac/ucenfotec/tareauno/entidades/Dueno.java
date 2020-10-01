package cr.ac.ucenfotec.tareauno.entidades;

public class Dueno {

    private String nombre;
    private int cedula;
    private int telefono;
    private String correo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Dueno(String nombre, int cedula, int telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Dueno () {}

    @Override
    public String toString() {
        return "Dueno{" +
                "nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                '}';
    }
}
