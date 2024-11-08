package org.example.Model.ProxyPattern;

// Proxy with caching mechanism
public class ProductDataProxy implements ProductDataAccess {
    private RealProductData realData;
    private String cachedData;

    @Override
    public String fetchData() {
        if (cachedData == null) {
            realData = new RealProductData();
            cachedData = realData.fetchData();
        }
        return cachedData;
    }
}
