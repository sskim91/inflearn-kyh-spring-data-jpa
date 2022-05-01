package study.datajpa.repository;

/**
 * Created by sskim on 2022/05/01
 * Github : http://github.com/sskim91
 */
public class UsernameOnlyDto {
    private final String username;

    public UsernameOnlyDto(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
