package co.edu.utp.misiontic2022.reto1.p45;

public class BecaUniversitaria{
    public double pMonto;
    public double pInteres;
    public int pTiempo;

    public BecaUniversitaria(){
        pMonto = 0.0;
        pInteres = 0.0;
        pTiempo = 0;
    }
    
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres){
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.pTiempo = pTiempo;
    }

    public double calcularInteresSimple(){

        double interesSimple = Math.round(pMonto*(pInteres/100)*pTiempo);
        return interesSimple; 
        
    }

    public double calcularInteresCompuesto( ){
        
        double interesCompuesto = Math.round(pMonto*(Math.pow(1+(pInteres/100),pTiempo)-1));
        return interesCompuesto;
    }

    public String compararInversion (int pTiempo, double pMonto, double pInteres){

        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        if (diferencia > 0){
            return ("La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia);
        }
        else{
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }
