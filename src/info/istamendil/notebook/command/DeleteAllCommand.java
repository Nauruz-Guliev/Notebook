package info.istamendil.notebook.command;

import info.istamendil.notebook.App;

public class DeleteAllCommand implements Command {
    private final App app;
    public DeleteAllCommand(App app) {
        this.app = app;
    }
    @Override
    public Object execute() {
        try {
            app.getStorage().deleteAll();
            app.getUserInteractor().print(app.getStorage().readAll());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
}
