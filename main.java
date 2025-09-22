import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "main", description = "Prints impact.com - SaaSquatch")
public class main implements Runnable {

    @Override
    public void run() {
        System.out.println("impact.com - SaaSquatch");
    }

    public static void main(String[] args) {
        new CommandLine(new main()).execute(args);
    }
}