public class Usuario_Natural extends Usuario {

    private String genero;

    public Usuario_Natural(String documento, String tipoDocumento, String nombre, Double saldo, String genero) {
        super(documento, tipoDocumento, nombre, saldo);
        this.genero = genero;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String presentacionCorta(){
        return "<< CC: " + this.documento + ">>\n" +
                "<< Nombre: " + this.nombre + " >>\n";
    }
    @Override
    public String presentacionLarga(){

        return "<< CC: " + this.documento + ">>\n" +
                "<< Nombre: " + this.nombre + " >>\n" +
                "<< Saldo: " + this.saldo + " >>\n" +
                "<< Genero: " + this.genero +" >>";

    }

}
