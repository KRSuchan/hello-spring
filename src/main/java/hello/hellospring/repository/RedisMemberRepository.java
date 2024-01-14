package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RedisMemberRepository extends CrudRepository<Member, Long>, MemberRepository{
}
