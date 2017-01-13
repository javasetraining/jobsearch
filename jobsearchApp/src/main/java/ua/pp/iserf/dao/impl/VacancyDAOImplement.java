package ua.pp.iserf.dao.impl;

import ua.pp.iserf.dao.VacancyDAO;
import ua.pp.iserf.entity.Vacancy;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alex
 */
@Repository
public class VacancyDAOImplement implements VacancyDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Vacancy detail) {
        sessionFactory.getCurrentSession().save(detail);
    }

    @Override
    public void update(Vacancy detail) {
        sessionFactory.getCurrentSession().update(detail);
    }

    @Override
    public void delete(Vacancy detail) {
       sessionFactory.getCurrentSession().delete(detail);
    }

    @Override
    public Vacancy findById(Long detailId) {
        return (Vacancy) sessionFactory.getCurrentSession().get(Vacancy.class, detailId);
    }

    @Override
    @Transactional
    public List<Vacancy> findAll() {
        Query query = sessionFactory.getCurrentSession().createQuery("from Vacancy");
        return new ArrayList<>(query.list());
    }

}
