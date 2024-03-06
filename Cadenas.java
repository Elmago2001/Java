public class Cadenas{
    public static void main(String[] args) {
        String saludo= "Hola";
        System.out.println(saludo);
        String txt = "akjshuhfueowiwopqks";
        System.out.println(txt.length());
        //comando length es para saber el numero de caracteres
        String txt2="Hola Mundo";
        System.out.println(txt2.toLowerCase()+" "+txt2.toUpperCase());
        //toLower/Uppercase sirve para hacerlo May. o Min. respct.
        String txt3 ="Hoy me fue bien";
        System.out.println(txt3);
        System.out.println(txt3.indexOf("Hoy"));// indica la posicion de donde inicia la palabra por primera vez
        //Concatenar cadenas
        String nombre= "Adolfo";
        String apellido = "Ogarrio";
        System.out.println(nombre+" "+ apellido);
        // o se puede usar el metodo. concat()
        System.out.println(nombre.concat(apellido));
        /*Caracteres especiales 
         * para evitar errores com comillas dentro del texto
         * se usa la barra invertida \ =(option + ?)
         * \' = '
         * \''="
         * \\
         * \n = salto de linia
         * \r
         * \t
         * \b
         * \f
        */

    }
}