package info.istamendil.notebook.utils.commands;

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
        int i = 0;
        while (notes[i] != null) {
            System.out.print(notes[i] + " ");
            i++;
        }
        System.out.println();
    }
}
