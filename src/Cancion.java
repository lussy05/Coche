public class Cancion {
    // atributos
    //encapsular es ponerlo privado por asi decirlo.
    private int Id;
    private String Titulo;
    private String Genero;
    private int numeroReproducciones;

    // constructor
    public Cancion(int idCancion, String t, String g, int repros) {
        Id = idCancion;
        Titulo = t;
        Genero = g;
        numeroReproducciones = repros;
    }
// cuando encapsulamos hay que hacer get (leer/dame) y set(escribir/cambia) que permite leer o escribir.
    public int getId() {
        return Id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public int getnumeroReproducciones() {
        return numeroReproducciones;
    }
    // el set siempre con void porque no devuelven nada

    public void setnumeroReproducciones(int nuevarepro) {
        numeroReproducciones = nuevarepro;
    }
    public void setGenero (String nuevoGen){
        Genero = nuevoGen;
    }
    public void setTitulo(String nuevoTit){
        Titulo = nuevoTit;
    }
    public void setId (int nuevoId){
        Id = nuevoId;
    }                                           

    public String toString() {
        return "cancion llamada " + Titulo + " se ha escuchado " + numeroReproducciones + " veces ";
    }



}
