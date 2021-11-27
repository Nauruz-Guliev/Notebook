package info.istamendil.notebook.utils;

import java.util.Scanner;

public class CommandLineUserInteractor implements UserInteractor {

    @Override
    public String readCommand(Scanner sc) {
        String command = sc.nextLine();
        System.out.println("<< " + command);
        return command;
    }

    @Override
    public void print(String[] notes) {
        System.out.print(">> ");
        for (String note : notes) {
            if (note != null) {
                System.out.print(note + " ");
            }
        }
        System.out.println();
    }
}
