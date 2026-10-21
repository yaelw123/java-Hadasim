import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EncryptorApp {
public static void Encript(String content){
    System.out.println(content.toLowerCase());
}
public static void Decrypt(String content)
{
    System.out.println(content.toUpperCase());
}
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Please choose an option:");
        System.out.println("1. encrypt ,2. decrypt ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if(choice!=1 && choice!=2){
           throw  new RuntimeException("Invalid choice");}
        System.out.println("Enter the path to file");
        String path= scanner.nextLine();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("Error!!! File doesnt exist!");
            return;
        }
        try {
            String content = Files.readString(Path.of(path));
            System.out.println("File read successfully!");
            switch (choice){
                case 1:
                    Encript(content);
                    break;
                case 2:
                    Decrypt(content);
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }






    }
}
