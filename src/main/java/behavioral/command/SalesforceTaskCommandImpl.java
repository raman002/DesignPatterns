package behavioral.command;

import java.util.Optional;
import java.util.UUID;

public class SalesforceTaskCommandImpl implements SalesforceTaskCommand {

    private String username;
    private String password;
    private String token;

    @Override
    public void setCredentials(String username, String password) {
        this.username = username;
        this.password = password;

        System.out.println("this.username = " + this.username);
        System.out.println("this.password = " + this.password);
    }

    @Override
    public void execute() {
        if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
            this.token = UUID.randomUUID().toString();
        }
    }

    @Override
    public Optional<String> getToken() {
         return Optional.ofNullable(this.token);
    }
}
