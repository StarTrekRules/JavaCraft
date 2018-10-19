package com.trf.javacraft.blocks;

import com.trf.javacraft.computers.Computer;
import com.trf.javacraft.computers.Registry;
import com.trf.javacraft.gui.ComGui;

import bsh.EvalError;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ComBlock extends BaseBlock {

	boolean act = false;
	
	public Computer ThisCom = null;
	
	@Override
	public boolean onBlockActivated(World w, BlockPos p, IBlockState st, EntityPlayer plr, EnumHand e, EnumFacing ef, float f, float f2, float f3)
	{
		Computer c;
		
		c = new Computer();
		c.ThisGui = new ComGui(c);	
		
		Registry.AddComputer(c);
		
		Minecraft.getMinecraft().displayGuiScreen(c.ThisGui);
		ThisCom = c;
		
		return true;
	}
	
	public ComBlock(String n, Material m)
	{
		super(n, m);
	}
	
}
