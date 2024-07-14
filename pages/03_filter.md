# Filter - [Filtro]

- Definição: 
   - Stream<T> filter(Predicate<? super T> predicate)

- Tipo: 
    - Operação Intermediária

- Parâmetro:
    - Predicado

- Retorno: 
    - Retorna um fluxo filtrado, ou seja, um fluxo que contém os elementos do fluxo original que atendeu ao predicado fornecido

- Exemplo: 
    ```
    List<String> nomes = Arrays.asList("Programação","Funcional", "Função", "Predicado");
	List<String> nomes_filtrados = nomes.stream().filter(s->s.startsWith("F")).toList();
    ```
- Diagrama:

    ![Filter](../images/03_filter.png)

- Fonte: 
    - https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
