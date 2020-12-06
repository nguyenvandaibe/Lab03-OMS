package com.oms.app.user;

import javax.swing.JPanel;

import com.oms.modules.cart.controller.CartController;

import com.oms.modules.media.book.controller.UserBookPageController;

//import cart.CartController;



public class OMSUserController {
	private CartController cartController;
	
	public OMSUserController() {
		cartController = new CartController();
	}
	
	public JPanel getCartPane() {
		return cartController.getCartPane();
	}
	
	public JPanel getBookPage() {
		UserBookPageController controller = new UserBookPageController();
		controller.setCartController(cartController);
		return controller.getDataPagePane();
	}
}
