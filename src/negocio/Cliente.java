package negocio;

public class Cliente {

    private String apellido;

    private String nombre;

    private int dni;

    private String ciudad;
    
    private String direccion;

    public Cliente(String apellido, String nombre, int dni, String ciudad, String direccion) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "~Cliente~\n" + "Nombre: " + nombre + "|Apellido: " + apellido + "|DNI: " 
                + dni + "|Ciudad: " + ciudad + "|Direccion: " + direccion;
    }
    
    
    
}
