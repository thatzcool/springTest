package com.multicampus.springex.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper2 {   //데이베이스의 현재시각을 문자열 받아와서 처리
       String getNow();
}
