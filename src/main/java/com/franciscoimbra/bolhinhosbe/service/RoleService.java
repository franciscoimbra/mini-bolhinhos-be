package com.franciscoimbra.bolhinhosbe.service;

import com.franciscoimbra.bolhinhosbe.entities.Role;

import java.util.Optional;

public interface RoleService {

    public Optional<Role> getRoleByName(Role role);

}
