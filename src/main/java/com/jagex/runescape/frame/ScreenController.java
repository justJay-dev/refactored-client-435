package com.jagex.runescape.frame;

import com.jagex.runescape.*;
import com.jagex.runescape.cache.Cache;
import com.jagex.runescape.cache.def.ActorDefinition;
import com.jagex.runescape.cache.def.IdentityKit;
import com.jagex.runescape.cache.def.VarbitDefinition;
import com.jagex.runescape.cache.media.SpotAnimDefinition;
import com.jagex.runescape.input.MouseHandler;
import com.jagex.runescape.language.English;
import com.jagex.runescape.language.Native;
import com.jagex.runescape.media.Rasterizer;
import com.jagex.runescape.media.Rasterizer3D;
import com.jagex.runescape.media.renderable.GameObject;
import com.jagex.runescape.media.renderable.Item;
import com.jagex.runescape.media.renderable.actor.Player;
import com.jagex.runescape.net.ISAAC;
import com.jagex.runescape.net.PacketBuffer;
import com.jagex.runescape.scene.GroundItemTile;
import com.jagex.runescape.scene.InteractiveObject;
import com.jagex.runescape.scene.Scene;
import com.jagex.runescape.scene.SceneCluster;

import java.awt.*;
import java.text.MessageFormat;

public class ScreenController {


    public static ScreenMode frameMode = null;
    public static int frameWidth = 765;
    public static int frameHeight = 503;
    public static Minimap minimap = new Minimap();
    private static Thread drawingThread;
    private static FrameRenderer renderer;


    public static void frameMode(ScreenMode screenMode) {
        if(frameMode != screenMode) {
            frameMode = screenMode;
            if(screenMode == ScreenMode.FIXED) {
                frameWidth = 765;
                frameHeight = 503;
                Class35.aFrame1732.setResizable(false);
                Class35.aFrame1732.setPreferredSize(new Dimension(ScreenController.frameWidth, ScreenController.frameHeight));
                Class35.aFrame1732.setMinimumSize(new Dimension(ScreenController.frameWidth, ScreenController.frameHeight));
            } else if(screenMode == ScreenMode.RESIZABLE) {
                frameWidth = 900;
                frameHeight = 600;
                Class35.aFrame1732.setResizable(true);
                Class35.aFrame1732.setPreferredSize(new Dimension(ScreenController.frameWidth, ScreenController.frameHeight));
                Class35.aFrame1732.setMinimumSize(new Dimension(ScreenController.frameWidth, ScreenController.frameHeight));


            } else if(screenMode == ScreenMode.FULLSCREEN) {
                frameWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
                frameHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            }
            Insets insets = Class35.aFrame1732.getInsets();
            Class35.aFrame1732.setSize(insets.right + ScreenController.frameWidth + insets.left, insets.bottom + insets.top + ScreenController.frameHeight);
        }

    }

    public static void refreshFrameSize() {
        Class12.width = frameWidth;
        IdentityKit.height = frameHeight;
        if(frameMode != ScreenMode.FIXED) {
            if(frameWidth != Class35.aFrame1732.getWidth()) {
                frameWidth = Class35.aFrame1732.getWidth();
                setBounds();
            }
            if(frameHeight != Class35.aFrame1732.getHeight()) {
                frameHeight = Class35.aFrame1732.getHeight();
                setBounds();
            }
        }
    }

