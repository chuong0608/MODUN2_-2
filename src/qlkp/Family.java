package qlkp;

import java.util.ArrayList;

public class Family {
    ArrayList<Person> people = new ArrayList<>();
    private String address;
    private int soThanhVien;

    public Family(String name, String job, int soCMND, String address, int soThanhVien) {
        people.add(new Person(name, job, soCMND));
        this.address = address;
        this.soThanhVien = soThanhVien;
    }

    public Family() {
        this.people = new ArrayList<>();
    }

    public Family(String address, int soThanhVien) {
        this.address = address;
        this.soThanhVien = soThanhVien;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public void add(Person person) {
        people.add(person);
    }

    public void delete(String name) {
        int indexOfPerson = find(name);
        if (indexOfPerson == -1) {
            System.out.println("Không có !");
        } else {
            people.remove(indexOfPerson);
        }
    }

    public void edit(String name, Person person) {
        int indexOfPerson = find(name);
        if (indexOfPerson == -1) {
            System.out.println("Không có !");
        } else {
            people.set(indexOfPerson, person);
        }

    }

    public int find(String name) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void displayFamily() {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
        System.out.println("-------------");
    }

    @Override
    public String toString() {
        return "Family{" +
                " address='" + address + '\'' +
                ", soThanhVien = " + soThanhVien +
                '}';
    }
}

