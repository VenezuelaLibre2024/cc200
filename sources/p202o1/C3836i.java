package p202o1;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import p232q1.C4122a;
import p232q1.C4124c;
import p232q1.C4125d;
import p262s1.InterfaceC4388b;
import p262s1.InterfaceC4389c;

/* renamed from: o1.i */
/* loaded from: classes.dex */
public class C3836i implements InterfaceC4389c {

    /* renamed from: h */
    public final Context f13839h;

    /* renamed from: i */
    public final String f13840i;

    /* renamed from: j */
    public final File f13841j;

    /* renamed from: k */
    public final int f13842k;

    /* renamed from: l */
    public final InterfaceC4389c f13843l;

    /* renamed from: m */
    public C3828a f13844m;

    /* renamed from: n */
    public boolean f13845n;

    public C3836i(Context context, String str, File file, int i10, InterfaceC4389c interfaceC4389c) {
        this.f13839h = context;
        this.f13840i = str;
        this.f13841j = file;
        this.f13842k = i10;
        this.f13843l = interfaceC4389c;
    }

    @Override // p262s1.InterfaceC4389c
    /* renamed from: U */
    public synchronized InterfaceC4388b mo14600U() {
        if (!this.f13845n) {
            m14603f();
            this.f13845n = true;
        }
        return this.f13843l.mo14600U();
    }

    /* renamed from: a */
    public final void m14601a(File file) {
        ReadableByteChannel channel;
        if (this.f13840i != null) {
            channel = Channels.newChannel(this.f13839h.getAssets().open(this.f13840i));
        } else {
            if (this.f13841j == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f13841j).getChannel();
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f13839h.getCacheDir());
        createTempFile.deleteOnExit();
        C4125d.m15903a(channel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    @Override // p262s1.InterfaceC4389c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f13843l.close();
        this.f13845n = false;
    }

    /* renamed from: d */
    public void m14602d(C3828a c3828a) {
        this.f13844m = c3828a;
    }

    /* renamed from: f */
    public final void m14603f() {
        String databaseName = getDatabaseName();
        File databasePath = this.f13839h.getDatabasePath(databaseName);
        C3828a c3828a = this.f13844m;
        C4122a c4122a = new C4122a(databaseName, this.f13839h.getFilesDir(), c3828a == null || c3828a.f13782j);
        try {
            c4122a.m15896b();
            if (!databasePath.exists()) {
                try {
                    m14601a(databasePath);
                    c4122a.m15897c();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            if (this.f13844m == null) {
                c4122a.m15897c();
                return;
            }
            try {
                int m15902c = C4124c.m15902c(databasePath);
                int i10 = this.f13842k;
                if (m15902c == i10) {
                    c4122a.m15897c();
                    return;
                }
                if (this.f13844m.m14542a(m15902c, i10)) {
                    c4122a.m15897c();
                    return;
                }
                if (this.f13839h.deleteDatabase(databaseName)) {
                    try {
                        m14601a(databasePath);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c4122a.m15897c();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                c4122a.m15897c();
                return;
            }
        } catch (Throwable th) {
            c4122a.m15897c();
            throw th;
        }
        c4122a.m15897c();
        throw th;
    }

    @Override // p262s1.InterfaceC4389c
    public String getDatabaseName() {
        return this.f13843l.getDatabaseName();
    }

    @Override // p262s1.InterfaceC4389c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f13843l.setWriteAheadLoggingEnabled(z10);
    }
}
