package com.mm.ssm.service.Impl;

import com.mm.ssm.dao.IPermissionDao;
import com.mm.ssm.domain.Permission;

import com.mm.ssm.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IPermissionServiceImpl implements IPermissionService {


    @Autowired
    private IPermissionDao permissionDao;

    @Override
    public List<Permission> findAll() throws Exception {

        return permissionDao.findAll();
    }

    @Override
    public void save(Permission permission) throws Exception{
        permissionDao.save(permission);
    }
}
