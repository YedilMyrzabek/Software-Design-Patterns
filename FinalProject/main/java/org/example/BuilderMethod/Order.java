package org.example.BuilderMethod;

// Order class with builder for flexible creation
class Order {
    private String product;
    private int quantity;
    private String paymentMethod;

    private Order(OrderBuilder builder) {
        this.product = builder.product;
        this.quantity = builder.quantity;
        this.paymentMethod = builder.paymentMethod;
    }

    public static class OrderBuilder {
        private String product;
        private int quantity;
        private String paymentMethod;

        public OrderBuilder setProduct(String product) {
            this.product = product;
            return this;
        }

        public OrderBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public OrderBuilder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}