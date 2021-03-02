package com.huinong.Controller;

import com.huinong.Entity.HnAdmin;
import com.huinong.Service.HnAdminService;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/HnAdmin")
public class ViewController {

    private Logger logger = Logger.getLogger(ViewController.class);
    @Resource(name = "HnAdminService")
    private HnAdminService hnAdminService;

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){
        List<HnAdmin> hnAdmins = hnAdminService.findAll();
        return JSON.toJSONString(hnAdmins);
    }
}
