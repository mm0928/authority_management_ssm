package com.mm.ssm.service.Impl;

import com.mm.ssm.dao.ISysLogDao;
import com.mm.ssm.domain.SysLog;
import com.mm.ssm.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class SysLogServiceImpl implements ISysLogService {

    @Autowired
    private ISysLogDao sysLogDao;


    @Override
    public void save(SysLog sysLog) throws Exception {

    }

    @Override
    public List<SysLog> findAll() throws Exception{
        return sysLogDao.findAll();
    }
}
