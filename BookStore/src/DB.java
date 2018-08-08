import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB {

	void getData(String id) {
		String sql = "SELECT * FROM USER WHERE ID = ?";
		try ( // 1. Create database connection
				Connection connection = DriverManager.getConnection("");
				// 2. Prepare SQL statement
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
			preparedStatement.setString(1, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
