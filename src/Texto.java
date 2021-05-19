import java.util.ArrayList;

class Texto {
    // IMPLEMENTE!
    public static int contar(String umaString, char umCaractere) {
      int resposta = 0;
      for(int i = 0; i < umaString.length(); i++){
        if(umaString.charAt(i) == umCaractere) resposta++;
      }
      return resposta;
    }

    public static String eliminar(String original, String retirada) {
        String resposta = "";
        String[] originalList = original.split("");
        String[] retiradaList = retirada.split("");
        for(int i = 0; i < retiradaList.length; i++){
           for(int j = 0; j < originalList.length; j++){
                //System.out.println("retirada " + retiradaList[i]);
                //System.out.println("original " + originalList[j]);
                if(retiradaList[i].equals(originalList[j])){
                    originalList[j] = "";
                }
           }
        }
        for(int i = 0; i < originalList.length; i++){
            resposta += originalList[i];
        }
        return resposta;
    }

    public static int[] localizar(String umaString, char umCaractere) {
        ArrayList<Integer> respostaList = new ArrayList<Integer>();
        for(int i = 0; i < umaString.length(); i++){
            if(umaString.charAt(i) == umCaractere) respostaList.add(i);
        }
        int[] resposta = new int[respostaList.size()];
        for(int i = 0; i < respostaList.size(); i++){
            resposta[i] = respostaList.get(i);
        }
        return resposta;
    }
}

