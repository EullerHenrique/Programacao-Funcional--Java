# Sorted Comparator - [Ordenado Comparador]

- Definição: 
    - Stream<T> sorted(Comparator<? super T> comparator)

- Tipo: 
    - Operação Intermediária

- Parâmetro:
    - Função Comparator

- Retorno:
    - Retorna um fluxo ordenado por um comparador, ou seja, um fluxo que contém os elementos do fluxo original ordenados por uma função comparadora

- Exemplo: 
    ```
  	List<Pessoa> pessoas_desordenadas = Arrays.asList(
				new Pessoa("Alice", 20),
				new Pessoa("Bob", 30),
				new Pessoa("Charlie", 10)
	);
	List<String> nomes_pessoas_ordenadas = pessoas_desordenadas.stream().sorted(Comparator.comparingInt(Pessoa::getIdade)).map(Pessoa::getNome).toList();
    ```

- Diagrama:

    ![Sorted](../images/13_sorted.png)

- Fonte: 
    - https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html