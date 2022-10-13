package entidades;

public class Retangulo {
    public double largura;
    public double altura;

    public double Area() {
        return largura * altura;
    }
 
    public double Perimetro() {
        return 2 * (largura + largura);
    }

    public double Diagonal() {
        return Math.sqrt(altura * altura + largura * largura) ;
        
    }
    

}
