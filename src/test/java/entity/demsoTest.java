package entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class demsoTest {

    public demso demSo;
    @BeforeEach
    void setup(){
        demSo = new demso();
    }

    // số chẵn
    @Test
    void demso() {
        int a [] = { 1,3,5,7,9};
        assertEquals(0,demSo.demso(a));
    }

    // số lẻ
    @Test
    void demso1() {
        int a[] = {2,4,6,8,10};
        assertEquals(5,demSo.demso(a));
    }

    // hỗn hợp
    @Test
    void demso2() {
        int a[] = {1,2,3,4,5,6,7,8,9};
        assertEquals(4,demSo.demso(a));
    }

    // rỗng
    @Test
    void demso3() {
        int a[] = {};
        assertEquals(0,demSo.demso(a));
    }
}