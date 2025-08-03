import java.util.Optional;
import java.util.function.Supplier;

public class LazyConfigLoader {
    
    public static void main(String[] args) {

        Optional<String> configValue = Optional.empty();
        // Optional<String> configValue = Optional.of("Config-1");

        Supplier<String> loadConfig = () -> {
            System.out.println("Loading the configuration...");
            return "Lazy Loaded Config Value.";
        };

        String finalConfig = configValue.orElseGet(loadConfig);

        System.out.println("Final Config: " + finalConfig);
    }
}