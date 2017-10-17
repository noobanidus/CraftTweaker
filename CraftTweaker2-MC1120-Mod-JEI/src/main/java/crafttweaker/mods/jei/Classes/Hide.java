package crafttweaker.mods.jei.Classes;

import static crafttweaker.api.minecraft.CraftTweakerMC.getItemStack;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import crafttweaker.mods.jei.JEIAddonPlugin;
import net.minecraft.item.ItemStack;

public class Hide implements IAction {
    
    private final IItemStack stack;
    
    public Hide(IItemStack stack) {
        this.stack = stack;
    }
    

    @Override
    public void apply() {
        if(stack == null){
            CraftTweakerAPI.logError("Cannot hide null item!");
            return;
        }
        
        
        ItemStack IStack = getItemStack(stack);
        JEIAddonPlugin.itemRegistry.removeIngredientsAtRuntime(ItemStack.class, JEIAddonPlugin.getSubTypes(IStack));

    }
    
    @Override
    public String describe() {
        return "Hiding item in JEI: " + stack;
    }
    
}
