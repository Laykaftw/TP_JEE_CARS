package metier;

import java.util.List;

public interface ImetierCatalogue {
	public List<Car> getCarsParMotCle(String mc);

	public void addCar(Car p);
}