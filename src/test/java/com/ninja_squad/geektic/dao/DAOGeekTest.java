package com.ninja_squad.geektic.dao;
import static org.junit.Assert.*;
import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.DAO.DAOGeek;
import com.ninja_squad.geektic.Model.Geek;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



/**
 * Created by Melonil on 24/06/2015.
 */
public class DAOGeekTest extends BaseDaoTest {
    @Autowired
    DAOGeek dao;

    @Before
    public void populateDatabase() {
        Operation operation = Operations.sequenceOf(
                Operations.deleteAllFrom("USER"),
                Operations.insertInto("USER")
                        .columns("id", "nom", "prenom","sexe","email")
                        .values(1, "Mohamed", "Boudrij", 1, "yaci.rachidi@gmail.com")
                        .values(2, "Yacine", "Boudrij", 1,"yaci.rachidi@gmail.com").build());
        DbSetup dbSetup = new DbSetup(destination, operation);
        dbSetup.launch();
    }

    @Test
    public void testGetGeek() throws Exception {
        List<Geek> liste = dao.getGeek(1);
        assertEquals(1, liste.get(0).getId());
    }
}