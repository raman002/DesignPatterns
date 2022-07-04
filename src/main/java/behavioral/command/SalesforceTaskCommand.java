package behavioral.command;

import java.util.Optional;

public interface SalesforceTaskCommand extends TaskCommand {

    void setCredentials(String username, String password);
    void execute();
    Optional<String> getToken();

}
