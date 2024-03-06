import java.util.Scanner;
public class scaner{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);//se crea el objeto scanner
        System.out.println("Que tabla quieres");
        int i = obj.nextInt();
        for(int a = 1; a<=10; a++){//el codigo sera ejecutado
            //a inicia en 1
            //la segunda es condicion y puedes poner lo que queiras
            System.out.println(a*i);
        }
        System.out.println("\n");

        for(int a = 10; a>=1; a--){
            System.out.println(a*i);
        }
         obj.close();
    }
}