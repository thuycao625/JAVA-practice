public class Nhanvien extends Person{
    private String phongban;
    private Float songaycong;
    private String chucvu;

    @Override
    public float tinhluong() {
        return this.getHesoluong() * 730 + this.getPhucap() + this.getSongaycong() * 30;
//        Hệ số lương x 730 + phụ cấp + số ngày công x 30;
    }

    @Override
    public void setPhucap(Float phucap) {
        super.setPhucap(phucap);
    }

    @Override
    public void setLuong(Float luong) {
        super.setLuong(luong);
    }

    @Override
    public void setHoTen(String hoTen) {
        super.setHoTen(hoTen);
    }

    @Override
    public void setHesoluong(Float hesoluong) {
        super.setHesoluong(hesoluong);
    }

    @Override
    public String getHoTen() {
        return super.getHoTen();
    }

    @Override
    public Float getPhucap() {
        return super.getPhucap();
    }

    @Override
    public Float getLuong() {
        return super.getLuong();
    }

    @Override
    public Float getHesoluong() {
        return super.getHesoluong();
    }

    public Float getSongaycong() {
        return songaycong;
    }

    public String getChucvu() {
        return chucvu;
    }

    public String getPhongban() {
        return phongban;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public void setSongaycong(Float songaycong) {
        this.songaycong = songaycong;
    }
}
