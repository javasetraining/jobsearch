package ua.pp.iserf.service;

import ua.pp.iserf.entity.Role;
import java.util.List;

public interface RoleService {

    public void create(Role role);

    public void update(Role role);

    public void delete(Role role);

    public Role findById(Long roleId);
    
    public Role findByName(String name);

    public List<Role> findAll();

}
