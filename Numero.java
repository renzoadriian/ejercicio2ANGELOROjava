package ejercicio2;
import java.util.Scanner;
public class Numero {
private Scanner teclado;
private int numero;
private int cont;
public void ingresar(){
	teclado=new Scanner(System.in);
	System.out.print("Ingrese su numero:");
	numero=teclado.nextInt();
}
public void digitos(){
	cont =0;
			while( numero>=1 ) 
			{ 
			numero=numero/10; 
			cont=cont+1; 
			}
	System.out.print("Los digitos de su numero son:"+cont);
}
public static void main(String[]ar){
	Numero numero1 ;
	numero1=new Numero();
	numero1.ingresar();
	numero1.digitos();
}

}
