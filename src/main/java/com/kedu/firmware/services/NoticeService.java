package com.kedu.firmware.services;

import com.kedu.firmware.DAO.NoticeDAO;
import com.kedu.firmware.DTO.NoticeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin
public class NoticeService {

    @Autowired
    private NoticeDAO noticeDAO;

    public void post(NoticeDTO dto) {
        noticeDAO.insert(dto);
    }

    public List<NoticeDTO> getNotices() {
        return noticeDAO.selectAll();
    }

    public NoticeDTO getNotice(int seq) {
        return noticeDAO.selectBySeq(seq);
    }
}


