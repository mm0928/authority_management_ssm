package com.mm.ssm.service;


import com.mm.ssm.domain.Permission;
import com.mm.ssm.domain.Role;

import java.util.List;

public interface IRoleService {


    List<Role> findAll() throws  Exception;

    void save(Role role);

    Role findById(String roleId) throws Exception;

    List<Permission> findOtherPermissions(String roleId) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;
}
