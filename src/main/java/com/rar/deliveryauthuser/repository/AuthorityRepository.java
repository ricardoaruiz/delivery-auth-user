package com.rar.deliveryauthuser.repository;

import com.rar.deliveryauthuser.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository responsável pelas consultas das regras do usuário no banco de dados.
 */

public interface AuthorityRepository extends JpaRepository<Authority, String> {

    Authority findByName(String name);

}
