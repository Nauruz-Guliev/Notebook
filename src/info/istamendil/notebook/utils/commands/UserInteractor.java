package info.istamendil.notebook.utils.commands;

import java.util.Scanner;

public interface UserInteractor {
    String readCommand(Scanner sc);
    void print(String[] notes);
}