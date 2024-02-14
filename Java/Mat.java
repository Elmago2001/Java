public class Mat {
    public static void main(String[] args) {
        // El método math.
        int pareja = Math.max(5, 10);
        System.out.println(pareja);
        // Sirve para encontrar el mayor numero entre 2 valores int dados
        float par=Math.min(2, 3);
        System.out.println(par);
        // Sirve para encontar el valor mas pequeño entre numeros
        double raiz= Math.sqrt(64);
        System.out.println(raiz);
        // o
        System.out.println(Math.sqrt(64));
        // valor absoluto en java
        System.out.println(Math.abs(-3));
        // Numeros aleatorios
        System.out.println(Math.random());
        // imprime numeros al azar entre 0,0 y 1,0
        //para algo mas especifico se utiliza...
         int random= (int)(Math.random()*100);
         System.out.println(random);


    }
}
