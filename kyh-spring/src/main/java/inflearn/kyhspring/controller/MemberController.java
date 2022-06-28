package inflearn.kyhspring.controller;

import inflearn.kyhspring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {


    private final MemberService memberService;

    public MemberController (MemberService memberService){
        this.memberService = memberService;

    }
}
