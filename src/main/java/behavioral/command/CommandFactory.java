package behavioral.command;

import java.util.Optional;

public class CommandFactory {

    private CommandFactory() {}

    public static Optional<TaskCommand> createCommand(Class<? extends TaskCommand> clazz) {
        if (clazz.getName().contains("SalesforceTaskCommand")) {
            return Optional.of(new SalesforceTaskCommandImpl());
        }

        return Optional.empty();
    };
}
