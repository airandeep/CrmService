package com.airan.pojo;

import com.airan.model.ProductEntity;

import java.util.List;

/**
 * Created by Administrator on 2019/9/3.
 */
public class ProductInfo {
    private List<ProductEntity> li;
    private int total;

    public List<ProductEntity> getLi() {
        return li;
    }

    public void setLi(List<ProductEntity> li) {
        this.li = li;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
