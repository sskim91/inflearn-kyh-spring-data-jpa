package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Member;

/**
 * Created by sskim on 2021/08/21
 * Github : http://github.com/sskim91
 */
public interface MemberRepository extends JpaRepository<Member, Long> {

}
