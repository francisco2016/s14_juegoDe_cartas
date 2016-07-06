import java.util.ArrayList;
import java.util.Collections;
/**
 *Francisco 05 / 07 / 2016
 */
public class Juego
{
    private int numeroDeJugadores;
    //necesitamos una colección para almacenar a los jugadores.
    private ArrayList<Jugador> jugadores;
    //para crear un objeto Mazo.
    private Mazo mazo2;

    //constructor para inicializar los atributos.
    public Juego(int numeroDeJugadores){
        this.numeroDeJugadores = (numeroDeJugadores < 2 || numeroDeJugadores > 8) ? 4 : numeroDeJugadores;
        jugadores = new ArrayList<>();
        mazo2 = new Mazo();
        //con un bucle while creamos todos los juagadores señalados en el parámetro, añadiendoles a la colección: "jugadores"    
        int index = 1;
        while(jugadores.size() < numeroDeJugadores){
            jugadores.add(new Jugador(index));
            index ++;
        }
    }

    /**
     *  método que reparte todas las cartas a los jugadores en la forma habitual en que se hace en un juego de cartas,
     *  es decir, barajando el mazo y entregando alternativamente cartas a los jugadores tomando siempre la primera carta
     *  del mazo. Al finalizar el reparto todos los jugadores deben tener el mismo número de cartas, por lo que es posible,
     *  dependiendo del número de estos, que queden cartas en el mazo.
     */
    public void repartir(){
        mazo2.barajar();
        int numJugadores = jugadores.size();
        while(mazo2.quedan() >= numJugadores){
            for(Jugador jugadorActual: jugadores){
                jugadorActual.recibirCarta(mazo2.tomarPrimera());
            }
        }
    }

    /**
     * método que muestra por pantalla el id de cada jugador junto a la cartas que tiene en la mano.
     */
    public void mostrarCartasJugadores(){
        System.out.println("                    ----    CARTAS DE LOS JUGADORES.    ----");
        System.out.println();
        for(Jugador jugadorActual: jugadores){
            System.out.println("Cartas del jugador con ID: " +jugadorActual.getId()+ "\n"+
                                   jugadorActual.cartasQueTieneEnLaMano());
            System.out.println();
                
            }
    }
}




