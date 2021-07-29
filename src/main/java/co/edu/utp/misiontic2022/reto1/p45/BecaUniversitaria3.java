package co.edu.utp.misiontic2022.reto1.p45;

public class BecaUniversitaria3 {
    
    //Atributos
    private double monto;
    private double interes;
    private int tiempo;
    
    //Constructores
    public BecaUniversitaria3(){
        this.monto = 0;
        this.interes = 0;
        this.tiempo = 0;
    }
    
    public BecaUniversitaria3(int pTiempo, double pMonto , double pInteres){
        this.monto = pMonto;
        this.interes = pInteres;
        this.tiempo = pTiempo;
    }
    
    //Metodos
    public double calcularInteresSimple(){
        double interesSimple = this.monto * (this.interes/100) * this.tiempo;
        interesSimple = Math.round(interesSimple);
        return interesSimple;
    }
    
    public double calcularInteresCompuesto(){
        double interesCompuesto = monto * ( Math.pow(1+this.interes/100,this.tiempo) - 1 );
        return Math.round(interesCompuesto);
    }
    
    public String compararInversion(){
        double diferencia = 0;
        //Calucular la Diferencia
        diferencia = this.calcularInteresCompuesto() - this.calcularInteresSimple();
    
        if(diferencia == 0){
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
    }
    
    public String compararInversion(int pTiempo, double pMonto, double pInteres){
    
        this.monto = pMonto;
        this.interes = pInteres;
        this.tiempo = pTiempo;
    
        return this.compararInversion();
    
    }
}   

