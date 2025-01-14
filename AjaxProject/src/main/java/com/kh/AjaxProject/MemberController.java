package com.kh.AjaxProject;


import com.kh.AjaxProject.DTO.Member;
import com.kh.AjaxProject.service.MemberSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberSerivce memberSerivce;

    @GetMapping("/api/members")
    public ResponseEntity< List<Member>   > getAllMembers() {
        return ResponseEntity.ok(memberSerivce.getAllMembers() )  ;
    }
}
