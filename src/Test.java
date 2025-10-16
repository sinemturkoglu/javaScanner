import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		// nextLine() -> String
		// nextInt() -> Integer
		// nextByte() -> Byte
		// nextFloat -> Float
		// nextDouble -> Double
		
		 Scanner scanner = new Scanner(System.in);
		 double sonuc = 0;
		 
		 
		 System.out.println("Birinci sayıyı giriniz: ");
		 Integer sayi1 = scanner.nextInt();
		 
		 System.out.println("Yapmak istediğiniz işlem operatörünü giriniz: (* , / , + , -)");
		 char operator = scanner.next().charAt(0);
		 
		 System.out.println("İkinci sayıyı giriniz: ");
		 Integer sayi2 = scanner.nextInt();
		 
		 switch(operator) {
		 	case '+':
			 	  sonuc = sayi1 + sayi2;
			 	  break;
		 	  
		 	case '-':
			 	  sonuc = sayi1 - sayi2;
			 	  break;
			 	  
			case '*':
			 	  sonuc = sayi1 * sayi2;
			 	  break;
			 	  
			 	  
			case '/':
				
			 	 if(sayi2 != 0) {
			 		 sonuc = sayi1 / sayi2;
			 	 } else {
			 		System.out.println("Bir sayı sıfıra bölünemez.");
			 		return;
			 	 }
			 	 break;
			 	 
			 default:
				 System.out.println("Geçersiz operatör girişi!");
	             return;  
		 	  
		 }
		 
		 System.out.println(sayi1 + " " + operator + " " + sayi2 + " = " + sonuc);
		
		 scanner.close();
		 
	 
	}

}
