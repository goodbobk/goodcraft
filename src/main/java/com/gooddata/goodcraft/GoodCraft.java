package com.gooddata.goodcraft;

import com.gooddata.goodcraft.colors.*;
import com.gooddata.goodcraft.font.*;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7

@Mod(modid=GoodCraft.MOD_ID, name=GoodCraft.MOD_NAME, version=GoodCraft.MOD_VERSION)

public class GoodCraft {

    static public final String MOD_ID = "goodcraft";
    static final String MOD_NAME = "GoodCraft";
    static final String MOD_VERSION = "0.0.1-alpha";

    static MasterBlock masterBlock;
    static ProjectBlock projectBlock;
    static ReportBlock reportBlock;
    static ChartBlock chartBlock;

    static final int TYPE_LEN = 30;

    static final ExecutorService executors = Executors.newFixedThreadPool(10);

    static String username;
    static String password;

    @Instance(value = GoodCraft.MOD_ID)
    public static GoodCraft instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="com.gooddata.goodcraft.client.ClientProxy", serverSide="com.gooddata.goodcraft.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event) {

        makeFont();
        makeColors();

        masterBlock = new MasterBlock();
        GameRegistry.registerBlock(masterBlock, MasterBlock.BLOCK_NAME);
        projectBlock = new ProjectBlock();
        GameRegistry.registerBlock(projectBlock, ProjectBlock.BLOCK_NAME);
        reportBlock = new ReportBlock();
        GameRegistry.registerBlock(reportBlock, ReportBlock.BLOCK_NAME);
        chartBlock = new ChartBlock();
        GameRegistry.registerBlock(chartBlock, ChartBlock.BLOCK_NAME);


