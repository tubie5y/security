/**
 * 
 */
package com.llionframework.security.rbac.repository;

import org.springframework.stereotype.Repository;

import com.llionframework.security.rbac.domain.Resource;

/**
 * @author zhailiang
 *
 */
@Repository
public interface ResourceRepository extends ImoocRepository<Resource> {

	Resource findByName(String name);

}
