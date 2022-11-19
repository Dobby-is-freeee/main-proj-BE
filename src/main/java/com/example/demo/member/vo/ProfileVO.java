package com.example.demo.member.vo;

import java.util.Date;

import com.example.demo.common.vo.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by Hyunsik Lee on 2022-05-25. Blog : https://hs95blue.github.io/ Github :
 * https://github.com/hs95blue
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class ProfileVO extends CommonVO {

  private int id;
  private String nickname;
  private String position;
  private int positionLevel;
  private String phoneNumber;
  private Date createDate;
  private Date modifyDate;

}
