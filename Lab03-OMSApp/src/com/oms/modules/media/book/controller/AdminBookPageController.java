package com.oms.modules.media.book.controller;

import java.util.List;
import java.util.Map;

import com.oms.api.MediaApi;
import com.oms.bean.Book;
import com.oms.bean.Media;
import com.oms.modules.media.book.gui.BookSearchPane;
import com.oms.modules.media.book.gui.BookSinglePane;
import com.oms.modules.media.controller.AdminMediaPageController;
import com.oms.modules.media.gui.MediaSearchPane;
import com.oms.modules.media.gui.MediaSinglePane;



public class AdminBookPageController extends AdminMediaPageController{
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
	
	@Override
	public Media updateMedia(Media media) {
		return new MediaApi().updateBook((Book) media);
	}
}
