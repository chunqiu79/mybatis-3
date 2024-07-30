package com.chunqiu79.example.table.mapper;

import com.chunqiu79.example.table.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: chunqiu79
 * @time: 2024/4/7 10:57
 * @desc:
 */
@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int updateBatch(List<User> list);

    int batchInsert(List<User> list);

}
