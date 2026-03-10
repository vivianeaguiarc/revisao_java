package fundamentos;

public class TipoString {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
      System.out.println("Ola pessoal".charAt(2));

      String s = "Boa tarde";
      System.out.println(s.concat(s + " !!!"));
      System.out.println(s + " !!!");
      System.out.println(s.startsWith("Boa"));
      System.out.println(s.toUpperCase().startsWith("boa"));
      System.out.println(s.length());
      System.out.println(s.endsWith("tarde"));
      System.out.println(s.toUpperCase().endsWith("TARDE"));
      System.out.println(s.equals("Boa tarde"));
      System.out.println(s.equalsIgnoreCase("boa tarde"));

      var nome = "Viviane";
      var sobrenome = "Aguiar";
      var idade = 42;
      var salario = 12640.60;

      System.out.println("Nome: " + nome + "\nSobrenome: " 
                + sobrenome + "\nIdade: " + idade + 
                "\nSalario: " + salario + "\n");
      System.out.printf("\nA %s %s tem %d. anos e ganha %.2f", nome, sobrenome, idade, salario);

    String frase = String.format("\nA %s %S tem %d anos e ganha %.2f de salario", nome, sobrenome, idade, salario);

    String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nidade: " + idade + "\nSalario: " + salario + "\n";
    System.out.println(frase);
    System.out.println(maisUmaFrase);
    }
}
