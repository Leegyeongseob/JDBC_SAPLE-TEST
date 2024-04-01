package KH_JDBC.DAO;
import KH_JDBC.COMMON.Common;
import KH_JDBC.VO.EmpVo;
import KH_JDBC.jdbcMain;
import oracle.jdbc.proxy._Proxy_;

import java.math.BigDecimal;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpDao extends jdbcMain {
    Connection conn = null;
    Statement stmt =null; // create Statement 방식
    PreparedStatement pSmt = null; // Prepared Statement 방식
    ResultSet rs = null; // database 부터 결과를 받는 변수
    Scanner sc = new Scanner(System.in);
    // SELECT문(조회)
    public List<EmpVo> empSelect() {
        List<EmpVo> list = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM EMP";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int empNo = rs.getInt("EMPNO");
                String name = rs.getString("ENAME");
                String job = rs.getString("JOB");
                int mgr = rs.getInt("MGR");
                Date date = rs.getDate("HIREDATE");
                BigDecimal sal = rs.getBigDecimal("SAL");
                BigDecimal comm = rs.getBigDecimal("COMM");
                int deptNO = rs.getInt("DEPTNO");
                String Stringdate = format.format(date);
                list.add(new EmpVo(empNo, name, job, mgr, Stringdate, sal, comm, deptNO));


            }
            Common.close(rs);
            Common.close(stmt);
            Common.close(conn);

        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public void EmpInsert(){
        EmpVo empVo = InputFunc();

        String query = "INSERT INTO EMP(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) " +
                "VALUES(?,?,?,?,?,?,?,?)";
        try{
            conn = Common.getConnection();
            pSmt = conn.prepareStatement(query);
            pSmt.setInt(1,empVo.getEmpNo());
            pSmt.setString(2,empVo.getName());
            pSmt.setString(3,empVo.getJob());
            pSmt.setInt(4,empVo.getMgr());
            pSmt.setString(5,empVo.getHiredate());
            pSmt.setBigDecimal(6,empVo.getSal());
            pSmt.setBigDecimal(7,empVo.getComm());
            pSmt.setInt(8,empVo.getDeptNo());
            int rst = pSmt.executeUpdate();
            System.out.print("rst :" + rst);

        }catch(Exception e){
            e.printStackTrace();
        }
        Common.close(pSmt);
        Common.close(conn);
    }
    public void EmpUpdate(){
        List list = UpdateFunc();
        String sql = "UPDATE EMP SET JOB = ?, SAL = ?, COMM = ? WHERE ENAME = ?";
        System.out.println(list);
        try{
            conn = Common.getConnection();
            pSmt = conn.prepareStatement(sql);
            pSmt.setString(1,list.get(1).toString());
            pSmt.setBigDecimal(2, (BigDecimal) (list.get(2)));
            pSmt.setBigDecimal(3,(BigDecimal) (list.get(3)));
            pSmt.setString(4,list.get(0).toString());
            pSmt.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
        Common.close(pSmt);
        Common.close(conn);
    }
    public void EmpDelete(){
        System.out.print("삭제할 이름을 입력 하세요 :");
        String name = sc.next();
        String sql = "DELETE FROM EMP WHERE ENAME = ?";

        try {
            conn = Common.getConnection();
            pSmt = conn.prepareStatement(sql);
            pSmt.setString(1, name);
            pSmt.executeUpdate();
        } catch (Exception e){
            e.printStackTrace();
        }
        Common.close(pSmt);
        Common.close(conn);
    }
    public void empSelectprn(List<EmpVo> list){
        for (EmpVo e : list){
            System.out.print(e.getEmpNo() + " ");
            System.out.print(e.getName() + " ");
            System.out.print(e.getJob() + " ");
            System.out.print(e.getMgr() + " ");
            System.out.print(e.getHiredate()+ " ");
            System.out.print(e.getSal() + " ");
            System.out.print(e.getComm() + " ");
            System.out.println(e.getDeptNo());
        }
    }

}
