package com.slb.vertigo.poc.mda;

import io.vertigo.core.lang.WrappedException;
import io.vertigo.studio.tools.VertigoStudioMda;

import java.net.MalformedURLException;
import java.nio.file.Paths;

public class Studio {

    public static void main(String[] args) {
        try {
            VertigoStudioMda.main(new String[] { "generate", Paths.get("studio-config.yaml").toUri().toURL().toExternalForm() });
        } catch (final MalformedURLException ex) {
            throw WrappedException.wrap(ex);
        }
    }
}
