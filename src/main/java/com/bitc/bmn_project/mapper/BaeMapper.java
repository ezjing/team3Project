package com.bitc.bmn_project.mapper;

import com.bitc.bmn_project.DTO.CeoDTO;
import com.bitc.bmn_project.DTO.CustomerDTO;
import com.bitc.bmn_project.DTO.QuestionDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BaeMapper {

  CeoDTO selectCeoDetail(int ceoIdx) throws Exception;

  int getFollows(@Param("ceoStore") String ceoStore) throws Exception;

  void updateFollow(int customerIdx, String ceoStore) throws Exception;

  CustomerDTO selectCustomerInfo(int customerIdx) throws Exception;

  void deleteFollow(int customerIdx, String ceoStore) throws Exception;

  List<QuestionDTO> selectQuestionList(int ceoIdx) throws Exception;

  void insertQuestion(QuestionDTO questionDTO) throws Exception;
}
