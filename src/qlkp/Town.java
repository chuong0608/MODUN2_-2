package qlkp;

import java.util.ArrayList;

public class Town {
    ArrayList<Family> families = new ArrayList<>();

    public Town() {
    }

    public void addFamily(Family family) {
        families.add(family);
    }

    public void editFamily(String address, Family family) {
        for (int i = 0; i < families.size(); i++) {
            if (families.get(i).getAddress().equals(address)) {
                families.set(i, family);
            }
        }
        System.out.println("Không có nhà cần sửa : ");
    }

    public void deleteFamily(String address) {

    }

    public void display() {
        for (int i = 0; i < families.size(); i++) {
            System.out.println(families.get(i));
        }
    }

}
