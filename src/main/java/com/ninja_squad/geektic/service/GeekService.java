package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.DAO.DAOGeek;
import com.ninja_squad.geektic.Model.Geek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;


import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@Transactional
public class GeekService {

    @Autowired
    DAOGeek dao;

    @RequestMapping(value="/getGeek",method = GET, params = {"sexe"})
    public List<Geek> getGeek(@RequestParam("sexe") int sexe) {

        List<Geek> listgeek = dao.getGeek(sexe);
        return listgeek;//new Geek();
    }

}
