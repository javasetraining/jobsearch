package ua.pp.iserf.dao.impl;

import ua.pp.iserf.dao.ParserDAO;
import ua.pp.iserf.entity.Parser;
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
public class ParserDAOImplement implements ParserDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Parser parser) {
        sessionFactory.getCurrentSession().save(parser);
    }

    @Override
    public void update(Parser parser) {
        sessionFactory.getCurrentSession().update(parser);
    }

    @Override
    public void delete(Parser parser) {
        sessionFactory.getCurrentSession().delete(parser);
    }

    @Override
    public Parser findById(Long parserId) {
        return (Parser) sessionFactory.getCurrentSession().get(Parser.class, parserId);
    }

    @Override
    @Transactional
    public List<Parser> findAll() {
        Query query = sessionFactory.getCurrentSession().createQuery("from Parser");
        return new ArrayList<>(query.list());
    }

}
