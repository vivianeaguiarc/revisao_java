package fundamentos;

public class NotacaoPonto {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
      String s = "Bom dia X";
      s = s.replace("X", "Viviane");
      s = s.toUpperCase();
      s = s.concat("!!!!");
      System.out.println(s);
      String x = "Leo".toUpperCase();
      System.out.println(x);
      
      String y = "Boa tarde X"
    		  .replace("X", "Bia")
    		  .toUpperCase()
    		  .concat("!!!");
      System.out.println(y);
      
      // Tipos primitivos nao tem notação ponto (.)
      int a = 3;
      System.out.println(a);
    }
}
