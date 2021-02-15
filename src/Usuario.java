public class Usuario {

    protected String documento;
    protected String tipoDocumento;
    protected String nombre;
    protected Double saldo;

    public Usuario(String documento,String tipoDocumento, String nombre, Double saldo) {
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String presentacionCorta(){

        return "<< Documento: " + this.documento + ">>\n" +
                "<< Nombre: " + this.nombre + " >>\n";
    }

    public String presentacionLarga(){

        return "<< Documento: " + this.documento + ">>\n" +
                "<< Nombre: " + this.nombre + " >>\n" +
                "<< Saldo: " + this.saldo + " >>\n";

    }

}
