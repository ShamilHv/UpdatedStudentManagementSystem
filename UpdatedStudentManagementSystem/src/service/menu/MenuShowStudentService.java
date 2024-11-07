package service.menu;

import bean.Config;
import bean.Student;
import service.inter.menu.MenuShowStudentsServiceInter;

public class MenuShowStudentService implements MenuShowStudentsServiceInter {
    @Override
    public void processLogic() {

        Student[] allStudents= Config.getInstance().getStudents();
        for(int i=0;i<allStudents.length;i++){
            System.out.println(allStudents[i]);
        }
    }
}
