package com.spring.action.chapter5.facade;

import com.spring.action.chapter5.model.Spitter;

import java.util.List;

/**
 * 数据仓储接口
 * Created by Administrator on 2018/9/10.
 */
public interface SpitterRepository {
    /**
     * 获取Spitters中ID 小于max的 count 个 数据
     *
     * @param max
     * @param count
     * @return
     */
    List<Spitter> findSpitters(long max, int count);

    /**
     * 注册用户
     *
     * @param spitter
     * @return
     */
    Spitter saveSpitter(Spitter spitter);

    /**
     * 查找用户
     * @param id
     * @return
     */
    Spitter findSpitter(String message);
}
