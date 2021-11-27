package info.istamendil.notebook.command;


public class ExitCommand implements Command {
    @Override
    public Object execute() {
        System.exit(0);
        return null;
    }
}
