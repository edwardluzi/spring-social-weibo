package org.springframework.social.weibo.api;

import java.io.Serializable;

public class Geo extends WeiboObject implements Serializable
{
    private static final long serialVersionUID = 8181764368679820465L;

    private String poiid;

    private String title;

    private String address;

    private String lon;

    private String lat;

    private String category;

    private String city;

    private String province;

    private String country;

    private String url;

    private String phone;

    private String postcode;

    private String weiboId;

    private String categorys;

    private String categoryName;

    private String icon;

    private Integer checkinNum;

    private String checkinUserNum;

    private Integer tipNum;

    private Integer photoNum;

    private Integer todoNum;

    public String getPoiid()
    {
        return poiid;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAddress()
    {
        return address;
    }

    public String getLon()
    {
        return lon;
    }

    public String getLat()
    {
        return lat;
    }

    public String getCategory()
    {
        return category;
    }

    public String getCity()
    {
        return city;
    }

    public String getProvince()
    {
        return province;
    }

    public String getCountry()
    {
        return country;
    }

    public String getUrl()
    {
        return url;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public String getWeiboId()
    {
        return weiboId;
    }

    public String getCategorys()
    {
        return categorys;
    }

    public String getCategoryName()
    {
        return categoryName;
    }

    public String getIcon()
    {
        return icon;
    }

    public Integer getCheckinNum()
    {
        return checkinNum;
    }

    public String getCheckinUserNum()
    {
        return checkinUserNum;
    }

    public Integer getTipNum()
    {
        return tipNum;
    }

    public Integer getPhotoNum()
    {
        return photoNum;
    }

    public Integer getTodoNum()
    {
        return todoNum;
    }
}