package ma;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

/* renamed from: ma.e */
/* loaded from: classes.dex */
public final class C3596e {

    /* renamed from: d */
    public static final String f12657d = "e";

    /* renamed from: a */
    public final Context f12658a;

    /* renamed from: b */
    public boolean f12659b = true;

    /* renamed from: c */
    public boolean f12660c = false;

    public C3596e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f12658a = activity.getApplicationContext();
    }

    /* renamed from: c */
    public static /* synthetic */ void m13324c(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m13325d(MediaPlayer mediaPlayer, int i10, int i11) {
        Log.w(f12657d, "Failed to beep " + i10 + ", " + i11);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    /* renamed from: e */
    public MediaPlayer m13326e() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        if (Build.VERSION.SDK_INT >= 21) {
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        } else {
            mediaPlayer.setAudioStreamType(3);
        }
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ma.c
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                C3596e.m13324c(mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: ma.d
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                boolean m13325d;
                m13325d = C3596e.m13325d(mediaPlayer2, i10, i11);
                return m13325d;
            }
        });
        try {
            AssetFileDescriptor openRawResourceFd = this.f12658a.getResources().openRawResourceFd(C3604m.f12699a);
            try {
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
                return mediaPlayer;
            } catch (Throwable th) {
                openRawResourceFd.close();
                throw th;
            }
        } catch (IOException e10) {
            Log.w(f12657d, e10);
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: f */
    public synchronized void m13327f() {
        Vibrator vibrator;
        if (this.f12659b) {
            m13326e();
        }
        if (this.f12660c && (vibrator = (Vibrator) this.f12658a.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200L);
        }
    }

    /* renamed from: g */
    public void m13328g(boolean z10) {
        this.f12659b = z10;
    }
}