    public static void setBounds() {
        Rasterizer3D.prepare(null, frameMode == ScreenMode.FIXED ? 512 : frameWidth, frameMode == ScreenMode.FIXED ? 334 : frameHeight);
        Class24.fullScreenTextureArray = Rasterizer3D.setLineOffsets(null);
        Rasterizer3D.prepare(null, frameMode == ScreenMode.FIXED ? 479 : frameWidth, frameMode == ScreenMode.FIXED ? 96 : frameHeight);
        Class5.chatboxLineOffsets = Rasterizer3D.setLineOffsets(null);
        Rasterizer3D.prepare(null, frameMode == ScreenMode.FIXED ? 190 : frameWidth, frameMode == ScreenMode.FIXED ? 261 : frameHeight);
        ActorDefinition.sidebarOffsets = Rasterizer3D.setLineOffsets(null);
        Rasterizer3D.prepare(null, frameMode == ScreenMode.FIXED ? 765 : frameWidth, frameMode == ScreenMode.FIXED ? 503 : frameHeight);
        Player.viewportOffsets = Rasterizer3D.setLineOffsets(null);

        int[] is = new int[9];
        for(int i = 0; i < 9; i++) {
            int i_0_ = 15 + 32 * i + 128;
            int i_1_ = 3 * i_0_ + 600;
            int i_2_ = Rasterizer3D.sinetable[i_0_];
            is[i] = i_2_ * i_1_ >> 16;
        }


        Scene.method95(500, 800, frameMode == ScreenMode.FIXED ? 512 : frameWidth, frameMode == ScreenMode.FIXED ? 334 : frameHeight, is);
        MouseHandler.aCanvas1469.setSize(ScreenController.frameMode == ScreenMode.FIXED ? 512 : ScreenController.frameWidth, ScreenController.frameMode == ScreenMode.FIXED ? 334 : ScreenController.frameHeight);

        if(Class51.anInt1197 <= 35 && Class51.anInt1197 >= 30) {
            VarbitDefinition.gameScreenImageProducer = Class40_Sub5_Sub13.createGraphicsBuffer(ScreenController.frameMode == ScreenMode.FIXED ? 512 : ScreenController.frameWidth, ScreenController.frameMode == ScreenMode.FIXED ? 334 : ScreenController.frameHeight, Class35.aFrame1732);
        } else {
            MouseHandler.aCanvas1469.setSize(Class12.width, IdentityKit.height);
            MouseHandler.aCanvas1469.setVisible(true);
            if (Class35.aFrame1732 == null)
                MouseHandler.aCanvas1469.setLocation(0, 0);
            else {
                Insets insets = Class35.aFrame1732.getInsets();
                MouseHandler.aCanvas1469.setLocation(insets.left, insets.top);
            }//            Class38.loginBoxGraphics = Class40_Sub5_Sub13.createGraphicsBuffer(frameWidth, frameHeight, Class35.aFrame1732);
        }
    }

    public static void RenderResizableUI() {
        if(drawingThread == null) {
            renderer = new FrameRenderer(minimap);
            drawingThread = new Thread(renderer);
            drawingThread.start();
        }
        minimap.drawResizableMiniMapArea(frameWidth - 210, 0);
        Insets insets = Class35.aFrame1732.getInsets();

        RenderTabArea(frameWidth - 234, frameHeight - (359 + insets.top/4));
        RenderChatArea(0, frameHeight - (184 + insets.top/4));

        if(Class4.menuOpen) {
            Class40_Sub5_Sub6.drawMenu(0, 0);
        }

    }
    public static void RenderTabArea(int x, int y) {
        // height 337
        // width 234
        drawFramePiece(GameObject.tabPieceLeft, x + 212, y + 39);
        drawFramePieceCutout(Class61.tabPieceUpperRight, x, y + 39, Class61.tabPieceUpperRight.width - 15, Class61.tabPieceUpperRight.height, 15, 0);
        drawFramePieceCutout(Class30.tabPieveLowerRight, x, y + 191, Class30.tabPieveLowerRight.width - 35, Class30.tabPieveLowerRight.height, 35, 0);
        drawFramePieceCutout(Class17.chatboxTop, x, y + 172, Class17.chatboxTop.width - 531, Class17.chatboxTop.height, 531, 0);
        drawFramePieceCutout(RSCanvas.tabBottom, x, y + 300, RSCanvas.tabBottom.width - 35, RSCanvas.tabBottom.height, 35, 0);
        drawFramePieceCutout(InteractiveObject.tabTop, x, y, InteractiveObject.tabTop.width - 15, InteractiveObject.tabTop.height - 6, 15, 6);
        drawFramePiece(SubNode.tabImageProducer, x + 22, y + 39);


    }

