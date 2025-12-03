package Lab2_11;

import java.util.Scanner;

public class Lab2_11 {

    public static void main(String[] rgs) {

        Scanner md = new Scanner(System.in);

        // รับข้อมูลชื่อรุ่น
        String name = md.nextLine();

        // รับข้อมูลปีที่ผลิต
        int year = md.nextInt();

        // รับข้อมูลปีที่อัปเดต
        int newYear = md.nextInt();

        // สร้างออบเจ็กต์ Car
        Car st = new Car(name, year);

        // อัปเดตปีที่ผลิตใหม่
        st.setYear(newYear);

        System.out.println("Model: " + st.getModel());
        System.out.println("Year: " + st.getYear());

        md.close();
    }
}

class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // เมธอดสำหรับแก้ไขปีที่ผลิต
    public void setYear(int newYear) {
        year = newYear;
    }
}
