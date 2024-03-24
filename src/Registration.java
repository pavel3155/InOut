
import java.util.Scanner;
import  java.io.*;
public class Registration {
    Scanner sc;
    String log;
    String pass;

    public Registration(Scanner sc) {
        this.sc = sc;
        System.out.println("Регистрация:");
        System.out.println("Введите логин:");
        if (sc.hasNextLine()) {
            log = sc.nextLine();
            System.out.println("Введите пароль:");
            pass = sc.nextLine();
        }
        try (FileWriter writer = new FileWriter("user.txt", false))
        {
            // запись всей строки

            writer.write(log);
            writer.write("\n");
            writer.write(pass);

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}