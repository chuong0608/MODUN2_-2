package qlkp;

public class Main {
    public static void main(String[] args) {
        Town town1 = new Town();
        Family family1 = new Family("Hà Nội", 4);
        family1.add(new Person("Anh", "Bia ôm", 1248940));
        family1.add(new Person("Đạt", "Bia ôm", 12677780));
        family1.add(new Person("Đạt", "Bia ôm", 12677780));
        family1.add(new Person("Đạt", "Bia ôm", 12677780));
        town1.addFamily(family1);
        town1.display();
        family1.displayFamily();
        Family family2 = new Family("HÀ nam", 2);
        family2.add(new Person("Anh", "Bia ôm", 1248940));
        family2.add(new Person("Đạt", "Bia ôm", 12677780));
        town1.addFamily(family2);
        town1.display();
        family2.displayFamily();
        town1.deleteFamily("Hà Nam");
//       family1.delete("Anh");
//       family1.displayFamily();
//       family1.edit("Đạt",new Person("Phong","Bia ôm",1234547780));
//       family1.displayFamily();
//        Town town = new Town();
    }


}
