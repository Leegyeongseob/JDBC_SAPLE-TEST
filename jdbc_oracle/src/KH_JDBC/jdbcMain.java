package KH_JDBC;

import KH_JDBC.DAO.EmpDao;
import KH_JDBC.VO.EmpVo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class jdbcMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpDao dao = new EmpDao();

        while(true){
            System.out.println("=====================================================================");
            System.out.print("메뉴 선택 :[0]EXITS [1]SELECT [2]INSERT [3]UPDATE [4]DELETE [5]QUIT : ");
            int sel = sc.nextInt();
            switch(sel){
                case 1:
                    List<EmpVo> list  = dao.empSelect();
                    dao.empSelectprn(list);
                    break;
                case 2:
                    dao.EmpInsert();
                    break;
                case 3:
                    dao.EmpUpdate();
                    break;
                case 4:
                    dao.EmpDelete();
                    break;
                default:
                    System.out.println("메뉴를 잘못 선택하셨습니다.");
            }
            if (sel == 0){
                System.out.println("0을 선택하셔서 종료합니다.");
                break;
            }
        }
    }
    public EmpVo InputFunc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("사원 정보를 입력하세요: ");
        System.out.print("사원번호(4자리) : ");
        int empNO = sc.nextInt();
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("직책 : ");
        String job = sc.next();
        System.out.print("상관 사원 번호 : ");
        int mgr = sc.nextInt();
        System.out.print("입사일 : ");
        String date = sc.next();
        System.out.print("급여 : " );
        BigDecimal sal = sc.nextBigDecimal();
        System.out.print("성과급 : " );
        BigDecimal comm = sc.nextBigDecimal();
        System.out.print("부서번호 : ");
        int deptNO = sc.nextInt();
        EmpVo empVo = new EmpVo(empNO,name,job,mgr,date,sal,comm,deptNO);
        return empVo;
    }
    public List UpdateFunc() {
        List list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.print("변경할 사원의 이름을 입력 하세요 : ");
        String name = sc.next();
        list.add(name);
        System.out.print("직책 : ");
        String job = sc.next();
        list.add(job);
        System.out.print("급여 : ");
        BigDecimal sal = sc.nextBigDecimal();
        list.add(sal);
        System.out.print("성과급 : ");
        BigDecimal comm = sc.nextBigDecimal();
        list.add(comm);
        return list;
    }
}
