package 올룸골룸;

import java.math.BigDecimal;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OlumgollumDao {
    Connection conn = null;
    Statement stmt =null; // create Statement 방식
    PreparedStatement pSmt = null; // Prepared Statement 방식
    ResultSet rs = null; // database 부터 결과를 받는 변수

    public List<OlumgollumVo> OlumGolumSelect() {
        List<OlumgollumVo> list = new ArrayList<>();
        try {
            conn = COMMON.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM ROOMINFO";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int house_num = rs.getInt("house_num");
                String user_id = rs.getString("user_id");
                String photo_url = rs.getString("photo_url");
                String trade_method = rs.getString("trade_method");
                int price = rs.getInt("price");
                String area = rs.getString("area");
                Date accept_date = rs.getDate("accept_date");
                int household = rs.getInt("household");
                String address = rs.getString("address");
                String floor1 = rs.getString("floor1");
                String remark = rs.getString("remark");
                int phonenumber = rs.getInt("phonenumber");
                Date regit_date = rs.getDate("regit_date");
                String roomtitle = rs.getString("roomtitle");
                int option_id = rs.getInt("option_id");
                list.add(new OlumgollumVo(house_num, user_id, photo_url,trade_method, price, area, accept_date, household,address,floor1,remark,phonenumber,regit_date,roomtitle,option_id));


            }
            COMMON.close(rs);
            COMMON.close(stmt);
            COMMON.close(conn);

        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public void OlumgollumPrn(List<OlumgollumVo> list){
        for (OlumgollumVo e : list)
        {
            System.out.print(e.getHouse_num()+ " ");
            System.out.print(e.getUser_id() + " ");
            System.out.print(e.getPhoto_url() + " ");
            System.out.print(e.getTrade_method() + " ");
            System.out.print(e.getPrice()+ " ");
            System.out.print(e.getArea()+ " ");
            System.out.print(e.getAccept_date() + " ");
            System.out.print(e.getHousehold() + " ");
            System.out.print(e.getPhonenumber() + " ");
            System.out.print(e.getRoomtitle() + " ");
            System.out.println(e.getOption_id());
        }

    }
}
