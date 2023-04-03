package com.api.members.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.members.model.Member;

public interface MemberRepository extends MongoRepository<Member, String> {
}
