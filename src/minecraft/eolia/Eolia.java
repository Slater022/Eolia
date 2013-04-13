package eolia;

import universalelectricity.prefab.network.ConnectionHandler;
import universalelectricity.prefab.network.PacketManager;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Eolia.MOD_ID, name = Eolia.NAME, version = Eolia.VERSION, dependencies = "")
@NetworkMod(channels = Eolia.CHANNEL, clientSideRequired = true, serverSideRequired = false, connectionHandler = ConnectionHandler.class, packetHandler = PacketManager.class)
public class Eolia
{
	
	// The instance of your mod that Forge uses.
	@Instance("Eolia")
	public static Eolia			instance;
	
	public static final String	MOD_ID				= "Eolia";
	public static final String	CHANNEL				= "Eolia";
	public static final String	NAME				= "Eolia";
	public static final String	FILE_PATH			= "/mods/Eolia/";
	public static final String	LANGUAGE_PATH		= FILE_PATH + "language/";
	public static final String	TEXTURE_PATH		= FILE_PATH + "textures/";
	public static final String	MODEL_PATH			= FILE_PATH + "models/";
	public static final String	GUI_PATH			= TEXTURE_PATH + "gui/";
	public static final String	BLOCK_TEXTURE_PATH	= TEXTURE_PATH + "block/";
	public static final String	ITEM_TEXTURE_PATH	= TEXTURE_PATH + "items/";
	public static final String	MODEL_TEXTURE_PATH	= TEXTURE_PATH + "model/";
	public static final String	TEXTURE_NAME_PREFIX	= "eolia:";
	private static final int	BLOCK_ID_PREFIX		= 2850;
	private static final int	ITEM_ID_PREFIX		= 24800;
	public static final int		MAJOR_VERSION		= 0;
	public static final int		MINOR_VERSION		= 2;
	public static final int		REVISION_VERSION	= 3;
	public static final String	VERSION				= MAJOR_VERSION + "." + MINOR_VERSION + "." + REVISION_VERSION;
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "eolia.client.ClientProxy", serverSide = "eolia.CommonProxy")
	public static CommonProxy	proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		// Stub Method
	}
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderers();
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		// Stub Method
	}
}
