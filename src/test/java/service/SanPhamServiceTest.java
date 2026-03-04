package service;

import entity.SanPham;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.rmi.UnexpectedException;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    private SanPhamService service;
    @BeforeEach
    void setup(){
        service = new SanPhamService();
    }

    @Test
    void findbyId() {
        SanPham sp1 = new SanPham(1,"CON CA",14000.0,15,"QUA OK");
        service.addSinhVien(sp1);
        //tìm kiếm
        SanPham timkiem = service.findbyId(1);
        assertEquals(1,timkiem.getIdSP());
    }

    @Test
    void addSinhVien() {
        SanPham sp1 = new SanPham(1,"CON CA",14000.0,15,"QUA OK");
        service.addSinhVien(sp1);
        assertEquals(1,service.getAll().size());
    }

    @Test
    void deleteSp() {
        SanPham sp1 = new SanPham(1,"CON CA",14000.0,15,"QUA OK");
        service.addSinhVien(sp1);
        // xóa
        service.deleteSp(1);
        assertEquals(0,service.getAll().size());
    }

    @Test
    void updatesanpham() {
        SanPham sp1 = new SanPham(1,"CON CA",14000.0,15,"QUA OK");
        service.addSinhVien(sp1);

        SanPham sp2 = new SanPham(1,"CONG NGHE",19000.0,1,"QUA O22K");
        service.updatesanpham(sp2,1);
        SanPham sp = service.findbyId(1);
        assertAll(
                () -> assertEquals("CONG NGHE",sp.getTen()),
                () -> assertEquals(19000.0, sp.getDonGia()),
                () -> assertEquals(1, sp.getSoLuong()),
                () -> assertEquals("QUA O22K", sp.getMoTa())
        );
    }

    @Test
    void checkvalidate(){
        SanPham sp1 = new SanPham();
        String message = service.addSinhVien(sp1);
        assertEquals("không được để trống", message);
    }

    @Test
    void testdangky() {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
            driver.findElement(By.id("firstname")).sendKeys("nam");
            driver.findElement(By.id("lastname")).sendKeys("nam cong");

            driver.findElement(By.id("username")).sendKeys("nguyencongnam");
            driver.findElement(By.id("password")).sendKeys("123456");
            driver.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();

            assertTrue(
                    wait.until(ExpectedConditions.urlContains("#"))
            );
        } finally {
          driver.quit();
        }
    }

    @Test
    void testdangnhap(){

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        try {
            driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
            driver.findElement(By.id("email")).sendKeys("nguyencongnam@gmail.com");
            driver.findElement(By.id("password")).sendKeys("congnam");
            driver.findElement(By.xpath("//input[@type='submit' and @value = 'Login']")).click();

            assertTrue(
                    wait.until(ExpectedConditions.urlContains("#"))
            );
        } finally {
            driver.quit();
        }
    }
}