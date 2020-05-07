package com.zz.select;

import com.zz.common.vo.PageObject;
import com.zz.pojo.SYQ_heartbeat;
import com.zz.service.SysBaoWenService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class SelectBaoWen {

    @Resource
    private SysBaoWenService sysBaoWenService;

    @Test
    public void selectBaoWen() {
        //   PageObject<SYQ_heartbeat> pageObject = sysBaoWenService.SysSelectBaoWenService(1);
        //  System.out.println(pageObject);
    }
}
