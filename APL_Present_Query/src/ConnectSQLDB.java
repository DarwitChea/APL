import java.sql.*;

public class ConnectSQLDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://david.iceteag8m1.click:3306/corejava_sql", "root", "mysql12345"
            );
            String Query = "SELECT * FROM Authors WHERE Name = ? ";
            PreparedStatement statement = conn.prepareStatement(Query);
            statement.setString(1, "Brooks");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + ", " + resultSet.getString(2));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        boolean isResult = stat.execute(command);
        boolean done = false;
        while (!done)
        {
            if (isResult)
            {
                ResultSet result = stat.getResultSet();
                dosomethingwith result }
            else {
                int updateCount = stat.getUpdateCount();
                if (updateCount >= 0)
                    dosomethingwith updateCount else
                    done = true; }
    }
}

