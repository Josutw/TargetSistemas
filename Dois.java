package targetSistemas;
import java.util.Scanner;
public class Dois {
 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int numero = sc.nextInt();
		 int prim = 0, segun = 1;
		 
		 boolean Fibonnaci = false;
		 while (segun<numero) {
			 segun = prim + segun;
			 prim =segun-prim;
			 if (segun == numero){
				 Fibonnaci = true;
				 break;
			 }
		 }
		 if (Fibonnaci) {
			 System.out.printf("O número %d%n pertence ao Fibonnaci",numero);
		 }
		 else {
			 System.out.printf("O número %d%n não  pertence ao Fibonnaci",numero);
		 }
		 
 }		
		
}



