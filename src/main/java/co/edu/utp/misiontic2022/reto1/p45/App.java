package co.edu.utp.misiontic2022.reto1.p45;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args ){
    
        /*System.out.println( "Hello World!" );*/
        BecaUniversitaria2 becaUniversitaria = new BecaUniversitaria2();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(48,10000,2.0));
    }
}
