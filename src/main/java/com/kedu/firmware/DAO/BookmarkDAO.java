package com.kedu.firmware.DAO;

import com.kedu.firmware.DTO.BookmarkDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class BookmarkDAO {

    @Autowired
    private SqlSession mybatis;

    public void insert(BookmarkDTO dto) {
        mybatis.insert("bookmark.insert", dto);
    }

    public List<BookmarkDTO> getBookmarksByUsername(String username) throws SQLException {
        return mybatis.selectList("bookmark.getBookmarksByUsername", username);
    }

    public int deleteBookmark(int bookmark_seq) {
        return mybatis.delete("bookmark.delete", bookmark_seq);
    }

//    public int checkBookmark(int user_Seq, int board_Seq) {
//        Map<String, Integer> params = new HashMap<>();
//        params.put("user_Seq", user_Seq);
//        params.put("board_Seq", board_Seq);
//        return mybatis.selectOne("bookmark.checkBookmark", params);
//    }
}
