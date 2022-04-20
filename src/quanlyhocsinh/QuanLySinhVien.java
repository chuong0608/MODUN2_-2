package quanlyhocsinh;

import java.util.ArrayList;
import java.util.Collections;

public class QuanLySinhVien extends SinhVien implements QuanLy<SinhVien>  {
    ArrayList<SinhVien> sinhViens;

    public QuanLySinhVien() {
        this.sinhViens = new ArrayList<>();
    }

    @Override
    public void them(SinhVien sinhVien) {
        sinhViens.add(sinhVien);
    }

    @Override
    public void sua(String name, SinhVien sinhVien) {
        int indexOfSudent= timKiem(name);
        if(indexOfSudent == -1){
            System.out.println("không có");
        }else {
            sinhViens.set(indexOfSudent,sinhVien);
        }

    }

    @Override
    public void xoa(String name) {
        int indexOfSudent= timKiem(name);
        if(indexOfSudent == -1){
            System.out.println("không có");
        }else {
            sinhViens.remove(indexOfSudent);
        }

    }

    @Override
    public void xapXep() {
        Collections.sort(this.sinhViens);
    }

    @Override
    public int timKiem(String name) {
        for (int i=0;i<sinhViens.size();i++){
            if(sinhViens.get(i).getTen().equals(name)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        for (int i = 0; i < sinhViens.size(); i++) {
            System.out.println(sinhViens.get(i));
        }
        System.out.println("----------------");
    }
}
