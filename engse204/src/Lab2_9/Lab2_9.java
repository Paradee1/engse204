package Lab2_9;

import java.util.Scanner;

public class Lab2_9 {

    public static void main(String[] rgs) {
        Scanner st = new Scanner(System.in);

        // รับข้อมูลโปรไฟล์ของนักเรียน
        String name = st.nextLine();
        String road = st.nextLine();
        String city = st.nextLine();
        String postcode = st.nextLine();

        // สร้างออบเจ็กต์ Address เพื่อเก็บที่อยู่ของนักเรียน
        Address sa = new Address(road, city, postcode);

        // ส่ง Address เข้าไปเก็บใน Student
        Student sp = new Student(name, sa);

        // แสดงโปรไฟล์นักเรียน
        sp.displayProfile();

        st.close();
    }
}

class Address {

    private String street;
    private String city;
    private String zipCode;

    // Constructor สำหรับกำหนดค่าเริ่มต้นของที่อยู่
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    // รวมที่อยู่ทั้งหมดเป็นข้อความเดียว
    public String getFullAddress() {
        return street + ", " + city + ", " + zipCode;
    }
}

class Student {

    private String name;
    private Address address;

    // Constructor รับชื่อและออบเจ็กต์ Address
    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // แสดงโปรไฟล์นักเรียน
    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getFullAddress());
    }
}
