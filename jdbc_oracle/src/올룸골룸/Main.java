package 올룸골룸;

import KH_JDBC.DAO.EmpDao;
import KH_JDBC.VO.EmpVo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OlumgollumDao dao = new OlumgollumDao();
        while (true) {
            System.out.println("=====================================================================");
            System.out.print("메뉴 선택 :[0]EXITS [1]SELECT [2]INSERT [3]UPDATE [4]DELETE [5]QUIT : ");
            int sel = sc.nextInt();
            switch (sel) {
                case 1:
                    List<OlumgollumVo> list = dao.OlumGolumSelect();
                    dao.OlumgollumPrn(list);
                    break;
                default:
                    System.out.println("입력이 잘못 되었습니다.");
            }
            if (sel == 0 )
            {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
