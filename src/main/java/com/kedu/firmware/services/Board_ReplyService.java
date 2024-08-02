package com.kedu.firmware.services;

import com.kedu.firmware.DAO.Board_ReplyDAO;
import com.kedu.firmware.DTO.Board_ReplyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
@CrossOrigin
public class Board_ReplyService {

    @Autowired
    private Board_ReplyDAO board_ReplyDAO;

    public  void post(Board_ReplyDTO dto){
        board_ReplyDAO.insert(dto);
    }
}
