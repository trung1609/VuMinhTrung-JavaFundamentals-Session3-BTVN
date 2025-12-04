package Session3;

import java.util.Scanner;

public class luyentap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float score;
        int n = 1;
        int count = 0;
        float sum = 0;
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;
        do {
            System.out.println("************** MENU NHAP DIEM ***************");
            System.out.println("1. Nhap diem hoc vien");
            System.out.println("2. Hien thi thong ke");
            System.out.println("3. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhap diem hoc vien");
                    while (true) {
                        System.out.printf("Nhap diem cho hoc vien thu %d: ", n);
                        score = Float.parseFloat(sc.nextLine());
                        if (score == -1) {
                            break;
                        }
                        if (score < 0 || score > 10) {
                            System.err.println("Vui long nhap diem trong khoang (0,10).");
                            continue;
                        }
                        String rank;
                        if (score < 5) rank = "Yeu";
                        else if (score < 7) rank = "Trung Binh";
                        else if (score < 8) rank = "Kha";
                        else if (score < 9) rank = "Gioi";
                        else rank = "Xuat sac";

                        System.out.printf("Hoc luc: %s\n" , rank);

                        count++;
                        sum += score;
                        if (score > max) max = score;
                        if (score < min) min = score;

                        n++;
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("Chua co du lieu diem");
                    } else {
                        System.out.println("--- KET QUA ---");
                        System.out.println("So hoc vien da nhap:" + count);
                        System.out.println("Diem trung binh:" + (sum / count));
                        System.out.println("Diem cao nhat:" + max);
                        System.out.println("Diem thap nhat:" + min);
                    }
                    break;
                case 3:
                    System.out.println("Ket thuc chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap lua chon tu 1-3");
            }
        }
        while (true);
    }
}

