import java.util.Random;

public class Pokemon {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private int velocidad;
    private Tipo tipo;
    private Movimiento[] movimientos = new Movimiento[2];
    
    public Pokemon(String nombre, int vida, int ataque, int defensa, int velocidad, Tipo tipo,
            Movimiento[] movimientos) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.movimientos = movimientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }

    //Metodos de ataque
    public void atacar(Movimiento ataque, Pokemon enemigo){
        //Considerar la presicion
        Random r = new Random();
        if(r.nextInt(101) <= ataque.getPrecision()){
            //Pokemon conecto el ataque
        }
    }

    //metodos para recibir daño
    public void recibirDanio(Movimiento ataque){
        double modificador = 1.0;
        modificador = tipo.ventajaTipo(
            ataque.getTipo(), tipo
        );

        int danioTotal = (int) modificador * (ataque.getPotencia());
        danioTotal = danioTotal - defensa;

        vida -= danioTotal;
        if (vida <= 0) {
            System.out.println("El pokemon "+ 
                nombre + " se ha debilitado");
        }
    }


    //En el juego original hay metodos para aprender movimientos
    //para subir de nivel
    //para evolucionar
    //etc...    
}
