# Map - [Mapa]

- Definição: 
    - <R> Stream<R> map(Function<? super T,? extends R> mapper)

- Parâmetro:
    - Função

- Tipo: 
    - Operação Intermediária

- Descrição:
    - Retorna um fluxo mapeado, ou seja, um fluxo que contém os resultados da aplicação da função fornecida no fluxo original 

- Exemplo: 
    ```
    List numeros = Arrays.asList(2, 4, 8, 10);
    List raizez_quadradas = number.stream().map(x->x*x).collect(Collectors.toList());
    ```
- Diagrama:

    ![Filter]()

- Fonte: 
    - https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html