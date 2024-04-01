package 올룸골룸;

import java.util.Date;

public class OlumgollumVo {
    private int house_num;
    private String user_id;
    private String photo_url;
    private String trade_method;
    private int price;
    private String area;
    private Date accept_date;
    private int household;
    private String address;
    private String floor1;
    private String remark;
    private int phonenumber;
    private Date regit_date;
    private String roomtitle;
    private int option_id;

    public OlumgollumVo(int house_num, String user_id, String photo_url, String trade_method, int price, String area, Date accept_date, int household, String address, String floor1, String remark, int phonenumber, Date regit_date, String roomtitle, int option_id) {
        this.house_num = house_num;
        this.user_id = user_id;
        this.photo_url = photo_url;
        this.trade_method = trade_method;
        this.price = price;
        this.area = area;
        this.accept_date = accept_date;
        this.household = household;
        this.address = address;
        this.floor1 = floor1;
        this.remark = remark;
        this.phonenumber = phonenumber;
        this.regit_date = regit_date;
        this.roomtitle = roomtitle;
        this.option_id = option_id;
    }

    public int getHouse_num() {
        return house_num;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public String getTrade_method() {
        return trade_method;
    }

    public int getPrice() {
        return price;
    }

    public String getArea() {
        return area;
    }

    public Date getAccept_date() {
        return accept_date;
    }

    public int getHousehold() {
        return household;
    }

    public String getAddress() {
        return address;
    }

    public String getFloor1() {
        return floor1;
    }

    public String getRemark() {
        return remark;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public Date getRegit_date() {
        return regit_date;
    }

    public String getRoomtitle() {
        return roomtitle;
    }

    public int getOption_id() {
        return option_id;
    }

    public void setHouse_num(int house_num) {
        this.house_num = house_num;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public void setTrade_method(String trade_method) {
        this.trade_method = trade_method;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setAccept_date(Date accept_date) {
        this.accept_date = accept_date;
    }

    public void setHousehold(int household) {
        this.household = household;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloor1(String floor1) {
        this.floor1 = floor1;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setRegit_date(Date regit_date) {
        this.regit_date = regit_date;
    }

    public void setRoomtitle(String roomtitle) {
        this.roomtitle = roomtitle;
    }

    public void setOption_id(int option_id) {
        this.option_id = option_id;
    }
}
