# Avaliação 01 Procedimentos e Testagem

Link do GitHub Classroom <https://classroom.github.com/a/bNuFiiNo>

## Implementar usando métodos e testar segundo as especificações

Esta atividade é avaliada e o esforço é estimado entre 4 e 8 horas.

Copie os casos de teste para o método `main` em [App.java](src/App.java), conforme o exemplo que já está no arquivo. Comente as linhas com `//` ou `/*` e `*/` e as descomente conforme for implementando.

Se houver um caso de teste incorreto, avise o professor e faça o ajuste. Mas, **IMPORTANTE**, a especificação não pode ser alterada, isto é, não altere os nomes das classes, métodos ou mude a quantidade de parâmetros e tipo de retorno, a não ser que a atividade deixe livre para esta escolha.

### Exponenciação

Implementar a classe `Matematica` e um procedimento (método) para fazer potência de inteiros `potencia`.

**Não pode ser usada a classe `Math`**.

**Casos de Teste:**

```java
// método Matematica.potencia que entram dois inteiros e sai um inteiro
// potencia(int,int):int
int base = 3;
int expoente = 4;
int resultado = Matematica.potencia(base, expoente);
// formato de saída: espera a resposta.
System.out.println(resultado); // deve imprimir 81
// formato de assertiva/caso de teste: espera SEMPRE true!
System.out.println(resultado == 81); // deve imprimir true

// Casos de Teste:
System.out.print("potencia(3, 2) == 9 "); // 3 ao quadrado
System.out.println(Matematica.potencia(3, 2) == 9); // 3 ao quadrado
System.out.print("potencia(2, 3) == 8 "); // 2 ao cubo
System.out.println(Matematica.potencia(2, 3) == 8); // 2 ao cubo
// Números grandes
System.out.print("potencia(23, 6) == 148035889 ");
System.out.println(Matematica.potencia(23, 6) == 148035889);
System.out.print("potencia(2, 30) == 1073741824 ");
System.out.println(Matematica.potencia(2, 30) == 1073741824);
// Casos Especiais: bases negativas
System.out.print("potencia(-2, 3) == -8 ");
System.out.println(Matematica.potencia(-2, 3) == -8);
System.out.print("potencia(-2, 4) == 16 ");
System.out.println(Matematica.potencia(2, 4) == 16);
// Casos não cobertos: expoente negativo
System.out.print("potencia(2, -3) == 0 ");
System.out.println(Matematica.potencia(2, -3) == 0);
System.out.print("potencia(7, -2) == 0 ");
System.out.println(Matematica.potencia(7, -2) == 0);
// Adicione mais 2 Casos de Teste/Assertivas a sua escolha
```

### Contar um caractere em uma String

Considere uma _string_ e um caractere. Retorne a quantidade de ocorrências deste caractere na _string_.

**Casos de Teste:**

```java
String umaString = "uma string de teste";
char umCaractere = 's';

// há dois `s` em `uma string de teste`
System.out.println(Texto.contar(umaString, umCaractere)); // 2
System.out.println(Texto.contar(umaString, umCaractere) == 2); // true
// sempre true:
System.out.println(Texto.contar(umaString, 'e') == 3);
System.out.println(Texto.contar(umaString, 'o') == 0);

System.out.println(Texto.contar("", ' ') == 0);
System.out.println(Texto.contar(" ", ' ') == 1);

System.out.println(Texto.contar("ABC", 'b') == 0);
System.out.println(Texto.contar("ABC", 'B') == 1);

System.out.println(Texto.contar("POO", 'O') == 2);
```

### Eliminar caracteres de uma String

Considere duas _Strings_, a primeira contendo o texto e a segunda contendo a lista de caracteres a excluir. Retorne o texto sem estes caracteres.

**Não pode ser usado o método `replace`**.

**Casos de Teste:**

```java
String str1 = "aula";
String str2 = Texto.eliminar(str1, "a");
System.out.println(str1.equals("aula"));
System.out.println(str2.equals("ul"));

String str3 = Texto.eliminar(str1, str2);
System.out.println(str3.equals("aa"));

// Eliminar os caracteres independente da ordem:
System.out.println(Texto.eliminar("texto de teste", "tx").equals("eo de ese"));
System.out.println(Texto.eliminar("palavra", "rlv").equals("paaa"));
System.out.println(Texto.eliminar("exemplo", "ertyui").equals("xmplo"));

System.out.println(Texto.eliminar("exemplo", "").equals("exemplo"));
System.out.println(Texto.eliminar("TESTE", "e").equals("TESTE"));
System.out.println(Texto.eliminar("teste", "eeeeee").equals("tst"));
System.out.println(Texto.eliminar("POO", "OP").equals(""));
System.out.println(Texto.eliminar("", "abc").equals(""));
System.out.println(Texto.eliminar("", "").equals(""));
System.out.println(Texto.eliminar("aabbbbbccccc", "cc").equals("aabbbbb"));
System.out.println(Texto.eliminar("aabbbbbccccc", "abbc").equals(""));
```

### Localizar os índices de um caractere em uma String

Considere uma _string_ e um caractere a localizar. Devolver um _array_ de _int_ com todos os índices encontrados para este caractere em ordem crescente.

```java
char letraA = 'a'; // a letra `a` está nos índices marcados abaixo
//                     _ _ _        _ _ _
String umTexto = "programacao orientada a objetos";
//                0123456789012345678901234567890
int[] indices = Texto.localizar(umTexto, letraA);

// a letra "a" aparece nos índices 5, 7, 9, 18, 20 e 22
System.out.println(java.util.Arrays.toString(indices)); // [5, 7, 9, 18, 20, 22]

System.out.println(indices.length == 6); // true

System.out.println(indices[0] == 5); // true
System.out.println(indices[1] == 7); // true
System.out.println(indices[2] == 9); // true
System.out.println(indices[3] == 18); // true
System.out.println(indices[4] == 20); // true
System.out.println(indices[5] == 22); // true

indices = Texto.localizar("poo", 'o');
System.out.println(indices.length == 2); // true
System.out.println(indices[0] == 1); // true
System.out.println(indices[1] == 2); // true

indices = Texto.localizar("poo", letraA);
System.out.println(indices.length == 0); // true

indices = Texto.localizar("poo", 'P');
System.out.println(indices.length == 0); // true

System.out.println(Texto.localizar("array", 'y')[0] == 4); // true
```

### Amplitude

Especificar, implementar e escrever os testes para um método de estatística que receba um _array_ de inteiros e devolva um inteiro com a amplitude dos dados.

Amplitude é uma medida de dispersão e podes encontrar mais detalhes neste link <https://brasilescola.uol.com.br/matematica/medidas-dispersao-amplitude-desvio.htm> ou outra referência na Web.

* * *

Deu certo [:)](memes/yes.jpg) Deu errado [:(](memes/no.jpg)
