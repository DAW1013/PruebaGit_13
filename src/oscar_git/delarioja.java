package oscar_git;
//Dado un numero de 3 cifras decir si es par o no
//////////////********************//////////////
///////******* OscarBlancoVallejo *******///////
//////////////********************//////////////
import java.util.Scanner;
public class delarioja {
private static Scanner sc;
public static void main(String[] args) {
int n=0;
sc = new Scanner(System.in);
System.out.println("Dame un numero DE 3 CIFRAS: ");
n = sc.nextInt();
if(n>99 && n<1000){
	if(n%2==0){
		System.out.println("Es par");
	}else{//if
		System.out.println("NO es par"); // <--- MODIFICACION
	}//else
}else{//if
	System.out.println("Me la estas contando!!");
}//else
}//main 
}//Espar_delarioja