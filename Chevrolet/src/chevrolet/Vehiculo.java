package chevrolet;

public class Vehiculo {
    public String patente;
    public String marca;
    public String modelo;
    public String color;
    public int cantidad_de_puertas;
    public String tipo_de_caja;
    public double precio;
    public String estado;

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getCantidad_de_puertas() {
        return cantidad_de_puertas;
    }

    public String getTipo_de_caja() {
        return tipo_de_caja;
    }

    public double getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCantidad_de_puertas(int cantidad_de_puertas) {
        this.cantidad_de_puertas = cantidad_de_puertas;
    }

    public void setTipo_de_caja(String tipo_de_caja) {
        this.tipo_de_caja = tipo_de_caja;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Vehiculo(String patente, String marca, String modelo, String color, int cantidad_de_puertas, String tipo_de_caja, double precio, String estado) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidad_de_puertas = cantidad_de_puertas;
        this.tipo_de_caja = tipo_de_caja;
        this.precio = precio;
        this.estado = estado;
    }
}
