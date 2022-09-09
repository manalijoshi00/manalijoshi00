import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Movies {

	public static void main(String[] args) 
	{
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter movies Title :");
		String title = sc.next();
		System.out.println("Enter movies Genre :");
		String genre = sc.next();
		System.out.println("Enter movies YearOfRelease :");
		int yearOfRelease = sc.nextInt();*/
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/manali?autoReconnect=true&useSSL=false", "root","1234567");
			
			 Statement s=con.createStatement();
			//s.execute("create table Movies(Id int auto_increment primary key,Title varchar(255),Genre varchar(255),YearOfRelease int)");
			//System.out.println("Table created Successfully...");
			
			/*PreparedStatement ps = con.prepareStatement("insert into Movies(Title,Genre,YearOfRelease) values(?,?,?)");
			ps.setString(1,title);
			ps.setString(2,genre);
			ps.setInt(3,yearOfRelease);
			ps.executeUpdate();*/
			
			/*PreparedStatement ps = con.prepareStatement("update Movies set YearOfRelease=2016 where id=2");
			ps.executeUpdate();
			System.out.println("Updated...");*/
			
			PreparedStatement ps = con.prepareStatement("delete from Movies where id=4;");
			ps.executeUpdate();
			System.out.println("deleted...");
			
			ResultSet rs = s.executeQuery("Select id,title,genre,yearOfRelease from Movies");
			System.out.println(" Id "+"\t"+" Title "+"\t"+" Genre "+"\t"+" YearOfRelease ");
			System.out.println("---------------------------------------------------------------------");
			while(rs.next()) 
			{
				System.out.println(" "+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t "+rs.getString(4));
			}
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
			
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
