public class Identif{
    public static void main (String[] args){
        int miVar= 200;
        String mivar= "Adolfo";
        System.out.println(miVar+" "+mivar);
        float f1= 1e3f;
        double d1= 2E4d; //E para num. cientifico
        System.out.println(f1+" "+d1);
        boolean java = true;
        boolean sabor = false;
        System.out.println(java);
        System.out.println(sabor);
        int entero=9;// de Grande a peuqeño es automatico.
        double doble = entero;
        System.out.println(entero);
        System.out.println(doble);
        double doble2= 9.78d;// de pequeño a grande se debe especificar en ()
        int entero2= (int) doble2;
        System.out.println(doble2);
        System.out.println(entero2);
    }
}
//java distingue entre mayusculas y minusculas.
/*tipos de datos primitivos:
 * byte
 * short
 * int
 * long = este siempre debe llevar L al final
 * float = este debe llevar  f al final 
 * double = este debe terminar con d al final
 * boolean
 * char
 */