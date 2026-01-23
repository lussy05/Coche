public class App2 {
    public static void main(String[] args) throws Exception {
        System.out.println(" Hola mundo ");
        Cancion c1 = new Cancion(1, "Guapa de cara ", "Flamenco", 17000);
        Cancion c2 = new Cancion(2, "Pending", "Trap", 20000);
        Cancion c3 = new Cancion(3, "444", "Trap", 30000);

        System.out.println(c1);
        c1.setnumeroReproducciones(13000);
        //con el toSteing lo de abajo
        System.out.println(c1);


        CartaFUT carta1 = new CartaFUT("Cristiano",7.0 ,"Medio","Real Madrid",100,99,8,8, 1000,80);
        CartaFUT carta2 = new CartaFUT("Mbappe",8.0,"Centro","Real Madrid", 100,88,9,7,108,7);
        CartaFUT carta3 = new CartaFUT("Bale",6.0,"Delantero","Real Madrid",7, 5, 8, 6,88, 5);
        System.out.println(carta3);
        carta3.setValoracionMedia(9.0);
        System.out.println(carta3);




}

}
