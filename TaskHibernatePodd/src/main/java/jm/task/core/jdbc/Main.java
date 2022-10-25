package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Заур", "Трегулов", (byte) 33);
        service.saveUser("Наиль", "Алишев", (byte) 35);
        service.saveUser("Дмитрий", "Поддубиков", (byte) 23);
        service.saveUser("Денис", "Матвеенко", (byte) 28);
        service.removeUserById(1);
        System.out.println(service.getAllUsers());
        service.dropUsersTable();
        Util.getFactory().close();
    }
}

