package com.slb.vertigo.poc.business;

import io.vertigo.core.node.config.DefinitionProviderConfig;
import io.vertigo.core.node.config.discovery.ModuleDiscoveryFeatures;
import io.vertigo.datamodel.impl.smarttype.ModelDefinitionProvider;

public class BusinessModelFeatures extends ModuleDiscoveryFeatures<BusinessModelFeatures> {

    protected BusinessModelFeatures() {
        super("VertigoPocBusinessModule");
    }

    @Override
    protected void buildFeatures() {
        super.buildFeatures(); // découverte automatique de tous les composants
        getModuleConfigBuilder()
                .addDefinitionProvider(DefinitionProviderConfig.builder(ModelDefinitionProvider.class)
                        .addDefinitionResource("smarttypes", "com.slb.vertigo.poc.SmartTypes")
                        .addDefinitionResource("dtobjects", "com.slb.vertigo.poc.domain.DtDefinitions")

                        .build());

    }

    @Override
    protected String getPackageRoot() {
        return this.getClass().getPackage().getName();
    }
}
