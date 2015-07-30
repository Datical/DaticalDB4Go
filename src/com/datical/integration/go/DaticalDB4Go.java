package com.datical.integration.go;

import com.thoughtworks.go.plugin.api.annotation.Extension;
import com.thoughtworks.go.plugin.api.annotation.Load;
import com.thoughtworks.go.plugin.api.annotation.UnLoad;
import com.thoughtworks.go.plugin.api.info.PluginContext;
import com.thoughtworks.go.plugin.api.info.PluginDescriptor;
import com.thoughtworks.go.plugin.api.info.PluginDescriptorAware;

import com.thoughtworks.go.plugin.api.logging.Logger;

@Extension
public class DaticalDB4Go implements PluginDescriptorAware {
	
	Logger logger;
	
	public void setPluginDescriptor(PluginDescriptor descriptor) {
	}

	@Load
	public void onLoad(PluginContext context) {
		logger.info("Plugin loaded.");
	}

	@UnLoad
	public void onUnload(PluginContext context) {
		logger.info("Plugin unloaded.");
		
	}
}
