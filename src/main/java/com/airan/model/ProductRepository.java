package com.airan.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2019/9/3.
 */
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
}
