/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-08-17 上午11:46 创建
 */
package com.vito16.task.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.vito16.task.Item;
import com.vito16.task.service.FileExportService;
import com.yjf.common.log.Logger;
import com.yjf.common.log.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2015/08/17
 */
@Service
public class FileExportServiceImpl implements FileExportService {
    private static final Logger logger = LoggerFactory.getLogger(FileExportServiceImpl.class);

    @Override
    public List<Item> readList() {
        List<Item> itemList = new ArrayList<>();
        for(int i = 1;i<=500;i++){
            Item item = new Item();
            item.setCurrentInt(String.valueOf(i));
            itemList.add(item);
        }
        return itemList;
    }

    @Override
    public void exportExcel(List<Item> itemList) {
        //TODO 文件写入
        Assert.notNull(itemList,"传入列表数据不能为空.");
        for(Item item:itemList){
            logger.info("item:{}",item);
        }
    }
}
