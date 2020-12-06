package com.oms.modules.media.book.gui;

import com.oms.bean.Media;
import com.oms.modules.media.gui.PhysicalMediaSinglePane;

@SuppressWarnings("serial")
public class BookSinglePane extends PhysicalMediaSinglePane {
	
	public BookSinglePane() {
		super();
	}
	
	public BookSinglePane(Media media) {
		this();
		this.t = media;

		displayData();
	}
}
