package io.github.portlek.mcjson.base.feature;

import io.github.portlek.mcjson.api.JsonFeatureEnvelope;

public final class ObfuscatedFeature extends JsonFeatureEnvelope {

    public ObfuscatedFeature(boolean obfuscated) {
        super("obfuscated", "\"" + obfuscated + "\"");
    }

}
