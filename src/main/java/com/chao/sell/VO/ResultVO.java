package com.chao.sell.VO;

import lombok.Data;

/**
 * http请求返回的数据的最外层
 */
@Data
public class ResultVO<T> {
    /**错误码*/
    private Integer code;
    /**提示信息*/
    private String msg;
    /**数据*/
    private T data;
}
