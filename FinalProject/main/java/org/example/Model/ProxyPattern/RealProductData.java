package org.example.Model.ProxyPattern;

// Real product data access class
class RealProductData implements ProductDataAccess {

    @Override
    public String fetchData() {
        return "Product data from database";
    }
}