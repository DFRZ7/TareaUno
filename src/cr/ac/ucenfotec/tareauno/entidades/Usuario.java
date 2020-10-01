package cr.ac.ucenfotec.tareauno.entidades;

public class Usuario {

    private String nombre;
    private int cedula;
    private int telefono;
    private String correo;
    private boolean estado;
    private String rol;

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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario(String nombre, int cedula, int telefono, String correo, boolean estado, String rol) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
        this.rol = rol;
    }

    public Usuario() {}

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", estado=" + estado +
                ", rol='" + rol + '\'' +
                '}';
    }
}
