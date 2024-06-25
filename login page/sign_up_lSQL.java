import java.sql.*;
public class sign_up_lSQL {
   static String use1;
    static String pa1;
    static String connectionpath = "jdbc:sqlserver://LAPTOP-RRR8Q3CJ:1433;Database=test1 ;user=lovemehateyou;password=alazar11821996;trustServerCertificate=true;";
    //CREATEING A DATABASE
    public static void create(){
        try {
            // Register the JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found");
            e.printStackTrace();
            return;
        }

        try(Connection connect = DriverManager.getConnection(connectionpath)){
            
            PreparedStatement statment = connect.prepareStatement("create table Users( username varchar(20),password varchar(20),role varchar(30))");
            statment.executeUpdate();
            System.out.println("DATABASE CREATED");

        }
        catch(SQLException E){
            System.out.println("could not connect");
            E.printStackTrace();
            return;
        }


    }
    //ADDING MOVIES TO THE DATABASE
    public static void ADD(String user, String pass,String role){
        try {
            // Register the JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found");
            e.printStackTrace();
            return;
        }

    try(Connection connect = DriverManager.getConnection(connectionpath);){
        
        PreparedStatement statement = connect.prepareStatement("INSERT INTO Users values(?,?,?);");
        statement.setString(1, user);
        statement.setString(2, pass);
        statement.setString(3, role);
        

        statement.executeUpdate();
        System.out.println("RECORDES ADDED");
        
        connect.close();

    }
    catch(SQLException E){
        System.out.println("COUDN'T ADD THE RECORED");
        E.printStackTrace();
        return;
    }
}
//SEARCHING FOR A VALUE
public static boolean search(String user,String pass){
    
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    }
    catch(ClassNotFoundException E){
        System.out.println("JDBC driver not found");
        E.printStackTrace();
        
    }
    try(Connection connect = DriverManager.getConnection(connectionpath)){
        PreparedStatement statement = connect.prepareStatement("SELECT * FROM Users WHERE username =? and password = ?");
        statement.setString(1, user);
        statement.setString(2, pass);
        ResultSet result =  statement.executeQuery();
        while ((result.next())) {
            use1 = result.getString("username");
            pa1 = result.getString("password");
               
        }
        if (use1.equals(user) && pa1.equals(pass)) {
           return true;
        }
        connect.close();
        
    }
    catch(SQLException E){
        System.out.println("JDBC driver not found");
        E.printStackTrace();
    
    }
    return false;
}



//DROP THE DATABASE TABLE
public static void Drop(){
    try {
        // Register the JDBC driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    } catch (ClassNotFoundException e) {
        System.out.println("JDBC driver not found");
        e.printStackTrace();
        return;
    }

    try(Connection connect = DriverManager.getConnection(connectionpath)){
        
        PreparedStatement statment = connect.prepareStatement("drop table Movies");
        statment.executeUpdate();
        System.out.println("DATABASE dropped");

    }
    catch(SQLException E){
        System.out.println("couldn't deop");
        E.printStackTrace();
        return;
    }

}
}
