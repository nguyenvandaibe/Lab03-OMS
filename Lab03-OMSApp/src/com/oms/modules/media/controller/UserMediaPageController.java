package com.oms.modules.media.controller;

import com.oms.bean.Media;
import com.oms.modules.cart.controller.CartController;
import com.oms.modules.media.gui.UserMediaListPane;

import abstractdata.ADataListPane;
import abstractdata.ADataPageController;


public abstract class UserMediaPageController extends ADataPageController<Media> {
	private CartController cartController;
	
	public UserMediaPageController() {
		super();
	}
	
	public UserMediaPageController(CartController cartController) {
		this();
		setCartController(cartController);
	}
	
	public void setCartController(CartController cartController) {
		this.cartController = cartController;
	}
	
	@Override
	public ADataListPane<Media> createListPane() {
		return new UserMediaListPane(this);
	}
	
	public void addToCart(String productId, String productTitle, float productCost, int productQuantity) {
		cartController.addToCart(productId, productTitle, productCost, productQuantity);
	}
}
