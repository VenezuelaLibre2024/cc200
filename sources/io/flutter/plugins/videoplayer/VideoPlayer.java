package io.flutter.plugins.videoplayer;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.exoplayer2.source.dash.C1152c;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.C1156a;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import io.flutter.plugin.common.EventChannel;
import io.flutter.view.TextureRegistry;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p047d5.C1547b;
import p047d5.C1550e;
import p152k4.C3348a;
import p193n5.C3759z;
import p206o5.C3923r;
import p206o5.C3924s;
import p206o5.InterfaceC3910j;
import p222p5.C4041n0;
import p236q5.C4192y;
import p264s3.AbstractC4505u3;
import p264s3.C4403a3;
import p264s3.C4463m1;
import p264s3.C4471o;
import p264s3.C4503u1;
import p264s3.C4519x2;
import p264s3.C4528z1;
import p264s3.C4530z3;
import p264s3.InterfaceC4409b3;
import p264s3.InterfaceC4486r;
import p289u3.C4813e;
import p290u4.C4859h0;
import p290u4.InterfaceC4882t;

/* loaded from: classes2.dex */
final class VideoPlayer {
    private static final String FORMAT_DASH = "dash";
    private static final String FORMAT_HLS = "hls";
    private static final String FORMAT_OTHER = "other";
    private static final String FORMAT_SS = "ss";
    private static final String USER_AGENT = "User-Agent";
    private final EventChannel eventChannel;
    private QueuingEventSink eventSink;
    private InterfaceC4486r exoPlayer;
    private C3924s.b httpDataSourceFactory;
    public boolean isInitialized;
    private final VideoPlayerOptions options;
    private Surface surface;
    private final TextureRegistry.SurfaceTextureEntry textureEntry;

    public VideoPlayer(Context context, EventChannel eventChannel, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, String str, String str2, Map<String, String> map, VideoPlayerOptions videoPlayerOptions) {
        this.isInitialized = false;
        this.httpDataSourceFactory = new C3924s.b();
        this.eventChannel = eventChannel;
        this.textureEntry = surfaceTextureEntry;
        this.options = videoPlayerOptions;
        InterfaceC4486r m17523e = new InterfaceC4486r.b(context).m17523e();
        Uri parse = Uri.parse(str);
        buildHttpDataSourceFactory(map);
        m17523e.mo17511l(buildMediaSource(parse, new C3923r.a(context, this.httpDataSourceFactory), str2));
        m17523e.mo17081a();
        setUpVideoPlayer(m17523e, new QueuingEventSink());
    }

