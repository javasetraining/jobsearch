package ua.pp.iserf.service;

import ua.pp.iserf.entity.User;

import java.util.List;

public interface UserService {
    public void create(User user);

    public void update(User user);

    public void delete(User user);

    public User findById(Long userId);

    public User findByLogin(String login);
    
    public List<User> findAll();
    
}
