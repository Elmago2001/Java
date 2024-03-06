	public class cadena {
		public static void main(String[] args){
			String nombre1,  nombre2;
			nombre1= "ADOLFO OGARRIO ROSAS";
			nombre2= "Adolfo Ogarrio Rosas";
			int x = nombre1.compareTo(nombre2);
			System.out.println(nombre1);
			System.out.println("y tiene "+ nombre1.length()+ " letras");
			System.out.println(x);
			System.out.println(nombre2.toUpperCase()+" "+nombre1.toLowerCase());
			double a, b=2, c=4;
			a = Math.max(b,c);
			System.out.println(a);
			a = Math.random();
			System.out.println("El numero aleatorio fue "+ a);
			int e = (int)(a*1000);
			System.out.println("El numero aleatorio es"+ e);
			System.out.println((int)Math.pow(b,c));
			if(e<=500){

				System.out.println("Esta en la primera mitad"); 
			}else{
				System.out.println("Esta en la segunda mitad");
			 }
			 
	 } 

 }
