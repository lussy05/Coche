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


    Profesor pablo = new Profesor("12121212r","Pablo Gonz", 1500);

    Asignatura sist = new Asignatura("Sistemas informaticos", pablo); 
    System.out.println(" El salario del profe de sistemas es: " + sist.docente.salario);// entra al objeto sist,  de este objeto dame el docente y del docente que es pablo, dame el salario


    CuentaBancaria cuenta1 = new CuentaBancaria();
    System.out.println(" Saldo de la cuenta 1 es : " + cuenta1.balance);

    CuentaBancaria cuenta2 = new CuentaBancaria( 2500);
    System.out.println(" Saldo de la cuenta 2 es: " + cuenta2.balance);

    //EJERCICIOS METODOS
    //construir el objeto: 
    Calculadora calc = new Calculadora();
    //calc.restar(80, 7);
    int resultado = calc.restar(80, 7);
    System.out.println(resultado);
    calc.bienvenida("cuau");

    //ejercicio 3
    int resultado2 = calc.elevarCuadrado(5);
    System.out.println("El resultado de elevar al cuadrado es " + resultado2);

    double res3 = calc.volumenEsfera(5);
    System.out.println( res3);

    
    Bombilla bomb = new Bombilla("Led", 200, false);
    Bombilla bomb1 = new Bombilla("Led", 200, true);


   boolean resultado4 = bomb.estaEncendida(true);
    System.out.println("La bombilla esta encendida? : " + resultado4);

    resultado4 = bomb.estaEncendida(false);
    System.out.println(" se ha pulsado el interruptor: " + resultado4);


    Perro perro1 = new Perro("yorksie", "guau"); 
    Perro perro2 = new Perro("American Bully xxl ", "MIAU");
    System.out.println("El perro1 hace: " + perro1.sonido);
    
    perro2.ladrar();
    perro2.sonido = "GUAUUUUUUUUUUUUUUUUUUUUUU";
    perro2.ladrar();

    

  }


    }
    
