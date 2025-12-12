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
       bmw.anyo = 2025;
       bmw.marca = "BMW";
       bmw.modelo = "140i";
       System.out.println("El año de bmw es: " + bmw.anyo );
       bmw.anyo = 2015;
       System.out.println("El año de bmw es: " + bmw.anyo );
       
       Coche Toyota = new Coche("Rojo", 2000, "Toyota", "Corolla", 150000);
      Coche Mercedes = new Coche(2000, "Mercedes", "Clase E", 250000);


    profesor pablo = new profesor("12121212r","Pablo Gonz", 1500);
    asignatura sist = new asignatura("Sistemas informaticos" );

    }
}
