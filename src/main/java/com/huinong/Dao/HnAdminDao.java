package com.huinong.Dao;

import com.huinong.Entity.HnAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("HnAdminDao")
public interface HnAdminDao {

    HnAdmin selectByPrimaryKey(String hnAdminId);


    List<HnAdmin> findAll();
}