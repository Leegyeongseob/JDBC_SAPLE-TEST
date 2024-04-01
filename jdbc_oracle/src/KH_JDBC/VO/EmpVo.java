package KH_JDBC.VO;

import java.math.BigDecimal;
import java.sql.Date;

//VO는 데이터베이스에서 가져온 레코드를 자바 객체로 매핑하는 데 사용
public class EmpVo {
    private int empNo; //사원 번호
    private String name; //사원 이름
    private String job; //직책
    private int mgr; //상관 사원 번호
    private String hiredate; // 입사연도
    private BigDecimal sal; // float 급여 정보이고 소수점 이하가 존재
    private BigDecimal comm; // 성과급
    private int deptNo;

    public EmpVo(int empNo, String name, String job, int mgr,
                 String hiredate, BigDecimal sal, BigDecimal comm, int deptNo) {
        this.empNo = empNo;
        this.name = name;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptNo = deptNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getMgr() {
        return mgr;
    }

    public String getHiredate() {
        return hiredate;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }
}
