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

	}
}