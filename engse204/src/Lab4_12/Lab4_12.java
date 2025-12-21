package Lab4_12;

import java.util.Scanner;

public class Lab4_12 {

    public static void main(String[] args) {
        Scanner lp = new Scanner(System.in);

        // รับชื่อพนักงาน เพื่อใช้แสดงผลและระบุตัวตนของแต่ละออบเจ็กต์
        String name = lp.nextLine();

        // รับชั่วโมงเริ่มต้นการทำงาน
        int startHour = lp.nextInt();

        // รับชั่วโมงใหม่
        int newHour = lp.nextInt();

        // สร้างออบเจ็กต์ Schedule 
        Schedule schedule = new Schedule(startHour);

        // สร้าง EmployeeSchedule ตัวแรก
        EmployeeSchedule emp1 = new EmployeeSchedule(name, schedule);

        // สร้าง EmployeeSchedule ตัวที่สองด้วย copy constructor
        EmployeeSchedule emp2 = new EmployeeSchedule(emp1);

        // เปลี่ยนค่าชั่วโมงใน Schedule เดิม
        schedule.setHour(newHour);

        // แสดงผลตารางเวลาของพนักงานทั้งสองคน
        emp1.displaySchedule();
        emp2.displaySchedule();

        lp.close();
    }
}

class Schedule {
    private int hour;

    // ตัวสร้างสำหรับกำหนดชั่วโมงเริ่มต้น
    public Schedule(int hour) {
        this.hour = hour;
    }

    // เมธอดสำหรับเปลี่ยนค่าชั่วโมงทำงาน
    public void setHour(int newHour) {
        hour = newHour;
    }

    // เมธอดสำหรับคืนค่าชั่วโมงปัจจุบัน
    public int getHour() {
        return hour;
    }
}

class EmployeeSchedule {
    private String name;
    private Schedule schedule;

    // ตัวสร้างแบบปกติ
    public EmployeeSchedule(String name, Schedule schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    // copy constructor
    public EmployeeSchedule(EmployeeSchedule other) {
        this.name = other.name;
        this.schedule = new Schedule(other.schedule.getHour());
    }

    // แสดงชื่อพนักงานและชั่วโมงทำงาน
    public void displaySchedule() {
        System.out.println(name + ": " + schedule.getHour() + ":00");
    }
}
