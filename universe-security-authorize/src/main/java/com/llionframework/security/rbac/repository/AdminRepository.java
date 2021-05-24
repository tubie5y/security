
package com.llionframework.security.rbac.repository;

import org.springframework.stereotype.Repository;

import com.llionframework.security.rbac.domain.Admin;

/**
 *
 *
 */
@Repository
public interface AdminRepository extends ImoocRepository<Admin> {

	Admin findByUsername(String username);

}
