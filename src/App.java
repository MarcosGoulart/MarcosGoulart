class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");
    /*
    int base = 3;
    int expoente = 4;
    int resultado = Matematica.potencia(base, expoente);
    // formato de saída: espera a resposta.
    System.out.println(resultado); // deve imprimir 81
    // formato de assertiva/caso de teste: espera SEMPRE true!
    System.out.println(resultado == 81); // deve imprimir true

    System.out.print("potencia(3, 2) == 9 "); // 3 ao quadrado
    System.out.println(Matematica.potencia(3, 2) == 9); // 3 ao quadrado
    System.out.print("potencia(2, 3) == 8 "); // 2 ao cubo
    System.out.println(Matematica.potencia(2, 3) == 8); // 2 ao cubo
    */


    String umaString = "uma string de teste";
    char umCaractere = 's';

    // há dois `s` em `uma string de teste`
    System.out.println(Texto.contar(umaString, umCaractere)); // 2
    System.out.println(Texto.contar(umaString, umCaractere) == 2); // true
  }
}
