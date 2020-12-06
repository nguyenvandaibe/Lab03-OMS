package com.oms.modules.media.book.controller;

import java.util.List;
import java.util.Map;

import com.oms.bean.Media;
import com.oms.modules.cart.controller.CartController;
import com.oms.modules.media.book.gui.BookSearchPane;
import com.oms.modules.media.book.gui.BookSinglePane;
import com.oms.modules.media.controller.UserMediaPageController;
import com.oms.modules.media.gui.MediaSearchPane;
import com.oms.modules.media.gui.MediaSinglePane;

import api.MediaApi;


public class UserBookPageController extends UserMediaPageController{
	public UserBookPageController() {
		super();
	}
	public UserBookPageController(CartController cartController) {
		super(cartController);
	}
	@Override
	public List<? extends Media> search(Map<String, String> searchParams) {
		return new MediaApi().getBooks(searchParams);
	}
	@Override
	public MediaSinglePane createSinglePane() {
		return new BookSinglePane();
	}
	@Override
	public MediaSearchPane createSearchPane() {
		return new BookSearchPane();
	}
}
