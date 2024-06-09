package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.entity.Member;
import com.example.firstproject.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class MemberController {

    private MemberRepository memberRepository;

    @GetMapping("/members/new")
    public String newMemberForm() {
        return "members/new";
    }

    @PostMapping("/members/create")
    public String createMember(MemberForm form) {
        // System.out.println("form.toString() : " + form.toString());
        log.info("form.toString() : " + form.toString());
        // dto -> entity
        Member member = form.toEntity();

        // System.out.println("member.toString() : " + member.toString());
        log.info("member.toString() : " + member.toString());

        // entity -> repository
        Member saved = memberRepository.save(member);
        // System.out.println("saved.toString() : " + saved.toString());
        log.info("saved.toString() : " + saved.toString());

        return "";
    }
}