    public static void RenderChatArea(int x, int y) {
        //width 516
        //height 184
        drawFramePiece(RSCanvas.chatboxProducingGraphicsBuffer, x + 17, y + 16);
        drawFramePiece(HuffmanEncoding.aProducingGraphicsBuffer_1541, x, y + 112);
        drawFramePieceCutout(RSCanvas.tabBottom, x + 496, y + 125, 20, RSCanvas.tabBottom.height, 0, 0);
        drawFramePiece(Class40_Sub5_Sub1.chatboxRight, x, y + 16);
        drawFramePieceCutout(Class17.chatboxTop, x, y, Class17.chatboxTop.width - 37, Class17.chatboxTop.height - 3, 0, 3);
        //        System.out.println(Class40_Sub5_Sub1.chatboxRight.height + (Class17.chatboxTop.height-3) + HuffmanEncoding.aProducingGraphicsBuffer_1541.height);

        drawFramePieceCutout(Class30.tabPieveLowerRight, x + 496, y + 16, 20, Class30.tabPieveLowerRight.height, 0, 0);


    }

    public static void drawFramePiece(ProducingGraphicsBuffer framePiece, int x, int y) {
        Rasterizer.copyPixels(framePiece.pixels, framePiece.width, framePiece.height, x, y);
    }

    public static void drawFramePieceCutout(ProducingGraphicsBuffer framePiece, int x, int y, int width, int height, int offsetX, int offsetY) {
        Rasterizer.copyPixelsCutOff(framePiece.pixels, framePiece.width, framePiece.height, x, y, width, height, offsetX, offsetY);
    }


    public static boolean isCoordinatesIn3dScreen(int x, int y) {
        if(frameMode == ScreenMode.FIXED) {
            return x > 4 && y > 4 && x < 516 && y < 338;
        } else {
            return x > 0 && y > 0 && x < frameWidth && y < frameHeight && !isCoordinatesInExtendedTabArea(x, y) && !isCoordinatesInMinimapArea(x, y) && !isCoordinatesInExtendedChatArea(x, y);

        }
    }

    public static boolean isCoordinatesInTabArea(int x, int y) {
        Insets insets = Class35.aFrame1732.getInsets();

        if(frameMode == ScreenMode.FIXED) {
            return x > 553 && y > 205 && x < 743 && y < 466;
        } else {
            return x > frameWidth - 234 + 22 && y > frameHeight - (359 + insets.top/4) + 39 && x < frameWidth - GameObject.tabPieceLeft.width && y < frameHeight - RSCanvas.tabBottom.height;
        }
    }


    public static boolean isCoordinatesInExtendedTabArea(int x, int y) {
        Insets insets = Class35.aFrame1732.getInsets();

        return x > frameWidth - 234 && y > frameHeight - (359 + insets.top/4);
    }

    public static boolean isCoordinatesInExtendedChatArea(int x, int y) {
        Insets insets = Class35.aFrame1732.getInsets();

        return x > 0 && y > frameHeight - (184 + insets.top/4) && x < 516;
    }

    public static boolean isCoordinatesInChatArea(int x, int y) {
        Insets insets = Class35.aFrame1732.getInsets();

        if(frameMode == ScreenMode.FIXED) {
            return x > 17 && y > 357 && x < 496 && y < 453;
        } else {
            return x > 17 && y > frameHeight - (200+ insets.top/4) && x < frameWidth - 496 && y < frameHeight - 54;
        }

    }

    public static boolean isCoordinatesInMinimapArea(int x, int y) {
        if(frameMode == ScreenMode.FIXED) {
            return x > 575 && y < 156;
        } else {
            return x > frameWidth - 210 && y < 210;
        }
    }

