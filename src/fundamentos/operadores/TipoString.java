package fundamentos.operadores;

import java.util.Scanner;

public class TipoString {
    public static void main(String[] args) {
      String s = new String("2");
      System.out.println("2" == s);

      System.out.println("2".equals(s)); // comparar Strings

      Scanner sc = new Scanner(System.in);
      String s2 = sc.nextLine();
      System.out.println("2" == s2.trim());
      System.out.println("2".equals(s2.trim()));

      sc.close();
    }
}
