package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
	@Override
	public List<Car> getCarsParMotCle(String mc) {
		List<Car> prods = new ArrayList<Car>();
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from CARS where CAR_NAME LIKE ?");
			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Car c = new Car();
				c.setIdCar(rs.getLong("ID_Car"));
				c.setCarname(rs.getString("CAR_NAME"));
				c.setPrice(rs.getDouble("PRICE"));
				prods.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prods;
	}

	@Override
	public void addCar(Car c) {
// TODO Auto-generated method stub
	}
}