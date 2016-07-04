
/**
 *    autor Francisco.
 *    02 / 06 / 2016
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
            carta = "As de " +palo;
        }
        else if(valor == 11){
            carta = "J de " +palo;
        }
        else if(valor == 12){
            carta = "Q de" +palo;
        }
        else if(valor == 13){
            carta = "K de " +palo;
        }
        else{ 
            carta = valor+ " de " +palo;
        }
        return carta;
    }

}



















