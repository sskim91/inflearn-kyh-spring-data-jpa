package study.datajpa.repository;

import study.datajpa.entity.Member;

import java.util.List;

/**
 * Created by sskim on 2022/04/30
 * Github : http://github.com/sskim91
 */
public interface MemberRepositoryCustom {
    List<Member> findMemberCustom();
}
