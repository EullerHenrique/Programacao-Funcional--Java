# Flat Map - [Mapa Long Plano]

- Definição: 
    - LongStream flatMapToLong(Function<? super T,? extends LongStream> mapper)

- Tipo: 
    - Operação Intermediária

- Parâmetro:
    - Função Long

- Retorno:
    - Retorna um fluxo long mapeado de forma plana, ou seja, um fluxo que contém a unificação de vários fluxos que podem ter sido alterados ou não

- Exemplo: 
    ```
	List<List<Long>> numeros_lista_long = Arrays.asList(
				Arrays.asList(100L, 121L, 141L),
				Arrays.asList(200L, 121L, 1213L),
				Arrays.asList(300L, 500L, 12312L)
		);

	List<Long> numeros_flat_map_long = numeros_lista_long.stream().flatMapToLong(l -> l.stream().mapToLong(i -> i*i)).boxed().toList();
    ```

- Diagrama:

    ![Flat Map](../images/05_flat_map.png)

- Fonte: 
    - https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html