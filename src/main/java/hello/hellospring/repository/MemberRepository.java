package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    //회원저장
    Member save(Member member);
    //id 찾아오기
    Optional<Member> findById(Long id);
    //name 찾아오기
    Optional<Member> findByName(String name);
    //모든회원 리스트 반환
    List<Member> findAll();
}
