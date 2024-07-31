package p021b6;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p079f6.AbstractC1848h;
import p079f6.C1849i;
import p096g6.C2068u;
import p108h6.C2394s;
import p154k6.C3363a;

/* renamed from: b6.f */
/* loaded from: classes.dex */
public final class RunnableC0487f implements Runnable {

    /* renamed from: j */
    public static final C3363a f2283j = new C3363a("RevokeAccessOperation", new String[0]);

    /* renamed from: h */
    public final String f2284h;

    /* renamed from: i */
    public final C2068u f2285i = new C2068u(null);

    public RunnableC0487f(String str) {
        this.f2284h = C2394s.m9613f(str);
    }

    /* renamed from: a */
    public static AbstractC1848h m2431a(String str) {
        if (str == null) {
            return C1849i.m7597a(new Status(4), null);
        }
        RunnableC0487f runnableC0487f = new RunnableC0487f(str);
        new Thread(runnableC0487f).start();
        return runnableC0487f.f2285i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f4472o;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f2284h).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f4470m;
            } else {
                f2283j.m12508c("Unable to revoke access!", new Object[0]);
            }
            f2283j.m12506a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f2283j.m12508c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f2283j.m12508c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f2285i.setResult(status);
    }
}
