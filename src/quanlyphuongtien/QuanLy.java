package quanlyphuongtien;

public interface QuanLy<T>{
    public void Them(T t);
    public void Sua(String name,T t);
    public void Xoa(String name);
    int TimKiem(String name);
    public void InAll();
    public void SapXep();
}
