# Map Int - [Mapa Int]

- Definição: 
    - IntStream mapToInt(ToIntFunction<? super T> mapper)

- Tipo: 
    - Operação Intermediária

- Parâmetro:
    - Função To Int

- Retorno:
    -  Retorna um fluxo int mapeado, ou seja, um fluxo que contém os resultados da aplicação da função to int fornecida no fluxo original 
- Exemplo: 
    ```
    List<String> numeros_string = Arrays.asList("1", "2", "3", "4");
	List<Integer> numeros_integer = numeros_string.stream().mapToInt(Integer::parseInt).boxed().toList();
    ```
- Diagrama:

    ![Map](../images/04_map.png)

- Fonte: 
    - https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html