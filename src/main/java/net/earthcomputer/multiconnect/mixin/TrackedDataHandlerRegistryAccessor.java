package net.earthcomputer.multiconnect.mixin;

import net.earthcomputer.multiconnect.impl.MixinHelper;
import net.minecraft.entity.data.TrackedDataHandler;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.util.Int2ObjectBiMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(TrackedDataHandlerRegistry.class)
public interface TrackedDataHandlerRegistryAccessor {

    @Accessor("field_13328")
    static Int2ObjectBiMap<TrackedDataHandler<?>> getHandlers() {
        return MixinHelper.fakeInstance();
    }

}
