package com.jagex.runescape;

import com.jagex.runescape.cache.def.*;
import com.jagex.runescape.cache.media.IndexedImage;
import com.jagex.runescape.cache.media.TypeFace;
import com.jagex.runescape.media.renderable.GameObject;
import com.jagex.runescape.media.renderable.Model;
import com.jagex.runescape.media.renderable.Renderable;
import com.jagex.runescape.media.renderable.actor.Actor;
import com.jagex.runescape.media.renderable.actor.Npc;
import com.jagex.runescape.media.renderable.actor.Player;

import java.awt.*;

public class Class53 {
    public static RSString aClass1_1243 = RSString.CreateString("@whi@ )4 ");
    public static int anInt1245;
    public static RSString aClass1_1246;
    public static Cache aClass9_1247;
    public static int anInt1248;
    public static int anInt1250;
    public static RSString aClass1_1251;
    public static RSString aClass1_1255;
    public static int anInt1256;
    public static int anInt1257 = 0;
    public static int anInt1258;
    public static RSString aClass1_1259;
    public static RSString aClass1_1260;
    public static RSString aClass1_1263;
    public static Cache aClass9_1264;
    public static RSString aClass1_1265;
    public static RSString aClass1_1266;
    public static long[] aLongArray1267;
    public static TypeFace fontNormal;
    public static RSString aClass1_1269;
    public static IndexedImage aClass40_Sub5_Sub14_Sub2_1270;

    static {
        aClass1_1246 = RSString.CreateString(" hat sich ausgeloggt)3");
        aClass1_1260 = RSString.CreateString("go back to the main RuneScape webpage");
        aClass1_1263 = RSString.CreateString("nicht hergestellt werden)3");
        aClass1_1255 = RSString.CreateString("and choose the (Wcreate account(W");
        aClass1_1259 = aClass1_1260;
        aClass1_1251 = aClass1_1255;
        aClass9_1247 = new Cache(64);
        aClass9_1264 = new Cache(50);
        aClass1_1266 = RSString.CreateString("backright2");
        aLongArray1267 = new long[100];
        aClass1_1265 = RSString.CreateString("auf einer freien Welt zu spielen)3");
        aClass1_1269 = (RSString.CreateString("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>"));
    }

    public int anInt1242;
    public int anInt1244;
    public Renderable aRenderable_1249;
    public int anInt1252;
    public int anInt1253 = 0;
    public int anInt1254;
    public int anInt1261;
    public int anInt1262 = 0;

