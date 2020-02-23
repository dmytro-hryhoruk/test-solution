package mate.academy;

public class Main {

    public static void main(String[] args) {
        String fileName = args[0];
        App application = new App();
        application.launchApp(fileName);
    }
}