    public static void handleTabClick(int x, int y) {
        if(frameMode == ScreenMode.FIXED) {

            if(Class29.tabAreaOverlayWidgetId != -1)
                Class13.method243((byte) 89, 205, 743, 466, Class29.tabAreaOverlayWidgetId, 553, x, y, 1);
            else if(Class40_Sub5_Sub11.tabWidgetIds[Class5.currentTabId] != -1) {
                Class13.method243((byte) 89, 205, 743, 466, Class40_Sub5_Sub11.tabWidgetIds[Class5.currentTabId], 553, x, y, 1);
            }
        } else {
            if(Class29.tabAreaOverlayWidgetId != -1)
                Class13.method243((byte) 89, frameHeight - 359 + 39, frameWidth - GameObject.tabPieceLeft.width, frameHeight - RSCanvas.tabBottom.height, Class29.tabAreaOverlayWidgetId, frameWidth - 234 + 22, x, y, 1);
            else if(Class40_Sub5_Sub11.tabWidgetIds[Class5.currentTabId] != -1) {
                Class13.method243((byte) 89, frameHeight - 359 + 39, frameWidth - GameObject.tabPieceLeft.width, frameHeight - RSCanvas.tabBottom.height, Class40_Sub5_Sub11.tabWidgetIds[Class5.currentTabId], frameWidth - 234 + 22, x, y, 1);
            }
        }
    }

    public static void handleChatClick(int x, int y) {
        if(frameMode == ScreenMode.FIXED) {

            if(ChatBox.openChatboxWidgetId == -1) {
                if(ChatBox.dialogueId == -1) {
                    if(y < 434 && x < 426)
                        Class40_Sub11.method873(y  -357, 45);
                } else
                    Class13.method243((byte) 89, 357, 496, 453, ChatBox.dialogueId, 17, x, y, 3);
            } else
                Class13.method243((byte) 89, 357, 496, 453, ChatBox.openChatboxWidgetId, 17, x, y, 2);
        } else {
            if(ChatBox.openChatboxWidgetId == -1) {
                if(ChatBox.dialogueId == -1) {
                    if(y < frameHeight - (112) && x < 426)
                        Class40_Sub11.method873(y  -(frameHeight - 162), 45);
                } else
                    Class13.method243((byte) 89, (frameHeight - 162), frameWidth - 496, frameHeight - 54, ChatBox.dialogueId, 17, x, y, 3);
            } else
                Class13.method243((byte) 89, (frameHeight - 162), frameWidth - 496, frameHeight - 54, ChatBox.openChatboxWidgetId, 17, x, y, 2);
        }

    }


    public static void handleMinimapMouse() {
        if(Class27.minimapState != 0) {
            return;
        }
        if(MouseHandler.clickType == 1) {
            int x;
            int y;
            if(frameMode == ScreenMode.FIXED) {
                x = -575 + Class57.clickX;
                y = -5 + RSString.clickY - 4;
                if(x >= 0 && y >= 0 && x < 146 && y < 151) {
                    x -= 73;
                    y -= 75;
                } else {
                    return;
                }

            } else {
                x = -(frameWidth - 210) + Class57.clickX;
                y = -5 + RSString.clickY - 4;
                if(x >= 0 && y >= 0 && x < 204 && y < 200) {
                    x -= 107;
                    y -= 100;
                } else {
                    return;
                }
            }
            int angle = 0x7ff & Class43.cameraYawOffset + GroundItemTile.cameraHorizontal;
            int sin = Rasterizer3D.sinetable[angle];
            int cos = Rasterizer3D.cosinetable[angle];
            cos = (Class51.mapZoomOffset + 256) * cos >> 8;
            sin = (Class51.mapZoomOffset + 256) * sin >> 8;
            int i_14_ = y * sin + x * cos >> 11;
            int i_15_ = cos * y - x * sin >> 11;
            int destX = Player.localPlayer.worldX + i_14_ >> 7;
            int destY = -i_15_ + Player.localPlayer.worldY >> 7;

            if(Item.obfuscatedKeyStatus[81] && InteractiveObject.playerRights > 1) {
                SceneCluster.packetBuffer.putPacket(246);
                SceneCluster.packetBuffer.putString(MessageFormat.format(" move {0} {1}", Integer.toString(destX + SpotAnimDefinition.baseX), Integer.toString(destY + Class26.baseY)));
            } else {
                boolean bool = MovedStatics.doWalkTo(0, 0, Player.localPlayer.pathY[0], destX, 0, true, 0, 0, Player.localPlayer.pathX[0], destY, 1);
                if(bool) {
                    SceneCluster.packetBuffer.putByte(x);
                    SceneCluster.packetBuffer.putByte(y);
                    SceneCluster.packetBuffer.putShortBE(GroundItemTile.cameraHorizontal);
                    SceneCluster.packetBuffer.putByte(57);
                    SceneCluster.packetBuffer.putByte(Class43.cameraYawOffset);
                    SceneCluster.packetBuffer.putByte(Class51.mapZoomOffset);
                    SceneCluster.packetBuffer.putByte(89);
                    SceneCluster.packetBuffer.putShortBE(Player.localPlayer.worldX);
                    SceneCluster.packetBuffer.putShortBE(Player.localPlayer.worldY);
                    SceneCluster.packetBuffer.putByte(Class40_Sub5_Sub15.arbitraryDestination);
                    SceneCluster.packetBuffer.putByte(63);
                }
            }
        }
    }

