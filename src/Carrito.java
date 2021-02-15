import java.util.ArrayList;
import java.util.Scanner;

public class Carrito {

    private ArrayList<Producto> aComprar;
    private ArrayList<Producto> Productos;
    private Usuario user;
    private Scanner snc = new Scanner (System.in);

    public Carrito(Usuario user, ArrayList<Producto> Productos){
        this.user = user;
        this.Productos = Productos;

    }

    public Usuario compra(){
        aComprar = new ArrayList<Producto>();
        Textos txt = new Textos();
        int sw = 0, opt;
        String id;

        while(sw == 0){

            opt = 0;

            txt.textoMenuVenta(this.aComprar.size(),this.user.getNombre());
            opt = Integer.parseInt(snc.nextLine());
            switch (opt){
                case 1:
                    for(Producto p : this.Productos){
                        System.out.println(p.mostrarProducto());
                    }
                    System.out.println("<< Seleccione 1 ID para Agregar: ");
                    id = snc.nextLine();
                    for(Producto p : this.Productos){
                       if(p.getCodigo().equals(id)){
                           this.aComprar.add(p);
                       }
                    }
                    break;
                case 2:

                    for(int i = 0 ; i < this.aComprar.size();i++){
                        System.out.println("<< Indice: "+ i + "\n" + this.aComprar.get(i).mostrarProducto());
                    }

                    System.out.println("<< Seleccione el indice del item que desea eliminar >>");

                    int j = Integer.parseInt(snc.nextLine());

                    if( j < this.aComprar.size() ){
                        this.aComprar.remove(j);
                    }

                    break;

                case 3:

                    for(Producto p : this.aComprar){
                        System.out.println(p.mostrarProducto());
                    }

                    break;

                case 4:
                    Double total = 0d;
                    for(Producto p : this.aComprar){
                        System.out.println(p.mostrarProducto());
                        total += p.getPrecio();
                    }
                    if(total < this.user.getSaldo()){
                        System.out.println("<< Total de la Compra: " + total + " >>");
                        this.user.setSaldo(this.user.getSaldo()-total);
                    }else{
                        System.out.println("<< Saldo Insuficiente >>");
                        System.out.println("<< Tu saldo actual es de: " + this.user.getSaldo() + " >>");
                    }

                case 5:
                    sw = 1;
                    break;


            }

        }
        return this.user;
    }

}