    public VideoPlayer(InterfaceC4486r interfaceC4486r, EventChannel eventChannel, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, VideoPlayerOptions videoPlayerOptions, QueuingEventSink queuingEventSink, C3924s.b bVar) {
        this.isInitialized = false;
        this.httpDataSourceFactory = new C3924s.b();
        this.eventChannel = eventChannel;
        this.textureEntry = surfaceTextureEntry;
        this.options = videoPlayerOptions;
        this.httpDataSourceFactory = bVar;
        setUpVideoPlayer(interfaceC4486r, queuingEventSink);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private InterfaceC4882t buildMediaSource(Uri uri, InterfaceC3910j.a aVar, String str) {
        char c10;
        int i10 = 0;
        if (str != null) {
            switch (str.hashCode()) {
                case 3680:
                    if (str.equals(FORMAT_SS)) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 103407:
                    if (str.equals(FORMAT_HLS)) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3075986:
                    if (str.equals(FORMAT_DASH)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 106069776:
                    if (str.equals(FORMAT_OTHER)) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = 1;
                    break;
                case 1:
                    i10 = 2;
                    break;
                case 2:
                    break;
                case 3:
                    i10 = 4;
                    break;
                default:
                    i10 = -1;
                    break;
            }
        } else {
            i10 = C4041n0.m15470m0(uri);
        }
        if (i10 == 0) {
            return new DashMediaSource.Factory(new C1152c.a(aVar), aVar).m4739a(C4503u1.m17600d(uri));
        }
        if (i10 == 1) {
            return new SsMediaSource.Factory(new C1156a.a(aVar), aVar).m4879a(C4503u1.m17600d(uri));
        }
        if (i10 == 2) {
            return new HlsMediaSource.Factory(aVar).m4871a(C4503u1.m17600d(uri));
        }
        if (i10 == 4) {
            return new C4859h0.b(aVar).m19321b(C4503u1.m17600d(uri));
        }
        throw new IllegalStateException("Unsupported type: " + i10);
    }

    private static void setAudioAttributes(InterfaceC4486r interfaceC4486r, boolean z10) {
        interfaceC4486r.mo17510h(new C4813e.e().m19018c(3).m19016a(), !z10);
    }

    private void setUpVideoPlayer(final InterfaceC4486r interfaceC4486r, final QueuingEventSink queuingEventSink) {
        this.exoPlayer = interfaceC4486r;
        this.eventSink = queuingEventSink;
        this.eventChannel.setStreamHandler(new EventChannel.StreamHandler() { // from class: io.flutter.plugins.videoplayer.VideoPlayer.1
            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onCancel(Object obj) {
                queuingEventSink.setDelegate(null);
            }

            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onListen(Object obj, EventChannel.EventSink eventSink) {
                queuingEventSink.setDelegate(eventSink);
            }
        });
        Surface surface = new Surface(this.textureEntry.surfaceTexture());
        this.surface = surface;
        interfaceC4486r.mo17086f(surface);
        setAudioAttributes(interfaceC4486r, this.options.mixWithOthers);
        interfaceC4486r.mo17093o(new InterfaceC4409b3.d() { // from class: io.flutter.plugins.videoplayer.VideoPlayer.2
            private boolean isBuffering = false;

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(C4813e c4813e) {
                super.onAudioAttributesChanged(c4813e);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
                super.onAudioSessionIdChanged(i10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(InterfaceC4409b3.b bVar) {
                super.onAvailableCommandsChanged(bVar);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onCues(C1550e c1550e) {
                super.onCues(c1550e);
            }

            @Override // p264s3.InterfaceC4409b3.d
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(List list) {
                super.onCues((List<C1547b>) list);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(C4471o c4471o) {
                super.onDeviceInfoChanged(c4471o);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
                super.onDeviceVolumeChanged(i10, z10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onEvents(InterfaceC4409b3 interfaceC4409b3, InterfaceC4409b3.c cVar) {
                super.onEvents(interfaceC4409b3, cVar);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
                super.onIsLoadingChanged(z10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public void onIsPlayingChanged(boolean z10) {
                if (queuingEventSink != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "isPlayingStateUpdate");
                    hashMap.put("isPlaying", Boolean.valueOf(z10));
                    queuingEventSink.success(hashMap);
                }
            }

            @Override // p264s3.InterfaceC4409b3.d
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
                super.onLoadingChanged(z10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
                super.onMaxSeekToPreviousPositionChanged(j10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onMediaItemTransition(C4503u1 c4503u1, int i10) {
                super.onMediaItemTransition(c4503u1, i10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(C4528z1 c4528z1) {
                super.onMediaMetadataChanged(c4528z1);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onMetadata(C3348a c3348a) {
                super.onMetadata(c3348a);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
                super.onPlayWhenReadyChanged(z10, i10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(C4403a3 c4403a3) {
                super.onPlaybackParametersChanged(c4403a3);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public void onPlaybackStateChanged(int i10) {
                if (i10 == 2) {
                    setBuffering(true);
                    VideoPlayer.this.sendBufferingUpdate();
                } else if (i10 == 3) {
                    VideoPlayer videoPlayer = VideoPlayer.this;
                    if (!videoPlayer.isInitialized) {
                        videoPlayer.isInitialized = true;
                        videoPlayer.sendInitialized();
                    }
                } else if (i10 == 4) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "completed");
                    queuingEventSink.success(hashMap);
                }
                if (i10 != 2) {
                    setBuffering(false);
                }
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
                super.onPlaybackSuppressionReasonChanged(i10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public void onPlayerError(C4519x2 c4519x2) {
                setBuffering(false);
                if (c4519x2.f16978h == 1002) {
                    interfaceC4486r.mo17091m();
                    interfaceC4486r.mo17081a();
                    return;
                }
                QueuingEventSink queuingEventSink2 = queuingEventSink;
                if (queuingEventSink2 != null) {
                    queuingEventSink2.error("VideoError", "Video player had error " + c4519x2, null);
                }
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(C4519x2 c4519x2) {
                super.onPlayerErrorChanged(c4519x2);
            }

            @Override // p264s3.InterfaceC4409b3.d
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
                super.onPlayerStateChanged(z10, i10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(C4528z1 c4528z1) {
                super.onPlaylistMetadataChanged(c4528z1);
            }

            @Override // p264s3.InterfaceC4409b3.d
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
                super.onPositionDiscontinuity(i10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(InterfaceC4409b3.e eVar, InterfaceC4409b3.e eVar2, int i10) {
                super.onPositionDiscontinuity(eVar, eVar2, i10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
                super.onRenderedFirstFrame();
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
                super.onRepeatModeChanged(i10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j10) {
                super.onSeekBackIncrementChanged(j10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
                super.onSeekForwardIncrementChanged(j10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            @Deprecated
            public /* bridge */ /* synthetic */ void onSeekProcessed() {
                super.onSeekProcessed();
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
                super.onShuffleModeEnabledChanged(z10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
                super.onSkipSilenceEnabledChanged(z10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
                super.onSurfaceSizeChanged(i10, i11);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onTimelineChanged(AbstractC4505u3 abstractC4505u3, int i10) {
                super.onTimelineChanged(abstractC4505u3, i10);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(C3759z c3759z) {
                super.onTrackSelectionParametersChanged(c3759z);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onTracksChanged(C4530z3 c4530z3) {
                super.onTracksChanged(c4530z3);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(C4192y c4192y) {
                super.onVideoSizeChanged(c4192y);
            }

            @Override // p264s3.InterfaceC4409b3.d
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
                super.onVolumeChanged(f10);
            }

            public void setBuffering(boolean z10) {
                if (this.isBuffering != z10) {
                    this.isBuffering = z10;
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", this.isBuffering ? "bufferingStart" : "bufferingEnd");
                    queuingEventSink.success(hashMap);
                }
            }
        });
    }

    public void buildHttpDataSourceFactory(Map<String, String> map) {
        boolean z10 = !map.isEmpty();
        this.httpDataSourceFactory.m14904e((z10 && map.containsKey(USER_AGENT)) ? map.get(USER_AGENT) : "ExoPlayer").m14902c(true);
        if (z10) {
            this.httpDataSourceFactory.m14903d(map);
        }
    }

    public void dispose() {
        if (this.isInitialized) {
            this.exoPlayer.stop();
        }
        this.textureEntry.release();
        this.eventChannel.setStreamHandler(null);
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        InterfaceC4486r interfaceC4486r = this.exoPlayer;
        if (interfaceC4486r != null) {
            interfaceC4486r.release();
        }
    }

    public long getPosition() {
        return this.exoPlayer.mo17079H();
    }

    public void pause() {
        this.exoPlayer.mo17096r(false);
    }

    public void play() {
        this.exoPlayer.mo17096r(true);
    }

    public void seekTo(int i10) {
        this.exoPlayer.mo17082b(i10);
    }

    public void sendBufferingUpdate() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "bufferingUpdate");
        hashMap.put("values", Collections.singletonList(Arrays.asList(0, Long.valueOf(this.exoPlayer.mo17098t()))));
        this.eventSink.success(hashMap);
    }

    public void sendInitialized() {
        if (this.isInitialized) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "initialized");
            hashMap.put("duration", Long.valueOf(this.exoPlayer.mo17083c()));
            if (this.exoPlayer.mo17512w() != null) {
                C4463m1 mo17512w = this.exoPlayer.mo17512w();
                int i10 = mo17512w.f16511x;
                int i11 = mo17512w.f16512y;
                int i12 = mo17512w.f16480A;
                if (i12 == 90 || i12 == 270) {
                    i10 = this.exoPlayer.mo17512w().f16512y;
                    i11 = this.exoPlayer.mo17512w().f16511x;
                }
                hashMap.put("width", Integer.valueOf(i10));
                hashMap.put("height", Integer.valueOf(i11));
                if (i12 == 180) {
                    hashMap.put("rotationCorrection", Integer.valueOf(i12));
                }
            }
            this.eventSink.success(hashMap);
        }
    }

    public void setLooping(boolean z10) {
        this.exoPlayer.mo17073B(z10 ? 2 : 0);
    }

    public void setPlaybackSpeed(double d10) {
        this.exoPlayer.mo17084d(new C4403a3((float) d10));
    }

    public void setVolume(double d10) {
        this.exoPlayer.mo17085e((float) Math.max(0.0d, Math.min(1.0d, d10)));
    }
}
