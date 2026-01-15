public class Bombilla {
    //atributos
    public String tipo;
    public int potencia;
    public boolean estaEncendida;
    //constructores
    public Bombilla (String t, int pot, boolean enc){
        tipo = t;
        potencia = pot;
        estaEncendida = enc;
    }
    //metodos
    // saber si esta encendida
  public boolean estaEncendida(boolean encendida){
        return encendida;
    }
    //pulsar interruptor
    public void interruptor (){
        if (estaEncendida== true){
            estaEncendida = false;
        }else{
            estaEncendida = true;
        }
    
    }
}



