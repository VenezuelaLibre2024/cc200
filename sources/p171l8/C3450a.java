package p171l8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
import p023b8.C0515g;
import p066e8.C1733i;
import p141j8.C3262f;

/* renamed from: l8.a */
/* loaded from: classes.dex */
public class C3450a {

    /* renamed from: a */
    public final File f12118a;

    public C3450a(C3262f c3262f) {
        this.f12118a = c3262f.m11799e("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    public final File m12834a() {
        return this.f12118a;
    }

    /* renamed from: b */
    public JSONObject m12835b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C0515g.m2482f().m2484b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File m12834a = m12834a();
                if (m12834a.exists()) {
                    fileInputStream = new FileInputStream(m12834a);
                    try {
                        jSONObject = new JSONObject(C1733i.m6812A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        C0515g.m2482f().m2487e("Failed to fetch cached settings", e);
                        C1733i.m6818f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    C0515g.m2482f().m2490i("Settings file does not exist.");
                    jSONObject = null;
                }
                C1733i.m6818f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                C1733i.m6818f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C1733i.m6818f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void m12836c(long j10, JSONObject jSONObject) {
        C0515g.m2482f().m2490i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j10);
                FileWriter fileWriter2 = new FileWriter(m12834a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C1733i.m6818f(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    C0515g.m2482f().m2487e("Failed to cache settings", e);
                    C1733i.m6818f(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    C1733i.m6818f(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
