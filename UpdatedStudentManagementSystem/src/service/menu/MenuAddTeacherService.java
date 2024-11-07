package service.menu;

import bean.Config;
import bean.Teacher;
import service.inter.menu.MenuAddTeacherServiceInter;
import service.interr.SaveableProcess;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter, SaveableProcess {

    @Override
    public void processLogic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("enter surname");
        String surname = scanner.nextLine();

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);

        Config.getInstance().appendTeacher(t);
        System.out.println("Teacher added");
    }
}
