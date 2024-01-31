package com.slb.vertigo.poc;

import io.vertigo.datamodel.smarttype.annotations.Formatter;
import io.vertigo.datamodel.smarttype.annotations.SmartTypeDefinition;
import io.vertigo.datamodel.smarttype.annotations.SmartTypeProperty;
import io.vertigo.basics.formatter.FormatterDefault;

public enum SmartTypes {
    @SmartTypeDefinition(Long.class)
    @Formatter(clazz = FormatterDefault.class)
    @SmartTypeProperty(property = "storeType", value = "NUMERIC")
    Id,

    @SmartTypeDefinition(String.class)
    @Formatter(clazz = FormatterDefault.class)
    @SmartTypeProperty(property = "storeType", value = "TEXT")
    Label;
}
