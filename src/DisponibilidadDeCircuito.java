import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class DisponibilidadDeCircuito{
	String registro[]=new String[11];
	String lista[]=new String[10];
	Scanner sc = new Scanner(System.in);
	public void mostrar(){
		java.util.Date fecha = new Date();
		System.out.println("Fecha "+fecha+"\n");
		System.out.print("   ===== HORARIOS DISPONIBLES ===== \n\n");
		for(int i = 1; i < 11 ; i++){
			System.out.print(i);
			System.out.print(") "+(i+6)+":00 - "+(i+7)+":00");
			if(registro[i]==null)
				System.out.print("  === Disponible ===\n");
			else
				System.out.print("   === ocupado === \n");
		}
	}
	public void reservar(int num) {
		
		System.out.println("ingrese su nombre: ");
		String nombre = sc.nextLine();
		lista[num-1]=nombre;
		registro[num]="ocupado";
		
	}
	public void desHacer(int num) {
		registro[num]=null;
	}
	
	public int elegir() {
		int x;
		do {
			System.out.print("selecione un horario ");
			x = sc.nextInt();
		}while(x<0 ||x>10);
		return x;
	}
	
	public String consultaCli() {
		int x;
		do {
			System.out.print("consultar :  ");
			x = sc.nextInt();
		}while(x<0 ||x>10);
		if(lista[x-1]!=null) {
			System.out.println(lista[x-1]);
			return lista[x-1];
		}else {
			System.out.println(lista[x-1]);
			return lista[x-1];
		}
	}
	
	
	public String[] getRegistro() {
		return registro;
	}
	public void setRegistro(String[] registro) {
		this.registro = registro;
	}
	public String[] getLista() {
		return lista;
	}
	public void setLista(String[] lista) {
		this.lista = lista;
	}
	
	
	
		
		
	
	

}
