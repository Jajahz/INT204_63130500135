package sit.int204.tester;

import sit.int204.database.ConnectionBuilder;

import java.sql.Connection;
import java.sql.SQLException;

public class TestJDBC {
    public static void main(String[] args) throws SQLException {
        Connection conn = (new ConnectionBuilder()).getConnection();
        listTable(conn);
    }

    private static void listTable(Connection conn) {

    }
}

