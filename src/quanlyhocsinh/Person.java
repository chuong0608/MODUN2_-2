package quanlyhocsinh;

public  abstract class Person {
    private int ma;
    private String ten;
    private int tuoi;

    public Person() {
    }

    public Person(int ma, String ten, int tuoi) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