    public static void handleChatButtonsClick() {
        int x = Class57.clickX;
        int y = RSString.clickY;
        if(frameMode == ScreenMode.FIXED) {
            x -= 6;
            y -= 467;
        } else {
            x -= 6;
            y -= frameHeight - 54;
        }
        if(MouseHandler.clickType == 1) {
            if(x >= 0 && x <= 100 && y >= 0 && y <= 32) {
                Cache.redrawChatbox = true;
                ChatBox.publicChatMode = (1 + ChatBox.publicChatMode) % 4;
                ChatBox.redrawChatbox = true;
                SceneCluster.packetBuffer.putPacket(32);
                SceneCluster.packetBuffer.putByte(ChatBox.publicChatMode);
                SceneCluster.packetBuffer.putByte(ChatBox.privateChatMode);
                SceneCluster.packetBuffer.putByte(ChatBox.tradeMode);
            }
            if(x >= 129 && x <= 229 && y >= 0 && y <= 32) {
                ChatBox.redrawChatbox = true;
                ChatBox.privateChatMode = (ChatBox.privateChatMode + 1) % 3;
                Cache.redrawChatbox = true;
                SceneCluster.packetBuffer.putPacket(32);
                SceneCluster.packetBuffer.putByte(ChatBox.publicChatMode);
                SceneCluster.packetBuffer.putByte(ChatBox.privateChatMode);
                SceneCluster.packetBuffer.putByte(ChatBox.tradeMode);
            }
            if(x >= 267 && x <= 367 && y >= 0 && y <= 32) {
                ChatBox.tradeMode = (ChatBox.tradeMode + 1) % 3;
                Cache.redrawChatbox = true;
                ChatBox.redrawChatbox = true;
                SceneCluster.packetBuffer.putPacket(32);
                SceneCluster.packetBuffer.putByte(ChatBox.publicChatMode);
                SceneCluster.packetBuffer.putByte(ChatBox.privateChatMode);
                SceneCluster.packetBuffer.putByte(ChatBox.tradeMode);
            }
            if(x >= 406 && x <= 506 && y >= 0 && y <= 32) {
                if(HuffmanEncoding.openScreenWidgetId == -1) {
                    PacketBuffer.method516();
                    if(Class34.anInt854 != -1) {
                        Class67.reportMutePlayer = false;
                        HuffmanEncoding.reportAbuseInterfaceID = HuffmanEncoding.openScreenWidgetId = Class34.anInt854;
                        Native.reportedName = "";
                    }
                } else
                    Class44.addChatMessage("", English.pleaseCloseInterfaceBeforeReportAbuse, 0);
            }
        }
    }

