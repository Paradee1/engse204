package Lab4_13;

import java.util.Scanner;

public class Lab4_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าสูงสุดของจำนวนวันสมาชิก (policy)
        int maxDuration = scanner.nextInt();
        scanner.nextLine();

        // ตั้งค่านโยบายก่อนสร้าง object ใด ๆ
        Subscription.setMaxDuration(maxDuration);

        // รับชื่อแพ็กเกจ
        String planName = scanner.nextLine();

        // รับจำนวนวันเริ่มต้นของสมาชิก
        int initialDays = scanner.nextInt();

        // รับจำนวนวันที่ต้องการขยายเพิ่ม 2 ครั้ง
        int extendDays1 = scanner.nextInt();
        int extendDays2 = scanner.nextInt();

        // สร้างสมาชิกด้วยจำนวนวันเริ่มต้น
        Subscription subscription = new Subscription(planName, initialDays);

        // ขยายวันสมาชิกครั้งที่ 1
        subscription = subscription.extend(extendDays1);

        // ขยายวันสมาชิกครั้งที่ 2
        subscription = subscription.extend(extendDays2);

        // แสดงข้อมูลสมาชิกสุดท้าย
        subscription.displayInfo();

        scanner.close();
    }
}

class Subscription {

    // ชื่อแพ็กเกจสมาชิก
    private final String planName;

    // จำนวนวันของสมาชิก (immutable)
    private final int durationDays;

    // นโยบายจำนวนวันสูงสุด เริ่มต้น 365 วัน
    private static int maxDuration = 365;

    // Constructor หลัก ใช้ตรวจสอบความถูกต้องของจำนวนวัน
    public Subscription(String planName, int durationDays) {
        this.planName = planName;

        // ป้องกันค่าที่เกินนโยบาย
        if (durationDays > maxDuration) {
            this.durationDays = maxDuration;
        }
        // ป้องกันค่าติดลบ
        else if (durationDays < 0) {
            this.durationDays = 0;
        }
        // กรณีค่าถูกต้อง
        else {
            this.durationDays = durationDays;
        }
    }

    // Copy constructor เพื่อความปลอดภัยของข้อมูล
    public Subscription(Subscription other) {
        this.planName = other.planName;
        this.durationDays = other.durationDays;
    }

    // ตั้งค่านโยบายจำนวนวันสูงสุด
    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max duration set to " + maxDuration);
        } else {
            System.out.println("Invalid max policy.");
        }
    }

    // เมธอดขยายวันสมาชิกแบบ immutable
    public Subscription extend(int days) {

        // ตรวจสอบจำนวนวันที่ขยายต้องมากกว่า 0
        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }

        // คำนวณจำนวนวันใหม่
        int newDuration = this.durationDays + days;

        // ตรวจสอบไม่ให้เกินนโยบาย
        if (newDuration > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }

        // กรณีขยายสำเร็จ
        System.out.println("Extension successful.");
        return new Subscription(planName, newDuration);
    }

    // แสดงข้อมูลสมาชิก
    public void displayInfo() {
        System.out.println("Plan: " + planName + ", Days: " + durationDays);
    }
}
