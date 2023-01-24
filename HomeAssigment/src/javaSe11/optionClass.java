package javaSe11;

import java.util.List;
import java.util.Optional;

public class optionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var items = List.of(new Item("A",10),new Item("B",2),new Item("C",12),new Item("D",5),new Item("E",6));
		double avg = items.stream().mapToInt(i -> i.amount).average().orElse(0.0);
		Optional<Item> item = items.parallelStream()
				.filter(i-> i.amount < avg).findAny();
		System.out.println(item.orElseThrow());
	}

}
