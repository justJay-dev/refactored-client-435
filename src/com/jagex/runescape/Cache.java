package com.jagex.runescape;

public class Cache {
    public static int anInt306;
    public static int anInt307;
    public static int anInt308;
    public static int anInt310;
    public static int anInt311;
    public static RSString dropString = Class58.method978("Drop");
    public static RSString dropStringInstance = dropString;
    public static PacketBuffer outgoingbuffer = new PacketBuffer(5000);
    public static int anInt315;
    public static volatile int anInt320;
    public static int anInt321 = 5063219;
    public static volatile int anInt322;
    public static RSString aClass1_323;
    public static int anInt324 = 0;
    public static RSString aClass1_325;
    public static Cache aClass9_326;
    public static RSString aClass1_327 = Class58.method978("@or1@");
    public static RSString aClass1_328;
    public static Class6 aClass6_329;
    public static boolean aBoolean330;
    public static RSString aClass1_331;
    public static RSString aClass1_332 = Class58.method978("Classic");
    public static RSString aClass1_333;

    static {
        aClass1_331 = (Class58.method978("RuneScape wird geladen )2 bitte warten)3)3)3"));
        aBoolean330 = false;
        aClass1_325 = Class58.method978("Ung-Ultiger Benutzername");
        aClass1_328 = (Class58.method978("Please check your message)2centre for details)3"));
        aClass1_323 = aClass1_328;
        aClass1_333 = aClass1_332;
        anInt322 = -1;
        anInt320 = 0;
        aClass9_326 = new Cache(200);
    }

    public SubNode aClass40_Sub5_309 = new SubNode();
    public int anInt316;
    public int anInt317;
    public HashTable aClass23_318;
    public Class27 aClass27_319 = new Class27();

    public Cache(int arg0) {

        anInt317 = arg0;
        int i;
        for(i = 1; (i + i ^ 0xffffffff) > (arg0 ^ 0xffffffff); i += i) {
            /* empty */
        }
        anInt316 = arg0;
        aClass23_318 = new HashTable(i);

    }

    public static void method233(boolean arg0) {

        Class33.aClass9_778.method235((byte) 108);
        if(arg0 != true)
            method236(true, null, null, null);
        anInt310++;

    }

    public static void method234(int arg0) {

        dropStringInstance = null;
        aClass1_333 = null;
        dropString = null;
        aClass1_332 = null;
        int i = -70 % ((32 - arg0) / 43);
        aClass1_328 = null;
        aClass1_331 = null;
        outgoingbuffer = null;
        aClass1_325 = null;
        aClass9_326 = null;
        aClass6_329 = null;
        aClass1_327 = null;
        aClass1_323 = null;

    }

    public static void method236(boolean arg0, Class6 arg1, Class6 arg2, Class6 arg3) {

        Class40_Sub11.aClass6_2162 = arg1;
        if(arg0 != false)
            anInt324 = -101;
        Class40_Sub5_Sub4.aClass6_2364 = arg3;
        anInt308++;
        Class40_Sub5_Sub7.aClass6_2484 = arg2;

    }

    public void method230(int arg0, long arg1, SubNode arg2) {

        if((anInt316 ^ 0xffffffff) != -1)
            anInt316--;
        else {
            SubNode class40_sub5 = aClass27_319.method351(536857847);
            class40_sub5.method457(-1);
            class40_sub5.method539(arg0 ^ ~0x1c27);
            if(class40_sub5 == aClass40_Sub5_309) {
                class40_sub5 = aClass27_319.method351(536857847);
                class40_sub5.method457(-1);
                class40_sub5.method539(0);
            }
        }
        anInt307++;
        aClass23_318.put(arg2, (byte) -115, arg1);
        if(arg0 == -7208)
            aClass27_319.method352(102, arg2);

    }

    public SubNode method231(long arg0, byte arg1) {

        anInt311++;
        SubNode class40_sub5 = (SubNode) aClass23_318.method331(arg0, 6120);
        if(arg1 < 39)
            aClass1_333 = null;
        if(class40_sub5 != null)
            aClass27_319.method352(114, class40_sub5);
        return class40_sub5;

    }

    public void removeAll(long arg0, int arg1) {
        do {
            anInt306++;
            if(arg1 <= 94)
                method231(30L, (byte) 20);
            SubNode class40_sub5 = (SubNode) aClass23_318.method331(arg0, 6120);
            if(class40_sub5 == null)
                break;
            class40_sub5.method457(-1);
            class40_sub5.method539(0);
            anInt316++;

            break;
        } while(false);
    }

    public void method235(byte arg0) {

        for(; ; ) {
            SubNode class40_sub5 = aClass27_319.method351(536857847);
            if(class40_sub5 == null)
                break;
            class40_sub5.method457(-1);
            class40_sub5.method539(0);
        }
        anInt315++;
        anInt316 = anInt317;
        int i = 115 / ((-2 - arg0) / 33);

    }
}