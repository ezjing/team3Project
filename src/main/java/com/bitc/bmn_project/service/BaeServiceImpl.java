package com.bitc.bmn_project.service;

import com.bitc.bmn_project.DTO.CeoDTO;
import com.bitc.bmn_project.mapper.BaeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaeServiceImpl implements BaeService {
  @Autowired
  private BaeMapper baeMapper;

  // 가게정보 조회
  @Override
  public CeoDTO selectCeoDetail(int ceoIdx) throws Exception {
    CeoDTO ceoDTO = baeMapper.selectCeoDetail(ceoIdx);

    return ceoDTO;
  }

  // 팔로워 수 조회
  @Override
  public int getFollows(String ceoStore) throws Exception {
    int result = baeMapper.getFollows(ceoStore);
    return result;
  }
}