package org.App;
import org.Server.SQLDatabaseConnection;
import org.Server.Queries;
import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            // Create an instance of SQLDatabaseConnection
            SQLDatabaseConnection dbConnection = new SQLDatabaseConnection();

            // Establish connection to the database
            Connection conn = dbConnection.connect();

            if (conn != null) {
                // Create an instance of Queries and run a query
                Queries queries = new Queries();
                queries.fetchData(conn);
                //queries.fetchpH(conn);
                //queries.counterOfRedWhite(conn);
//                queries.phSmallerThanSix(conn);
                //queries.selectMaxMinValue(conn);

                // Close the connection (optional, since it's automatically handled with try-with-resources)
                try {
                    conn.close();
                } catch (Exception e) {
                    System.out.println("Error closing connection: " + e.getMessage());
                }
            }
        }

}