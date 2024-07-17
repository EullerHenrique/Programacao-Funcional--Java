# Distinct - [Distinto]

- Definição: 
    - Stream<T> distinct()

- Tipo: 
    - Operação Intermediária

- Parâmetro:
    - Nenhum

- Retorno:
    - Retorna um fluxo distinto, ou seja, um fluxo que não contém os elementos repetidos do fluxo original  

- Exemplo: 
    ```
    List<Integer> numeros_repetidos = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5);
	List<Integer> numeros_distintos = numeros_repetidos.stream().distinct().toList();
    ```

- Diagrama:

    ![Distinct](../images/12_distinct.png)

- Fonte: 
    - https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html