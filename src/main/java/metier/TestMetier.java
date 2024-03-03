package metier;

import java.util.List;

public class TestMetier {
	public static void main(String[] args) {
		MetierImpl metier = new MetierImpl();
		List<Car> prods = metier.getCarsParMotCle("P");
		for (Car p : prods)
			System.out.println(p.getCarname());
	}
}