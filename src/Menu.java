import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Scanner snc = new Scanner (System.in);
    private Textos txt = new Textos();
    private Carrito cr;
    private ArrayList<Usuario> Usuarios;
    private ArrayList<Producto> Productos;


    public void MenuPrincipal(){

        boolean respuesta = false;
        this.Usuarios = new ArrayList<Usuario>();
        this.Productos = new ArrayList<Producto>();
        int opt;

        while(!respuesta){
            opt = 0;
            System.out.println(opt);
            try{
                txt.textoMenuPrincipal();
                opt = Integer.parseInt(snc.nextLine());
                switch (opt){
                    case 1:
                        MenuUsuario();
                        break;
                    case 2:
                        MenuProducto();
                        break;
                    case 3:
                        MenuCarrito();
                        break;
                    case 4:
                        respuesta = true;
                        break;
                    default:
                        System.out.println("\n<< Intenta ingresar de nuevo otra opcion >>\n");
                        break;
                }

            }catch(Exception e){
                System.out.println("<< Error: " + e.getMessage() + " >>");

            }
        }



    }

    public void MenuUsuario(){

        boolean respuesta = false;
        int opt, opt2;
        String documento;

        while(!respuesta){
            opt = 0;
            opt2 = 0;
            documento = "";
            try{

                txt.textoMenuUsuarui();
                opt = Integer.parseInt(snc.nextLine());

                switch (opt){

                    case 1:

                        System.out.println("<< Tipo de Documento >>");
                        System.out.println("<< 0. CC >>");
                        System.out.println("<< 1. NIT >>");
                        opt2 = Integer.parseInt(snc.nextLine());

                        if(opt2 == 1 ){
                            System.out.println("<< Ingrese el NIT: >>");
                            String NIT = snc.nextLine();
                            Integer.parseInt(NIT);
                            if(!existeUsuario(NIT,this.Usuarios)){
                                System.out.println("<< Ingrese el Responsable:  >>");
                                String nombre = snc.nextLine();
                                System.out.println("<< Ingrese un Saldo: >>");
                                Double saldo = Double.parseDouble(snc.nextLine());
                                System.out.println("<< Razon Social:  >>");
                                String social = snc.nextLine();
                                this.Usuarios.add(new Usuario_Empresa(NIT,"NIT",nombre,saldo,social));
                            }else{
                                System.out.println("<< Este Usuario ya existe >>");
                            }

                        }else if(opt2 == 0){

                            System.out.println("<< Ingrese el CC: >>");
                            String cc = snc.nextLine();
                            Integer.parseInt(cc);
                                if(!existeUsuario(cc,this.Usuarios)){
                                    System.out.println("<< Nombre:  >>");
                                    String nombre = snc.nextLine();
                                    System.out.println("<< Ingrese un Saldo: >>");
                                    Double saldo = Double.parseDouble(snc.nextLine());
                                    System.out.println("<< Genero:  >>");
                                    String genero = snc.nextLine();
                                    this.Usuarios.add(new Usuario_Natural(cc,"CC",nombre,saldo,genero));
                                }else{
                                    System.out.println("<< Este Usuario ya existe >>");
                            }
                        }

                        break;
                    case 2:

                        System.out.println("<< Tipo de Documento >>");
                        System.out.println("<< 0. CC >>");
                        System.out.println("<< 1. NIT >>");
                        opt2 = Integer.parseInt(snc.nextLine());

                        if(opt2 == 1 ){
                            System.out.println("<< Ingrese el NIT  >>");
                            documento = snc.nextLine();
                            for(Usuario u : this.Usuarios ){
                                if( u.getDocumento().equals(documento) && u.tipoDocumento.equals("NIT") ){
                                    System.out.println(u.presentacionLarga());
                                }
                            }

                        }else if(opt2 == 0 ){
                            System.out.println("<< Ingrese el Documento  >>");
                            documento = snc.nextLine();
                            for(Usuario u : this.Usuarios ){
                                if(u.getDocumento().equals(documento) && u.tipoDocumento.equals("CC")){
                                    System.out.println(u.presentacionLarga());
                                }
                            }
                        }

                        break;

                    case 3:

                        System.out.println("<< Ingrese el Documento del Usuario que desea Eliminar  >>");
                        documento = snc.nextLine();

                        for(int i = 0 ; i < this.Usuarios.size() ; i++){
                            if(this.Usuarios.get(i).getDocumento().equals(documento)){
                                Usuarios.remove(i);
                                System.out.println("<< Usuario Eliminado >>");
                            }else {
                                System.out.println("<< Usuario no Encontrado >>");
                            }
                        }

                        break;

                    case 4:

                        System.out.println("<< Tipo de Documento >>");
                        System.out.println("<< 0. Natural >>");
                        System.out.println("<< 1. Empresa >>");

                        opt2 = Integer.parseInt(snc.nextLine());

                        if(opt2 == 1 ){
                            System.out.println("<< Ingrese el CC del Usuario que desea Modificar  >>");
                            documento = snc.nextLine();
                            for(int i = 0 ; i < this.Usuarios.size() ; i++){
                                if(this.Usuarios.get(i).getDocumento().equals(documento) && this.Usuarios.get(i).tipoDocumento.equals("NIT")) {
                                    System.out.println("<< Ingrese el Responsable:  >>");
                                    String nombre = snc.nextLine();
                                    System.out.println("<< Ingrese un Saldo: >>");
                                    Double saldo = Double.parseDouble(snc.nextLine());
                                    System.out.println("<< Razon Social:  >>");
                                    String social = snc.nextLine();
                                    this.Usuarios.set( i , new Usuario_Empresa( documento ,"NIT", nombre , saldo , social ) );
                                }else{
                                    System.out.println("<< Usuario no Encontrado >>\n");
                                }
                            }
                        }else if(opt2 == 0){
                            System.out.println("<< Ingrese el CC del Usuario que desea Modificar  >>");
                            documento = snc.nextLine();
                            for(int i = 0 ; i < this.Usuarios.size() ; i++){
                                if(this.Usuarios.get(i).getDocumento().equals(documento) && this.Usuarios.get(i).tipoDocumento.equals("CC")) {
                                    System.out.println("<< Nombre:  >>");
                                    String nombre = snc.nextLine();
                                    System.out.println("<< Ingrese un Saldo: >>");
                                    Double saldo = Double.parseDouble(snc.nextLine());
                                    System.out.println("<< Genero:  >>");
                                    String genero = snc.nextLine();
                                    this.Usuarios.set(i,new Usuario_Natural(documento ,"CC" , nombre, saldo, genero));
                                }else{
                                    System.out.println("<< Usuario no Encontrado >>");
                                }

                            }

                        }

                    case 5:

                        respuesta = true;
                        break;

                    default:

                        System.out.println("\n<< Intenta ingresar de nuevo otra opcion >>");

                        break;
                }

            }catch(Exception e){
                System.out.println("<< Error: " + e.getMessage() + " >>");

            }
        }

    }

    public void MenuProducto(){

        boolean respuesta = false;
        int opt, opt2, opt3;
        String id;

        while(!respuesta){

            opt = 0;
            opt2 = 0;
            opt3 = 0;
            id = "";

            try{

                txt.textoMenuProducto();
                opt = Integer.parseInt(snc.nextLine());

                switch (opt){

                    case 1:

                        System.out.println("<< Tipo de Producto >>");
                        System.out.println("<< 0. Audifonos >>");
                        System.out.println("<< 1. Monitores >>");
                        System.out.println("<< 2. Silla >>");

                            opt2 = Integer.parseInt(snc.nextLine());

                        if(opt2 == 0 ){
                            System.out.println("<< Codigo: >>");
                            String cod = snc.nextLine();
                            Integer.parseInt(cod);
                            if(!existeProducto(cod,this.Productos)){
                                System.out.println("<< Nombre del producto:  >>");
                                String nombre = snc.nextLine();
                                System.out.println("<< Marca del producto: >>");
                                String marca = snc.nextLine();
                                System.out.println("<< Costo:  >>");
                                Double costo = Double.parseDouble(snc.nextLine());
                                System.out.println("<< Tamano de Drivers: >>");
                                int drv = Integer.parseInt(snc.nextLine());
                                System.out.println("<< Sonido Envolvente:  >>");
                                System.out.println("<< 1: Si >>");
                                System.out.println("<< 2: No>>");

                                opt3 = Integer.parseInt(snc.nextLine());
                                if(opt3 == 1){
                                    this.Productos.add(new Producto_Audifonos(cod,nombre,"Audifonos",marca,costo,drv,true));
                                }else if(opt3 == 2){
                                    this.Productos.add(new Producto_Audifonos(cod,nombre,"Audifonos",marca,costo,drv,false));
                                }
                            }else{
                            System.out.println("<< Codigo de producto ya existe >>");
                        }

                        }else if(opt2 == 1){

                            System.out.println("<< Codigo: >>");
                            String cod = snc.nextLine();
                            Integer.parseInt(cod);
                            if(!existeProducto(cod,this.Productos)) {
                                System.out.println("<< Nombre del producto:  >>");
                                String nombre = snc.nextLine();
                                System.out.println("<< Marca del producto: >>");
                                String marca = snc.nextLine();
                                System.out.println("<< Costo:  >>");
                                Double costo = Double.parseDouble(snc.nextLine());
                                System.out.println("<< Pulgadas: >>");
                                float pulgadas = Float.parseFloat(snc.nextLine());
                                System.out.println("<< FPS: >>");
                                int fps = Integer.parseInt(snc.nextLine());
                                this.Productos.add(new Producto_Monitores(cod, nombre, "Monitor", marca, costo, pulgadas, fps));
                            }else{
                                System.out.println("<< Codigo de producto ya existe >>");
                            }
                        }else if(opt2 == 2){

                            System.out.println("<< Codigo: >>");
                            String cod = snc.nextLine();
                                Integer.parseInt(cod);
                                if(!existeProducto(cod,this.Productos)){
                            System.out.println("<< Nombre del producto:  >>");
                            String nombre = snc.nextLine();
                            System.out.println("<< Marca del producto: >>");
                            String marca = snc.nextLine();
                            System.out.println("<< Costo:  >>");
                            Double costo = Double.parseDouble(snc.nextLine());
                            System.out.println("<< Color: >>");
                            String color = snc.nextLine();
                            System.out.println("<< Trae repuestos ?:  >>");
                            System.out.println("<< 1: Si >>");
                            System.out.println("<< 2: No>>");
                             opt3 = Integer.parseInt(snc.nextLine());
                            if(opt3 == 1){
                                this.Productos.add(new Producto_Silla(cod,nombre,"Silla",marca,costo,color,true));
                            }else if(opt3 == 2) {
                                this.Productos.add(new Producto_Silla(cod,nombre,"Silla",marca,costo,color,false));
                            }
                        }else{
                            System.out.println("<< Codigo de producto ya existe >>");
                        }
                        }

                        break;
                    case 2:

                        System.out.println("<< Ingrese el ID del producto >>");
                        id = snc.nextLine();
                            for(Producto p : this.Productos ){
                                if( p.getCodigo().equals(id) ){
                                    System.out.println(p.mostrarProducto());
                                }
                            }

                        break;

                    case 3:

                        System.out.println("<< Ingrese el ID del Producto que desea Eliminar  >>");
                        id = snc.nextLine();

                        for(int i = 0 ; i < this.Productos.size() ; i++){
                            if(this.Productos.get(i).getCodigo().equals(id)){
                                Productos.remove(i);
                                System.out.println("<< Producto Eliminado >>");
                            }else {
                                System.out.println("<< Producto no Encontrado >>");
                            }
                        }

                        break;

                    case 4:
                        System.out.println("<< Tipo de Producto >>");
                        System.out.println("<< 0. Audifonos >>");
                        System.out.println("<< 1. Monitores >>");
                        System.out.println("<< 2. Silla >>");

                        opt2 = Integer.parseInt(snc.nextLine());

                        System.out.println("<< Ingrese el ID del Producto que desea Modificar  >>");
                        id = snc.nextLine();

                        if(opt2 == 0){

                            for(int i = 0 ; i < this.Productos.size() ; i++){
                                if(this.Productos.get(i).getCodigo().equals(id) && this.Productos.get(i).tipo.equals("Audifonos")){
                                    System.out.println("<< Nombre del producto:  >>");
                                    String nombre = snc.nextLine();
                                    System.out.println("<< Marca del producto: >>");
                                    String marca = snc.nextLine();
                                    System.out.println("<< Costo:  >>");
                                    Double costo = Double.parseDouble(snc.nextLine());
                                    System.out.println("<< Tamano de Drivers: >>");
                                    int drv = Integer.parseInt(snc.nextLine());
                                    System.out.println("<< Sonido Envolvente:  >>");
                                    System.out.println("<< 1: Si >>");
                                    System.out.println("<< 2: No>>");
                                    opt3 = Integer.parseInt(snc.nextLine());
                                    if(opt3 == 1){
                                        this.Productos.set(i,new Producto_Audifonos(id,nombre,"Audifonos",marca,costo,drv,true));
                                    }else if(opt3 == 2){
                                        this.Productos.set(i,new Producto_Audifonos(id,nombre,"Audifonos",marca,costo,drv,false));
                                    }
                                    System.out.println("<< Producto Modificado >>");
                                }else {
                                    System.out.println("<< Producto no Encontrado >>");
                                }
                            }
                        }else if(opt2 == 1){
                            for(int i = 0 ; i < this.Productos.size() ; i++){
                                if(this.Productos.get(i).getCodigo().equals(id) && this.Productos.get(i).tipo.equals("Monitor")){
                                    System.out.println("<< Nombre del producto:  >>");
                                    String nombre = snc.nextLine();
                                    System.out.println("<< Marca del producto: >>");
                                    String marca = snc.nextLine();
                                    System.out.println("<< Costo:  >>");
                                    Double costo = Double.parseDouble(snc.nextLine());
                                    System.out.println("<< Pulgadas: >>");
                                    float pulgadas = Float.parseFloat(snc.nextLine());
                                    System.out.println("<< FPS: >>");
                                    int fps = Integer.parseInt(snc.nextLine());
                                    this.Productos.set(i, new Producto_Monitores(id,nombre,"Monitor",marca,costo,pulgadas,fps));
                                    System.out.println("<< Producto Moddificado >>");
                                }else {
                                    System.out.println("<< Producto no Encontrado >>");
                                }
                            }
                        }else if(opt2 == 2){
                            for(int i = 0 ; i < this.Productos.size() ; i++){
                                if(this.Productos.get(i).getCodigo().equals(id) && this.Productos.get(i).tipo.equals("Silla")){
                                    System.out.println("<< Nombre del producto:  >>");
                                    String nombre = snc.nextLine();
                                    System.out.println("<< Marca del producto: >>");
                                    String marca = snc.nextLine();
                                    System.out.println("<< Costo:  >>");
                                    Double costo = Double.parseDouble(snc.nextLine());
                                    System.out.println("<< Color: >>");
                                    String color = snc.nextLine();
                                    System.out.println("<< Trae repuestos ?:  >>");
                                    System.out.println("<< 1: Si >>");
                                    System.out.println("<< 2: No>>");
                                    opt3 = Integer.parseInt(snc.nextLine());
                                    if(opt3 == 1){
                                        this.Productos.set(i,new Producto_Silla(id,nombre,"Silla",marca,costo,color,true));
                                    }else if(opt3 == 2) {
                                        this.Productos.add(i,new Producto_Silla(id,nombre,"Silla",marca,costo,color,false));
                                    }
                                    System.out.println("<< Producto Moddificado >>");
                                }else {
                                    System.out.println("<< Producto no Encontrado >>");
                                }
                            }
                        }


                        System.out.println("<< Ingrese el ID del Producto que desea Modificar  >>");
                        id = snc.nextLine();

                        break;

                    case 5:

                        respuesta = true;
                        break;

                    default:

                        System.out.println("\n<< Intenta ingresar de nuevo otra opcion >>");

                        break;
                }

            }catch(Exception e){
                System.out.println("<< Error: " + e.getMessage() + " >>");

            }
        }

    }

    public void MenuCarrito(){

        boolean respuesta = false;
        int opt;
        Usuario uCarrito;

        while(!respuesta){
            opt = 0;

            try{

                System.out.println("<< Ingrese el documento del cliente: ");
                String documento = snc.nextLine();

                for(int i = 0 ; i < this.Usuarios.size(); i++){

                    if(this.Usuarios.get(i).getDocumento().equals(documento)){
                        this.cr = new Carrito(this.Usuarios.get(i),this.Productos);
                        this.Usuarios.set(i,cr.compra());
                        respuesta = true;
                    }else{
                        respuesta = true;
                        System.out.println("<< Usuario no Encontrado >>");
                    }
                }

            }catch(Exception e){
                System.out.println("<< Error: " + e.getMessage() + " >>");

            }
        }

    }

    public  boolean existeUsuario(String documento , ArrayList<Usuario> u){

        for(Usuario aux : u){
            if(aux.getDocumento().equals(documento)){
                return true;
            }
        }

        return false;
    }

    public boolean existeProducto(String codigo, ArrayList<Producto> p){

        for(Producto aux : p){
            if(aux.getCodigo().equals(codigo)){
                return true;
            }
        }
        return false;
    }

}

