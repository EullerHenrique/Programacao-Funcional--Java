# Sorted - [Ordenado]

- Definição: 
    - Stream<T> sorted()

- Tipo: 
    - Operação Intermediária

- Parâmetro:
    - Nenhum

- Retorno:
    - Retorna um fluxo ordenado, ou seja, um fluxo que contém os elementos do fluxo original de forma ordenada

- Exemplo: 
    ```
  	List<Integer> numeros_desordenados = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);
	List<Integer> numeros_ordenados = numeros_desordenados.stream().sorted().toList();
    ```

- Diagrama:

    ![Sorted](../images/13_sorted.png)

- Fonte: 
    - https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html