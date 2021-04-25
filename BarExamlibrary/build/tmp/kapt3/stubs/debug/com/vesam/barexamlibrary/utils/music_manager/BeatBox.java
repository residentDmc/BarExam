package com.vesam.barexamlibrary.utils.music_manager;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006!"}, d2 = {"Lcom/vesam/barexamlibrary/utils/music_manager/BeatBox;", "", "context", "Landroid/content/Context;", "handelErrorTools", "Lcom/vesam/barexamlibrary/utils/tools/HandelErrorTools;", "(Landroid/content/Context;Lcom/vesam/barexamlibrary/utils/tools/HandelErrorTools;)V", "afd", "Landroid/content/res/AssetFileDescriptor;", "assetManager", "Landroid/content/res/AssetManager;", "getAssetManager", "()Landroid/content/res/AssetManager;", "setAssetManager", "(Landroid/content/res/AssetManager;)V", "soundsList", "Ljava/util/ArrayList;", "Lcom/vesam/barexamlibrary/utils/music_manager/Sound;", "Lkotlin/collections/ArrayList;", "getSoundsList", "()Ljava/util/ArrayList;", "setSoundsList", "(Ljava/util/ArrayList;)V", "loadSounds", "", "play", "sound", "mediaPlayer", "Landroid/media/MediaPlayer;", "looping", "", "release", "Companion", "BarExamlibrary_debug"})
public final class BeatBox {
    private android.content.res.AssetFileDescriptor afd;
    public android.content.res.AssetManager assetManager;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.vesam.barexamlibrary.utils.music_manager.Sound> soundsList;
    private android.content.Context context;
    private com.vesam.barexamlibrary.utils.tools.HandelErrorTools handelErrorTools;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ASSET_DIR_SAMPLE_SOUNDS = "sound";
    @org.jetbrains.annotations.NotNull()
    public static final com.vesam.barexamlibrary.utils.music_manager.BeatBox.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.res.AssetManager getAssetManager() {
        return null;
    }
    
    public final void setAssetManager(@org.jetbrains.annotations.NotNull()
    android.content.res.AssetManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.vesam.barexamlibrary.utils.music_manager.Sound> getSoundsList() {
        return null;
    }
    
    public final void setSoundsList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.vesam.barexamlibrary.utils.music_manager.Sound> p0) {
    }
    
    private final void loadSounds() {
    }
    
    public final void play(@org.jetbrains.annotations.NotNull()
    com.vesam.barexamlibrary.utils.music_manager.Sound sound, @org.jetbrains.annotations.NotNull()
    android.media.MediaPlayer mediaPlayer, boolean looping) {
    }
    
    public final void release(@org.jetbrains.annotations.NotNull()
    android.media.MediaPlayer mediaPlayer) {
    }
    
    public BeatBox(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.vesam.barexamlibrary.utils.tools.HandelErrorTools handelErrorTools) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/vesam/barexamlibrary/utils/music_manager/BeatBox$Companion;", "", "()V", "ASSET_DIR_SAMPLE_SOUNDS", "", "BarExamlibrary_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}