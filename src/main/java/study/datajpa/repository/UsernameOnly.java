package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by sskim on 2022/05/01
 * Github : http://github.com/sskim91
 */
public interface UsernameOnly {
    @Value("#{target.username+ ' ' + target.age}")
    String getUsername();
}
