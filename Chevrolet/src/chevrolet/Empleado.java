package chevrolet;

public class Empleado {
public int dni;
public String nombre;
public String apellido;
public double sueldo;
public String rol;

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getRol() {
        return rol;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Empleado(int dni,String nombre, String apellido, double sueldo, String rol) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.rol = rol;
    }

}
