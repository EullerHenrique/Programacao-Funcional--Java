# Filter - [Filtro]

- Definição: 
   - Stream<T> filter(Predicate<? super T> predicate)

- Parâmetro:
    - Predicado
    
- Tipo: 
    - Operação Intermediária

- Descrição: 
    - Retorna um fluxo filtrado, ou seja, um fluxo que contém os elementos do fluxo original que atendeu ao predicado fornecido

- Exemplo: 
    ```
    List nomes = Arrays.asList("Programação","Funcional", "Função", "Predicado");
    List resultado = names.stream().filter(s->s.startsWith("F"));
    ```
- Diagrama:

    ![Filter](../images/03_filter.png)

- Fonte: 
    - https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
