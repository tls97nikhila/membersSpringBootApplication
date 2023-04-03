package com.api.members.controller;
import com.api.members.model.Member;
import com.api.members.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MembersController {

    @Autowired
    private MemberRepository repo;

    @PostMapping("/addMember")
    public Member addMember(@RequestBody Member member) {
        return repo.save(member);
    }

    @GetMapping("/msg")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/getAllMembers")
    public List<Member> getAllMembers(){
        return repo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMember(@PathVariable String id){
        repo.deleteById(id);

        return "Deleted Successfully";
    }



}