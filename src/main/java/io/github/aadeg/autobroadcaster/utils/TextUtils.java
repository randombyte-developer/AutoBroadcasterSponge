package io.github.aadeg.autobroadcaster.utils;

import de.randombyte.kosp.config.serializers.text.SimpleTextTypeSerializer;

import org.spongepowered.api.text.Text;

public class TextUtils {
    public static String serializeText(Text text){
        return SimpleTextTypeSerializer.INSTANCE.serialize(text);
    }

    public static Text deserializeText(String string, boolean parseUrl){
        return SimpleTextTypeSerializer.INSTANCE.deserialize(string);
    }

    public static Text deserializeText(String str){
        return deserializeText(str, false);
    }
}
