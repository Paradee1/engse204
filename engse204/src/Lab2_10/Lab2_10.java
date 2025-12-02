package Lab2_10;

import java.util.Scanner;

public class Lab2_10 {

    public static void main(String[] rgs) {

        Scanner scanner = new Scanner(System.in);

        // รับจำนวนสินค้าที่จะเพิ่มลงตะกร้า
        int N = scanner.nextInt();
        scanner.nextLine();  // เคลียร์ buffer

        ShoppingCart cart = new ShoppingCart();

        // รับข้อมูลสินค้าแต่ละชิ้น
        for (int i = 0; i < N; i++) {

            // รับชื่อสินค้า
            String productName = scanner.nextLine();

            // รับราคาสินค้า
            double productPrice = scanner.nextDouble();
            scanner.nextLine(); // เคลียร์ buffer

            // สร้างออบเจ็กต์สินค้า
            Product product = new Product(productName, productPrice);

            // เพิ่มลงตะกร้า
            cart.addProduct(product);
        }

        // คำนวณราคารวม
        double totalPrice = cart.calculateTotalPrice();

        // แสดงผลรวมราคา
        System.out.println(totalPrice);

        scanner.close();
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

    // เพิ่มสินค้าแต่ละชิ้นลงใน array
    public void addProduct(Product product) {
        items[itemCount] = product;
        itemCount++;
    }

    // รวมราคาสินค้าทั้งหมด
    public double calculateTotalPrice() {

        double total = 0;

        for (int index = 0; index < itemCount; index++) {
            total += items[index].price;
        }

        return total;
    }

}
