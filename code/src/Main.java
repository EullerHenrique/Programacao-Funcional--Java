import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		//Filter
		System.out.println("Filter");
		List<String> nomes = Arrays.asList("Programação","Funcional", "Função", "Predicado");
		List<String> nomes_filtrados = nomes.stream().filter(s->s.startsWith("F")).toList();
		System.out.println(nomes_filtrados);

		//Map
		System.out.println("Map");
		List<Integer> numeros = Arrays.asList(2, 4, 8, 10);
		List<Integer> raizez_quadradas = numeros.stream().map(x->x*x).toList();
		System.out.println(raizez_quadradas);

		//Map To Int
		System.out.println("Map To Int");
		List<String> numeros_string_integer = Arrays.asList("1", "2", "3", "4");
		List<Integer> numeros_integer = numeros_string_integer.stream().mapToInt(Integer::parseInt).boxed().toList();
		System.out.println(numeros_integer);

		//Map To Long
		System.out.println("Map To Long");
		List<String> numeros_string_long = Arrays.asList("12121212121212121", "21212121212121212", "31212121212121212", "41212121212121212");
		List<Long> numeros_long = numeros_string_long.stream().mapToLong(Long::parseLong).boxed().toList();
		System.out.println(numeros_long);

		//Map To Double
		System.out.println("Map To Double");
		List<String> numeros_string_double = Arrays.asList("1.4", "2.7", "3.2", "4.6");
		List<Double> numeros_double = numeros_string_double.stream().mapToDouble(Double::parseDouble).boxed().toList();
		System.out.println(numeros_double);

		//Flat Map
		System.out.println("Flat Map");

		List<Pessoa> pessoas = Arrays.asList(
				new Pessoa("Alice", new ArrayList<>(Arrays.asList("Vermelho", "Azul"))),
				new Pessoa("Bob", new ArrayList<>(Arrays.asList("Verde", "Amarelo"))),
				new Pessoa("Charlie", new ArrayList<>(List.of("Roxo")))
		);
		List<String> cores_favoritas = pessoas.stream().flatMap(p -> {
			p.addCorFavorita("Cinza");
			return p.getCoresFavoritas().stream();
		}).toList();
		System.out.println(cores_favoritas);

		//Flat Map Int
		System.out.println("Flat Map Int");

		List<List<Integer>> numeros_lista = Arrays.asList(
				Arrays.asList(1, 2, 3),
				Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9)
		);
		List<Integer> numeros_flat_map_int = numeros_lista.stream().flatMapToInt(l -> l.stream().mapToInt(i -> i*i)).boxed().toList();
		System.out.println(numeros_flat_map_int);

		//Flat Map Long
		System.out.println("Flat Map Long");

		List<List<Long>> numeros_lista_long = Arrays.asList(
				Arrays.asList(100L, 121L, 141L),
				Arrays.asList(200L, 121L, 1213L),
				Arrays.asList(300L, 500L, 12312L)
		);

		List<Long> numeros_flat_map_long = numeros_lista_long.stream().flatMapToLong(l -> l.stream().mapToLong(i -> i*i)).boxed().toList();
		System.out.println(numeros_flat_map_long);

		//Flat Map Double
		System.out.println("Flat Map Double");

		List<List<Double>> numeros_lista_double = Arrays.asList(
				Arrays.asList(1.1, 2.2, 3.3),
				Arrays.asList(4.4, 5.5, 6.6),
				Arrays.asList(7.7, 8.8, 9.9)
		);
		List<Double> numeros_flat_map_double = numeros_lista_double.stream().flatMapToDouble(l -> l.stream().mapToDouble(i -> i*i)).boxed().toList();
		System.out.println(numeros_flat_map_double);

	}
}