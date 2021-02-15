public class Usuario_Empresa extends Usuario {

    private String razonSocial;

    public Usuario_Empresa(String documento, String tipoDocumento, String nombre, Double saldo, String razonSocial) {
        super(documento, tipoDocumento, nombre, saldo);
        this.razonSocial = razonSocial;
    }


    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String presentacionCorta() {
        return "<< NIT: " + this.documento + ">>\n" +
                "<< Responsable: " + this.nombre + " >>\n";
    }

    @Override
    public String presentacionLarga(){

        return "<< NIT: " + this.documento + ">>\n" +
                "<< Responsable: " + this.nombre + " >>\n" +
                "<< Saldo: " + this.saldo + " >>\n" +
                "<< Razon: " + this.razonSocial + " >>";

    }

}
