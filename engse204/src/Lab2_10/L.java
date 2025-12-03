package Lab2_10;

import java.util.Scanner;

public class L {

    public static void main(String[] rgs) {

        Scanner as = new Scanner(System.in);

        // รับจำนวนสินค้าที่ต้องการเพิ่มในตะกร้า
        int N = as.nextInt();
        as.nextLine();

        // สร้าง ShoppingCart
        ShoppingCart mi = new ShoppingCart();

        for (int j = 0; j < N; j++) {

            // รับชื่อสินค้า
            String pdname = as.nextLine();

            // รับราคาสินค้า
            double pdprice = as.nextDouble();
            as.nextLine();

            // สร้างออบเจ็กต์สินค้า
            Product dp = new Product(pdname, pdprice);

            // เพิ่มสินค้าเข้าตะกร้า
            mi.addProduct(dp);
        }

        // คำนวณราคารวม
        double total = mi.calculateTotalPrice();

        // แสดงผลราคารวม
        System.out.println(total);

        as.close();
    }
}

class Product {

    private String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart {

    private Product[] items = new Product[10];
    private int itemCount = 0;

    // เพิ่มสินค้าเข้าอาร์เรย์
    public void addProduct(Product p) {
        items[itemCount] = p;
        itemCount++;
    }

    // คำนวณราคารวมสินค้าในตะกร้า
    public double calculateTotalPrice() {
        double sum = 0;

        for (int i = 0; i < itemCount; i++) {
            sum += items[i].price;
        }

        return sum;
    }
}
