package shop.view;

import java.util.Scanner;

public class menuStaff {
    public void showMenu() {
        System.out.println("Xin mời chọn chức năng: ");
        System.out.println("1. Xem thông tin tất cả sản phẩm trong cửa hàng ");
        System.out.println("2. Xem thông tin tất cả đơn hàng ");
        System.out.println("3. Chỉnh sửa thông tin đơn hàng ");
        System.out.println("4. Xem và chỉnh sửa thông tin khách hàng ");
        System.out.println("0. Đăng xuất ");
    }

    //// choose Function CHƯA CÓ TRY CATCH!!!
    public void chooseFunction(Scanner scanner) {
        System.out.print("Chọn chức năng: ");
        int choice = Integer.parseInt(scanner.nextLine());
        while (choice < 0 || choice > 4) {
            System.out.print("Vui lòng chọn chức năng hợp lệ: ");
            choice = Integer.parseInt(scanner.nextLine());
        }

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 0: // Quay lại  menu đăng nhập
                break;
        }
    }
}
