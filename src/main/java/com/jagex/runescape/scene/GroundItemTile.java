package com.jagex.runescape.scene;

import com.jagex.runescape.*;
import com.jagex.runescape.cache.Cache;
import com.jagex.runescape.cache.CacheIndex;
import com.jagex.runescape.cache.def.GameObjectDefinition;
import com.jagex.runescape.cache.def.ItemDefinition;
import com.jagex.runescape.cache.media.TypeFace;
import com.jagex.runescape.media.renderable.GameObject;
import com.jagex.runescape.media.renderable.Renderable;
import com.jagex.runescape.media.renderable.actor.Actor;
import com.jagex.runescape.media.renderable.actor.Player;
import com.jagex.runescape.scene.util.CollisionMap;

public class GroundItemTile {
    public static boolean loadGeneratedMap = false;
    public static int selectedInventorySlot = 0;
    public static int[] anIntArray1358 = new int[5];
    public static Cache aClass9_1364 = new Cache(64);
    public static byte[][] aByteArrayArray1370;
    public static int cameraHorizontal = 0;
    public static CacheIndex aCacheIndex_1375;
    public static int walkableWidgetId = -1;
    public static byte[][] aByteArrayArray1377 = new byte[1000][];
    public static int[] varbitmasks = new int[2000];

    public Renderable firstGroundItem;
    public int y;
    public int z;
    public Renderable secondGroundItem;
    public Renderable thirdGroundItem;
    public int hash;
    public int anInt1371;
    public int x;

}
