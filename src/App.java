public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

/*
 * Java application(JDBC api => DB Vendor Driver Software) => Connection =>
 * Database
 * 
 * We need to download jdbc driver for our db vendor (mysql) and add it to
 * classpath of the project.
 * 
 * MySQL driver will connect you to MySQL database only; it can't connect to
 * other databases.
 * 
 * 1. https://dev.mysql.com/downloads/connector/j/
 * or
 * https://mvnrepository.com/artifact/com.mysql/mysql-connector-j
 * 2. Select platform independent
 * 3. Download zip file and extract.
 * Connector/J implements the Java Database Connectivity (JDBC) API.
 * 4. Copy the .jar driver file into the lib folder in the root of the project.
 * 5. Add the jar file to buildpath. (not required in VSCode)
 * 
 */