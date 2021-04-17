import java.sql.*;
class MysqlCon{
    public static void main(String args[]){
        try{
           // Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila","root","123@pass");
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select first_name from actor");
            while(rs.next())
                System.out.println(rs.getString(1));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
