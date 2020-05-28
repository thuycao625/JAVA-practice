public abstract class Person {
    private String hoTen;
    private Float phucap;
    private Float hesoluong;
    private Float luong;

    public Person(String name, Float phucap, Float hesoluong) {
        this.hoTen = name;
        this.phucap = phucap;
        this.hesoluong =hesoluong;
    }
    public Person(){}

    public void setPhucap(Float phucap) {
        this.phucap = phucap;
    }

    public void setHesoluong(Float hesoluong) {
        this.hesoluong = hesoluong;
    }

    public Float getPhucap() {
        return phucap;
    }

    public Float getHesoluong() {
        return hesoluong;
    }

    public Float getLuong() {
        return luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }

    public abstract float tinhluong();

}
