import javax.print.event.PrintJobListener;

public class cadena{
    public static void main(String[] args){
        //Ahora vamos a declarar variables

        String nombre1; 
        String nombre2;

        nombre1 = "Adolfo Ogarrio Rosas";
        nombre2 = "Adolfo Ogarrio Rosas";
        int x = nombre1.compareTo(nombre2);
        System.out.print(nombre1);
        System.out.println(" y tiene "+ nombre1.length() + " letras"); // se puede usar /t de tabulador para espacios
        System.out.println(x); // 0 son iguales otro numero son distintas
        System.out.println(nombre1.toUpperCase()+" "+nombre2.toLowerCase());
        double a, b = 2, c = 4;
        a = Math.max(b,c);
        System.out.println(a);
        a = Math.random();
        System.out.println("El numero aleatorio fue "+ a);
        int e = (int) (a*1000);
        System.out.println("El numero aleatorio es "+e);
        System.out.println((int)Math.pow(b,c));
        if(e<=500){
            System.out.println("esta en la primera mitad");
        } else{
            System.out.println("Esta en la segunda mitad");
        }
    }
}