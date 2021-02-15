public class Textos {


    public void textoMenuPrincipal(){
        //Cuerpo Menu Principal
        System.out.println("<< Menu Inicio, Bienvenido >>");
        System.out.println("<< Escoja la opcion deseada >>");
        System.out.println("<< 1. Opciones de Usuario >>");
        System.out.println("<< 2. Opciones de Producto >>");
        System.out.println("<< 3. Compra de Producto >>");
        System.out.println("<< 4. Salir >>");

    }

    public void textoMenuUsuarui(){

        System.out.println("<< Menu Usuarios >>");
        System.out.println("<< Escoja la opcion deseada >>");
        System.out.println("<< 1. Agregar Usuario >>");
        System.out.println("<< 2. Consultar Usuarios >>");
        System.out.println("<< 3. Eliminar Usuario >>");
        System.out.println("<< 4. Modificar Usuario >>");
        System.out.println("<< 5. Regresar >>");

    }

    public void textoMenuProducto(){

        System.out.println("<< Menu Producto >>");
        System.out.println("<< Escoja la opcion deseada >>");
        System.out.println("<< 1. Agregar Producto >>");
        System.out.println("<< 2. Consultar Producto >>");
        System.out.println("<< 3. Eliminar Producto >>");
        System.out.println("<< 4. Modificar Producto >>");
        System.out.println("<< 5. Regresar >>");

    }


    public void textoMenuVenta( int cantidad , String nombre ){

        System.out.println("<< Carrito>>");
        System.out.println("<< Nombre de Usuario: " + nombre + " >>");
        System.out.println("<< Cantidad de productos en el Carrito ( " + cantidad + " ) >>");
        System.out.println("<< 1. Agregar Producto >>");
        System.out.println("<< 2. Quitar  Producto >>");
        System.out.println("<< 3. Listar Carrito >>");
        System.out.println("<< 4. Finalizar Compra >>");
        System.out.println("<< 5. Salir >>");

    }



}
