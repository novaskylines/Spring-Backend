package org.zerock.springex3.mapper;

import org.apache.ibatis.annotations.Select;

// Mapper : 쿼리를 저장하는 구간!
// @Select, @Insert, @Delete, @Update 등 쿼리문 설정 가능
public interface TimeMapper {
    // @Select(쿼리문)
    @Select("SELECT now()")
    String getTime();
}
