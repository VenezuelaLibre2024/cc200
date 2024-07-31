package p309v8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: v8.k */
/* loaded from: classes.dex */
public class C5151k {

    /* renamed from: a */
    public final SharedPreferences f19412a;

    public C5151k(Context context, String str) {
        this.f19412a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    public final synchronized void m20833a() {
        long j10 = this.f19412a.getLong("fire-count", 0L);
        String str = null;
        String str2 = "";
        for (Map.Entry<String, ?> entry : this.f19412a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = entry.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f19412a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f19412a.edit().putStringSet(str2, hashSet).putLong("fire-count", j10 - 1).commit();
    }

    /* renamed from: b */
    public synchronized void m20834b() {
        SharedPreferences.Editor edit = this.f19412a.edit();
        int i10 = 0;
        for (Map.Entry<String, ?> entry : this.f19412a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String m20836d = m20836d(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(m20836d)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(m20836d);
                    i10++;
                    edit.putStringSet(key, hashSet);
                } else {
                    edit.remove(key);
                }
            }
        }
        if (i10 == 0) {
            edit.remove("fire-count");
        } else {
            edit.putLong("fire-count", i10);
        }
        edit.commit();
    }

    /* renamed from: c */
    public synchronized List<AbstractC5152l> m20835c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f19412a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(m20836d(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(AbstractC5152l.m20846a(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        m20844l(System.currentTimeMillis());
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized String m20836d(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    /* renamed from: e */
    public final synchronized String m20837e(String str) {
        for (Map.Entry<String, ?> entry : this.f19412a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public synchronized boolean m20838f(long j10, long j11) {
        return m20836d(j10).equals(m20836d(j11));
    }

    /* renamed from: g */
    public synchronized void m20839g() {
        String m20836d = m20836d(System.currentTimeMillis());
        this.f19412a.edit().putString("last-used-date", m20836d).commit();
        m20840h(m20836d);
    }

    /* renamed from: h */
    public final synchronized void m20840h(String str) {
        String m20837e = m20837e(str);
        if (m20837e == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f19412a.getStringSet(m20837e, new HashSet()));
        hashSet.remove(str);
        (hashSet.isEmpty() ? this.f19412a.edit().remove(m20837e) : this.f19412a.edit().putStringSet(m20837e, hashSet)).commit();
    }

    /* renamed from: i */
    public synchronized boolean m20841i(long j10) {
        return m20842j("fire-global", j10);
    }

    /* renamed from: j */
    public synchronized boolean m20842j(String str, long j10) {
        if (!this.f19412a.contains(str)) {
            this.f19412a.edit().putLong(str, j10).commit();
            return true;
        }
        if (m20838f(this.f19412a.getLong(str, -1L), j10)) {
            return false;
        }
        this.f19412a.edit().putLong(str, j10).commit();
        return true;
    }

    /* renamed from: k */
    public synchronized void m20843k(long j10, String str) {
        String m20836d = m20836d(j10);
        if (this.f19412a.getString("last-used-date", "").equals(m20836d)) {
            String m20837e = m20837e(m20836d);
            if (m20837e == null) {
                return;
            }
            if (m20837e.equals(str)) {
                return;
            }
            m20845m(str, m20836d);
            return;
        }
        long j11 = this.f19412a.getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            m20833a();
            j11 = this.f19412a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f19412a.getStringSet(str, new HashSet()));
        hashSet.add(m20836d);
        this.f19412a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", m20836d).commit();
    }

    /* renamed from: l */
    public synchronized void m20844l(long j10) {
        this.f19412a.edit().putLong("fire-global", j10).commit();
    }

    /* renamed from: m */
    public final synchronized void m20845m(String str, String str2) {
        m20840h(str2);
        HashSet hashSet = new HashSet(this.f19412a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f19412a.edit().putStringSet(str, hashSet).commit();
    }
}
