package cn.racyacid.goawaydfu.mixin;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.Type;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Util.class)
public abstract class UtilMixin {
    @Inject(method = "getChoiceTypeInternal", at = @At("HEAD"), cancellable = true)
    private static void takeMyNull(DSL.TypeReference typeReference, String id, CallbackInfoReturnable<Type<?>> cir) {
        cir.setReturnValue(null);
    }
}