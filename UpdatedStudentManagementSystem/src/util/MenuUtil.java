package util;

import java.util.Scanner;

public class MenuUtil {
    public static void showMenu() {
        System.out.println("Select Menu");
        Menu.showAllMenu();
        Scanner scan = new Scanner(System.in);
        int selectedMenuNumber = scan.nextInt();
        Menu selectedMenu= Menu.find(selectedMenuNumber);
        selectedMenu.process();
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }
}
