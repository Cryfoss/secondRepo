import java.util.Scanner;

public class Study {

    public static void main(String[] args) {
        nameCheck();
    }
    public static void nameCheck(){
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        if (name.length() > 20){
            System.out.println("имя слишком длинное");
        }
        else {
            System.out.println(name);
        }
    }
}