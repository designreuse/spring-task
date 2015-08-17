/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-08-17 上午11:02 创建
 */
package com.vito16.task;

import com.vito16.task.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2015/08/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class TaskExecutorTests {
    @Autowired
    private Printer printer;

    @Test
    public void testRunTask(){
        printer.printMessages();
    }

}
