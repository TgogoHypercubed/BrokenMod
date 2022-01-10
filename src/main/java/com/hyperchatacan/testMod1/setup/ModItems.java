package com.hyperchatacan.testMod1.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> TEST_ITEM_1 = Registration.ITEMS.register("test_item_1", () ->
        new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS))); //VIDEO REFRENCE NOTES .group instead of .tab, and has ItemGroup.MATERIALS, not CreativeModeTab.TAB_MATERIALS

    static void register(){}

}
