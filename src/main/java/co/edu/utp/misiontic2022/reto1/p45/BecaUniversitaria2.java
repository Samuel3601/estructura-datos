package co.edu.utp.misiontic2022.reto1.p45;

public class BecaUniversitaria2 {

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    // ...
    int pTiempo;
    double pMonto, pInteres;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
    // ...
    public BecaUniversitaria2() {

    }
    public BecaUniversitaria2(int pTiempo, double pMonto, double pInteres){
    try {
    double interesSimple = pMonto * (pInteres/100)*pTiempo;
    interesSimple = Math.round(interesSimple);
    double interesCompuesto = pMonto * (Math.pow((1+ pInteres/100), pTiempo)-1);
    interesCompuesto = Math.round(interesCompuesto);
    double compararInversion = interesCompuesto - interesSimple;
    System.out.println(interesSimple);
    System.out.println(interesCompuesto);
    System.out.println( "La diferencia entre la proyección de interés compuesto e interés simple es: $" + compararInversion);
    }catch(Exception e){
}
finally{
System.exit(pTiempo);
}
    }
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    public double calcularInteresSimple( ){
    double interesSimple = pMonto * (pInteres/100)*pTiempo;
    interesSimple = Math.round(interesSimple);
    return interesSimple;
    }
    public double calcularInteresCompuesto( ){
    double interesCompuesto = pMonto * (Math.pow((1+ pInteres/100), pTiempo)-1);
    interesCompuesto = Math.round(interesCompuesto);
    return interesCompuesto;
    }
    public String compararInversion (int pTiempo, double pMonto, double pInteres){
    double interesSimple = pMonto * (pInteres/100)*pTiempo;
    interesSimple = Math.round(interesSimple);
    double interesCompuesto = pMonto * (Math.pow((1+ pInteres/100), pTiempo)-1);
    interesCompuesto = Math.round(interesCompuesto);
    double compararInversion = interesCompuesto - interesSimple;
    return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + compararInversion;
    }
    public String compararInversion ( ){
    return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";

    

    
    }    
}
    

