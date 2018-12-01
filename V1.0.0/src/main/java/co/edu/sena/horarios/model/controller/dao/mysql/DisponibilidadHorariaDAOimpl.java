package co.edu.sena.horarios.model.controller.dao.mysql;

import co.edu.sena.horarios.model.controller.dao.DisponibilidadHorarioDAO;
import co.edu.sena.horarios.model.entities.DisponibilidadHoraria;

public class DisponibilidadHorariaDAOimpl extends AbstractDao<DisponibilidadHoraria> implements DisponibilidadHorarioDAO {
    public DisponibilidadHorariaDAOimpl (Class<DisponibilidadHoraria>entityclass){
        super(entityclass);
    }
}
