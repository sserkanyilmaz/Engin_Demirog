package oopWithNLayeredApp.Core.Logging.Logger;

public class DatabaseLogger implements Logger{
    public void log(String data) {
        System.out.println("Veri tabanına loglandı : " +data);
    }
}
