package info.istamendil.notebook.utils.commands;

import info.istamendil.notebook.App;

public class ReadAllCommand implements Command {
    private final App app;
    public ReadAllCommand(App app) {
        this.app = app;
    }
    @Override
    public Object execute() {
        app.getUserInteractor().print(app.getStorage().readAll());
        return null;
    }
}
