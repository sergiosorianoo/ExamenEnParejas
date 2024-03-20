public class Cliente {

    //Atributos
    protected String nombre,apellidos,email,telefono,dni,numTarjetaCred;

    //Metodos
    //Constructor

    public Cliente(String nombre, String apellidos, String email, String telefono, String dni, String numTarjetaCred) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.numTarjetaCred = numTarjetaCred;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumTarjetaCred() {
        return numTarjetaCred;
    }

    public void setNumTarjetaCred(String numTarjetaCred) {
        this.numTarjetaCred = numTarjetaCred;
    }

    //Otros metodos
}
