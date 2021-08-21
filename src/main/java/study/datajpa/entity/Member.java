package study.datajpa.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

/**
 * Created by sskim on 2021/08/21
 * Github : http://github.com/sskim91
 */
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String username;

    public Member(String username) {
        this.username = username;
    }
}
