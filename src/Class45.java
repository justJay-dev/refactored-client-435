/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public class Class45
{
    public static long aLong1051;
    public static int anInt1052;
    public static int anInt1053;
    public static int anInt1054;
    public static int anInt1055;
    public Node aClass40_1056 = new Node();
    public static DirectColorSprite aClass40_Sub5_Sub14_Sub4_1057;
    public static int anInt1058;
    public static RSString aClass1_1059
	= Class58.method978(-11538, "Bitte entfernen Sie ");
    public static int anInt1060;
    public static int anInt1061;
    public static int anInt1062;
    public static int anInt1063;
    public static Class45 aClass45_1064;
    public static int anInt1065;
    public static int anInt1066;
    public static int anInt1067;
    public Node aClass40_1068;
    public static int anInt1069;
    public static int anInt1070;
    public static int[] anIntArray1071;
    public static int anInt1072;
    public static volatile int anInt1073;
    public static int anInt1074;
    public static int anInt1075 = 0;
    public static RSString aClass1_1076;
    public static RSString aClass1_1077;
    public static RSString aClass1_1078;
    public static RSString aClass1_1079;
    public static RSString aClass1_1080;
    public static Buffer aClass40_Sub1_1081;
    public static Class30 aClass30_1082;
    public static int[] anIntArray1083;
    public static RSString aClass1_1084;
    public static RSString aClass1_1085;
    
    public Node method899(byte arg0) {
	try {
	    anInt1067++;
	    int i = -68 / ((28 - arg0) / 50);
	    Node class40 = aClass40_1056.aClass40_968;
	    if (class40 == aClass40_1056)
		return null;
	    class40.method457(-1);
	    return class40;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "pb.L(" + arg0 + ')');
	}
    }
    
    public static void method900(int arg0) {
	try {
	    aClass1_1080 = null;
	    anIntArray1083 = null;
	    aClass45_1064 = null;
	    aClass30_1082 = null;
	    if (arg0 != 29690)
		aClass40_Sub1_1081 = null;
	    aClass1_1077 = null;
	    aClass40_Sub5_Sub14_Sub4_1057 = null;
	    aClass1_1085 = null;
	    aClass40_Sub1_1081 = null;
	    anIntArray1071 = null;
	    aClass1_1084 = null;
	    aClass1_1079 = null;
	    aClass1_1076 = null;
	    aClass1_1059 = null;
	    aClass1_1078 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "pb.E(" + arg0 + ')');
	}
    }
    
    public Node method901(byte arg0) {
	try {
	    anInt1070++;
	    Node class40 = aClass40_1056.aClass40_968;
	    if (class40 == aClass40_1056) {
		aClass40_1068 = null;
		return null;
	    }
	    aClass40_1068 = class40.aClass40_968;
	    if (arg0 > -53)
		return null;
	    return class40;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "pb.B(" + arg0 + ')');
	}
    }
    
    public Node method902(byte arg0) {
	try {
	    if (arg0 != -90)
		method901((byte) 0);
	    anInt1058++;
	    Node class40 = aClass40_1056.aClass40_950;
	    if (aClass40_1056 == class40) {
		aClass40_1068 = null;
		return null;
	    }
	    aClass40_1068 = class40.aClass40_950;
	    return class40;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "pb.N(" + arg0 + ')');
	}
    }
    
    public static RSString method903(int arg0, byte arg1) {
	try {
	    if (arg1 >= -13)
		return null;
	    anInt1069++;
	    RSString class1 = HashTable.method334(arg0, -1);
	    for (int i = -3 + class1.method59(-3136); (i ^ 0xffffffff) < -1;
		 i -= 3)
		class1
		    = (Class40_Sub5_Sub17_Sub6.method832
		       (113, new RSString[] { class1.method68(0, 0, i),
					    Class33.aClass1_795,
					    class1.method50((byte) 95, i) }));
	    if (class1.method59(-3136) > 8)
		class1
		    = (Class40_Sub5_Sub17_Sub6.method832
		       (-69,
			(new RSString[]
			 { Landscape.aClass1_1162,
			   class1.method68(0, 0, -8 + class1.method59(-3136)),
			   Class40_Sub5_Sub9.aClass1_2577,
			   Class52.aClass1_1213, class1,
			   Class51.aClass1_1199 })));
	    else if (class1.method59(-3136) > 4)
		class1
		    = (Class40_Sub5_Sub17_Sub6.method832
		       (-115,
			(new RSString[]
			 { Class40_Sub5_Sub17.aClass1_2862,
			   class1.method68(0, 0, class1.method59(-3136) + -4),
			   Class40_Sub5_Sub10.aClass1_2593,
			   Class52.aClass1_1213, class1,
			   Class51.aClass1_1199 })));
	    return Class40_Sub5_Sub17_Sub6.method832(127,
						     (new RSString[]
						      { Class48.aClass1_1123,
							class1 }));
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   "pb.I(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public void method904(Node arg0, int arg1) {
	try {
	    anInt1062++;
	    if (arg0.aClass40_968 != null)
		arg0.method457(-1);
	    arg0.aClass40_968 = aClass40_1056.aClass40_968;
	    int i = 106 % ((-7 - arg1) / 59);
	    arg0.aClass40_950 = aClass40_1056;
	    arg0.aClass40_968.aClass40_950 = arg0;
	    arg0.aClass40_950.aClass40_968 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   ("pb.M(" + (arg0 != null ? "{...}" : "null")
				    + ',' + arg1 + ')'));
	}
    }
    
    public void method905(int arg0, Node arg1) {
	try {
	    if (arg1.aClass40_968 != null)
		arg1.method457(-1);
	    if (arg0 != 0)
		method911(-96, null, null);
	    arg1.aClass40_950 = aClass40_1056.aClass40_950;
	    anInt1066++;
	    arg1.aClass40_968 = aClass40_1056;
	    arg1.aClass40_968.aClass40_950 = arg1;
	    arg1.aClass40_950.aClass40_968 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   ("pb.G(" + arg0 + ','
				    + (arg1 != null ? "{...}" : "null")
				    + ')'));
	}
    }
    
    public void method906(int arg0) {
	try {
	    if (arg0 != 0)
		method903(-33, (byte) -75);
	    anInt1063++;
	    for (;;) {
		Node class40 = aClass40_1056.aClass40_950;
		if (class40 == aClass40_1056)
		    break;
		class40.method457(arg0 ^ 0xffffffff);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "pb.H(" + arg0 + ')');
	}
    }
    
    public static void method907(int arg0) {
	Class57.aClass9_1331.method235((byte) 94);
	anInt1072++;
	if (arg0 >= -36)
	    aClass45_1064 = null;
    }
    
    public static void method908(byte arg0) {
	try {
	    try {
		Graphics graphics = Class62.aCanvas1469.getGraphics();
		if (arg0 <= 83)
		    method908((byte) 19);
		RSCanvas.aClass68_64.method1044(0, 17, graphics, 357);
	    } catch (Exception exception) {
		Class62.aCanvas1469.repaint();
	    }
	    anInt1054++;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "pb.J(" + arg0 + ')');
	}
    }
    
    public Node method909(int arg0) {
	try {
	    anInt1053++;
	    Node class40 = aClass40_1068;
	    if (aClass40_1056 == class40) {
		aClass40_1068 = null;
		return null;
	    }
	    if (arg0 != -4)
		method910(109);
	    aClass40_1068 = class40.aClass40_950;
	    return class40;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "pb.F(" + arg0 + ')');
	}
    }
    
    public static void method910(int arg0) {
	anInt1065++;
	if (arg0 == -32322) {
	    if (Class46.aBoolean1112
		&& (Class40_Sub6.anInt2120
		    != Player.anInt3267))
		Class40_Sub5_Sub17_Sub4.method789
		    ((Class40_Sub5_Sub13.aClass40_Sub5_Sub17_Sub4_Sub1_2760
		      .anIntArray3088[0]),
		     -1000, Class17.anInt448, Class51.anInt1202,
		     (Class40_Sub5_Sub13.aClass40_Sub5_Sub17_Sub4_Sub1_2760
		      .anIntArray3135[0]),
		     Player.anInt3267);
	    else if (Buffer.anInt1985
		     != Player.anInt3267) {
		Buffer.anInt1985
		    = Player.anInt3267;
		Class22.method299((byte) 53,
				  Player.anInt3267);
	    }
	}
    }
    
    public void method911(int arg0, Node arg1, Node arg2) {
	try {
	    anInt1052++;
	    if (arg2.aClass40_968 != null)
		arg2.method457(-1);
	    if (arg0 == -31793) {
		arg2.aClass40_950 = arg1;
		arg2.aClass40_968 = arg1.aClass40_968;
		arg2.aClass40_968.aClass40_950 = arg2;
		arg2.aClass40_950.aClass40_968 = arg2;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   ("pb.O(" + arg0 + ','
				    + (arg1 != null ? "{...}" : "null") + ','
				    + (arg2 != null ? "{...}" : "null")
				    + ')'));
	}
    }
    
    public Node method912(int arg0) {
	try {
	    if (arg0 != 4)
		return null;
	    anInt1074++;
	    Node class40 = aClass40_1068;
	    if (class40 == aClass40_1056) {
		aClass40_1068 = null;
		return null;
	    }
	    aClass40_1068 = class40.aClass40_968;
	    return class40;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "pb.D(" + arg0 + ')');
	}
    }
    
    public Node method913(int arg0) {
	try {
	    anInt1055++;
	    if (arg0 != 25447)
		method902((byte) -115);
	    Node class40 = aClass40_1056.aClass40_950;
	    if (aClass40_1056 == class40)
		return null;
	    class40.method457(arg0 + -25448);
	    return class40;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "pb.C(" + arg0 + ')');
	}
    }
    
    public Class45() {
	try {
	    aClass40_1056.aClass40_968 = aClass40_1056;
	    aClass40_1056.aClass40_950 = aClass40_1056;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "pb.<init>(" + ')');
	}
    }
    
    static {
	anInt1073 = 0;
	aClass45_1064 = new Class45();
	aClass1_1077 = Class58.method978(-11538, "(U2");
	aClass1_1080 = Class58.method978(-11538, "cyan:");
	aClass1_1076 = aClass1_1080;
	aClass1_1078
	    = (Class58.method978
	       (-11538,
		"(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3"));
	aClass1_1079
	    = Class58.method978(-11538, "Name des Gegenstands eingeben:");
	aClass40_Sub1_1081 = new Buffer(8);
	anIntArray1083 = new int[1000];
	aClass1_1084 = Class58.method978(-11538, "Texturen geladen)3");
	aClass1_1085 = Class58.method978(-11538, "m");
	aClass30_1082 = new Class30();
    }
}