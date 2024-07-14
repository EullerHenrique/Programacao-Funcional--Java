# Map Long - [Mapa Long]

- Definição: 
    - LongStream mapToLong(ToLongFunction<? super T> mapper)

- Tipo: 
    - Operação Intermediária

- Parâmetro:
    - Função To Long

- Retorno:
    - Retorna um fluxo long mapeado, ou seja, um fluxo que contém os resultados da aplicação da função to int fornecida no fluxo original 

- Exemplo: 
    ```
    List<String> numeros_string_long = Arrays.asList("12121212121212121", "21212121212121212", "31212121212121212", "41212121212121212");
	List<Long> numeros_long = numeros_string_long.stream().mapToLong(Long::parseLong).boxed().toList();
    ```
- Diagrama:

    ![Map](../images/04_map.png)

- Fonte: 
    - https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html