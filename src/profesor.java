public class profesor {
    // si aqui no pones contructor
    // esto que hemos puesto funcionaria ; // profesor pablo = new profesor();


    // esto son atributos:
    public String dni;
    public String nombre;
    public double salario;

//como se crea el constructor, entre parentesis el orden e informacion
    public profesor(String dniprofesor, String nombreprofesor, double salarioprofesor) {
        dni = dniprofesor;
        nombre = nombreprofesor;
        salario = salarioprofesor;
    }

}
