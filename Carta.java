
/**
 *                                
 */
class Carta {

    private int valor;
    private String palo;

    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }  

    public String getNombre(){
        String carta = "";
        if(valor == 1){
            carta = "As " +palo;
        }
        else if(valor == 11){
            carta = "J " +palo;
        }
        else if(valor == 12){
            carta = "Q " +palo;
        }
        else if(valor == 13){
            carta = "K " +palo;
        }
        else{ 
            carta = valor+ " " +palo;
        }
        return carta;
    }

}


