package co.edu.sena.horarios.model.controller.dao.mysql;

import co.edu.sena.horarios.model.controller.dao.DisponibilidadHorarioDAO;
import co.edu.sena.horarios.model.controller.dao.factory.DAOFactory;
import co.edu.sena.horarios.model.entities.DisponibilidadHoraria;
import co.edu.sena.horarios.model.entities.DisponibilidadHorariaPK;
import co.edu.sena.horarios.model.entities.Jornada;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DisponibilidadHorariaDAOimplTest {

    private DisponibilidadHorarioDAO disponibilidadHorarioDAO;

    @Before
    public void setUp() throws Exception {
        disponibilidadHorarioDAO = DAOFactory.crearDisponibilidadHorariaDAO();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test1Insert() {
        DisponibilidadHoraria disponibilidadHoraria = new DisponibilidadHoraria(new DisponibilidadHorariaPK("CC","1000514134","Lunes","T"));
        disponibilidadHoraria.setJornada(new Jornada("JT"));
        disponibilidadHorarioDAO.insert(disponibilidadHoraria);
        assertEquals(disponibilidadHoraria, disponibilidadHorarioDAO.find(new DisponibilidadHorariaPK("CC","1000514134","Lunes","T")));
    }

    @Test
    public void test2Update() {
        DisponibilidadHoraria disponibilidadHoraria = (DisponibilidadHoraria) disponibilidadHorarioDAO.find((new DisponibilidadHorariaPK("CC","1000514134","Lunes","T")));
        disponibilidadHoraria.setJornada(new Jornada("JM"));
        disponibilidadHorarioDAO.update(disponibilidadHoraria);
        assertEquals(disponibilidadHoraria,(DisponibilidadHoraria) disponibilidadHorarioDAO.find(new DisponibilidadHorariaPK("CC","12154213","Jueves","M")));
    }

    @Test
    public void test3FinAll() {
        List<DisponibilidadHoraria> disponibilidadHorarias = (List<DisponibilidadHoraria>) disponibilidadHorarioDAO.findAll();
        assertFalse(disponibilidadHorarias.isEmpty());
    }

    @Test
    public void test4Find() {
        DisponibilidadHoraria disponibilidadHoraria = (DisponibilidadHoraria) disponibilidadHorarioDAO.find(new DisponibilidadHorariaPK("CC","12154213","Jueves","JM"));
        assertNotNull(disponibilidadHoraria);
    }

    @Test
    public void test5Remove() {
        disponibilidadHorarioDAO.remove((DisponibilidadHoraria) disponibilidadHorarioDAO.find (new DisponibilidadHorariaPK("CC","12154213","Jueves","JM")));
        assertNull((DisponibilidadHoraria) disponibilidadHorarioDAO.find(new DisponibilidadHorariaPK("CC","12154213","Jueves","JM")));
    }
}