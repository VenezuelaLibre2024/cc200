package p024b9;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p195n7.C3767g;

/* renamed from: b9.c */
/* loaded from: classes.dex */
public class C0522c {

    /* renamed from: a */
    public File f2338a;

    /* renamed from: b */
    public final C3767g f2339b;

    /* renamed from: b9.c$a */
    /* loaded from: classes.dex */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C0522c(C3767g c3767g) {
        this.f2339b = c3767g;
    }

    /* renamed from: a */
    public final File m2528a() {
        if (this.f2338a == null) {
            synchronized (this) {
                if (this.f2338a == null) {
                    this.f2338a = new File(this.f2339b.m14349m().getFilesDir(), "PersistedInstallation." + this.f2339b.m14352s() + ".json");
                }
            }
        }
        return this.f2338a;
    }

    /* renamed from: b */
    public AbstractC0523d m2529b(AbstractC0523d abstractC0523d) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC0523d.mo2505d());
            jSONObject.put("Status", abstractC0523d.mo2508g().ordinal());
            jSONObject.put("AuthToken", abstractC0523d.mo2503b());
            jSONObject.put("RefreshToken", abstractC0523d.mo2507f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC0523d.mo2509h());
            jSONObject.put("ExpiresInSecs", abstractC0523d.mo2504c());
            jSONObject.put("FisError", abstractC0523d.mo2506e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f2339b.m14349m().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(m2528a())) {
            return abstractC0523d;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    /* renamed from: c */
    public final JSONObject m2530c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m2528a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: d */
    public AbstractC0523d m2531d() {
        JSONObject m2530c = m2530c();
        String optString = m2530c.optString("Fid", null);
        int optInt = m2530c.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m2530c.optString("AuthToken", null);
        String optString3 = m2530c.optString("RefreshToken", null);
        long optLong = m2530c.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m2530c.optLong("ExpiresInSecs", 0L);
        return AbstractC0523d.m2532a().mo2514d(optString).mo2517g(a.values()[optInt]).mo2512b(optString2).mo2516f(optString3).mo2518h(optLong).mo2513c(optLong2).mo2515e(m2530c.optString("FisError", null)).mo2511a();
    }
}
