package Session3;

import java.util.Scanner;

public class luyentap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary;
        int n = 1;
        int count = 0;
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double totalBonus = 0;
        do {
            System.out.println("*********** MENU NHAP LUONG *************");
            System.out.println("1. Nhap luong nhan vien");
            System.out.println("2. Hien thi thong ke");
            System.out.println("3. Tinh tong so tien thuong cho nhan vien");
            System.out.println("4. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("--- Nhap luong nhan vien (nhap -1 de ket thuc) ---");
                    while (true) {
                        System.out.printf("Nhap luong cho nhan vien thu %d: ", n);
                        salary = Double.parseDouble((sc.nextLine()));
                        if (salary == -1) {
                            break;
                        }
                        if (salary < 0 || salary > 500) {
                            System.out.println("Vui long nhap luong trong khoang (0-500).");
                            continue;
                        }
                        String type;
                        if (salary < 5) type = "Thu nhap thap";
                        else if (salary < 15) type = "Thu nhap trung binh";
                        else if (salary < 50) type = "Thu nhap kha";
                        else type = "Thu nhap cao";

                        System.out.println("-> Phan loai: " + type);
                        n++;

                        //Hien thi thong ke
                        count++;
                        sum += salary;
                        if (salary > max) max = salary;
                        if (salary < min) min = salary;

                        //Tinh tien thuong cho nhan vien
                        double bonus;
                        if (salary < 5) bonus = salary * 0.05f;
                        else if (salary < 15) bonus = salary * 0.1f;
                        else if (salary < 50) bonus = salary * 0.15f;
                        else if (salary < 100) bonus = salary * 0.2f;
                        else bonus = salary * 0.25f;

                        totalBonus += bonus;
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("Chua co du lieu");
                    } else {
                        double avg = sum / count;
                        System.out.println("--- Thong ke ---");
                        System.out.println("So nhan vien:" + count);
                        System.out.printf("Luong trung binh: %.2f\n", avg);
                        System.out.println("Luong cao nhat:" + max);
                        System.out.println("Luong thap nhat:" + min);
                    }
                    break;
                case 3:
                    System.out.printf("Tong tien thuong cho nhan vien: %.2f\n" , totalBonus);
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap luong chon tu 1-4");
            }
        } while (true);
    }
}
