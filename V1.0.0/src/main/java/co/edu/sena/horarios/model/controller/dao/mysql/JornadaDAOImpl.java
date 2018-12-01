package co.edu.sena.horarios.model.controller.dao.mysql;

import co.edu.sena.horarios.model.controller.dao.JornadaDAO;
import co.edu.sena.horarios.model.entities.Jornada;

public class JornadaDAOImpl extends AbstractDao<Jornada> implements JornadaDAO {
    public JornadaDAOImpl(Class<Jornada> entityClass) {
        super(entityClass);
    }
}
