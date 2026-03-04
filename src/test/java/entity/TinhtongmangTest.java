package entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhtongmangTest {
    public Tinhtongmang tinhtongmang;
    @BeforeEach
    void setup(){
        tinhtongmang = new Tinhtongmang();
    }


    // các phần tử âm
    @Test
    void tinhTong() {
        int a[] = { -1,-4,-20,-22,-9};
        int kqthucte = tinhtongmang.tinhTong(a);
        int kqkyvong = -56;
        assertEquals(kqkyvong,kqthucte);
    }

    @Test
    void tinhTong1() {
        int a[] = {1 , 10, 16,22,25};
        int kqthucte = tinhtongmang.tinhTong(a);
        int kqkyvong = 74;
        assertEquals(kqkyvong,kqthucte);
    }

    // rỗng
    @Test
    void tinhTong2() {
        int a[] = {};
        int kqthucte = tinhtongmang.tinhTong(a);
        int kqkyvong = 0;
        assertEquals(kqkyvong,kqthucte);
    }

    @Test
    void tinhTong3() {
        int a[] = {-5, 10, -3, 8};
        int kqthucte = tinhtongmang.tinhTong(a);
        int kqkyvong = 10; // -5 + 10 - 3 + 8 = 10
        assertEquals(kqkyvong, kqthucte);
    }
}