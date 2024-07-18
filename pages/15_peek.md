# Peek - [Espiar/Observar]

- Definição: 
    - Stream<T> peek(Consumer<? super T> action)

- Tipo: 
    - Operação Intermediária

- Parâmetro:
    - Função Consumer [Não possui retorno] 

- Retorno:
    - Retorna um fluxo utilizado exclusivamente para debugar, ou seja, contém um fluxo que permite que o fluxo original seja espiado/observado

- Exemplo: 
    ```
    List<Pessoa> pessoas_peek = Arrays.asList(new Pessoa("Alice", 20), new Pessoa("Bob", 30), new Pessoa("Charlie", 10));
	pessoas_peek.stream()
                .map(p -> {
	                p.setNome(p.getNome().toUpperCase());
		            return p;
	            })
                .peek(pessoa -> System.out.println("Nome: " + pessoa.getNome())).toList();
    ```

- Diagrama:

    ![Peek](../images/15_peek.png)

- Fonte: 
    - https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html