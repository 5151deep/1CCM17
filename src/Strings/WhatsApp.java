package Strings;

public class WhatsApp {
    private long cellNo;
    private String city;
    private int UserId;
    private String Status;
    public WhatsApp(long cellNo,String city,int UserId,String Status){
        this.cellNo=cellNo;
        this.city=city;
        this.UserId=UserId;
        this.Status=Status;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
    public long getCellNo(){
        return cellNo;
    }
    public void setCellNo(long cellNo){
        this.cellNo=cellNo;
    }
    public String getStatus(){
        return Status;
    }
    public void setStatus(String status){
        this.Status=status;
    }



}
