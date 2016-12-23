package ua.pp.iserf.dao;

import java.util.List;
import ua.pp.iserf.entity.Parser;

/**
 * Created by alex
 */
public interface ParserDAO {

    public void create(Parser phoneNumber);

    public void update(Parser phoneNumber);

    public void delete(Parser phoneNumber);

    public Parser findById(Long phoneNumberId);

    public List<Parser> findAll();
}
