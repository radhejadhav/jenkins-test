package school.admin.dto;

import java.util.Set;

public class TokenRequest {

    private String username;
    private String password;

    public TokenRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
