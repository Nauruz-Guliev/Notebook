package info.istamendil.notebook.command;

import info.istamendil.notebook.App;

public class ReadAllCommand implements Command {
    private final App app;
    public ReadAllCommand(App app) {
        this.app = app;
    }
    @Override
    public Object execute() {
        try {
            app.getUserInteractor().print(app.getStorage().readAll());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
}
