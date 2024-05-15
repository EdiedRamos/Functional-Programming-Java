package org.example;


import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplier {
    public static void main(String[] args) {}
}

class CLIArguments {
    private boolean isHelp;

    public boolean isHelp() {
        return isHelp;
    }
}

class CLIArgumentsUtils {
    static void showHelp(CLIArguments cliArguments) {
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if (cliArguments1.isHelp()) {
                System.out.println("Manual required!");
            }
        };
        consumerHelper.accept(cliArguments);
    }

    static CLIArguments generateCLI() {
//        Supplier<CLIArguments> generator = () -> new CLIArguments();
//        With reference method
        Supplier<CLIArguments> generator = CLIArguments::new;
        return generator.get();
    }
}