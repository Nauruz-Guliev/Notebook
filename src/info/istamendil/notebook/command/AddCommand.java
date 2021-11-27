package info.istamendil.notebook.command;

import info.istamendil.notebook.App;

public class AddCommand implements Command {
    private final App app;
    private String note;
    public AddCommand(App app) {
        this.app = app;
    }
    @Override
    public Object execute() {
        try {
            note = app.getUserInteractor().readCommand(app.getScanner());
            app.getStorage().save(note);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
}
