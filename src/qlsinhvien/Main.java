package qlsinhvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSInhVien danhSachSInhVien= new DanhSachSInhVien();
        int luaChon=0;
        do {
            System.out.println("----Menu----");
            System.out.println("Vui lòng chọn chức năng : ");
            System.out.println("1. Thêm sinh viên vào danh sách :\n" +
                    "2. In danh sách sinh viên ra màn hinh: \n" +
                    "3. Kiểm tra danh sách có rỗng hay không : \n" +
                    "4. Lấy ra số lượng sinh viên trong danh sach : \n" +
                    "5. Làm rỗng danh sách sinh viên : \n" +
                    "6. Kiểm tra sinh viên có trong danh sách không : \n" +
                    "7. Xóa một sinh viên ra khỏi danh sach  : \n" +
                    "8. Tìm tất cả sinh viên dựa trên tên được nhập từ bàn phím : \n" +
                    "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp :  \n" +
                    "0. Thoát khỏi chương trình.\n");
            luaChon= scanner.nextInt();
            scanner.nextLine();

            if (luaChon==1){
                System.out.println("Nhập mã sinh viên : ");
                String maSinhVien=scanner.nextLine();
                System.out.println("Nhập họ và tên : ");
                String hoTen=scanner.nextLine();
                System.out.println("Nhập năm sinh : ");
                int namSinh=scanner.nextInt();
                System.out.println("Nhập điểm trung bình : ");
                double diemTrungBinh=scanner.nextDouble();
                SinhVien sinhVien=new SinhVien(maSinhVien,hoTen,namSinh,diemTrungBinh);
                danhSachSInhVien.themSinhVien(sinhVien);
            }else if (luaChon==2){
                System.out.println("In danh sách sinh viên");
                danhSachSInhVien.inDanhSachSinhVien();

            }else if (luaChon==3){
                System.out.println("Kiểm tra danh sách rỗng : ");
                System.out.println("Danh sách rỗng : " + danhSachSInhVien.kiemTraDanhSachRong());
            }
            else if (luaChon==4){
                System.out.println("Số lượng sinh viên có trong danh sách : " + danhSachSInhVien.laySoLuongSinhVien());

            }
            else if (luaChon==5){
                danhSachSInhVien.lamRongDanhSach();
            }
            else if (luaChon==6){
                System.out.println(danhSachSInhVien.kiemTraTonTai(new SinhVien()));

            }
            else if (luaChon==7){
                danhSachSInhVien.xoaSinhVien("Anh");
            }
            else if (luaChon==8){
                System.out.println(danhSachSInhVien.timKiemSinhVien("Hoa"));

            }
            else if (luaChon==9){
               danhSachSInhVien.xapXepSVGianDanDiem();
               danhSachSInhVien.inDanhSachSinhVien();

            }

        }while (luaChon!=0);

    }
}