        GameRegistry.addRecipe(new ItemStack(masterBlock),
                "x", "y",
                'x', Blocks.sand, 'y', Blocks.planks);
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event) {

        proxy.registerRenderers();

        GameRegistry.registerTileEntity(MasterTileEntity.class, MasterTileEntity.id);
        GameRegistry.registerTileEntity(ProjectTileEntity.class, ProjectTileEntity.id);
        GameRegistry.registerTileEntity(ReportTileEntity.class, ReportTileEntity.id);
        GameRegistry.registerTileEntity(ChartTileEntity.class, ChartTileEntity.id);

        FMLCommonHandler.instance().bus().register(new Ticker());

        try {
            // I really hope our security architect will never see this
            String filename = System.getProperty("user.home") + "/.goodcraft.creds";
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            username = reader.readLine();
            password = reader.readLine();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            // oh noes.
        }
        System.out.println("GoodCraft Loaded");
    }

    @EventHandler()
    public void serverStarting(FMLServerStartingEvent event){
    }

    static final HashMap<String, Block> colors = new HashMap<String, Block>();

    static void makeColors() {
        colors.put("000000", new ColorBlock_000000());
        colors.put("000055", new ColorBlock_000055());
        colors.put("0000aa", new ColorBlock_0000aa());
        colors.put("0000ff", new ColorBlock_0000ff());
        colors.put("005500", new ColorBlock_005500());
        colors.put("005555", new ColorBlock_005555());
        colors.put("0055aa", new ColorBlock_0055aa());
        colors.put("0055ff", new ColorBlock_0055ff());
        colors.put("00aa00", new ColorBlock_00aa00());
        colors.put("00aa55", new ColorBlock_00aa55());
        colors.put("00aaaa", new ColorBlock_00aaaa());
        colors.put("00aaff", new ColorBlock_00aaff());
        colors.put("00ff00", new ColorBlock_00ff00());
        colors.put("00ff55", new ColorBlock_00ff55());
        colors.put("00ffaa", new ColorBlock_00ffaa());
        colors.put("00ffff", new ColorBlock_00ffff());
        colors.put("550000", new ColorBlock_550000());
        colors.put("550055", new ColorBlock_550055());
        colors.put("5500aa", new ColorBlock_5500aa());
        colors.put("5500ff", new ColorBlock_5500ff());
        colors.put("555500", new ColorBlock_555500());
        colors.put("555555", new ColorBlock_555555());
        colors.put("5555aa", new ColorBlock_5555aa());
        colors.put("5555ff", new ColorBlock_5555ff());
        colors.put("55aa00", new ColorBlock_55aa00());
        colors.put("55aa55", new ColorBlock_55aa55());
        colors.put("55aaaa", new ColorBlock_55aaaa());
        colors.put("55aaff", new ColorBlock_55aaff());
        colors.put("55ff00", new ColorBlock_55ff00());
        colors.put("55ff55", new ColorBlock_55ff55());
        colors.put("55ffaa", new ColorBlock_55ffaa());
        colors.put("55ffff", new ColorBlock_55ffff());
        colors.put("aa0000", new ColorBlock_aa0000());
        colors.put("aa0055", new ColorBlock_aa0055());
        colors.put("aa00aa", new ColorBlock_aa00aa());
        colors.put("aa00ff", new ColorBlock_aa00ff());
        colors.put("aa5500", new ColorBlock_aa5500());
        colors.put("aa5555", new ColorBlock_aa5555());
        colors.put("aa55aa", new ColorBlock_aa55aa());
        colors.put("aa55ff", new ColorBlock_aa55ff());
        colors.put("aaaa00", new ColorBlock_aaaa00());
        colors.put("aaaa55", new ColorBlock_aaaa55());
        colors.put("aaaaaa", new ColorBlock_aaaaaa());
        colors.put("aaaaff", new ColorBlock_aaaaff());
        colors.put("aaff00", new ColorBlock_aaff00());
        colors.put("aaff55", new ColorBlock_aaff55());
        colors.put("aaffaa", new ColorBlock_aaffaa());
        colors.put("aaffff", new ColorBlock_aaffff());
        colors.put("ff0000", new ColorBlock_ff0000());
        colors.put("ff0055", new ColorBlock_ff0055());
        colors.put("ff00aa", new ColorBlock_ff00aa());
        colors.put("ff00ff", new ColorBlock_ff00ff());
        colors.put("ff5500", new ColorBlock_ff5500());
        colors.put("ff5555", new ColorBlock_ff5555());
        colors.put("ff55aa", new ColorBlock_ff55aa());
        colors.put("ff55ff", new ColorBlock_ff55ff());
        colors.put("ffaa00", new ColorBlock_ffaa00());
        colors.put("ffaa55", new ColorBlock_ffaa55());
        colors.put("ffaaaa", new ColorBlock_ffaaaa());
        colors.put("ffaaff", new ColorBlock_ffaaff());
        colors.put("ffff00", new ColorBlock_ffff00());
        colors.put("ffff55", new ColorBlock_ffff55());
        colors.put("ffffaa", new ColorBlock_ffffaa());
        colors.put("ffffff", new ColorBlock_ffffff());
    }

    static final Block[] font = new Block[128];

    static void makeFont() {
        font['0'] = new FontBlock_0();
        font['1'] = new FontBlock_1();
        font['2'] = new FontBlock_2();
        font['3'] = new FontBlock_3();
        font['4'] = new FontBlock_4();
        font['5'] = new FontBlock_5();
        font['6'] = new FontBlock_6();
        font['7'] = new FontBlock_7();
        font['8'] = new FontBlock_8();
        font['9'] = new FontBlock_9();
        font['a'] = new FontBlock_a();
        font['b'] = new FontBlock_b();
        font['c'] = new FontBlock_c();
        font['d'] = new FontBlock_d();
        font['e'] = new FontBlock_e();
        font['f'] = new FontBlock_f();
        font['g'] = new FontBlock_g();
        font['h'] = new FontBlock_h();
        font['i'] = new FontBlock_i();
        font['j'] = new FontBlock_j();
        font['k'] = new FontBlock_k();
        font['l'] = new FontBlock_l();
        font['m'] = new FontBlock_m();
        font['n'] = new FontBlock_n();
        font['o'] = new FontBlock_o();
        font['p'] = new FontBlock_p();
        font['q'] = new FontBlock_q();
        font['r'] = new FontBlock_r();
        font['s'] = new FontBlock_s();
        font['t'] = new FontBlock_t();
        font['u'] = new FontBlock_u();
        font['v'] = new FontBlock_v();
        font['w'] = new FontBlock_w();
        font['x'] = new FontBlock_x();
        font['y'] = new FontBlock_y();
        font['z'] = new FontBlock_z();
        font['?'] = new FontBlock_wtf();
        font[' '] = Blocks.air;


//        for (FontBlock b: font) {
//            if (b != null) {
//                GameRegistry.registerBlock(b, "letterblock-" + b.letter);
//            }
//        }

    }
    public static boolean glyphExists(char c) {
        return c==' '
                || (c>='a' && c<='z')
                || (c>='0' && c<='9');
    }

    public static Block getGlyph(char c) {
        if (glyphExists(c)) {
            return font[c];
        }
        else {
            return font['?'];
        }
    }

    public static void type(World world, int distance, ViewDirection vd, String text) {
        text = text.toLowerCase();
        text = (text + "                                 ").substring(0,30);
        int textLength = text.length();

        for (int i = 0; i < textLength; i++) {
            world.setBlock(vd.x(distance, i), vd.y(), vd.z(distance, i),
                    getGlyph(text.charAt(i)));
        }
    }
}