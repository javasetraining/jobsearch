package ua.pp.iserf.service.impl;

import ua.pp.iserf.dao.ParserDAO;
import ua.pp.iserf.entity.Parser;
import ua.pp.iserf.service.ParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ParserServiceImpl implements ParserService {

    private ParserDAO phoneNumberDAO;

    @Autowired
    public void setPhoneNumberDAO(ParserDAO phoneNumberDAO) {
        this.phoneNumberDAO = phoneNumberDAO;
    }

    @Override
    public void create(Parser phoneNumber) {
        phoneNumberDAO.create(phoneNumber);
    }

    @Override
    public void update(Parser phoneNumber) {
        phoneNumberDAO.update(phoneNumber);
    }

    @Override
    public void delete(Parser phoneNumber) {
        phoneNumberDAO.delete(phoneNumber);
    }

    @Override
    public Parser findById(Long id) {
        return phoneNumberDAO.findById(id);
    }

    @Override
    public List<Parser> findAll() {
        return phoneNumberDAO.findAll();
    }

}
