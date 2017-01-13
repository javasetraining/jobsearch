package ua.pp.iserf.service;

import ua.pp.iserf.entity.Parser;
import java.util.List;

public interface ParserService {
    public void create(Parser phoneNumber);

    public void update(Parser phoneNumber);

    public void delete(Parser phoneNumber);

    public Parser findById(Long phoneNumberId);

    public List<Parser> findAll();

}
