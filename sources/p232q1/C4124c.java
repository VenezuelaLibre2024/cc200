package p232q1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import p202o1.AbstractC3832e;
import p262s1.InterfaceC4388b;
import p262s1.InterfaceC4391e;

/* renamed from: q1.c */
/* loaded from: classes.dex */
public class C4124c {
    /* renamed from: a */
    public static void m15900a(InterfaceC4388b interfaceC4388b) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor mo16970V = interfaceC4388b.mo16970V("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (mo16970V.moveToNext()) {
            try {
                arrayList.add(mo16970V.getString(0));
            } catch (Throwable th) {
                mo16970V.close();
                throw th;
            }
        }
        mo16970V.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                interfaceC4388b.mo16976p("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* renamed from: b */
    public static Cursor m15901b(AbstractC3832e abstractC3832e, InterfaceC4391e interfaceC4391e, boolean z10, CancellationSignal cancellationSignal) {
        Cursor m14561q = abstractC3832e.m14561q(interfaceC4391e, cancellationSignal);
        if (!z10 || !(m14561q instanceof AbstractWindowedCursor)) {
            return m14561q;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) m14561q;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C4123b.m15898a(abstractWindowedCursor) : m14561q;
    }

    /* renamed from: c */
    public static int m15902c(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i10 = allocate.getInt();
            channel.close();
            return i10;
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
