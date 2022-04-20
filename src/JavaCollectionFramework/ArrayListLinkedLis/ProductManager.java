package JavaCollectionFramework.ArrayListLinkedLis;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManager{
    ArrayList<Product> danhsach = new ArrayList<>();

    public ProductManager() {
        this.danhsach = danhsach;
    }

    public void them(Product product) {
        danhsach.add(product);
    }

    public void sua(int id, Product product) {
        if (timKiemTheoID(id) == -1) {
            danhsach.set(timKiemTheoID(id), product);
        }

    }

    public void xoa(int id) {
        if (timKiemTheoID(id) != -1) {
            danhsach.remove(timKiemTheoID(id));
        }

    }

    public void hienThi() {
        for (int i = 0; i < danhsach.size(); i++) {
            System.out.println(danhsach.get(i));
        }
        System.out.println("____________________");
    }

    public int timKiemTheoID(int id) {
        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public void timKiemTheoTen(String ten){
        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).getTenSP().equals(ten)){
                System.out.println(danhsach.get(i));
            }
        }
        System.out.println("---ok-------- chưa---");
    }
    public void xapXep(){
        Collections.sort(this.danhsach);
    }

}