    public static void method949(byte arg0) {
        anInt1256++;
        if((Class57.incomingPacket ^ 0xffffffff) == -50) {
            int i = Cache.outgoingbuffer.getUnsignedNegativeOffsetByte();
            int i_0_ = OverlayDefinition.anInt2318 + (i & 0x7);
            int i_1_ = ((0x7b & i) >> 4) + Class40_Sub6.anInt2119;
            int i_2_ = Cache.outgoingbuffer.getUnsignedNegativeOffsetByte();
            int i_3_ = i_2_ >> 2;
            int i_4_ = 0x3 & i_2_;
            int i_5_ = Npc.anIntArray3304[i_3_];
            int i_6_ = Cache.outgoingbuffer.getUnsignedNegativeOffsetShortLE();
            if(i_1_ >= 0 && (i_0_ ^ 0xffffffff) <= -1 && (i_1_ ^ 0xffffffff) > -104 && (i_0_ ^ 0xffffffff) > -104) {
                int i_7_ = (Class40_Sub6.tile_height[Player.anInt3267][i_1_][i_0_]);
                int i_8_ = (Class40_Sub6.tile_height[Player.anInt3267][i_1_ + 1][i_0_]);
                int i_9_ = (Class40_Sub6.tile_height[Player.anInt3267][1 + i_1_][1 + i_0_]);
                int i_10_ = (Class40_Sub6.tile_height[Player.anInt3267][i_1_][i_0_ + 1]);
                if(i_5_ == 0) {
                    Class10 class10 = (Npc.aScene_3301.method126(Player.anInt3267, i_1_, i_0_));
                    if(class10 != null) {
                        int i_11_ = 0x7fff & class10.anInt336 >> 14;
                        if((i_3_ ^ 0xffffffff) == -3) {
                            class10.aRenderable_341 = new GameObject(i_11_, 2, 4 + i_4_, i_7_, i_8_, i_9_, i_10_, i_6_, false);
                            class10.aRenderable_340 = new GameObject(i_11_, 2, 0x3 & i_4_ + 1, i_7_, i_8_, i_9_, i_10_, i_6_, false);
                        } else
                            class10.aRenderable_341 = new GameObject(i_11_, i_3_, i_4_, i_7_, i_8_, i_9_, i_10_, i_6_, false);
                    }
                }
                if((i_5_ ^ 0xffffffff) == -2) {
                    Class53 class53 = (Npc.aScene_3301.method100(Player.anInt3267, i_1_, i_0_));
                    if(class53 != null)
                        class53.aRenderable_1249 = (new GameObject((0x1fffe268 & class53.anInt1262) >> 14, 4, 0, i_7_, i_8_, i_9_, i_10_, i_6_, false));
                }
                if((i_5_ ^ 0xffffffff) == -3) {
                    Class19 class19 = (Npc.aScene_3301.method107(Player.anInt3267, i_1_, i_0_));
                    if(i_3_ == 11)
                        i_3_ = 10;
                    if(class19 != null)
                        class19.aRenderable_474 = new GameObject(((class19.anInt469 >> 14) & 0x7fff), i_3_, i_4_, i_7_, i_8_, i_9_, i_10_, i_6_, false);
                }
                if(i_5_ == 3) {
                    FloorDecoration floorDecoration = (Npc.aScene_3301.getFloorDecoration(Player.anInt3267, i_1_, i_0_));
                    if(floorDecoration != null)
                        floorDecoration.renderable = new GameObject((0x7fff & (floorDecoration.hash >> 14)), 22, i_4_, i_7_, i_8_, i_9_, i_10_, i_6_, false);
                }
            }
        } else if((Class57.incomingPacket ^ 0xffffffff) == -242) {
            int i = Cache.outgoingbuffer.getUnsignedInvertedByte();
            int i_12_ = i & 0x3;
            int i_13_ = i >> 2;
            int i_14_ = Npc.anIntArray3304[i_13_];
            int i_15_ = Cache.outgoingbuffer.getUnsignedShortBE();
            int i_16_ = Cache.outgoingbuffer.getUnsignedNegativeOffsetByte();
            int i_17_ = (0x7 & i_16_) + OverlayDefinition.anInt2318;
            int i_18_ = Class40_Sub6.anInt2119 + ((i_16_ & 0x75) >> 4);
            if((i_18_ ^ 0xffffffff) <= -1 && i_17_ >= 0 && i_18_ < 104 && (i_17_ ^ 0xffffffff) > -105)
                GameObjectDefinition.method609(i_15_, true, i_18_, i_12_, -1, (Player.anInt3267), i_17_, i_14_, i_13_, 0);
        } else {
            if((Class57.incomingPacket ^ 0xffffffff) == -10) {
                int i = Cache.outgoingbuffer.getUnsignedByte();
                int i_19_ = (i & 0x7) + OverlayDefinition.anInt2318;
                int i_20_ = (0x7 & i >> 4) + Class40_Sub6.anInt2119;
                int i_21_ = Cache.outgoingbuffer.getUnsignedShortBE();
                int i_22_ = Cache.outgoingbuffer.getUnsignedByte();
                int i_23_ = i_22_ >> 4 & 0xf;
                int i_24_ = 0x7 & i_22_;
                int i_25_ = Cache.outgoingbuffer.getUnsignedByte();
                if(i_20_ >= 0 && i_19_ >= 0 && i_20_ < 104 && i_19_ < 104) {
                    int i_26_ = 1 + i_23_;
                    if(((i_20_ + -i_26_ ^ 0xffffffff) >= ((Player.localPlayer.anIntArray3088[0]) ^ 0xffffffff)) && ((i_20_ + i_26_ ^ 0xffffffff) <= ((Player.localPlayer.anIntArray3088[0]) ^ 0xffffffff)) && (i_19_ - i_26_ <= (Player.localPlayer.anIntArray3135[0])) && (i_19_ + i_26_ >= (Player.localPlayer.anIntArray3135[0])) && RSCanvas.anInt65 != 0 && i_24_ > 0 && PacketBuffer.anInt2248 < 50) {
                        IdentityKit.anIntArray2602[(PacketBuffer.anInt2248)] = i_21_;
                        ItemDefinition.anIntArray2814[(PacketBuffer.anInt2248)] = i_24_;
                        Class40_Sub3.anIntArray2023[(PacketBuffer.anInt2248)] = i_25_;
                        PacketBuffer.effects[(PacketBuffer.anInt2248)] = null;
                        Class38_Sub1.anIntArray1916[(PacketBuffer.anInt2248)] = i_23_ + ((i_19_ << 8) + (i_20_ << 16));
                        PacketBuffer.anInt2248++;
                    }
                }
            }
            if(Class57.incomingPacket == 202) {
                int i = Cache.outgoingbuffer.getUnsignedByte();
                int i_27_ = ((0x78 & i) >> 4) + Class40_Sub6.anInt2119;
                int i_28_ = OverlayDefinition.anInt2318 + (0x7 & i);
                int i_29_ = Cache.outgoingbuffer.getUnsignedShortBE();
                int i_30_ = Cache.outgoingbuffer.getUnsignedByte();
                int i_31_ = Cache.outgoingbuffer.getUnsignedShortBE();
                if((i_27_ ^ 0xffffffff) <= -1 && (i_28_ ^ 0xffffffff) <= -1 && (i_27_ ^ 0xffffffff) > -105 && i_28_ < 104) {
                    i_28_ = 128 * i_28_ + 64;
                    i_27_ = i_27_ * 128 + 64;
                    Class40_Sub5_Sub17_Sub6 class40_sub5_sub17_sub6 = (new Class40_Sub5_Sub17_Sub6(i_29_, Player.anInt3267, i_27_, i_28_, (-i_30_ + Class37.method430((byte) -124, (Player.anInt3267), i_27_, i_28_)), i_31_, Node.pulseCycle));
                    Class57.aClass45_1332.method904(class40_sub5_sub17_sub6, -111);
                }
            } else if(Class57.incomingPacket == 99) {
                int i = Cache.outgoingbuffer.getUnsignedByte();
                int i_32_ = Class40_Sub6.anInt2119 + ((0x75 & i) >> 4);
                int i_33_ = (i & 0x7) + OverlayDefinition.anInt2318;
                int i_34_ = Cache.outgoingbuffer.getUnsignedShortBE();
                int i_35_ = Cache.outgoingbuffer.getUnsignedShortBE();
                int i_36_ = Cache.outgoingbuffer.getUnsignedShortBE();
                if((i_32_ ^ 0xffffffff) <= -1 && (i_33_ ^ 0xffffffff) <= -1 && i_32_ < 104 && i_33_ < 104) {
                    Class45 class45 = (Class10.aClass45ArrayArrayArray357[Player.anInt3267][i_32_][i_33_]);
                    if(class45 != null) {
                        for(Class40_Sub5_Sub17_Sub3 class40_sub5_sub17_sub3 = ((Class40_Sub5_Sub17_Sub3) class45.method902((byte) -90)); class40_sub5_sub17_sub3 != null; class40_sub5_sub17_sub3 = ((Class40_Sub5_Sub17_Sub3) class45.method909(-4))) {
                            if(class40_sub5_sub17_sub3.anInt3067 == (i_34_ & 0x7fff) && (i_35_ == class40_sub5_sub17_sub3.anInt3058)) {
                                class40_sub5_sub17_sub3.anInt3058 = i_36_;
                                break;
                            }
                        }
                        Class40_Sub13.method880((byte) -80, i_33_, i_32_);
                    }
                }
            } else if(Class57.incomingPacket == 143) {
                int i = Cache.outgoingbuffer.getUnsignedNegativeOffsetByte();
                int i_37_ = OverlayDefinition.anInt2318 + (0x7 & i);
                int i_38_ = Class40_Sub6.anInt2119 + (i >> 4 & 0x7);
                int i_39_ = Cache.outgoingbuffer.getUnsignedInvertedByte();
                int i_40_ = i_39_ & 0x3;
                int i_41_ = i_39_ >> 2;
                int i_42_ = Npc.anIntArray3304[i_41_];
                if((i_38_ ^ 0xffffffff) <= -1 && (i_37_ ^ 0xffffffff) <= -1 && (i_38_ ^ 0xffffffff) > -105 && i_37_ < 104)
                    GameObjectDefinition.method609(-1, true, i_38_, i_40_, -1, (Player.anInt3267), i_37_, i_42_, i_41_, 0);
            } else {
                if((Class57.incomingPacket ^ 0xffffffff) == -230) {
                    int i = Cache.outgoingbuffer.getNegativeOffsetByte();
                    int i_43_ = Cache.outgoingbuffer.getUnsignedNegativeOffsetShortBE();
                    int i_44_ = Cache.outgoingbuffer.getByte();
                    int i_45_ = Cache.outgoingbuffer.getByte();
                    int i_46_ = Cache.outgoingbuffer.getUnsignedNegativeOffsetByte();
                    int i_47_ = i_46_ & 0x3;
                    int i_48_ = i_46_ >> 2;
                    int i_49_ = Npc.anIntArray3304[i_48_];
                    int i_50_ = Cache.outgoingbuffer.putUnsignedPreNegativeOffsetByte();
                    int i_51_ = (i_50_ & 0x7) + OverlayDefinition.anInt2318;
                    int i_52_ = Class40_Sub6.anInt2119 + (i_50_ >> 4 & 0x7);
                    int i_53_ = Cache.outgoingbuffer.getUnsignedShortBE();
                    int i_54_ = Cache.outgoingbuffer.getInvertedByte();
                    int i_55_ = Cache.outgoingbuffer.getUnsignedShortLE();
                    int i_56_ = Cache.outgoingbuffer.getUnsignedNegativeOffsetShortLE();
                    Player class40_sub5_sub17_sub4_sub1;
                    if(i_43_ != Class30.anInt708)
                        class40_sub5_sub17_sub4_sub1 = (Actor.aClass40_Sub5_Sub17_Sub4_Sub1Array3156[i_43_]);
                    else
                        class40_sub5_sub17_sub4_sub1 = (Player.localPlayer);
                    if(class40_sub5_sub17_sub4_sub1 != null) {
                        GameObjectDefinition gameObjectDefinition = GameObjectDefinition.getDefinition(i_55_);
                        int i_57_ = (Class40_Sub6.tile_height[Player.anInt3267][i_52_][i_51_]);
                        int i_58_ = (Class40_Sub6.tile_height[Player.anInt3267][i_52_][1 + i_51_]);
                        int i_59_ = (Class40_Sub6.tile_height[Player.anInt3267][1 + i_52_][1 + i_51_]);
                        int i_60_ = (Class40_Sub6.tile_height[Player.anInt3267][i_52_ + 1][i_51_]);
                        Model class40_sub5_sub17_sub5 = gameObjectDefinition.getGameObjectModel(i_59_, i_58_, i_47_, i_57_, i_48_, (byte) 124, i_60_);
                        if(class40_sub5_sub17_sub5 != null) {
                            if((i < i_54_)) {
                                int i_61_ = i_54_;
                                i_54_ = i;
                                i = i_61_;
                            }
                            if(i_44_ < i_45_) {
                                int i_62_ = i_45_;
                                i_45_ = i_44_;
                                i_44_ = i_62_;
                            }
                            GameObjectDefinition.method609(-1, true, i_52_, 0, 1 + i_56_, Player.anInt3267, i_51_, i_49_, 0, 1 + i_53_);
                            class40_sub5_sub17_sub4_sub1.anInt3274 = i_56_ + Node.pulseCycle;
                            int i_63_ = gameObjectDefinition.sizeX;
                            class40_sub5_sub17_sub4_sub1.aClass40_Sub5_Sub17_Sub5_3265 = class40_sub5_sub17_sub5;
                            class40_sub5_sub17_sub4_sub1.anInt3283 = i_53_ + Node.pulseCycle;
                            int i_64_ = gameObjectDefinition.sizeY;
                            if((i_47_ ^ 0xffffffff) == -2 || i_47_ == 3) {
                                i_64_ = gameObjectDefinition.sizeX;
                                i_63_ = gameObjectDefinition.sizeY;
                            }
                            class40_sub5_sub17_sub4_sub1.anInt3271 = i_52_ * 128 + 64 * i_63_;
                            class40_sub5_sub17_sub4_sub1.anInt3291 = i_51_ * 128 + (64 * i_64_);
                            class40_sub5_sub17_sub4_sub1.anInt3272 = (Class37.method430((byte) -127, Player.anInt3267, class40_sub5_sub17_sub4_sub1.anInt3271, class40_sub5_sub17_sub4_sub1.anInt3291));
                            class40_sub5_sub17_sub4_sub1.anInt3281 = i_45_ + i_51_;
                            class40_sub5_sub17_sub4_sub1.anInt3258 = i_52_ + i_54_;
                            class40_sub5_sub17_sub4_sub1.anInt3262 = i_52_ + i;
                            class40_sub5_sub17_sub4_sub1.anInt3289 = i_44_ + i_51_;
                        }
                    }
                }
                if((Class57.incomingPacket ^ 0xffffffff) == -75) {
                    int i = Cache.outgoingbuffer.getUnsignedByte();
                    int i_65_ = Class40_Sub6.anInt2119 + (i >> 4 & 0x7);
                    int i_66_ = (i & 0x7) + OverlayDefinition.anInt2318;
                    int i_67_ = Cache.outgoingbuffer.getUnsignedNegativeOffsetShortBE();
                    if((i_65_ ^ 0xffffffff) <= -1 && (i_66_ ^ 0xffffffff) <= -1 && (i_65_ ^ 0xffffffff) > -105 && (i_66_ ^ 0xffffffff) > -105) {
                        Class45 class45 = (Class10.aClass45ArrayArrayArray357[Player.anInt3267][i_65_][i_66_]);
                        if(class45 != null) {
                            for(Class40_Sub5_Sub17_Sub3 class40_sub5_sub17_sub3 = ((Class40_Sub5_Sub17_Sub3) class45.method902((byte) -90)); class40_sub5_sub17_sub3 != null; class40_sub5_sub17_sub3 = ((Class40_Sub5_Sub17_Sub3) class45.method909(-4))) {
                                if((0x7fff & i_67_) == class40_sub5_sub17_sub3.anInt3067) {
                                    class40_sub5_sub17_sub3.method457(-1);
                                    break;
                                }
                            }
                            if(class45.method902((byte) -90) == null)
                                Class10.aClass45ArrayArrayArray357[Player.anInt3267][i_65_][i_66_] = null;
                            Class40_Sub13.method880((byte) -80, i_66_, i_65_);
                        }
                    }
                } else if(Class57.incomingPacket == 1) {
                    int i = Cache.outgoingbuffer.getUnsignedByte();
                    int i_68_ = (i & 0x7) + OverlayDefinition.anInt2318;
                    int i_69_ = Class40_Sub6.anInt2119 + (0x7 & i >> 4);
                    int i_70_ = (i_69_ + Cache.outgoingbuffer.getByte());
                    int i_71_ = (i_68_ + Cache.outgoingbuffer.getByte());
                    int i_72_ = Cache.outgoingbuffer.getShortBE();
                    int i_73_ = Cache.outgoingbuffer.getUnsignedShortBE();
                    int i_74_ = Cache.outgoingbuffer.getUnsignedByte() * 4;
                    int i_75_ = 4 * Cache.outgoingbuffer.getUnsignedByte();
                    int i_76_ = Cache.outgoingbuffer.getUnsignedShortBE();
                    int i_77_ = Cache.outgoingbuffer.getUnsignedShortBE();
                    int i_78_ = Cache.outgoingbuffer.getUnsignedByte();
                    int i_79_ = Cache.outgoingbuffer.getUnsignedByte();
                    if(i_69_ >= 0 && i_68_ >= 0 && (i_69_ ^ 0xffffffff) > -105 && i_68_ < 104 && (i_70_ ^ 0xffffffff) <= -1 && i_71_ >= 0 && i_70_ < 104 && (i_71_ ^ 0xffffffff) > -105 && (i_73_ ^ 0xffffffff) != -65536) {
                        i_70_ = 64 + 128 * i_70_;
                        i_69_ = 64 + 128 * i_69_;
                        i_68_ = i_68_ * 128 + 64;
                        Class40_Sub5_Sub17_Sub1 class40_sub5_sub17_sub1 = (new Class40_Sub5_Sub17_Sub1(i_73_, Player.anInt3267, i_69_, i_68_, Class37.method430((byte) -121, (Player.anInt3267), i_69_, i_68_) + -i_74_, i_76_ + Node.pulseCycle, i_77_ + Node.pulseCycle, i_78_, i_79_, i_72_, i_75_));
                        i_71_ = 128 * i_71_ + 64;
                        class40_sub5_sub17_sub1.method766(i_76_ + Node.pulseCycle, 0, i_71_, (-i_75_ + Class37.method430((byte) -124, (Player.anInt3267), i_70_, i_71_)), i_70_);
                        Class43.aClass45_1022.method904(class40_sub5_sub17_sub1, -73);
                    }
                } else {
                    if(arg0 >= -110)
                        method952(32);
                    if((Class57.incomingPacket ^ 0xffffffff) == -20) {
                        int i = Cache.outgoingbuffer.getUnsignedNegativeOffsetShortLE();
                        int i_80_ = Cache.outgoingbuffer.getUnsignedNegativeOffsetShortLE();
                        int i_81_ = Cache.outgoingbuffer.getUnsignedShortBE();
                        int i_82_ = Cache.outgoingbuffer.getUnsignedNegativeOffsetByte();
                        int i_83_ = (((0x71 & i_82_) >> 4) + Class40_Sub6.anInt2119);
                        int i_84_ = (0x7 & i_82_) + OverlayDefinition.anInt2318;
                        if(i_83_ >= 0 && i_84_ >= 0 && (i_83_ ^ 0xffffffff) > -105 && i_84_ < 104 && (i_80_ ^ 0xffffffff) != (Class30.anInt708 ^ 0xffffffff)) {
                            Class40_Sub5_Sub17_Sub3 class40_sub5_sub17_sub3 = new Class40_Sub5_Sub17_Sub3();
                            class40_sub5_sub17_sub3.anInt3067 = i_81_;
                            class40_sub5_sub17_sub3.anInt3058 = i;
                            if((Class10.aClass45ArrayArrayArray357[Player.anInt3267][i_83_][i_84_]) == null)
                                Class10.aClass45ArrayArrayArray357[Player.anInt3267][i_83_][i_84_] = new Class45();
                            Class10.aClass45ArrayArrayArray357[Player.anInt3267][i_83_][i_84_].method904(class40_sub5_sub17_sub3, 64);
                            Class40_Sub13.method880((byte) -80, i_84_, i_83_);
                        }
                    } else if(Class57.incomingPacket == 175) {
                        int i = Cache.outgoingbuffer.getUnsignedShortLE();
                        int i_85_ = Cache.outgoingbuffer.getUnsignedShortBE();
                        int i_86_ = Cache.outgoingbuffer.getUnsignedByte();
                        int i_87_ = OverlayDefinition.anInt2318 + (i_86_ & 0x7);
                        int i_88_ = (Class40_Sub6.anInt2119 + ((0x7a & i_86_) >> 4));
                        if((i_88_ ^ 0xffffffff) <= -1 && (i_87_ ^ 0xffffffff) <= -1 && i_88_ < 104 && i_87_ < 104) {
                            Class40_Sub5_Sub17_Sub3 class40_sub5_sub17_sub3 = new Class40_Sub5_Sub17_Sub3();
                            class40_sub5_sub17_sub3.anInt3058 = i_85_;
                            class40_sub5_sub17_sub3.anInt3067 = i;
                            if((Class10.aClass45ArrayArrayArray357[Player.anInt3267][i_88_][i_87_]) == null)
                                Class10.aClass45ArrayArrayArray357[Player.anInt3267][i_88_][i_87_] = new Class45();
                            Class10.aClass45ArrayArrayArray357[Player.anInt3267][i_88_][i_87_].method904(class40_sub5_sub17_sub3, -118);
                            Class40_Sub13.method880((byte) -80, i_87_, i_88_);
                        }
                    }
                }
            }
        }
    }

