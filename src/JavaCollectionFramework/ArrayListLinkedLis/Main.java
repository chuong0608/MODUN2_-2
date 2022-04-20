package JavaCollectionFramework.ArrayListLinkedLis;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager =new ProductManager();
        Product product =new Product(1,"kẹo",100,10);
        Product product1 =new Product(2,"Ke",200,15);
        Product product2 =new Product(4,"Đá",500,5);
        Product product3 =new Product(3,"Cần",50,7);
        Product product4 =new Product(7,"Sixa",300,8);
        productManager.them(product);
        productManager.them(product1);
        productManager.them(product2);
        productManager.them(product3);
        productManager.them(product4);
        productManager.hienThi();
        System.out.println(productManager.timKiemTheoID(1));
        productManager.timKiemTheoTen("Đá");
        productManager.xoa(3);
        productManager.hienThi();
        productManager.xapXep();
        productManager.hienThi();
    }
}
