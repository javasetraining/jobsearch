package ua.pp.iserf.dao;

import ua.pp.iserf.entity.User;
import java.util.List;

/**
 * Created by alex
 */
public interface UserDAO {

    public void create(User user);

    public void update(User user);

    public void delete(User user);

    public User findById(Long userId);

    public User findByLogin(String login);

    public List<User> findAll();
}
