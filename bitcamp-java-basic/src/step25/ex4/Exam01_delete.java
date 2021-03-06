package step25.ex4;

import java.util.Scanner;

public class Exam01_delete {
    
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in); 
        System.out.println("삭제할 게시물 번호? ");
        String no = keyScan.nextLine();
        
        try {
            DataSource dataSource = new DefaultDataSource();
            BoardDao boardDao = new BoardDao(dataSource);
            int count = boardDao.delete(Integer.parseInt(no));
            System.out.printf("%d개 삭제 성공!", count);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        keyScan.close();
    }
    
}
