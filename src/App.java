import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       Coche audi = new Coche();
       audi.color = "gris";
       audi.anyo = 2017;
       audi.marca = "Audi";
       audi.modelo = "RS6";

       Coche bmw = new Coche();
       bmw.color = "Negro";
       bmw.anyo = 2020;
       bmw.marca = "BMW";
       bmw.modelo = "140i";
       
       Coche Toyota = new Coche("Rojo", 2000, "Toyota", "Corolla");
      

    

    }
}
