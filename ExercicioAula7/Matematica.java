package aula7;

public class Matematica {
    public static double calculaAreaQuadrado(double lado){
        double r = Math.pow(lado, 2);
        return r;
    }
    
    public static double calcularAreaRetangulo(double b, double h){
        double r;
        r = b*h;
        return r;
    }
    
    public static double calcularAreaLosango(double b, double h){
        double r;
        r = b*h;
        return r;
    }
    
    public static double calcularAreaTrinagulo(double b, double h){
        double r;
        r = (b*h)/2;
        return r;
    }
    
    public static double calcularAreaPentagono(double b, double h){
        double r;
        r = (5*(b*h))/2;
        return r;
    }
    
    public static double calcularAreaHexagono(double b, double h){
        double r;
        r = (6*(b*h))/2;
        return r;
    }
    
    public static double calcularAreaCircunferencia(double raio){
        double r;
        r = Math.PI * Math.pow(raio, 2);
        return r;
    }
    
    public static double calcularAreaTetaedro(double a){
        double r;
        r = Math.pow(a, 2) * Math.sqrt(3);
        return r;
    }
    
     public static double calcularAreaOctaedro (double a){
        double r;
        r = (2*(Math.pow(a, 2))) * Math.sqrt(3);
        return r;
    }
     
     public static double calcularAreaCubo(double a){
        double r;
        r = (6*(Math.pow(a, 2)));
        return r;
    }
     
     public static double calcularAreaDocecaedro(double b, double h, double a){
        double r;
        double rp;
        rp = Matematica.calcularAreaPentagono(b, h);
        r = (30*a*rp);
        return r;
    }
       
}
