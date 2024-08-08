package com.kedu.firmware.services;

import com.kedu.firmware.DAO.BookmarkDAO;
import com.kedu.firmware.DTO.BookmarkDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.sql.SQLException;
import java.util.List;

@Service
@CrossOrigin
public class BookmarkService {

    @Autowired
    BookmarkDAO bookmarkDAO;

    public void addBookmark(BookmarkDTO dto ) {bookmarkDAO.insert(dto);}


    public List<BookmarkDTO> getBookmarksByUsername(String username) throws SQLException {
            return bookmarkDAO.getBookmarksByUsername(username);
    }

    public int deleteBookmark(int bookmark_seq)  {
       return bookmarkDAO.deleteBookmark(bookmark_seq);}

//    public boolean isBookmarked(int user_Seq, int board_Seq) {
//        return bookmarkDAO.checkBookmark(user_Seq, board_Seq) > 0;
//    }
}
