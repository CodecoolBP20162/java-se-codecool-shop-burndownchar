package com.codecool.shop.dao.implementation;

import com.codecool.shop.dao.ProductCategoryDao;
import com.codecool.shop.dao.ProductDao;
import com.codecool.shop.dao.SupplierDao;


public class DaoFactory {

    private static String state="sql";

    public static void setState(String input_state){
        state=input_state;
    }

    public static ProductDao createProductDao(){
        if(state.equals("memory")) return ProductDaoMem.getInstance();
        else return ProductDaoJdbc.getInstance();
    }

    public static SupplierDao createSupplierDao(){
        if(state.equals("memory")) return SupplierDaoMem.getInstance();
        else return SupplierDaoJdbc.getInstance();
    }

    public static ProductCategoryDao createProductCategoryDao(){
        if(state.equals("memory")) return ProductCategoryDaoMem.getInstance();
        else return ProductCategoryDaoJdbc.getInstance();
    }


}
