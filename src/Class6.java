/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.DataInputStream;
import java.net.URL;

public abstract class Class6 {
    public static int anInt211;
    public byte[][] aByteArrayArray212;
    public static int anInt213;
    public static int anInt214;
    public static IndexedColorSprite[] aClass40_Sub5_Sub14_Sub2Array215;
    public int anInt216;
    public Class42[] aClass42Array217;
    public static int anInt218;
    public static long aLong219 = 0L;
    public boolean aBoolean220;
    public int anInt221;
    public static int anInt222;
    public static int anInt223;
    public int[] anIntArray224;
    public static int[] anIntArray225 = new int[1000];
    public static int anInt226;
    public int[] anIntArray227;
    public static int anInt228;
    public static Cache aClass9_229 = new Cache(260);
    public static int anInt230;
    public static int anInt231;
    public static int anInt232;
    public boolean aBoolean233;
    public static int anInt234;
    public static int anInt235;
    public int[][] anIntArrayArray236;
    public static int anInt237;
    public static int anInt238;
    public int[] anIntArray239;
    public static int anInt240;
    public static int anInt241;
    public static int anInt242;
    public int[][] anIntArrayArray243;
    public static int anInt244;
    public static int anInt245;
    public static int anInt246;
    public static int anInt247;
    public static int anInt248;
    public byte[][][] aByteArrayArrayArray249;
    public static int anInt250;
    public static int anInt251;
    public int[] anIntArray252;
    public static int anInt253;
    public Class42 aClass42_254;
    public static int anInt255;
    public static RSString aClass1_256 = Class58.method978(-11538, "backbase2");
    public static RSString aClass1_257
            = Class58.method978(-11538, "Please try again)3");
    public static RSString aClass1_258 = aClass1_257;
    public static RSString aClass1_259;
    public static boolean aBoolean260 = false;
    public int[] anIntArray261;
    public static int[][][] anIntArrayArrayArray262;
    public static int anInt263;

    public static void method169(String arg0, byte arg1, Throwable arg2) {
        anInt248++;
        do {
            try {
                String string = "";
                if(arg2 != null)
                    string = Class55.method959(0, arg2);
                if(arg0 != null) {
                    if(arg2 != null)
                        string += " | ";
                    string += (String) arg0;
                }
                System.out.println("Error: " + string);
                string = string.replace(':', '.');
                string = string.replace('@', '_');
                if(arg1 > -119)
                    method189(true);
                string = string.replace('&', '_');
                string = string.replace('#', '_');
                Class15 class15
                        = (Class40_Sub5_Sub17_Sub4.aClass31_3152.method388
                        (false,
                                new URL(Class40_Sub5_Sub17_Sub4.aClass31_3152
                                        .anApplet740.getCodeBase(),
                                        ("clienterror.ws?c=" + Class39.anInt901 + "&u="
                                                + Class34.aLong853 + "&v1="
                                                + Signlink.aString735 + "&v2="
                                                + Signlink.aString739 + "&e=" + string))));
                while((class15.anInt434 ^ 0xffffffff) == -1)
                    Class43.method890(1L, -74);
                if((class15.anInt434 ^ 0xffffffff) != -2)
                    break;
                DataInputStream datainputstream
                        = (DataInputStream) class15.anObject437;
                datainputstream.read();
                datainputstream.close();
            } catch(Exception exception) {
                break;
            }
            break;
        } while(false);
    }

