import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Books {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter BookId :");
		int id = sc.nextInt();
		System.out.println("Enter BookName :");
		String bookname = sc.next();
		System.out.println("Enter AuthorName :");
		String authorname = sc.next();
		System.out.println("Enter YearOfPublised :");
		int yearofpublised = sc.nextInt();
		System.out.println("Enter BookType :");
		String booktype = sc.next();
		System.out.println("Enter Price :");
		int price = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/manali", "root","1234567");
			System.out.println("Database Connected Successfully...");
			Statement s=con.createStatement();
			s.execute("create table Books(BookId int primary key auto_increment,BookName varchar(20)not null,AuthorName varchar(30) not null,YearOfPublised int,BookType varchar(30)not null,Price int)");
			System.out.println("Table created Successfully...");
			PreparedStatement ps = con.prepareStatement("insert into Book(BookId,BookName,AuthorName,YearOfPublised,BookType,Price) values(?,?,?,?,?,?)");
			ps.setInt(1,id);
			ps.setString(2,bookname);
			ps.setString(3,authorname);
			ps.setInt(4,yearofpublised);
			ps.setString(5,booktype);
			ps.setInt(6,price);
			ps.executeUpdate();
			ResultSet rs = s.executeQuery("Select id,bookname,authorname,yearofpublised,booktype,price from Books");
			System.out.println("BookId"+"\t\t"+"BookName"+"\t\t"+"AuthorName"+"\t\t"+"YearOfPublised"+"\t\t"+"BookType"+"\t\t"+"Price");
			while(rs.next()) {
				int id1 = rs.getInt(1);
				String bookname1 = rs.getString(2);
				String authorname1 = rs.getString(3);
				int yearofpublised1 = rs.getInt(4);
				String booktype1 = rs.getString(5);
				int price1 = rs.getInt(6);
				System.out.println("id1"+"\t\t"+"bookname1"+"\t\t"+"authorname1"+"\t\t"+"yearofpublised1"+"\t\t"+"booktype1"+"\t\t"+"price1");

			}
			rs.close();
			s.close();
			con.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	  
}

}

