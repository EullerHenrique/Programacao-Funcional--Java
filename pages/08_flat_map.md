# Flat Map - [Mapa plano]

- Definição: 
    - <R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)

- Tipo: 
    - Operação Intermediária

- Parâmetro:
    - Função 

- Retorno:
    - Retorna um fluxo mapeado de forma plana, ou seja, um fluxo que contém a unificação de vários fluxos que podem ter sido alterados ou não

- Exemplo: 
    ```
	List<Pessoa> pessoas = Arrays.asList(
				new Pessoa("João", new ArrayList<>(Arrays.asList("Vermelho", "Azul"))),
				new Pessoa("Maria", new ArrayList<>(Arrays.asList("Verde", "Amarelo"))),
				new Pessoa("José", new ArrayList<>(List.of("Roxo")))
	);
	List<String> cores_favoritas = 
        pessoas.stream()
                .flatMap(p -> {
			        p.addCorFavorita("Cinza");
			        return p.getCoresFavoritas().stream();
	            })
                .toList();
    ```

- Diagrama:

    ![Flat Map](../images/05_flat_map.png)

- Fonte: 
    - https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html