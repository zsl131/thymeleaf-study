package com.zslin.web;

/**
 * Created by 钟述林 393156105@qq.com on 2016/10/29 13:05.
 */
public class WebDto {

    private String name;

    private String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WebDto(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public WebDto() {}
}
