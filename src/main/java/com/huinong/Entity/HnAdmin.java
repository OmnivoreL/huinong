package com.huinong.Entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * hn_admin
 * @author 
 */
@Data
public class HnAdmin implements Serializable {
    private String hnAdminId;

    private String hnAdminPwd;


    public String getHnAdminId() {
        return hnAdminId;
    }

    public String getHnAdminPwd() {
        return hnAdminPwd;
    }

    public Date getHnAdminLastlogin() {
        return hnAdminLastlogin;
    }

    /**
     * 上次登录时间
     */
    private Date hnAdminLastlogin;

    private static final long serialVersionUID = 1L;
}