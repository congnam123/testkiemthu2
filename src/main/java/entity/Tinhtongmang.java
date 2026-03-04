package entity;

public class Tinhtongmang {
    public int tinhTong(int a[]){
        int tong = 0;
        for(int i = 0 ; i < a.length; i ++){
            tong += a[i];
        }
        return tong;
    }

}
