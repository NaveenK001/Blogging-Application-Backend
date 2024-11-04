package com.demoBlog.App.repositories;

import com.demoBlog.App.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Integer> {
}
