package com.harleyoconnor.dtteraforged;

import com.ferreusveritas.dynamictrees.api.registry.RegistryHandler;
import net.minecraftforge.fml.common.Mod;

@Mod(DynamicTreesTerraForged.MOD_ID)
public final class DynamicTreesTerraForged {

    public static final String MOD_ID = "dtterraforged";

    public DynamicTreesTerraForged() {
        RegistryHandler.setup(MOD_ID);
    }

}
