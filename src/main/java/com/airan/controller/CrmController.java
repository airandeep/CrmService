package com.airan.controller;

import com.airan.model.ProductEntity;
import com.airan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.airan.pojo.*;

import java.util.List;

/**
 * Created by Administrator on 2019/1/18.
 */
@Controller
@RequestMapping("")
public class CrmController {


    @Autowired
    private ProductService productService;

    @ResponseBody
    @RequestMapping(value = "testJsonMethod",method = RequestMethod.GET,
            produces = "application/json;charset=utf-8")
    public ProductInfo list() {



//        JsonPojo jsonPojo = new JsonPojo();
//
//        jsonPojo.setName("airan");
//        jsonPojo.setId("1");
//        jsonPojo.setPwd("347254");
//        return jsonPojo;
        ProductInfo productInfo = new ProductInfo();
        productInfo.setLi(productService.reDataByPage(1,10));
        productInfo.setTotal(productService.list().size());
        return productInfo;
    }

    @ResponseBody
    @RequestMapping(value = "productInfo",method = RequestMethod.POST)
    public  ProductInfo productInfo(@RequestBody PageInfo pageInfo){

        List<ProductEntity> li = productService.reDataByPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        int total = productService.list().size();
        ProductInfo productInfo = new ProductInfo();
        productInfo.setLi(li);
        productInfo.setTotal(total);
        return  productInfo;
    }


}
