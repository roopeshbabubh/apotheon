package com.apotheon.userservice.repository;

import com.apotheon.userservice.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRoleName(String roleName);

    boolean existsByRoleName(String roleName);
}
