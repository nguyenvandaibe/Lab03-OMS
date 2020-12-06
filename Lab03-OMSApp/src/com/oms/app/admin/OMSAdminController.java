package com.oms.app.admin;

import javax.swing.JPanel;

import com.oms.bean.Media;
import com.oms.modules.abtractdata.controller.ADataPageController;
import com.oms.modules.media.book.controller.AdminBookPageController;

public class OMSAdminController {
	public OMSAdminController() {
	}
	
	public JPanel getBookPage() {
		ADataPageController<Media> controller = new AdminBookPageController();
		return controller.getDataPagePane();
	}
}
