package info.istamendil.notebook.utils.commands;

import info.istamendil.notebook.App;
import info.istamendil.notebook.dataStorage.ArrayStorage;

public class AddCommand implements Command {
    private final App app;
    private String note;
    public AddCommand(App app) {
        this.app = app;
    }
    @Override
    public Object execute() {
        note = app.getUserInteractor().readCommand(app.getScanner());
        app.getStorage().save(note);
        return null;
    }
}
