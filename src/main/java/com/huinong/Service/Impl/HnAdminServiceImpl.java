package com.huinong.Service.Impl;

import com.huinong.Dao.HnAdminDao;
import com.huinong.Entity.HnAdmin;
import com.huinong.Service.HnAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("HnAdminService")
public class HnAdminServiceImpl implements HnAdminService {

    @Resource(name = "HnAdminDao")
    private HnAdminDao hnAdminDao;

    @Override
    public List<HnAdmin> findAll() {
        return hnAdminDao.findAll();
    }
}
