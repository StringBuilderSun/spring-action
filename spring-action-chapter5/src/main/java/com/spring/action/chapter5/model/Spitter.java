package com.spring.action.chapter5.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

/**
 * 实体类
 * Created by Administrator on 2018/9/10.
 */
@Setter
@Getter
@ToString
public class Spitter {
    private final Long id;
    private final String message;
    private final Date time;
    private Double lastitude;
    private Double longitude;

    public Spitter(String message, Date time) {
        this(message, time, null, null);
    }

    public Spitter(String message, Date time, Double lastitude, Double longitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.lastitude = lastitude;
        this.longitude = longitude;
    }

    //重写equals方法  认为 id 和  time 相等 两个对象即相等
    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o, "id", "time");
    }

    //计算该对象的hash数，就是相当于计算id 和 time的hash
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }
}
