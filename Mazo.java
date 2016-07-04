import java.util.ArrayList;
import java.util.Collections;
/**
 *  Mazo, está formado por las cartas de una baraja de poker o francesa.
 * 
 * @author Francisco, 02 / 07 / 2016
 */
public class Mazo
{
    // creamos un ArrayList para almacenar una colección de cartas.
    private ArrayList<Carta> cartas;
    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        cartas = new ArrayList<>();
        cartas.add(new Carta(1, "picas"));      cartas.add(new Carta(6, "picas"));      cartas.add(new Carta(10, "picas"));
        cartas.add(new Carta(2, "picas"));      cartas.add(new Carta(7, "picas"));      cartas.add(new Carta(11, "picas"));
        cartas.add(new Carta(3, "picas"));      cartas.add(new Carta(8, "picas"));      cartas.add(new Carta(12, "picas"));
        cartas.add(new Carta(4, "picas"));      cartas.add(new Carta(9, "picas"));      cartas.add(new Carta(13, "picas"));
        cartas.add(new Carta(5, "picas"));  
        cartas.add(new Carta(1, "corazones"));  cartas.add(new Carta(6, "corazones"));  cartas.add(new Carta(10, "corazones"));
        cartas.add(new Carta(2, "corazones"));  cartas.add(new Carta(7, "corazones"));  cartas.add(new Carta(11, "corazones"));
        cartas.add(new Carta(3, "corazones"));  cartas.add(new Carta(8, "corazones"));  cartas.add(new Carta(12, "corazones"));
        cartas.add(new Carta(4, "corazones"));  cartas.add(new Carta(9, "corazones"));  cartas.add(new Carta(13, "corazones"));
        cartas.add(new Carta(5, "corazones"));  
        cartas.add(new Carta(1, "treboles"));   cartas.add(new Carta(6, "treboles"));   cartas.add(new Carta(10, "treboles"));
        cartas.add(new Carta(2, "treboles"));   cartas.add(new Carta(7, "treboles"));   cartas.add(new Carta(11, "treboles"));
        cartas.add(new Carta(3, "treboles"));   cartas.add(new Carta(8, "treboles"));   cartas.add(new Carta(12, "treboles"));
        cartas.add(new Carta(4, "treboles"));   cartas.add(new Carta(9, "treboles"));   cartas.add(new Carta(13, "treboles"));
        cartas.add(new Carta(5, "treboles"));  
        cartas.add(new Carta(1, "rombos"));     cartas.add(new Carta(6, "rombos"));     cartas.add(new Carta(10, "rombos"));
        cartas.add(new Carta(2, "rombos"));     cartas.add(new Carta(7, "rombos"));     cartas.add(new Carta(11, "rombos"));
        cartas.add(new Carta(3, "rombos"));     cartas.add(new Carta(8, "rombos"));     cartas.add(new Carta(12, "rombos"));
        cartas.add(new Carta(4, "rombos"));     cartas.add(new Carta(9, "rombos"));     cartas.add(new Carta(13, "rombos"));
        cartas.add(new Carta(5, "rombos"));     
    }

    /**
     * mt, encargado de barajar el mazo de cartas.
     */
    public void barajar(){
        Collections.shuffle(cartas);
    }
    
    /**
     *retorna la primera carta del mazo y modifica el estado del mazo para reflejar que esa carta ya no se encuentra en el
     *mazo. En caso de que no queden cartas en el mazo devuelve null.
     */
    public Carta tomarPrimera(){
        Carta carta1 = null;
        if(!cartas.isEmpty()){
            carta1 = cartas.remove(0);
        }
        return carta1;
    }
    
    /**
     *retorna el número de cartas que quedan en el mazo.
     */
    public int quedan(){
        return cartas.size();
    }
    
    /**
     *mt para mostrar todas las cartas del mazo. 
     */
     
    public void sampleMethod()
    {
        int index = 0;

        while(index < cartas.size()){
            System.out.println(index+ " -- " +cartas.get(index).getNombre());
            index ++;
        }
       
    }
}

















