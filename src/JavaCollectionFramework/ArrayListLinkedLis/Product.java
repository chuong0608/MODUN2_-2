package JavaCollectionFramework.ArrayListLinkedLis;

public class Product implements Comparable<Product> {
    private int id;
    private String tenSP;
    private int gia;
    private int soLuong;

    public Product(int id, String tenSP, int gia, int soLuong) {
        this.id = id;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", tenSP='" + tenSP + '\'' +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getGia()-o.getGia();
    }
}
