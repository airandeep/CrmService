package com.airan.service.impl;

import com.airan.model.ProductEntity;
import com.airan.model.ProductRepository;
import com.airan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/9/3.
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductEntity> reDataByPage(int page, int size) {
        PageRequest pageRequest = new PageRequest(page-1,size);
        return productRepository.findAll(pageRequest).getContent();
    }

    @Override
    public List<ProductEntity> list() {
        return productRepository.findAll();
    }
}