    public static void handleTabClick() {
        int x = Class57.clickX;
        int y = RSString.clickY;
        if(frameMode == ScreenMode.FIXED) {
            x -= 539;
            y -= 168;
        } else {
            x -= frameWidth - 226;
            y -= frameHeight - 355;
        }
        if(MouseHandler.clickType == 1) {
            if(x >= 0 && x <= 34 && y >= 1 && y < 37 && Class40_Sub5_Sub11.tabWidgetIds[0] != -1) {
                IdentityKit.drawTabIcons = true;
                ISAAC.redrawTabArea = true;
                Class5.currentTabId = 0;
            }
            if(x >= 30 && x <= 60 && y >= 0 && y < 37 && Class40_Sub5_Sub11.tabWidgetIds[1] != -1) {
                Class5.currentTabId = 1;
                ISAAC.redrawTabArea = true;
                IdentityKit.drawTabIcons = true;
            }
            if(x >= 58 && x <= 88 && y >= 0 && y < 37 && Class40_Sub5_Sub11.tabWidgetIds[2] != -1) {
                IdentityKit.drawTabIcons = true;
                Class5.currentTabId = 2;
                ISAAC.redrawTabArea = true;
            }
            if(x >= 86 && x <= 130 && y >= 0 && y < 35 && Class40_Sub5_Sub11.tabWidgetIds[3] != -1) {
                IdentityKit.drawTabIcons = true;
                ISAAC.redrawTabArea = true;
                Class5.currentTabId = 3;
            }
            if(x >= 127 && x <= 157 && y >= 0 && y < 37 && Class40_Sub5_Sub11.tabWidgetIds[4] != -1) {
                Class5.currentTabId = 4;
                ISAAC.redrawTabArea = true;
                IdentityKit.drawTabIcons = true;
            }
            if(x >= 155 && x <= 185 && y >= 0 && y < 37 && Class40_Sub5_Sub11.tabWidgetIds[5] != -1) {
                IdentityKit.drawTabIcons = true;
                ISAAC.redrawTabArea = true;
                Class5.currentTabId = 5;
            }
            if(x >= 183 && x <= 217 && y >= 1 && y < 37 && Class40_Sub5_Sub11.tabWidgetIds[6] != -1) {
                ISAAC.redrawTabArea = true;
                Class5.currentTabId = 6;
                IdentityKit.drawTabIcons = true;
            }
            if(x >= 1 && x <= 35 && y >= 298 && y < 334 && Class40_Sub5_Sub11.tabWidgetIds[7] != -1) {
                Class5.currentTabId = 7;
                IdentityKit.drawTabIcons = true;
                ISAAC.redrawTabArea = true;
            }
            if(x >= 33 && x <= 63 && y >= 298 && y < 335 && Class40_Sub5_Sub11.tabWidgetIds[8] != -1) {
                ISAAC.redrawTabArea = true;
                IdentityKit.drawTabIcons = true;
                Class5.currentTabId = 8;
            }
            if(x >= 60 && x <= 90 && y >= 298 && y < 335 && Class40_Sub5_Sub11.tabWidgetIds[9] != -1) {
                IdentityKit.drawTabIcons = true;
                Class5.currentTabId = 9;
                ISAAC.redrawTabArea = true;
            }
            if(x >= 88 && x <= 132 && y >= 299 && y < 334 && Class40_Sub5_Sub11.tabWidgetIds[10] != -1) {
                Class5.currentTabId = 10;
                IdentityKit.drawTabIcons = true;
                ISAAC.redrawTabArea = true;
            }
            if(x >= 130 && x <= 160 && y >= 298 && y < 335 && Class40_Sub5_Sub11.tabWidgetIds[11] != -1) {
                Class5.currentTabId = 11;
                ISAAC.redrawTabArea = true;
                IdentityKit.drawTabIcons = true;
            }
            if(x >= 157 && x <= 187 && y >= 298 && y < 335 && Class40_Sub5_Sub11.tabWidgetIds[12] != -1) {
                ISAAC.redrawTabArea = true;
                IdentityKit.drawTabIcons = true;
                Class5.currentTabId = 12;
            }
            if(x >= 185 && x <= 219 && y >= 298 && y < 334 && Class40_Sub5_Sub11.tabWidgetIds[13] != -1) {
                Class5.currentTabId = 13;
                ISAAC.redrawTabArea = true;
                IdentityKit.drawTabIcons = true;
            }
        }
    }
}
