package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.Geek;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@Transactional
@RequestMapping("/service/getInteret")
public class GeekService {
    @RequestMapping(method = GET)
    public String getGeek() {
        DAO dao =new DAO();
        dao.getElement();

        return "ok";//new Geek();
    }

}
