package cn.racyacid.goawaydfu.mixin;

import cn.racyacid.goawaydfu.GoAwayDFU;
import com.mojang.datafixers.DataFixer;
import net.minecraft.datafixer.Schemas;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Schemas.class)
public abstract class SchemasMixin {
	@Inject(method = "create", at = @At("HEAD"), cancellable = true)
	private static void howAboutTheFakeOne(CallbackInfoReturnable<DataFixer> cir) {
		cir.setReturnValue(GoAwayDFU.FAKE_DATA_FIXER);
	}
}