package com.blindley.slowcraft.item;

import com.blindley.slowcraft.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SLOWCRAFT_TAB = new CreativeModeTab("slowcrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.SLOW_CRAFTING_TABLE.get());
        }
    };
}