    public byte[] method170(RSString arg0, RSString arg1, int arg2) {
        try {
            if(arg2 != 1)
                method186(-26, 53);
            arg1 = arg1.method79(arg2 ^ ~0x7e);
            anInt231++;
            arg0 = arg0.method79(-128);
            int i = aClass42_254.method882(arg1.method76((byte) 41),
                    arg2 + -126);
            int i_0_ = aClass42Array217[i].method882(arg0.method76((byte) 41),
                    -112);
            return method172(i_0_, 114, i);
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    ("bd.CA("
                            + (arg0 != null ? "{...}" : "null") + ','
                            + (arg1 != null ? "{...}" : "null") + ','
                            + arg2 + ')'));
        }
    }

    public void method171(int arg0, int arg1) {
        try {
            anInt242++;
            int i = 0;
            if(arg0 == 1) {
                for(/**/;
                        ((i ^ 0xffffffff)
                                > (aByteArrayArrayArray249[arg1].length ^ 0xffffffff));
                        i++)
                    aByteArrayArrayArray249[arg1][i] = null;
            }
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    "bd.E(" + arg0 + ',' + arg1 + ')');
        }
    }

    public byte[] method172(int arg0, int arg1, int arg2) {
        try {
            anInt213++;
            if(arg1 <= 110)
                anIntArray239 = null;
            return method176(arg2, arg0, null, 20582);
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    ("bd.B(" + arg0 + ',' + arg1 + ',' + arg2
                            + ')'));
        }
    }

    public boolean method173(int arg0, byte arg1, int arg2) {
        try {
            anInt234++;
            if((arg0 ^ 0xffffffff) > -1
                    || ((aByteArrayArrayArray249.length ^ 0xffffffff)
                    >= (arg0 ^ 0xffffffff))
                    || aByteArrayArrayArray249[arg0] == null
                    || (arg2 ^ 0xffffffff) > -1
                    || arg2 >= aByteArrayArrayArray249[arg0].length)
                return false;
            if(arg1 != -10)
                method183(-98, null);
            if(aByteArrayArrayArray249[arg0][arg2] != null)
                return true;
            if(aByteArrayArray212[arg0] != null)
                return true;
            method177(122, arg0);
            if(aByteArrayArray212[arg0] != null)
                return true;
            return false;
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    ("bd.G(" + arg0 + ',' + arg1 + ',' + arg2
                            + ')'));
        }
    }

    public void method174(int arg0, byte arg1) {
        try {
            if(arg1 == 2)
                anInt228++;
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    "bd.M(" + arg0 + ',' + arg1 + ')');
        }
    }

    public int method175(int arg0) {
        try {
            if(arg0 > -7)
                aBoolean260 = true;
            anInt232++;
            return aByteArrayArrayArray249.length;
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception, "bd.I(" + arg0 + ')');
        }
    }

    public byte[] method176(int arg0, int arg1, int[] arg2, int arg3) {
        try {
            anInt246++;
            if(arg3 != 20582)
                return null;
            if(arg0 < 0
                    || ((aByteArrayArrayArray249.length ^ 0xffffffff)
                    >= (arg0 ^ 0xffffffff))
                    || aByteArrayArrayArray249[arg0] == null || arg1 < 0
                    || arg1 >= aByteArrayArrayArray249[arg0].length)
                return null;
            if(aByteArrayArrayArray249[arg0][arg1] == null) {
                boolean bool = method181(arg0, 20824, arg2);
                if(!bool) {
                    method177(33, arg0);
                    bool = method181(arg0, arg3 + 242, arg2);
                    if(!bool)
                        return null;
                }
            }
            byte[] is = aByteArrayArrayArray249[arg0][arg1];
            if(aBoolean220)
                aByteArrayArrayArray249[arg0][arg1] = null;
            return is;
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    ("bd.L(" + arg0 + ',' + arg1 + ','
                            + (arg2 != null ? "{...}" : "null") + ','
                            + arg3 + ')'));
        }
    }

    public void method177(int arg0, int arg1) {
        try {
            if(arg0 < 1)
                method181(22, -64, null);
            anInt240++;
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    "bd.W(" + arg0 + ',' + arg1 + ')');
        }
    }

    public void method178(int arg0, byte[] arg1) {
        anInt216 = Class40_Sub2.method525(arg1, arg1.length, (byte) -68);
        Buffer class40_sub1
                = new Buffer(Landscape.method931(arg1, 9));
        int i = class40_sub1.method468(false);
        anInt238++;
        if((i ^ 0xffffffff) == -6) {
            int i_1_ = 0;
            int i_2_ = class40_sub1.method468(false);
            anInt221 = class40_sub1.method469(65280);
            anIntArray227 = new int[anInt221];
            if(arg0 != -21071)
                method173(-78, (byte) 73, -64);
            int i_3_ = -1;
            for(int i_4_ = 0; anInt221 > i_4_; i_4_++) {
                anIntArray227[i_4_] = i_1_ += class40_sub1.method469(65280);
                if((anIntArray227[i_4_] ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
                    i_3_ = anIntArray227[i_4_];
            }
            anIntArrayArray243 = new int[i_3_ - -1][];
            anIntArray224 = new int[1 + i_3_];
            anIntArray252 = new int[i_3_ - -1];
            aByteArrayArrayArray249 = new byte[1 + i_3_][][];
            anIntArray261 = new int[1 + i_3_];
            aByteArrayArray212 = new byte[i_3_ + 1][];
            if((i_2_ ^ 0xffffffff) != -1) {
                anIntArray239 = new int[i_3_ - -1];
                for(int i_5_ = 0;
                    (anInt221 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++)
                    anIntArray239[anIntArray227[i_5_]]
                            = class40_sub1.method491(-4750);
                aClass42_254 = new Class42(anIntArray239);
            }
            for(int i_6_ = 0; i_6_ < anInt221; i_6_++)
                anIntArray252[anIntArray227[i_6_]]
                        = class40_sub1.method491(-4750);
            for(int i_7_ = 0; i_7_ < anInt221; i_7_++)
                anIntArray224[anIntArray227[i_7_]]
                        = class40_sub1.method491(-4750);
            for(int i_8_ = 0; (anInt221 ^ 0xffffffff) < (i_8_ ^ 0xffffffff);
                i_8_++)
                anIntArray261[anIntArray227[i_8_]]
                        = class40_sub1.method469(RSApplet.method27(arg0,
                        -44367));
            for(int i_9_ = 0; (i_9_ ^ 0xffffffff) > (anInt221 ^ 0xffffffff);
                i_9_++) {
                i_1_ = 0;
                int i_10_ = anIntArray227[i_9_];
                int i_11_ = -1;
                int i_12_ = anIntArray261[i_10_];
                anIntArrayArray243[i_10_] = new int[i_12_];
                for(int i_13_ = 0; i_12_ > i_13_; i_13_++) {
                    int i_14_ = (anIntArrayArray243[i_10_][i_13_] = i_1_
                            += (class40_sub1.method469
                            (RSApplet.method27(arg0, -44367))));
                    if(i_14_ > i_11_)
                        i_11_ = i_14_;
                }
                aByteArrayArrayArray249[i_10_] = new byte[i_11_ - -1][];
            }
            if(i_2_ != 0) {
                aClass42Array217 = new Class42[i_3_ + 1];
                anIntArrayArray236 = new int[1 + i_3_][];
                for(int i_15_ = 0;
                    (anInt221 ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
                    int i_16_ = anIntArray227[i_15_];
                    int i_17_ = anIntArray261[i_16_];
                    anIntArrayArray236[i_16_]
                            = new int[aByteArrayArrayArray249[i_16_].length];
                    for(int i_18_ = 0; i_17_ > i_18_; i_18_++)
                        anIntArrayArray236[i_16_][(anIntArrayArray243[i_16_]
                                [i_18_])]
                                = class40_sub1.method491(arg0 + 16321);
                    aClass42Array217[i_16_]
                            = new Class42(anIntArrayArray236[i_16_]);
                }
            }
        }
    }

    public int method179(int arg0, int arg1, RSString arg2) {
        try {
            int i = 107 % ((-47 - arg0) / 56);
            arg2 = arg2.method79(-128);
            anInt214++;
            return aClass42Array217[arg1].method882(arg2.method76((byte) 41),
                    -70);
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    ("bd.O(" + arg0 + ',' + arg1 + ','
                            + (arg2 != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public static void method180(int arg0) {
        try {
            aClass1_259 = null;
            aClass40_Sub5_Sub14_Sub2Array215 = null;
            aClass1_256 = null;
            if(arg0 != 0)
                anIntArray225 = null;
            aClass9_229 = null;
            aClass1_257 = null;
            anIntArray225 = null;
            anIntArrayArrayArray262 = null;
            aClass1_258 = null;
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception, "bd.Q(" + arg0 + ')');
        }
    }

    public boolean method181(int arg0, int arg1, int[] arg2) {
        try {
            anInt222++;
            if(aByteArrayArray212[arg0] == null)
                return false;
            int i = anIntArray261[arg0];
            byte[][] is = aByteArrayArrayArray249[arg0];
            int[] is_19_ = anIntArrayArray243[arg0];
            boolean bool = true;
            for(int i_20_ = 0; i_20_ < i; i_20_++) {
                if(is[is_19_[i_20_]] == null) {
                    bool = false;
                    break;
                }
            }
            if(arg1 != 20824)
                aClass9_229 = null;
            if(bool)
                return true;
            byte[] is_21_;
            if(arg2 == null || (arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0
                    && arg2[3] == 0))
                is_21_ = aByteArrayArray212[arg0];
            else {
                is_21_ = new byte[aByteArrayArray212[arg0].length];
                Class18.method278(aByteArrayArray212[arg0], 0, is_21_, 0,
                        is_21_.length);
                Buffer class40_sub1 = new Buffer(is_21_);
                class40_sub1.method483(arg2, false,
                        class40_sub1.payload.length, 5);
            }
            byte[] is_22_;
            try {
                is_22_ = Landscape.method931(is_21_, arg1 + -20815);
            } catch(RuntimeException runtimeexception) {
                throw Class8.method216(runtimeexception,
                        ("T3 - " + (arg2 != null) + "," + arg0
                                + "," + is_21_.length + ","
                                + Class40_Sub2.method525(is_21_,
                                is_21_.length,
                                (byte) -68)
                                + ","
                                + Class40_Sub2.method525(is_21_,
                                (is_21_.length
                                        + -2),
                                (byte) -68)
                                + "," + anIntArray252[arg0] + ","
                                + anInt216));
            }
            if(aBoolean233)
                aByteArrayArray212[arg0] = null;
            if(i > 1) {
                int i_23_ = is_22_.length;
                int i_24_ = is_22_[--i_23_] & 0xff;
                Buffer class40_sub1 = new Buffer(is_22_);
                i_23_ -= 4 * (i_24_ * i);
                class40_sub1.offset = i_23_;
                int[] is_25_ = new int[i];
                for(int i_26_ = 0;
                    (i_24_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff); i_26_++) {
                    int i_27_ = 0;
                    for(int i_28_ = 0;
                        (i_28_ ^ 0xffffffff) > (i ^ 0xffffffff); i_28_++) {
                        i_27_ += class40_sub1.method491(arg1 + -25574);
                        is_25_[i_28_] += i_27_;
                    }
                }
                for(int i_29_ = 0; (i_29_ ^ 0xffffffff) > (i ^ 0xffffffff);
                    i_29_++) {
                    if(is[is_19_[i_29_]] == null)
                        is[is_19_[i_29_]] = new byte[is_25_[i_29_]];
                    is_25_[i_29_] = 0;
                }
                class40_sub1.offset = i_23_;
                int i_30_ = 0;
                for(int i_31_ = 0;
                    (i_24_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++) {
                    int i_32_ = 0;
                    for(int i_33_ = 0; i_33_ < i; i_33_++) {
                        i_32_ += class40_sub1.method491(-4750);
                        Class18.method278(is_22_, i_30_, is[is_19_[i_33_]],
                                is_25_[i_33_], i_32_);
                        is_25_[i_33_] += i_32_;
                        i_30_ += i_32_;
                    }
                }
            } else
                is[is_19_[0]] = is_22_;
            return true;
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    ("bd.T(" + arg0 + ',' + arg1 + ','
                            + (arg2 != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public byte[] method182(int arg0, int arg1, int arg2) {
        try {
            anInt226++;
            if(arg2 < 0
                    || ((aByteArrayArrayArray249.length ^ 0xffffffff)
                    >= (arg2 ^ 0xffffffff))
                    || aByteArrayArrayArray249[arg2] == null || arg0 < 0
                    || aByteArrayArrayArray249[arg2].length <= arg0)
                return null;
            if(aByteArrayArrayArray249[arg2][arg0] == null) {
                boolean bool = method181(arg2, 20824, null);
                if(!bool) {
                    method177(45, arg2);
                    bool = method181(arg2, 20824, null);
                    if(!bool)
                        return null;
                }
            }
            int i = 44 % ((-59 - arg1) / 42);
            byte[] is = aByteArrayArrayArray249[arg2][arg0];
            return is;
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    ("bd.H(" + arg0 + ',' + arg1 + ',' + arg2
                            + ')'));
        }
    }

    public int method183(int arg0, RSString arg1) {
        try {
            if(arg0 != 0)
                method183(58, null);
            anInt237++;
            arg1 = arg1.method79(arg0 ^ ~0x7f);
            return aClass42_254.method882(arg1.method76((byte) 41),
                    arg0 + -80);
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    ("bd.R(" + arg0 + ','
                            + (arg1 != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public static void method184(byte[] arg0, int arg1) {
        try {
            anInt247++;
            Buffer class40_sub1 = new Buffer(arg0);
            class40_sub1.offset = -2 + arg0.length;
            Class40_Sub5_Sub9.anInt2581 = class40_sub1.method469(65280);
            Class40_Sub5_Sub17_Sub4.anIntArray3111
                    = new int[Class40_Sub5_Sub9.anInt2581];
            Class58.aByteArrayArray1370
                    = new byte[Class40_Sub5_Sub9.anInt2581][];
            Class17.anIntArray456 = new int[Class40_Sub5_Sub9.anInt2581];
            NPC.anIntArray3312
                    = new int[Class40_Sub5_Sub9.anInt2581];
            Class57.anIntArray1347 = new int[Class40_Sub5_Sub9.anInt2581];
            class40_sub1.offset
                    = arg0.length + -7 + -(Class40_Sub5_Sub9.anInt2581 * 8);
            ItemDefinition.anInt2846 = class40_sub1.method469(65280);
            RSApplet.anInt31 = class40_sub1.method469(65280);
            int i = 1 + (class40_sub1.method468(false) & 0xff);
            for(int i_34_ = 0;
                ((i_34_ ^ 0xffffffff)
                        > (Class40_Sub5_Sub9.anInt2581 ^ 0xffffffff));
                i_34_++)
                Class57.anIntArray1347[i_34_] = class40_sub1.method469(65280);
            for(int i_35_ = arg1; i_35_ < Class40_Sub5_Sub9.anInt2581;
                i_35_++)
                Class40_Sub5_Sub17_Sub4.anIntArray3111[i_35_]
                        = class40_sub1.method469(arg1 + 65280);
            for(int i_36_ = 0; i_36_ < Class40_Sub5_Sub9.anInt2581; i_36_++)
                Class17.anIntArray456[i_36_] = class40_sub1.method469(65280);
            for(int i_37_ = 0; Class40_Sub5_Sub9.anInt2581 > i_37_; i_37_++)
                NPC.anIntArray3312[i_37_]
                        = class40_sub1.method469(65280);
            class40_sub1.offset
                    = arg0.length - (7 + (Class40_Sub5_Sub9.anInt2581 * 8
                    + (-3 + i * 3)));
            Buffer.anIntArray1972 = new int[i];
            for(int i_38_ = 1; (i ^ 0xffffffff) < (i_38_ ^ 0xffffffff);
                i_38_++) {
                Buffer.anIntArray1972[i_38_]
                        = class40_sub1.getTri(true);
                if(Buffer.anIntArray1972[i_38_] == 0)
                    Buffer.anIntArray1972[i_38_] = 1;
            }
            class40_sub1.offset = 0;
            for(int i_39_ = 0; Class40_Sub5_Sub9.anInt2581 > i_39_; i_39_++) {
                int i_40_ = NPC.anIntArray3312[i_39_];
                int i_41_ = Class17.anIntArray456[i_39_];
                int i_42_ = i_40_ * i_41_;
                byte[] is = new byte[i_42_];
                Class58.aByteArrayArray1370[i_39_] = is;
                int i_43_ = class40_sub1.method468(false);
                if((i_43_ ^ 0xffffffff) != -1) {
                    if((i_43_ ^ 0xffffffff) == -2) {
                        for(int i_44_ = 0;
                            (i_41_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff);
                            i_44_++) {
                            for(int i_45_ = 0; i_40_ > i_45_; i_45_++)
                                is[i_41_ * i_45_ + i_44_]
                                        = class40_sub1.get(94);
                        }
                    }
                } else {
                    for(int i_46_ = 0;
                        (i_42_ ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++)
                        is[i_46_] = class40_sub1.get(109);
                }
            }
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    ("bd.N(" + (arg0 != null ? "{...}" : "null")
                            + ',' + arg1 + ')'));
        }
    }

    public boolean method185(byte arg0) {
        try {
            anInt230++;
            boolean bool = true;
            if(arg0 < 11)
                return true;
            for(int i = 0;
                (anIntArray227.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
                int i_47_ = anIntArray227[i];
                if(aByteArrayArray212[i_47_] == null) {
                    method177(59, i_47_);
                    if(aByteArrayArray212[i_47_] == null)
                        bool = false;
                }
            }
            return bool;
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception, "bd.P(" + arg0 + ')');
        }
    }

    public boolean method186(int arg0, int arg1) {
        try {
            anInt253++;
            if(aByteArrayArray212[arg1] != null)
                return true;
            method177(74, arg1);
            if(aByteArrayArray212[arg1] != null)
                return true;
            if(arg0 < 102)
                aLong219 = 119L;
            return false;
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    "bd.DA(" + arg0 + ',' + arg1 + ')');
        }
    }

    public byte[] method187(int arg0, byte arg1) {
        try {
            if(arg1 >= -74)
                method173(-8, (byte) 107, 12);
            anInt263++;
            if(aByteArrayArrayArray249.length == 1)
                return method172(arg0, 115, 0);
            if(aByteArrayArrayArray249[arg0].length == 1)
                return method172(0, 120, arg0);
            throw new RuntimeException();
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    "bd.C(" + arg0 + ',' + arg1 + ')');
        }
    }

    public static void method188(boolean arg0) {
        try {
            Class40_Sub5_Sub6.aClass9_2439.method235((byte) 95);
            Class42.aClass9_998.method235((byte) -90);
            if(arg0 == true)
                anInt211++;
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception, "bd.V(" + arg0 + ')');
        }
    }

    public static void method189(boolean arg0) {
        try {
            anInt250++;
            if(arg0 != false)
                anIntArray225 = null;
            Class53.aClass9_1247.method235((byte) 59);
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception, "bd.F(" + arg0 + ')');
        }
    }

    public int method190(int arg0, byte arg1) {
        try {
            anInt235++;
            if(arg1 < 4)
                return 17;
            return aByteArrayArrayArray249[arg0].length;
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    "bd.D(" + arg0 + ',' + arg1 + ')');
        }
    }

    public void method191(int arg0) {
        anInt218++;
        for(int i = 0; i < aByteArrayArrayArray249.length; i++) {
            if(aByteArrayArrayArray249[i] != null) {
                for(int i_48_ = 0;
                    ((i_48_ ^ 0xffffffff)
                            > (aByteArrayArrayArray249[i].length ^ 0xffffffff));
                    i_48_++)
                    aByteArrayArrayArray249[i][i_48_] = null;
            }
        }
        if(arg0 != 1120)
            method186(-112, 82);
    }

    public int[] method192(int arg0, boolean arg1) {
        try {
            if(arg1 != true)
                return null;
            anInt241++;
            return anIntArrayArray243[arg0];
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    "bd.U(" + arg0 + ',' + arg1 + ')');
        }
    }

    public byte[] method193(byte arg0, int arg1) {
        try {
            anInt244++;
            if((aByteArrayArrayArray249.length ^ 0xffffffff) == -2)
                return method182(arg1, -116, 0);
            if((aByteArrayArrayArray249[arg1].length ^ 0xffffffff) == -2)
                return method182(0, -124, arg1);
            if(arg0 < 17)
                aClass1_257 = null;
            throw new RuntimeException();
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    "bd.BA(" + arg0 + ',' + arg1 + ')');
        }
    }

    public boolean method194(RSString arg0, RSString arg1, int arg2) {
        try {
            anInt251++;
            if(arg2 != -1234)
                anIntArray261 = null;
            arg0 = arg0.method79(-128);
            arg1 = arg1.method79(-128);
            int i = aClass42_254.method882(arg0.method76((byte) 41), -66);
            int i_49_ = aClass42Array217[i].method882(arg1.method76((byte) 41),
                    arg2 ^ 0x483);
            return method173(i, (byte) -10, i_49_);
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    ("bd.AA("
                            + (arg0 != null ? "{...}" : "null") + ','
                            + (arg1 != null ? "{...}" : "null") + ','
                            + arg2 + ')'));
        }
    }

    public void method195(int arg0, RSString arg1) {
        try {
            arg1 = arg1.method79(-128);
            int i = aClass42_254.method882(arg1.method76((byte) 41), -69);
            anInt223++;
            if(arg0 == 0 && (i ^ 0xffffffff) <= -1)
                method174(i, (byte) 2);
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    ("bd.J(" + arg0 + ','
                            + (arg1 != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public Class6(boolean arg0, boolean arg1) {
        try {
            aBoolean220 = arg1;
            aBoolean233 = arg0;
        } catch(RuntimeException runtimeexception) {
            throw Class8.method216(runtimeexception,
                    "bd.<init>(" + arg0 + ',' + arg1 + ')');
        }
    }

    static {
        aClass1_259
                = (Class58.method978
                (-11538, "Sie befinden sich in einem Mitglieder)2Gebiet(Q"));
    }
}