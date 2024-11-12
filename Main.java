public class Main {
    
    public static void main(String[] args) {
        System.out.println("Bienvenido al juego");

        //Debemos de definir una serie de pokemones
        Pokemon charmander = new Pokemon(
            "Charmander", 
            100, 
            20,
            20, 
            30, 
            Tipo.FUEGO, 
            new Movimiento[] {
                Movimiento.ASCUAS, 
                Movimiento.GIRO_FUEGO
            }
        );
        Pokemon vaporeon = new Pokemon(
            "Vaporeon", 
            200, 
            40,
            40, 
            35, 
            Tipo.AGUA, 
            new Movimiento[] {Movimiento.HIDRO_CANON, Movimiento.CASCADA}
        );
        Pokemon bulbasaur = new Pokemon(
            "Bulbasaur", 
            120, 
            20,
            30, 
            18, 
            Tipo.PLANTA,
            new Movimiento[] {
                Movimiento.DRENADORAS, 
                Movimiento.HOJAS_NAVAJA}
        );
        Pokemon squirtle = new Pokemon(
            "Squirtle", 
            130, 
            25,
            25, 
            25, 
            Tipo.AGUA, 
            new Movimiento[] {
                Movimiento.PISTOLA_AGUA, 
                Movimiento.SURF}
        );
        Pokemon magikarp = new Pokemon(
            "Magikarp", 
            40, 
            5,
            5, 
            30, 
            Tipo.AGUA, 
            new Movimiento[] {Movimiento.PISTOLA_AGUA}
        );
        Pokemon chikorita = new Pokemon(
            "Chikorita", 
            110, 
            20,
            25, 
            25, 
            Tipo.PLANTA, 
            new Movimiento[] {Movimiento.DRENADORAS, 
                Movimiento.LATIGO_CEPA}
        );
        Pokemon charizard = new Pokemon(
            "Charizard", 
            350, 
            80,
            70, 
            60, 
            Tipo.FUEGO, 
            new Movimiento[] {Movimiento.ONDA_IGNEA, 
                Movimiento.LANZA_LLAMAS}
        );


        Jugador ignacio = new Jugador(
            "Ignacio", 
            new Pokemon[] {chikorita,charizard,bulbasaur}
        );

        Jugador karol = new Jugador(
            "Karol", 
            new Pokemon[] {charizard,magikarp,vaporeon}
        );

        //Hacer una clase que permita la batalla
        //se compone de 2 jugadores
        //de una cola de turnos <--- dependiendo de la vel

    }

}
