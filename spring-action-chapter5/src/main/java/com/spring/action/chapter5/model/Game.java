package com.spring.action.chapter5.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Administrator on 2018/9/14.
 */
@Getter
@Setter
@ToString
public class Game {
    @NotNull
    @Size(max = 20, min = 8)
    private String gameId;
    @NotNull
    private String gameName;
    @NotNull
    private int gameSize;
}
