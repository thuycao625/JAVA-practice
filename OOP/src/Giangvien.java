public class Giangvien extends Person{
    private String khoa;
    private String trinhdo;
    private Float sotiet;



    @Override
    public float tinhluong() {
        return this.getHesoluong() * 730 + this.getPhucap() + this.getSotiet() * 45;
        //        Hệ số lương x 730 + phụ cấp + số tiết dạy x 45
    }
    @Override
    public Float getHesoluong() {
        return super.getHesoluong();
    }

    @Override
    public Float getLuong() {
        return super.getLuong();
    }

    @Override
    public Float getPhucap() {
        return super.getPhucap();
    }

    @Override
    public String getHoTen() {
        return super.getHoTen();
    }

    @Override
    public void setHesoluong(Float hesoluong) {
        super.setHesoluong(hesoluong);
    }

    @Override
    public void setHoTen(String hoTen) {
        super.setHoTen(hoTen);
    }

    @Override
    public void setLuong(Float luong) {
        super.setLuong(luong);
    }

    @Override
    public void setPhucap(Float phucap) {
        super.setPhucap(phucap);
    }

    public String getKhoa() {
        return khoa;
    }

    public Float getSotiet() {
        return sotiet;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void setSotiet(Float sotiet) {
        this.sotiet = sotiet;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }
    public Giangvien(){

    }
     public Giangvien(String name, String khoa, float phucap, float sotiet, float hesoluong) {

        super(name,phucap,hesoluong);
        this.khoa = khoa;
        this.sotiet = sotiet;
    }
}
