
package com.llionframework.security.rbac.repository.spec;

import com.llionframework.security.rbac.domain.Admin;
import com.llionframework.security.rbac.dto.AdminCondition;
import com.llionframework.security.rbac.repository.support.ImoocSpecification;
import com.llionframework.security.rbac.repository.support.QueryWraper;

/**
 *
 *
 */
public class AdminSpec extends ImoocSpecification<Admin, AdminCondition> {

	public AdminSpec(AdminCondition condition) {
		super(condition);
	}

	@Override
	protected void addCondition(QueryWraper<Admin> queryWraper) {
		addLikeCondition(queryWraper, "username");
	}

}