    public static void method950(int arg0, byte arg1, int arg2, int arg3) {
        if((Class5.anInt200 ^ 0xffffffff) != -1 && (arg2 ^ 0xffffffff) != -1 && PacketBuffer.anInt2248 < 50) {
            IdentityKit.anIntArray2602[PacketBuffer.anInt2248] = arg0;
            ItemDefinition.anIntArray2814[PacketBuffer.anInt2248] = arg2;
            Class40_Sub3.anIntArray2023[PacketBuffer.anInt2248] = arg3;
            PacketBuffer.effects[PacketBuffer.anInt2248] = null;
            Class38_Sub1.anIntArray1916[PacketBuffer.anInt2248] = 0;
            PacketBuffer.anInt2248++;
        }
        anInt1248++;
        if(arg1 <= 24)
            aClass9_1247 = null;
    }

    public static void method951(int arg0, TypeFace arg1, TypeFace arg2) {
        do {
            Class38.aClass68_887.method1046((byte) 90);
            anInt1245++;
            if((Class51.anInt1197 ^ 0xffffffff) == -1 || Class51.anInt1197 == 5) {
                int i = 20;
                arg1.method686(Class48.aClass1_1122, 180, 74 + -i, 16777215);
                int i_89_ = -i + 82;
                Rasterizer.drawUnfilledRectangle(28, i_89_, 304, 34, 9179409);
                Rasterizer.drawUnfilledRectangle(29, 1 + i_89_, 302, 32, 0);
                Rasterizer.drawFilledRectangle(30, 2 + i_89_, Class67.anInt1607 * 3, 30, 9179409);
                Rasterizer.drawFilledRectangle(3 * Class67.anInt1607 + 30, i_89_ + 2, (-(Class67.anInt1607 * 3) + 300), 30, 0);
                arg1.method686(Class22_Sub2.currentLoadingText, 180, -i + 105, 16777215);
            }
            if((Class51.anInt1197 ^ 0xffffffff) == -21) {
                int i = 40;
                Class40_Sub5_Sub15.aClass40_Sub5_Sub14_Sub2_2775.drawImage(0, 0);
                arg1.method688(Class22_Sub2.aClass1_1879, 180, i, 16776960, true);
                i += 15;
                arg1.method688(Class22_Sub2.aClass1_1896, 180, i, 16776960, true);
                i += 15;
                arg1.method688(Class22_Sub2.aClass1_1881, 180, i, 16776960, true);
                i += 15;
                i += 10;
                arg1.drawShadowedString((Class40_Sub5_Sub17_Sub6.method832(126, (new RSString[]{Class61.aClass1_1422, Class22_Sub2.username}))), 90, i, 16777215, true);
                i += 15;
                arg1.drawShadowedString((Class40_Sub5_Sub17_Sub6.method832(-121, new RSString[]{Class22_Sub1.aClass1_1864, Class22_Sub2.password.method61(false)})), 92, i, 16777215, true);
                i += 15;
            }
            if((Class51.anInt1197 ^ 0xffffffff) == -11) {
                Class40_Sub5_Sub15.aClass40_Sub5_Sub14_Sub2_2775.drawImage(0, 0);
                if(Class26.anInt622 != 0) {
                    if(Class26.anInt622 == 2) {
                        int i = 40;
                        int i_90_ = 100;
                        arg1.method688(Class22_Sub2.aClass1_1879, 180, i, 16776960, true);
                        i += 15;
                        int i_91_ = 150;
                        arg1.method688(Class22_Sub2.aClass1_1896, 180, i, 16776960, true);
                        i += 15;
                        arg1.method688(Class22_Sub2.aClass1_1881, 180, i, 16776960, true);
                        i += 15;
                        i += 10;
                        arg1.drawShadowedString((Class40_Sub5_Sub17_Sub6.method832(-113, (new RSString[]{Class61.aClass1_1422, Class22_Sub2.username, ((Node.pulseCycle % 40 < 20 & Node.anInt947 == 0) ? (Class40_Sub5_Sub6.aClass1_2447) : (Class22_Sub2.string_blank))}))), 90, i, 16777215, true);
                        i += 15;
                        arg1.drawShadowedString((Class40_Sub5_Sub17_Sub6.method832(arg0 + 18924, (new RSString[]{Class22_Sub1.aClass1_1864, Class22_Sub2.password.method61(false), (((Node.pulseCycle % 40 ^ 0xffffffff) > -21 & (Node.anInt947 ^ 0xffffffff) == -2) ? (Class40_Sub5_Sub6.aClass1_2447) : (Class22_Sub2.string_blank))}))), 92, i, 16777215, true);
                        Class59.aClass40_Sub5_Sub14_Sub2_1387.drawImage(-73 + i_90_, i_91_ + -20);
                        i += 15;
                        arg1.method688(VarbitDefinition.aClass1_2351, i_90_, i_91_ + 5, 16777215, true);
                        i_90_ = 260;
                        Class59.aClass40_Sub5_Sub14_Sub2_1387.drawImage(-73 + i_90_, i_91_ + -20);
                        arg1.method688(Class68.aClass1_1635, i_90_, 5 + i_91_, 16777215, true);
                    } else if((Class26.anInt622 ^ 0xffffffff) == -4) {
                        arg1.method688(Class67.aClass1_1598, 180, 40, 16776960, true);
                        int i = 180;
                        int i_92_ = 150;
                        int i_93_ = 65;
                        arg1.method688(Class57.aClass1_1333, 180, i_93_, 16777215, true);
                        i_93_ += 15;
                        arg1.method688(aClass1_1259, 180, i_93_, 16777215, true);
                        i_93_ += 15;
                        arg1.method688(aClass1_1251, 180, i_93_, 16777215, true);
                        i_93_ += 15;
                        arg1.method688(Class40_Sub5_Sub11.aClass1_2629, 180, i_93_, 16777215, true);
                        Class59.aClass40_Sub5_Sub14_Sub2_1387.drawImage(-73 + i, i_92_ - 20);
                        arg1.method688(Class68.aClass1_1635, i, 5 + i_92_, 16777215, true);
                        i_93_ += 15;
                    }
                } else {
                    int i = 80;
                    int i_94_ = 100;
                    arg1.method688(Main.aClass1_1761, 180, i, 16776960, true);
                    i += 30;
                    int i_95_ = 120;
                    Class59.aClass40_Sub5_Sub14_Sub2_1387.drawImage(i_94_ - 73, i_95_ - 20);
                    arg1.method672(Class52.aClass1_1223, i_94_ + -73, -20 + i_95_, 144, 40, 16777215, true, 1, 1, 0);
                    i_94_ = 260;
                    Class59.aClass40_Sub5_Sub14_Sub2_1387.drawImage(i_94_ - 73, i_95_ + -20);
                    arg1.method672(Class42.aClass1_1011, -73 + i_94_, -20 + i_95_, 144, 40, 16777215, true, 1, 1, 0);
                }
            }
            Main.method38(0);
            try {
                Graphics graphics = GameFrame.aCanvas1469.getGraphics();
                Class38.aClass68_887.method1044(0, 202, graphics, 171);
                if(arg0 != -19010)
                    method949((byte) 41);
                Class8.aClass68_298.method1044(arg0 ^ ~0x4a41, 0, graphics, 0);
                GameObject.aClass68_3042.method1044(0, 637, graphics, 0);
                if(!Class40_Sub5_Sub11.clearScreen)
                    break;
                Class40_Sub5_Sub11.clearScreen = false;
                Class39.aClass68_907.method1044(0, 128, graphics, 0);
                Class51.aClass68_1206.method1044(0, 202, graphics, 371);
                Class17.aClass68_463.method1044(0, 0, graphics, 265);
                Class54.aClass68_1285.method1044(0, 562, graphics, 265);
                GameObjectDefinition.aClass68_2524.method1044(0, 128, graphics, 171);
                Class68.aClass68_1631.method1044(0, 562, graphics, 171);
            } catch(Exception exception) {
                GameFrame.aCanvas1469.repaint();
            }
            break;

        } while(false);
    }

    public static void method952(int arg0) {

        aClass40_Sub5_Sub14_Sub2_1270 = null;
        fontNormal = null;
        aClass9_1247 = null;
        aClass1_1243 = null;
        aClass1_1251 = null;
        aClass1_1246 = null;
        aClass1_1265 = null;
        aClass1_1269 = null;
        aClass1_1266 = null;
        aClass1_1255 = null;
        if(arg0 != 0)
            method950(-77, (byte) 57, -36, 56);
        aClass9_1264 = null;
        aClass1_1259 = null;
        aLongArray1267 = null;
        aClass1_1263 = null;
        aClass1_1260 = null;

    }
}
