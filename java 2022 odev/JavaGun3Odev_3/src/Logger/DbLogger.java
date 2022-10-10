package Logger;

public class DbLogger implements Logger {
    public void log(String data) {
        System.out.println("Veritabanına loglandı : " + data);
    }
}
