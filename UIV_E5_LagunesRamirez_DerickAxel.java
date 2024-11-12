public class UIV_E5_LagunesRamirez_DerickAxel {

    private static class Cliente{
        private String nombre;
        private int tiempo;
        private Queue<Producto> carrito;
        
        //Constructor
        public Cliente(String nombre, int tiempo, 
                Queue<Producto> carrito) {
            this.nombre = nombre;
            this.tiempo = tiempo;
            this.carrito = carrito;
        }
        public String getNombre() {return nombre;}
        public int getTiempo() {return tiempo;}
        public Queue<Producto> getCarrito() {return carrito;}                
    }

    private static class Producto{
        private String nombre;
        private double precio;
        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }
        public String getNombre() {
            return nombre;
        }
        public double getPrecio() {
            return precio;
        }
    }

     public static void main(String[] args) {
        //Ejercicio
        Queue<Producto> carritoIgnacio = new Queue<>();
        carritoIgnacio.offer(new Producto("Donas", 15));
        carritoIgnacio.offer(new Producto("Takis", 20));
        carritoIgnacio.offer(new Producto("Runners", 20));
        carritoIgnacio.offer(new Producto("Arizona", 25));

        Cliente ignacio = new Cliente(
            "Ignacio", 10, carritoIgnacio);

        Queue<Producto> carritoMartin = new Queue<>();
        carritoMartin.offer(new Producto("coca", 25));
        carritoMartin.offer(new Producto("Runners", 20));
        carritoMartin.offer(new Producto("Emperador Limon", 20));

        Cliente martin = new Cliente("Jorge", 5, carritoMartin);

        //Formar a los clientes
        Queue<Cliente> fila = new Queue<>();
        fila.offer(ignacio);
        fila.offer(martin);

        //Atender a los clientes
        for(int i = 0; i<2; i++){
            System.out.println(
                "Atendiendo a: " + fila.peek().getNombre());
            try{
                //Simulación de que le estan cobrando
                Thread.sleep(fila.peek().getTiempo() * 1000);
            }catch(Exception e){
                e.printStackTrace();
            }
            //Poner el procesamiento de nuestros productos
            //--------------------------------------------
            double total = 0.0;
            int z = fila.peek().getCarrito().size();
            for(int j=0;j<z;j++){
                total += fila.peek().getCarrito().poll().getPrecio();
            }
            System.out.println("Se cobro: " + total);
            //--------------------------------------------
            System.out.println(
                "Ya se atendio a:" + fila.poll().getNombre() );
        }

     }
}
