package info.istamendil.notebook;


import info.istamendil.notebook.dataStorage.ArrayStorage;
import info.istamendil.notebook.utils.commands.*;

import java.util.Scanner;

public class App extends Application {
    private String[] commandNames;
    private Command[] commands;
    private final int INIT_SIZE = 100;
    private String[] notes;
    private Scanner sc;
    private ArrayStorage array;
    private CommandLineUserInteractor CLUI;


    public static void main(String[] args) {
        App app = new App(args);
        app.init();
        app.start();
    }

    public App(String[] args) {
        super(args);
    }

    @Override
    public void init() {
        notes = new String[INIT_SIZE];
        sc = new Scanner(System.in);
        commandNames = new String[]{"add", "readAll", "exit", "deleteAll"};
        commands = new Command[]{
                new AddCommand(this),
                new ReadAllCommand(this),
                new ExitCommand(),
                new DeleteAllCommand(this)
        };
        CLUI = new CommandLineUserInteractor();
        array = new ArrayStorage(notes);
    }

    @Override
    public void start() {
        while (true) {
            String userCommand = sc.nextLine();
            int commandIndex = 0;
            boolean found = false;
            for (String commandName : commandNames) {
                if (userCommand.equals(commandName)) {
                    commands[commandIndex].execute();
                    found = true;
                    break;
                }
                commandIndex++;
            }
            if (!found) {
                System.out.println("Command not found");
            }
        }
    }
    public Scanner getScanner() {
        return sc;
    }
    public ArrayStorage getStorage() {
        return array;
    }
    public CommandLineUserInteractor getUserInteractor() {
        return CLUI;
    }
}
