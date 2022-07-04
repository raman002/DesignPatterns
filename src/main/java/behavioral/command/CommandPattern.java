package behavioral.command;

import java.util.Optional;

public class CommandPattern {
    public static void main(String[] args) {
        Optional<TaskCommand> taskCommand = CommandFactory.createCommand(SalesforceTaskCommand.class);

        if (taskCommand.isPresent()) {
            TaskCommand taskCommand1 = taskCommand.get();
            if (taskCommand1 instanceof SalesforceTaskCommand salesforceTaskCommand) {
                salesforceTaskCommand.setCredentials("jdk_test", "3eofijsldfklsd");
                salesforceTaskCommand.execute();
                Optional<String> token = salesforceTaskCommand.getToken();

                if (token.isPresent()) {
                    System.out.println("token = " + token.get());
                } else {
                    System.out.println("Something went wrong while getting the salesforce token");
                }
            }

        }



    }
}
