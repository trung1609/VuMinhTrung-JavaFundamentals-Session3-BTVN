package Session3;

import java.util.Scanner;

public class luyentap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten khach hang: ");
        String nameCustomer = sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        String nameProduct = sc.nextLine();
        System.out.print("Nhap gia san pham: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong mua: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.print("Khach co the thanh vien? (true/false): ");
        boolean membershipCard = Boolean.parseBoolean(sc.nextLine());

        double subtotal = price *  quantity;
        double discount = 0;
        if(membershipCard){
            discount = subtotal * 0.1;
        }else{
            discount = 0;
        }
        double vat = subtotal * 0.08;

        double total = subtotal - discount + vat;

        System.out.println("============== HOA DON ==============");
        System.out.printf("Khach hang: %s\n", nameCustomer);
        System.out.printf("San pham: %s\n", nameProduct);
        System.out.printf("So luong mua: %d\n", quantity);
        System.out.printf("Don gia: %.2f\n", price);
        System.out.printf("Thanh tien: %.2f\n", subtotal);
        System.out.printf("Giam gia thanh vien: %.2f\n", discount);
        System.out.printf("Tien VAT: %.2f\n", vat);
        System.out.printf("Tong thanh toan: %.2f\n", total);
    }
}
