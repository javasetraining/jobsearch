package ua.pp.iserf.service.impl;

import ua.pp.iserf.dao.VacancyDAO;
import ua.pp.iserf.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import ua.pp.iserf.entity.Vacancy;

@Service
@Transactional
public class VacancyServiceImpl implements VacancyService {

    private VacancyDAO detailDAO;

    @Autowired
    public void setDetailDAO(VacancyDAO detailDAO) {
        this.detailDAO = detailDAO;
    }

    @Override
    public void create(Vacancy detail) {
        detailDAO.create(detail);
    }

    @Override
    public void update(Vacancy detail) {
        detailDAO.update(detail);
    }

    @Override
    public void delete(Vacancy detail) {
        detailDAO.delete(detail);
    }

    @Override
    public Vacancy findById(Long id) {
        return detailDAO.findById(id);
    }

    @Override
    public List<Vacancy> findAll() {
        return detailDAO.findAll();
    }

 
}
