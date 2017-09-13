package com.techmaster.vscraper.config;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 13/09/2017
 */
public abstract class Config {

    /**
     *
     * @return name of targeted website, such as 'vnexpress.net', 'dantri.com.vn'
     */
    public abstract String getTargetName();

    public abstract String getHomeLink();

    public abstract String getNewsLink();

    public abstract String getVideosLink();

    public abstract String getSportsLink();
}
