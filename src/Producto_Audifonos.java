public class Producto_Audifonos extends Producto{

    private int tamDrivers;
    private boolean sonidoEnvolvente;

    public Producto_Audifonos(String codigo, String nombre, String tipo, String marca, Double precio, int tamDrivers, boolean sonidoENvolvente) {
        super(codigo, nombre, tipo, marca, precio);
        this.tamDrivers = tamDrivers;
        this.sonidoEnvolvente = sonidoENvolvente;
    }


    public int getTamDrivers() {
        return tamDrivers;
    }

    public void setTamDrivers(int tamDrivers) {
        this.tamDrivers = tamDrivers;
    }

    public boolean isSonidoEnvolvente() {
        return sonidoEnvolvente;
    }

    public void setSonidoEnvolvente(boolean sonidoEnvolvente) {
        this.sonidoEnvolvente = sonidoEnvolvente;
    }

    @Override
    public String mostrarProducto(){
        return "<< Nombre del preoducto: " + this.nombre + " >>\n" +
                "<< Codigo producto: " + this.codigo + ">>\n" +
                "<< Marca: "+ this.marca +" >>\n" +
                "<< Precio del producto: " + this.precio + " >>\n" +
                "<< Tamano de los Drivers: " + this.tamDrivers + " >>\n" +
                "<< Sonido Envolvente ? : " + this.sonidoEnvolvente + " >>\n";
    }

}
