public class Coche {
    //aqui van las caracteristicas o atributos
    public String color;
    public int anyo;
    public String marca;
    public String modelo;
    public double kilometraje;


    public Coche(){
        //aqui va el codigo cuando se instancia (crea) la clase 
        System.out.println("creando Coche...");
    }
    public Coche(String colorCoche, int anyoCoche, String marcaCoche, String modeloCoche, double kilometrajeCoche){
        color = colorCoche;
        anyo = anyoCoche;
        marca = marcaCoche;
        modelo = modeloCoche;
        kilometraje = kilometrajeCoche;
        System.out.println("Creando Coche " + marca + " " + modelo);

    }
}
