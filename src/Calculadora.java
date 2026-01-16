import java.util.ArrayList;

public class Calculadora {
    /**
     * resta 2 numeros enteros
     * @param n1 el primer numero
     * @param n2 segundo numero
     * @return el resultado de la resta de n1 y n2
     */

    //EJERCICO 2; RESTAR 2 VALORES 
    //metodos:
public int restar (int n1, int n2) {
    return n1 - n2;
}
// no tiene return y es vacio = void 
public void bienvenida (String usuario){
    System.out.println("Hola " + usuario);

}
public int elevarCuadrado (int e1){
    return e1 * e1;

}
public double media (ArrayList<Double> notas){
    //DESPUES DE HACER LAS CUENTAS, TENGO LA MEDIA 
    double notaMedia = 4.86;
    return notaMedia;

}
// public luego boolean es lo que te devuelve y lo que va entre parentesis es lo que tu le das 
public boolean aprobado (double nota){
    if (nota >= 5){
        return true;

    }else{
        return false;
    }

}
public double volumenEsfera (double r) {
    double resultado = (4.0 /3.0) * 3.14 * (r * r* r);
    return resultado;
}
}
