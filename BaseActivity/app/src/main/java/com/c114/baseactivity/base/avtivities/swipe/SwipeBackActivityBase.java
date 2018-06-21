package com.c114.baseactivity.base.avtivities.swipe;

/**
 * Created by c114 on 2018/6/21.
 */

public interface SwipeBackActivityBase {
    SwipeBackLayout getSwipeBackLayout();

    void setSwipeBackEnable(boolean enable);

    /**
     * Scroll out contentView and finish the activity
     */
    void scrollToFinishActivity();

}
