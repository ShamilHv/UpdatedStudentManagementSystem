package service.menu;

import bean.Config;
import bean.Student;
import service.inter.menu.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void processLogic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter surname");
        String surname = scanner.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);

        Config.getInstance().appendStudent(s);
        System.out.println("Student added");

    }
}
