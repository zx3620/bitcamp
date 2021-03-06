package step25.ex2;

import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Exam01_insert {
    
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("JDBC 드라이버 로딩 및 등록완료!");
        
        
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");
        
        System.out.println("DBMS 연결됨");

        Statement stmt = con.createStatement();
        
        System.out.print("제목? ");
        String title = keyScan.nextLine();

        System.out.print("내용? ");
        String content = keyScan.nextLine();
        
        String sql = String.format("insert into ex_board(titl,cont,rdt) values('%s','%s',now())", title, content);
        
        int count = stmt.executeUpdate(sql);
        System.out.printf("%d개 입력 성공!", count);
        
        stmt.close();
        con.close();
        keyScan.close();
    }
    
}
