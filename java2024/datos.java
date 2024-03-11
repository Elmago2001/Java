import java.util.Scanner;
public class datos {
   public static void main(String[] args){
        /*Scanner guardian = new Scanner(System.in);
        // declaradcion para escuchar desde el teclado
        System.out.println("cual es tu nombre");
        String texto = guardian.next();
        System.out.println("Mucho gusto "+ texto);
        System.out.println("Tu nombre tiene "+texto.length()+" letras");
        System.out.println("Tu nombre en Mayusuclas es "+ texto.toUpperCase());
        System.out.println("Tu nombre en minusculas es "+ texto.toLowerCase());
        //guardian.close();// cerramos el sacnner
        double res, x, n;
        System.out.println("Dame x: ");
        x= guardian.nextDouble();
        System.out.println("Dame n: ");
        n = guardian.nextDouble();
        res = Math.pow(x, n);
        System.out.println("El resultado es : "+res);
        double a, b ;
        System.out.println("Dame a: ");
        a = guardian.nextDouble();
        System.out.println("Dame b: ");
        b = guardian.nextDouble();
        double c = Math.sqrt(a*a+b*b);
        System.out.println(c);
        guardian.close();*/
        Scanner in = new Scanner(System.in);
        System.out.println("De que numero sera tu tabla");
        int a;
        a = in.nextInt();
        for (int i =0; i<=a; i++){
              System.out.println(a*i);
        }
        for (int i=10; i>=a; i--){
            System.out.println(a*i);
        }
        



   } 
}
