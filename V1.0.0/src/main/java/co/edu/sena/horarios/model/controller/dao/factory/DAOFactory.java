package co.edu.sena.horarios.model.controller.dao.factory;

import co.edu.sena.horarios.model.controller.dao.DisponibilidadHorarioDAO;
import co.edu.sena.horarios.model.controller.dao.InstructorDAO;
import co.edu.sena.horarios.model.controller.dao.JornadaDAO;
import co.edu.sena.horarios.model.controller.dao.VinculacionDAO;
import co.edu.sena.horarios.model.controller.dao.mysql.DisponibilidadHorariaDAOimpl;
import co.edu.sena.horarios.model.controller.dao.mysql.InstructorDAOImpl;
import co.edu.sena.horarios.model.controller.dao.mysql.JornadaDAOImpl;
import co.edu.sena.horarios.model.controller.dao.mysql.VinculacionDAOImpl;
import co.edu.sena.horarios.model.entities.DisponibilidadHoraria;
import co.edu.sena.horarios.model.entities.Instructor;
import co.edu.sena.horarios.model.entities.Jornada;
import co.edu.sena.horarios.model.entities.Vinculacion;

public class DAOFactory {
    public static JornadaDAO crearJorndaDAO(){return new JornadaDAOImpl(Jornada.class);
    }
    public static DisponibilidadHorarioDAO crearDisponibilidadHorariaDAO(){
        return new DisponibilidadHorariaDAOimpl(DisponibilidadHoraria.class);
    }
}
