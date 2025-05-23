package net.jk.mod.item;

import net.jk.mod.MinecraftMod;
import net.jk.mod.item.custom.ChiselItem;
import net.jk.mod.item.custom.HammerItem;
import net.jk.mod.item.custom.ModArmorItem;
import net.jk.mod.sound.ModSounds;
import net.jk.mod.util.ModTags;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftMod.MOD_ID);


    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel", () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi", () -> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI)) {
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.translatable("tooltip.minecraftmod.kohlrabi.tooltip"));
            super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        }
    });

    public static final RegistryObject<Item> AURORA_ASHES = ITEMS.register("aurora_ashes", () -> new FuelItem(new Item.Properties(), 1200));

    public static final RegistryObject<Item> ALEXANDRITE_SWORD = ITEMS.register("alexandrite_sword", () -> new SwordItem(ModToolTiers.ALEXANDRITE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ALEXANDRITE, 3, -2.4f))));
    public static final RegistryObject<Item> ALEXANDRITE_PICKAXE = ITEMS.register("alexandrite_pickaxe", () -> new PickaxeItem(ModToolTiers.ALEXANDRITE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.ALEXANDRITE, 1, -2.8f))));
    public static final RegistryObject<Item> ALEXANDRITE_SHOVEL = ITEMS.register("alexandrite_shovel", () -> new ShovelItem(ModToolTiers.ALEXANDRITE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.ALEXANDRITE, 1.5f, -3.0f))));
    public static final RegistryObject<Item> ALEXANDRITE_AXE = ITEMS.register("alexandrite_axe", () -> new AxeItem(ModToolTiers.ALEXANDRITE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.ALEXANDRITE, 6, -3.2f))));
    public static final RegistryObject<Item> ALEXANDRITE_HOE = ITEMS.register("alexandrite_hoe", () -> new HoeItem(ModToolTiers.ALEXANDRITE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.ALEXANDRITE, 0, -3.0f))));

    public static final RegistryObject<Item> ALEXANDRITE_HAMMER = ITEMS.register("alexandrite_hammer", () -> new HammerItem(ModToolTiers.ALEXANDRITE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.ALEXANDRITE, 7, -3.5f))));

    public static final RegistryObject<Item> ALEXANDRITE_HELMET = ITEMS.register("alexandrite_helmet", () -> new ModArmorItem(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final RegistryObject<Item> ALEXANDRITE_CHESTPLATE = ITEMS.register("alexandrite_chestplate", () -> new ArmorItem(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final RegistryObject<Item> ALEXANDRITE_LEGGINGS = ITEMS.register("alexandrite_leggings", () -> new ArmorItem(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final RegistryObject<Item> ALEXANDRITE_BOOTS = ITEMS.register("alexandrite_boots", () -> new ArmorItem(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));

    public static final RegistryObject<Item> ALEXANDRITE_HORSE_ARMOR = ITEMS.register("alexandrite_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> ADRITE_SMITHING_TEMPLATE = ITEMS.register("adrite_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(MinecraftMod.MOD_ID, "adrite")));

    public static final RegistryObject<Item> ADRITE_BOW = ITEMS.register("adrite_bow", () -> new BowItem(new Item.Properties().durability(500)));

    public static final RegistryObject<Item> BAR_BRAWL_MUSIC_DISC = ITEMS.register("bar_brawl_music_disc", () -> new Item( new Item.Properties().jukeboxPlayable(ModSounds.BAR_BRAWL_KEY).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
