public class Producto {

         protected String codigo;
         protected String nombre;
         protected String tipo;
         protected String marca;
         protected Double precio;


    public Producto(String codigo, String nombre, String tipo, String marca, Double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public  String mostrarProducto(){
                return "<< Nombre del preoducto: " + this.nombre + " >>\n" +
                        "<< Codigo producto: " + this.codigo + ">>\n" +
                        "<< Marca: "+ this.marca +" >>" +
                        "<< Precio del producto: " + this.precio + " >>\n";
        };

}
