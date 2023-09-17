package com.codemantra.alttext.autoboxing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codemantra.alttext.api.model.AltText;
import com.codemantra.alttext.service.AltTextService;

public class AutoboxingThread extends Thread {
	private AltText altTextItem;
	private final Logger logger = LoggerFactory.getLogger(AutoboxingThread.class);

	public AutoboxingThread(AltText item) {
		this.altTextItem = item;
	}

	private AltTextService altTextService;

	public void run() {
		altTextService.processAltTextRegenerate(altTextItem);
	}

	public AltTextService getaltTextService() {
		return altTextService;
	}

	public void setaltTextService(AltTextService altTextService) {
		this.altTextService = altTextService;
	}

}
