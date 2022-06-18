package com.example.demo.member.service.impl;

import com.example.demo.member.mapper.MemberMapper;

import com.example.demo.member.service.MemberService;
import com.example.demo.member.vo.MemberVO;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {
  private final MemberMapper memberMapper;

  public int saveUser(MemberVO memberVO){
    //roles 가 List 형식임으로 String role 로 넣어주기
    String r = "";
    List<String> userRoles = memberVO.getRoles();
    for(String roleData : userRoles){
      if ("" .equals(r)) {
        r = roleData;
      } else {
        r += "," + roleData;
      }
    }
    memberVO.setRole(r);
    System.out.println("유저 정보: " + memberVO);
    return memberMapper.save(memberVO);
  }

  public int chgPassword(MemberVO memberVO){
    return memberMapper.chgPass(memberVO);
  }

}
