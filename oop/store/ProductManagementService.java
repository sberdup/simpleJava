package com.it.berdeja.oop.store;

public interface ProductManagementService {
	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
