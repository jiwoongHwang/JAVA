package woongs2;

import java.util.Scanner;

public class ���� {
	   public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	      int result=0;
	      System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");
	      int a = s.nextInt();
	      int b = s.nextInt();
	      char c = s.next().charAt(0);
	      Calc cal;
	      switch(c) {
	      case '+' : 
	         cal = new Add();
	         break;
	      case '-' :
	         cal = new Sub();
	         break;
	      case '*' :
	         cal = new Mul();
	         break;
	      case '/' :
	         cal = new Div();
	         break;
	      default :
	         System.out.println("�߸��� ������ �Դϴ�.");
	         return;
	      }
	      cal.setValue(a, b);
	      result = cal.calculate();
	      System.out.println(result);
	   }
	}