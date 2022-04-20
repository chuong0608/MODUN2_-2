package quanlyhocsinh;

public interface QuanLy<T> {
    void them(T t);
    void sua(String name, T t);
    int timKiem(String name);
    void display();
    void xoa(String name);
    void xapXep();
}
