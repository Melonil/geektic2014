package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.Model.Geek;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;


import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@Transactional
public class GeekService {
    @RequestMapping(value="/getGeek",method = GET)
    public Geek getGeek() {
        DAOGeek dao =new DAOGeek();
        Geek listgeek = dao.getGeek();

        return listgeek;//new Geek();
    }

}
