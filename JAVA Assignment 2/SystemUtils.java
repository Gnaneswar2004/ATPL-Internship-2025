public class SystemUtils {

    public static class Logger {
        
        public static void log(String message) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Logger.log("Log 1");
        Logger.log("Log 2");
        Logger.log("Log 3");
    }
}