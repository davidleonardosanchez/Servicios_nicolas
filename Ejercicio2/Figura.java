package Ejercicio2;

public class Figura {

    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimension;

    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimension) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimension = dimension;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
    
    public void subirPrecio(double cantidad){
       this.precio += cantidad;
    }
    
    
    @Override
    public String toString() {
        return "\nDatos de la Figura\ncodigo:" + codigo + "\nPrecio: " + precio
                + "\nNombre: " + superheroe.getNombre() + "\nDescripcion: " + superheroe.getDescripcion()
                + "\nCapa: " + superheroe.getCapa();
    }

    public void modificadorAdicional(double cantidad) {
        precio += cantidad;
    }

}
