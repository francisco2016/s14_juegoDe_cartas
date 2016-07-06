import java.util.ArrayList;

/**
 * Francisco
 */
public class Jugador
{
    private int idJugador;
    //Colección para almacenar las cartas que vaya recibiendo el jugador.
    private ArrayList<Carta> cartaJ; 
    /**
     * Constructor for objects of class Juagador
     */
    public Jugador(int idJugador)
    {
        this.idJugador =  idJugador;
        cartaJ = new ArrayList<>();
    }

    /**
     * este método crea un objeto jugador que no tiene cartas en su poder con el identificador indicado como parámetro.
     */
    public void jugador(int id){
        idJugador = id;
    }
    
    /**
     *devuelve el identificador del jugador.
     */
    public int getId(){
        return idJugador;
    }
    
    /**
     *agrega la carta unaCarta a las que posee el jugador.
     */
    public void recibirCarta(Carta unaCarta){
        cartaJ.add(unaCarta);
    }

    /**
     *devuelve una colección de cadenas con los nombres de las cartas que el jugador ha recibido.
     */
    public ArrayList<String> cartasQueTieneEnLaMano(){
        //Declaro una VL. de tipo ArrayList para almacenar las cartas que reciba.
        ArrayList<String> cartasRecibidas = new ArrayList<>();
        for(Carta cartaEnLaMano: cartaJ){
            cartasRecibidas.add(cartaEnLaMano.getNombre());
        }
        return cartasRecibidas;
    }

}




















