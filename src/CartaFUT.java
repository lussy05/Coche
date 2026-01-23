public class CartaFUT {

    private String Nombre; 
    private Double ValoracionMedia;
    private String Posicion;
    private String Equipo;
    private int Ritmo;
    private int Tiro;
    private int Pase;
    private int Regate;
    private int Fisico;
    private int Defensa;

    public CartaFUT(String Nom, Double ValoMe, String Posi, String Equi, int Rit, int Ti, int Pas, int Reg, int Fis, int Def){
        Nombre = Nom;
         ValoracionMedia = ValoMe;
         Posicion = Posi;
         Equipo = Equi;
         Ritmo = Rit;
         Tiro = Ti;
         Pase = Pas;
         Regate = Reg;
         Fisico = Fis;
         Defensa = Def;
    }

// cuando encapsulamos hay que hacer get (leer/dame) y set(escribir/cambia) que permite leer o escribir.
    public String getNombre() {
        return Nombre;
    }
   
    public Double getValoracionMedia() {
        return ValoracionMedia;
    }
    
    public String  getPosicion() {
        return Posicion;
    }
    
    public String getEquipo() {
        return Equipo;
    }
   
    public int getRitmo() {
        return Ritmo;
    }
    public int getTiro() {
        return Tiro;
    }
    public int getPase() {
        return Pase;
    }
    public int getRegate() {
        return Regate;
    }
    public int getFisico() {
        return Fisico;
    }
    public int getDefensa() {
        return Defensa;
    }



    // el set siempre con void porque no devuelven nadaç
    public void setNombre(String Nom) {
        Nombre = Nom;
    }
     public void setValoracionMedia(Double ValoMe) {
        ValoracionMedia = ValoMe;
    }











    // aqui despues del get y el set va el toString





         
         








    }

    
}
