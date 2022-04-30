package study.datajpa.dto;

import lombok.Data;

/**
 * Created by sskim on 2022/04/27
 * Github : http://github.com/sskim91
 */
@Data
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }
}
