package com.airan.service;

import com.airan.model.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/9/3.
 */
public interface ProductService {

    List<ProductEntity> reDataByPage(int page, int size);

    List<ProductEntity> list();
}
