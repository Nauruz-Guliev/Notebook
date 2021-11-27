package info.istamendil.notebook.utils.commands;

import info.istamendil.notebook.App;

public class DeleteAllCommand implements Command {
    private final App app;
    public DeleteAllCommand(App app) {
        this.app = app;
    }
    @Override
    public Object execute() {
        int i = 0;
        while (app.getStorage().readAll()[i] != null) {
            app.getStorage().readAll()[i] = null;
        }
        app.getUserInteractor().print(app.getStorage().readAll());
        return null;
    }
}
