package com.franciscoimbra.bolhinhosbe.service.serviceImpl;

import com.franciscoimbra.bolhinhosbe.entities.Role;
import com.franciscoimbra.bolhinhosbe.repository.ClientRepository;
import com.franciscoimbra.bolhinhosbe.repository.RoleRepository;
import com.franciscoimbra.bolhinhosbe.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Optional<Role> getRoleByName(Role role) {
        return roleRepository.findByName(role.getName());
    }
}
