public class Perro {
    // Atributos
    public String raza;
    public String sonido;

    // Constructores
    public Perro(String raz, String son) {
        raza = raz;
        sonido = son;
    }

    // metodo
    public void ladrar() {
        System.out.println(sonido + " " + sonido);
    }

}
