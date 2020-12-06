package com.oms.modules.media.controller;

import com.oms.bean.Media;
import com.oms.modules.abtractdata.controller.ADataPageController;
import com.oms.modules.abtractdata.gui.ADataListPane;
import com.oms.modules.media.gui.AdminMediaListPane;

public abstract class AdminMediaPageController extends ADataPageController<Media> {
	public AdminMediaPageController() {
		super();
	}
	
	@Override
	public ADataListPane<Media> createListPane() {
		return new AdminMediaListPane(this);
	}
	
	public abstract Media updateMedia(Media media);
	
}

