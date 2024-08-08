package com.kedu.firmware.DAO;

import com.kedu.firmware.DTO.BoardDTO;
import com.kedu.firmware.DTO.Board_CategoryDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Board_CategoryDAO {

    @Autowired
    private SqlSession mybatis;

    public List<Board_CategoryDTO> getAllCategories() {
        return mybatis.selectList("category.selectAll");
    }

    public List<BoardDTO> getPostsByCategory(int category_seq) {
        System.out.println("category_seq::::: "+category_seq);
        return mybatis.selectList("category.selectByCategory", category_seq);
    }
}
