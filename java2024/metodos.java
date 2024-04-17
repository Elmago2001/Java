import java.util.Scanner;
public class metodos {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double lado, res, radio, base, altura, diametro;

    System.out.println("Dame el radio");
    radio = in.nextDouble();
    res= areaCirculo(radio);
    System.out.println("El area es "+ res);


    System.out.println("Dame el lado ");
    lado = in.nextDouble();
    System.out.println("El area del cuadrado es "+ areaCuadrado(lado));
    

    System.out.println("dame una base y una altura");
    base = in.nextDouble();
    altura = in.nextDouble();
    System.out.println("El area del triangulo es "+ areaTriangulo(base, altura));
    
    
    System.out.println("Dame el diametro ");
    diametro = in.nextDouble();
    System.out.println("El perimetro es "+ perimetroCirculo(diametro));
    in.close();
   } 
    static  double areaCirculo(double radio){
        double resultado;
        resultado= Math.PI*(radio*radio);
        return resultado;
   }
   static  double areaCuadrado(double lado){
    double resultado;
    resultado= lado*lado;
    return resultado;
   }
   static  double areaTriangulo(double base, double altura){
    double resultado;
    resultado= (base*altura)/2;
    return resultado;

    }
    static void noRegresa(){

    }
    static double perimetroCirculo(double diametro){
        double resultado;
        resultado = (Math.PI* diametro);
        return resultado;
    }
}
