package advanced.home1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

        public static void main(String[] args) {
/* Connection �� ���������, ��������� ����� � � ��� ��������� ��
* ��������������� ��� ����, �� � ����������� �� ��
* ���� �ᒺ�� ���������, �� ������ �� ����������� � ����� ���������
* DriverManager.getConnection(String url, String user, String password)
* �������� ������ �� �������� �� � � classpath 
* ����� ������� Connection �� url ���� �� ��� ��� ����� �� �����
* ����� ��������� ��������� ������� ����������� � ������
* Connection ����������� � try-with-resources ��� ���� ��� ��������� �� ���������**/
                try(Connection conn = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/test", "root", "1987")){
/* Statement ��������� ��� ������� ������ ��� ������ ���������
* �������� ��� �������� ������� �� ��������� ������**/
                        Statement st = conn.createStatement();
/* ��� ����� �������� �������� ����� � ��
* �� ��������� ������ ������ � ��� ��������� ����� � ��**/
                        st.execute("CREATE TABLE Person(id int PRIMARY KEY AUTO_INCREMENT, name varchar(255))");
/* ��� ������� ���������**/
                        st.close();
/* PreparedStatement ����� �������� ��� ������ � ���� � ������ ���������**/
                        PreparedStatement ps = conn.prepareStatement("INSERT INTO Person(name) values (?)");
/* ��� ����� �������� ���������� �������� �������� �� ������� ������� ����� ���������**/
                        ps.setString(1, "Ivan");
/* ��� ����� ����� ��������������� ���� � ��� ����� UPDATE, INSERT �� DELETE**/
                        ps.executeUpdate();
/* ��� ������� ���������**/
                        ps.close();
/* �������� ��� �� � � ������� Person**/
                        ps = conn.prepareStatement("SELECT * FROM Person");
/* ResultSet ��������� ���� ��������� ���������� ��� ���������� ������**/
                        ResultSet rs = ps.executeQuery();
/* ��� ����� � �������� � ���������� �� � �� �����,
               � ����� ����������� �� ��������� �����**/
                        while(rs.next()){
/* ����� ���� ������� ����� �� �������� ������� ������� ����������� � 1 � ���
* �������� ������ �� �� ��������, � �� ������ �������
* System.out.println(rs.getString("name"));**/
                                System.out.println(rs.getString(2));
                        }
                }catch(SQLException e){
                }
        }
}
