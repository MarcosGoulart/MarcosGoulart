class Matematica {
  // IMPLEMENTE!
  public static int potencia(int base, int expoente) {
    int resposta = 1;
    if (expoente == 0) return resposta;
    if (expoente < 1) return 0;
    for(int i = 0; i < expoente; i++){
      resposta *= base;
    }
    //System.out.println("Resposta: " + resposta);
    return resposta;
  }

  public static int amplitude(int[] dados){
    int menor = dados[0];
    int maior = dados[0];
    for(int i = 0; i < dados.length; i++){
      if(menor > dados[i]) menor = dados[i];
      if(maior < dados[i]) maior = dados[i];
    }
    return maior - menor;
  }
}
