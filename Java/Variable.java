public class Variable{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        String nombre= "John";
        System.out.print(nombre);// sim. concatenar +
        int numero= 22;
        System.out.println(numero);
        int numero2;//1
        numero2=300;//2
        System.out.println(numero2);
        int numero3=15;//3
        numero3=20;//4
        System.out.println(numero3);
        /*usar la keyword final
         * la variable se volvera constante
         * y no se podra cambiar, generara error
         */
        final int numero4=15;
        //numero4=23; // generara error.
        float numero5 =5.6f;
        char letra='D';
        boolean bolean= true;
        System.out.println(numero5 + numero5);
        System.out.println(letra + nombre + " " + numero2);
        int x=4, y=3, z=3;//5
        System.out.println(x+y+z);
        int a,b,c;
        a=b=c=2;
        System.out.println(c+b+a);
    }
}
/*tipos de variable:
string, int, float, char, boolean
ejemplo. type variablename= value */
// 1: se puede declarar variable sin asgnar valor
// 2: asignar el valor mas tarde
// 3: si se asigna un valor a una variable existente
// 4: sobrescribira el valor anterior.
// 5: creaar mas de una variable del mismo tipo