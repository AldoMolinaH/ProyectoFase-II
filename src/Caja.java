
public class Caja extends Persona{
	private int cont=0;
	
	public Caja( String nombre, String apellidos,String dni) {
		super( nombre, apellidos,dni);
	}
	
	public void GenerarRecivo(float horas) {
		System.out.println("******* RECIVO *******");
		System.out.println("Nombres: "+getNombre()+" "+getApellidos());
		System.out.println("DNI: "+getDni());
		
		System.out.println("\n****** Total: "+(horas*25));
	}
	public void cuentaDia() {
		System.out.println("Total del dia: "+(this.cont*25));
	}
	public void confirmaPago(String c) {
		if (c=="si")this.cont++;
		else System.out.println("no realizado");
	}
	
	
}
