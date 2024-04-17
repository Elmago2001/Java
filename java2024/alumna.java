public class alumna {
    String matricula;
    static int generacion;// esto es de la clase objeto
    public static void main(String[] args) {
        alumna x = new alumna();
        alumna y = new alumna();
        alumna z = new alumna();
        
        ponGeneracion(2023);
        x.ponMatricula("1924700b");
        y.ponMatricula("2203013k");
    }
    // para toda la clase
    static void ponGeneracion(int g){
        generacion = g;
    }
    // para objetos particulares
    void ponMatricula(String m){
        matricula = m;
    }
}
