package info.istamendil.notebook.command;

import info.istamendil.notebook.App;

public class DeleteNoteCommand implements Command{
    private final App app;
    String note;
    public DeleteNoteCommand(App app) {
        this.app = app;
    }
    @Override
    public Object execute() {
        try {
            note = app.getUserInteractor().readCommand(app.getScanner());
            app.getStorage().deleteNote(note);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
