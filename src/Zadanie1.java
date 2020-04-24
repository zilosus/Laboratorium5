import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie1 {
    static void zadanie1(){
        Scanner scan = new Scanner(System.in);
        String login;
        String password;
        String loginToCrackPassword;
        Map<String, String> mapa = new HashMap<>();

        do {
            login = "";
            password = "";
            System.out.println("Nazwa Użytkownika: ");
            login = scan.nextLine();
            if(login.equals("q")){
                break;
            }
            else{
                if(mapa.containsKey(login)){
                    System.out.println("Takie konto już istnieje!!!");
                    System.out.println();
                }
                else {
                    System.out.println("Hasło użytkownika: ");
                    password = scan.nextLine();
                    System.out.println();
                    mapa.put(login, password);
                }
            }
        }while(true);

        System.out.println("");System.out.println("");

        System.out.println(mapa);

        System.out.println("");System.out.println("");

        do{
            System.out.println("Aby wyjść wciśnij q");
            System.out.println("Użytkownik: ");
            loginToCrackPassword = scan.nextLine();
            if(loginToCrackPassword.equals("q")){
                break;
            }
            else{
                if(!mapa.containsKey(loginToCrackPassword)){
                    System.out.println("Nie ma takiego loginu!!!");
                    System.out.println();
                }
                else {
                    System.out.println("Hasło " + loginToCrackPassword + " to " + mapa.get(loginToCrackPassword));
                    System.out.println();
                }
            }

        }while(true);
    }
}
