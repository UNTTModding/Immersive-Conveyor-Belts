package com.untt.icb.init;

import com.untt.icb.block.BlockBridge;
import com.untt.icb.block.BlockConveyor;
import com.untt.icb.block.BlockConveyorDetector;
import com.untt.icb.block.BlockFilter;
import com.untt.icb.reference.Names;
import com.untt.icb.registry.BlockRegistry;
import net.minecraft.block.Block;

public class ICBBlocks
{
    public static Block BRIDGE;

    public static Block CONVEYOR;
    public static Block CONVEYOR_DETECTOR;

    public static Block FILTER;

    public static void preInit()
    {
        BRIDGE = BlockRegistry.registerBlock(new BlockBridge(Names.Blocks.BRIDGE));

        CONVEYOR = BlockRegistry.registerBlock(new BlockConveyor(Names.Blocks.CONVEYOR));
        CONVEYOR_DETECTOR = BlockRegistry.registerBlock(new BlockConveyorDetector(Names.Blocks.CONVEYOR_DETECTOR));

        FILTER = BlockRegistry.registerBlock(new BlockFilter(Names.Blocks.FILTER));
    }
}