/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-08-17 上午11:45 创建
 */
package com.vito16.task.service;

import java.util.List;

import com.vito16.task.Item;

/**
 * 文件导出服务
 *
 * @author 木鱼 muyu@yiji.com
 * @version 2015/08/17
 */
public interface FileExportService {

    /**
     * 获取数据列表
     * @return
     */
    List<Item> readList();

    /**
     * 将数据列表写入Excel文件
     * @param itemList 待写入数据
     */
    void exportExcel(List<Item> itemList);
}
