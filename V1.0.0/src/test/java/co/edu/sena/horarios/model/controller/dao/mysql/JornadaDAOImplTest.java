package co.edu.sena.horarios.model.controller.dao.mysql;

import co.edu.sena.horarios.model.controller.dao.JornadaDAO;
import co.edu.sena.horarios.model.controller.dao.factory.DAOFactory;
import co.edu.sena.horarios.model.entities.Jornada;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class JornadaDAOImplTest {

    private JornadaDAO jornadaDAO;

    @Before
    public void setUp() throws Exception {
        jornadaDAO = DAOFactory.crearJorndaDAO();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test1Insert() {
        Jornada jornada = new Jornada("JT","Jornda Tarde","12 a 6 pm","Activo");
        jornadaDAO.insert(jornada);
        assertEquals(jornada,(Jornada) jornadaDAO.find("JT"));
    }

    @Test
    public void tast2Update() {
        Jornada jornada = (Jornada) jornadaDAO.find("JT");
        jornada.setNombreJornada("Jornada Diurna");
        jornada.setDescripcion("6 a 12 am");
        jornada.setEstado("Inactivo");
        assertEquals(jornada, (Jornada) jornadaDAO.find("JT"));
    }

    @Test
    public void test3FinAll() {
        List<Jornada> list = (List<Jornada>) jornadaDAO.findAll();
        assertFalse(list.isEmpty());
    }

    @Test
    public void test4Find() {
        Jornada jornada = (Jornada) jornadaDAO.find("JT");
        assertNotNull(jornada);
    }

    @Test
    public void test5Remove() {
        jornadaDAO.remove((Jornada) new Jornada("JT","Jornada Tarde","12 a 6pm","Activo"));
        assertNull((Jornada) jornadaDAO.find("JT"));
    }
}