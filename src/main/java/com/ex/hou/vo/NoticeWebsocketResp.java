package com.ex.hou.vo;


import lombok.Data;

@Data

public class NoticeWebsocketResp<T> {


    private String noticeType;


    private T noticeInfo;

}
