package com.tao.pojo.sys;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.HashMap;

/**
 * 自定义Map
 */
public class SimpleMap extends HashMap<String, Object> implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;

    public Integer getInteger(String key) {
        if(containsKey(key)) {
            return Integer.parseInt(get(key).toString());
        }else{
            return null;
        }
    }

    public Integer removeInteger(String key) {
        if(containsKey(key)) {
            return Integer.parseInt(remove(key).toString());
        }else{
            return null;
        }
    }

    public Long getLong(String key) {
        if(containsKey(key)) {
            return Long.parseLong(get(key).toString());
        }else{
            return null;
        }
    }

    public Long removeLong(String key) {
        if(containsKey(key)) {
            return Long.parseLong(remove(key).toString());
        }else{
            return null;
        }
    }

    public BigDecimal getBigDecimal(String key) {
        if(containsKey(key)) {
            return new BigDecimal(get(key).toString());
        }else{
            return null;
        }
    }

    public BigDecimal removeBigDecimal(String key) {
        if(containsKey(key)) {
            return new BigDecimal(remove(key).toString());
        }else{
            return null;
        }
    }

    public String getString(String key) {
        if(containsKey(key)) {
            return get(key).toString();
        }else{
            return null;
        }
    }

    public String getBlob(String key) {
        if(containsKey(key) && get(key) != null) {
            try {
                return new String((byte[])get(key),"utf-8");
            } catch (UnsupportedEncodingException e) {
                return null;
            }
        }else{
            return null;
        }
    }

    public String removeString(String key) {
        if(containsKey(key)) {
            return remove(key).toString();
        }else{
            return null;
        }
    }

    public Integer getPageNum() {
        Object value = get("page");
        if(value == null) {
            return 1;
        }
        Integer page = Integer.parseInt(value.toString());
        if(page < 1) {
            return 1;
        }else{
            return page;
        }
    }

    public Integer getPageSize() {
        Object value = get("rows");
        if(value == null) {
            return 15;
        }
        Integer size = Integer.parseInt(value.toString());
        if(size > 200) {
            return 200;
        }else{
            return size;
        }
    }

}
