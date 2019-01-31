package com.tao.pojo.sys;

import java.io.Serializable;
import java.util.List;

public class GridPage implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;

    private Long total;

    private List<SimpleMap> rows;

    public GridPage() {

    }

    public GridPage(long total, List<SimpleMap> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<SimpleMap> getRows() {
        return rows;
    }

    public void setRows(List<SimpleMap> rows) {
        this.rows = rows;
    }
}