public class Producto_Silla extends Producto {

    private String color;
    private boolean repuestos;

    public Producto_Silla(String codigo, String nombre, String tipo, String marca, Double precio,String color,boolean repuestos) {
        super(codigo, nombre, tipo, marca, precio);
        this.color = color;
        this.repuestos = repuestos;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRepuestos() {
        return repuestos;
    }

    public void setRepuestos(boolean repuestos) {
        this.repuestos = repuestos;
    }

    @Override
    public String mostrarProducto(){
        return "<< Nombre del preoducto: " + this.nombre + " >>\n" +
                "<< Codigo producto: " + this.codigo + ">>\n" +
                "<< Marca: "+ this.marca +" >>\n" +
                "<< Precio del producto: " + this.precio + " >>\n" +
                "<< Color: " + this.color + " >>\n" +
                "<< Repuestos ?: " + this.repuestos + " >>\n";
    }

}
