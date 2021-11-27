package info.istamendil.notebook.utils.commands;


public class ExitCommand implements Command {
    @Override
    public Object execute() {
        System.exit(0);
        return null;
    }
}
