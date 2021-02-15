public class Producto_Monitores extends Producto {

    private float pulgadas;
    private int fps;

    public Producto_Monitores(String codigo, String nombre, String tipo, String marca, Double precio, float pulgadas, int fps) {
        super(codigo, nombre, tipo, marca, precio);
        this.pulgadas = pulgadas;
        this.fps = fps;
    }


    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    @Override
    public String mostrarProducto(){
        return "<< Nombre del preoducto: " + this.nombre + " >>\n" +
                "<< Codigo producto: " + this.codigo + " >>\n" +
                "<< Marca: "+ this.marca +" >>\n" +
                "<< Precio del producto: " + this.precio + " >>\n" +
                "<< Pulgadas: " + this.pulgadas + " >>\n" +
                "<< FPS: " + this.fps + " >>\n";
    }

}
