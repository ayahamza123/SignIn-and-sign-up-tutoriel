package com.learning.projetloginregisterjwt.Repository;

import com.learning.projetloginregisterjwt.models.ERole;
import com.learning.projetloginregisterjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Ala Hadj Brahim <ala.hajbrahim@gmail.com>
 * @project ProjetLoginRegisterjwt
 * @Created 16/08/2021  8:46.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
