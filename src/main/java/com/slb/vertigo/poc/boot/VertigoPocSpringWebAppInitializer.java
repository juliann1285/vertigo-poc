package com.slb.vertigo.poc.boot;

import io.vertigo.ui.impl.springmvc.config.AbstractVSpringMvcWebApplicationInitializer;

public class VertigoPocSpringWebAppInitializer extends AbstractVSpringMvcWebApplicationInitializer {
	
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {VertigoPocSpringWebConfig.class};
    }
}
