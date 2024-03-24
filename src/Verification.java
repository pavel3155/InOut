import  java.io.*;
import java.io.FileNotFoundException;
public class Verification {
    String log;
    String pass;
    String readLog="";
    String readPass="";

    public Verification(String log, String pass) {
        this.log=log;
        this.pass=pass;
        System.out.println("......Проверка логина и пароля......");



        try (BufferedReader br = new BufferedReader(new FileReader("user.txt"))) {

            readLog =br.readLine();
            readPass=br.readLine();
            System.out.println("readLog:= "+readLog);
            System.out.println("readPass:= "+readPass);


        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        if ((log.equals(readLog))&&(pass.equals(readPass))) {
            System.out.println("......Авторизация прошла успешно......");
        } else {
            System.out.println("......Авторизация не пройдена......");
        }


    }
}