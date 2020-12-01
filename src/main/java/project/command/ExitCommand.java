package project.command;

import project.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
