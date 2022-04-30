package study.datajpa.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import study.datajpa.repository.MemberRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by sskim on 2021/08/21
 * Github : http://github.com/sskim91
 */
@SpringBootTest
@Transactional
@Rollback(false)
class MemberTest {

    @PersistenceContext
    EntityManager em;

    @Autowired
    MemberRepository memberRepository;

    @Test
    void testEntity() throws Exception {
        Team teamA = new Team("teamA");
        Team teamB = new Team("teamB");
        em.persist(teamA);
        em.persist(teamB);

        Member member1 = new Member("member1", 10, teamA);
        Member member2 = new Member("member2", 20, teamA);
        Member member3 = new Member("member3", 30, teamB);
        Member member4 = new Member("member4", 40, teamB);

        em.persist(member1);
        em.persist(member2);
        em.persist(member3);
        em.persist(member4);

        //영속성 컨텍스트 초기화
        em.flush();
        em.clear();

        //확인
        List<Member> members = em.createQuery("select m from Member m", Member.class)
                .getResultList();

        members.forEach(m ->{
            System.out.println("member = " + m);
            System.out.println("member.getTeam() = " + m.getTeam());
        });

    }

    @Test
    void JpaEventBaseEntity() throws Exception{
        Member member1 = new Member("member1");
        memberRepository.save(member1); //@PrePersist

        Thread.sleep(1000);
        member1.setUsername("member2");

        em.flush(); //@PreUpdate
        em.clear();

        Member member = memberRepository.findById(member1.getId()).get();

        System.out.println("member.getCreatedDate() = " + member.getCreatedDate());
        System.out.println("member.getUpdatedDate() = " + member.getLastModifiedDate());
    }
}