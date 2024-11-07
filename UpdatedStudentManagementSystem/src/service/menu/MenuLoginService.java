package service.menu;

import bean.Config;
import service.inter.menu.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void processLogic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("username:");
        String username = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("password:");
        String password = scanner.nextLine();

        if (!(username.equals("user") && password.equals("11111"))) {
            throw new IllegalArgumentException("incorrect user or password");
        }
        Config.setLoggedIn(true);
    }
}
