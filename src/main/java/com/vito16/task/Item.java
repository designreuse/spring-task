/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-08-17 上午11:48 创建
 */
package com.vito16.task;

import com.yjf.common.util.ToString;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2015/08/17
 */
public class Item {
    private String currentInt;

    public String getCurrentInt() {
        return currentInt;
    }

    public void setCurrentInt(String currentInt) {
        this.currentInt = currentInt;
    }

    @Override
    public String toString() {
        return ToString.toString(this);
    }
}
