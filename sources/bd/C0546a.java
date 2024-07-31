package bd;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: bd.a */
/* loaded from: classes2.dex */
public class C0546a implements Comparable<C0546a> {

    /* renamed from: h */
    public String f2427h;

    /* renamed from: i */
    public String f2428i;

    /* renamed from: j */
    public String f2429j;

    /* renamed from: k */
    public String f2430k;

    /* renamed from: l */
    public String f2431l;

    /* renamed from: m */
    public String f2432m;

    /* renamed from: n */
    public String f2433n;

    /* renamed from: o */
    public String f2434o;

    /* renamed from: p */
    public String f2435p;

    /* renamed from: q */
    public String f2436q;

    /* renamed from: r */
    public String f2437r;

    /* renamed from: s */
    public String f2438s;

    /* renamed from: t */
    public String f2439t;

    /* renamed from: u */
    public ArrayList<C0548c> f2440u;

    /* renamed from: v */
    public ArrayList<C0548c> f2441v;

    /* renamed from: w */
    public ArrayList<C0549d> f2442w;

    /* renamed from: x */
    public byte[] f2443x;

    public C0546a() {
        this.f2440u = new ArrayList<>();
        this.f2441v = new ArrayList<>();
        this.f2442w = new ArrayList<>();
        this.f2443x = new byte[0];
    }

    public C0546a(String str) {
        this.f2440u = new ArrayList<>();
        this.f2441v = new ArrayList<>();
        this.f2442w = new ArrayList<>();
        this.f2443x = new byte[0];
        this.f2427h = str;
    }

    /* renamed from: c */
    public static C0546a m2696c(HashMap hashMap) {
        C0546a c0546a = new C0546a();
        c0546a.f2427h = (String) hashMap.get(Constants.IDENTIFIER);
        c0546a.f2429j = (String) hashMap.get("givenName");
        c0546a.f2430k = (String) hashMap.get("middleName");
        c0546a.f2431l = (String) hashMap.get("familyName");
        c0546a.f2432m = (String) hashMap.get("prefix");
        c0546a.f2433n = (String) hashMap.get("suffix");
        c0546a.f2434o = (String) hashMap.get("company");
        c0546a.f2435p = (String) hashMap.get("jobTitle");
        c0546a.f2443x = (byte[]) hashMap.get("avatar");
        c0546a.f2436q = (String) hashMap.get("note");
        c0546a.f2437r = (String) hashMap.get("birthday");
        c0546a.f2438s = (String) hashMap.get("androidAccountType");
        c0546a.f2439t = (String) hashMap.get("androidAccountName");
        ArrayList arrayList = (ArrayList) hashMap.get("emails");
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0546a.f2440u.add(C0548c.m2736a((HashMap) it.next()));
            }
        }
        ArrayList arrayList2 = (ArrayList) hashMap.get("phones");
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                c0546a.f2441v.add(C0548c.m2736a((HashMap) it2.next()));
            }
        }
        ArrayList arrayList3 = (ArrayList) hashMap.get("postalAddresses");
        if (arrayList3 != null) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                c0546a.f2442w.add(C0549d.m2740a((HashMap) it3.next()));
            }
        }
        return c0546a;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0546a c0546a) {
        String str;
        String str2 = this.f2429j;
        String str3 = "";
        String lowerCase = str2 == null ? "" : str2.toLowerCase();
        if (c0546a != null && (str = c0546a.f2429j) != null) {
            str3 = str.toLowerCase();
        }
        return lowerCase.compareTo(str3);
    }

    /* renamed from: f */
    public HashMap<String, Object> m2698f() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(Constants.IDENTIFIER, this.f2427h);
        hashMap.put("displayName", this.f2428i);
        hashMap.put("givenName", this.f2429j);
        hashMap.put("middleName", this.f2430k);
        hashMap.put("familyName", this.f2431l);
        hashMap.put("prefix", this.f2432m);
        hashMap.put("suffix", this.f2433n);
        hashMap.put("company", this.f2434o);
        hashMap.put("jobTitle", this.f2435p);
        hashMap.put("avatar", this.f2443x);
        hashMap.put("note", this.f2436q);
        hashMap.put("birthday", this.f2437r);
        hashMap.put("androidAccountType", this.f2438s);
        hashMap.put("androidAccountName", this.f2439t);
        ArrayList arrayList = new ArrayList();
        Iterator<C0548c> it = this.f2440u.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m2739d());
        }
        hashMap.put("emails", arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator<C0548c> it2 = this.f2441v.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().m2739d());
        }
        hashMap.put("phones", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator<C0549d> it3 = this.f2442w.iterator();
        while (it3.hasNext()) {
            arrayList3.add(it3.next().m2742c());
        }
        hashMap.put("postalAddresses", arrayList3);
        return hashMap;
    }
}
