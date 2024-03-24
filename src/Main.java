import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        Registration reg = new Registration(sc);

        String login;
        String password;


        System.out.println("......Авторизуйтесь......");
        System.out.println("Введите логин:");

        if (sc.hasNextLine()) {
            login = sc.nextLine();
            System.out.println("Введите пароль:");
            password = sc.nextLine();

            System.out.println("login:= "+login);
            System.out.println("password:= "+password);
            Verification ver = new Verification(login, password);
        }


    }
}