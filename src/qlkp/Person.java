package qlkp;

public class Person {
    private String name;
    private String job;
    private int soCMND;

    public Person(String name, String job, int soCMND) {
        this.name = name;
        this.job = job;
        this.soCMND = soCMND;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", soCMND=" + soCMND +
                '}';
    }
}
