import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Caja p=new Caja("70761357","alex","armando");
		//System.out.println(p);
		DisponibilidadDeCircuito dis= new DisponibilidadDeCircuito();
		dis.mostrar();
		int x;
		do {
			System.out.print("selecione un horario");
			x = sc.nextInt();
		}while(x<0 ||x>10);
		dis.reservar(x);
		dis.mostrar();
		String per=dis.consultaCli();
		
		Caja caja=new Caja(per,"valdivia","70761357");
		caja.GenerarRecivo(1);
		caja.confirmaPago("si");
		caja.cuentaDia();
		
	}

}
