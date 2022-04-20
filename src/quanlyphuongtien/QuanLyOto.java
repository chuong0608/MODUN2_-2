package quanlyphuongtien;

import java.util.Arrays;

public class QuanLyOto extends Oto implements QuanLy<Oto> {
    private Oto [] otos= new Oto[4];
    private int size=0;

    @Override
    public void Them(Oto oto) {
        otos[size]=oto;
        size++;

    }

    @Override
    public void Sua(String name, Oto oto) {
        otos[TimKiem(name)]=oto;
    }

    @Override
    public void Xoa(String name) {
        if(otos[TimKiem(name)] != null){
            size--;
        }

    }

    @Override
    public int TimKiem(String name) {
        for (int i = 0; i <size ; i++) {
            if(name.equals( otos[i].getTen())){
                return i;
            }
        }
        return 0;
    }

    @Override
    public void InAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(otos[i]);
        }
        System.out.println("\n --------------");

    }
    @Override
    public void SapXep() {
        Arrays.sort(otos);
    }

    public static void main(String[] args) {
        QuanLyOto qloto=new QuanLyOto();
        Oto oto1=new Oto("Toyoa","Xanh","G3849",100d,4);
        Oto oto2=new Oto("Toyoa","Xanh","G3840",100d,4);
        Oto oto3=new Oto("Toyoa","Xanh","G384545",100d,4);
        Oto oto4=new Oto("Toyoa","Xanh","G334",100d,4);
        qloto.Them(oto1);
        qloto.Them(oto2);
        qloto.Them(oto3);
        qloto.Them(oto4);
        qloto.InAll();
        Oto oto5=new Oto("Toyoa","Xđâsh","G3849",100d,4);
        qloto.Sua("G334",oto3);
        qloto.InAll();
        qloto.SapXep();
        qloto.InAll();
        qloto.Xoa("G3840");
        qloto.InAll();
    }
}
