package com.slb.vertigo.poc.boot;

import io.vertigo.ui.impl.springmvc.config.VSpringWebConfig;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.slb.vertigo.poc.business.model.controller", "com.slb.vertigo.poc.business.model.services"})
public class VertigoPocSpringWebConfig extends VSpringWebConfig {
}
