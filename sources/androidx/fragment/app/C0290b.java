package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC0301g0;
import androidx.lifecycle.AbstractC0344f;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public final class C0290b implements Parcelable {
    public static final Parcelable.Creator<C0290b> CREATOR = new a();

    /* renamed from: h */
    public final int[] f1353h;

    /* renamed from: i */
    public final ArrayList<String> f1354i;

    /* renamed from: j */
    public final int[] f1355j;

    /* renamed from: k */
    public final int[] f1356k;

    /* renamed from: l */
    public final int f1357l;

    /* renamed from: m */
    public final String f1358m;

    /* renamed from: n */
    public final int f1359n;

    /* renamed from: o */
    public final int f1360o;

    /* renamed from: p */
    public final CharSequence f1361p;

    /* renamed from: q */
    public final int f1362q;

    /* renamed from: r */
    public final CharSequence f1363r;

    /* renamed from: s */
    public final ArrayList<String> f1364s;

    /* renamed from: t */
    public final ArrayList<String> f1365t;

    /* renamed from: u */
    public final boolean f1366u;

    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C0290b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0290b createFromParcel(Parcel parcel) {
            return new C0290b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0290b[] newArray(int i10) {
            return new C0290b[i10];
        }
    }

    public C0290b(Parcel parcel) {
        this.f1353h = parcel.createIntArray();
        this.f1354i = parcel.createStringArrayList();
        this.f1355j = parcel.createIntArray();
        this.f1356k = parcel.createIntArray();
        this.f1357l = parcel.readInt();
        this.f1358m = parcel.readString();
        this.f1359n = parcel.readInt();
        this.f1360o = parcel.readInt();
        this.f1361p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1362q = parcel.readInt();
        this.f1363r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1364s = parcel.createStringArrayList();
        this.f1365t = parcel.createStringArrayList();
        this.f1366u = parcel.readInt() != 0;
    }

    public C0290b(C0288a c0288a) {
        int size = c0288a.f1466c.size();
        this.f1353h = new int[size * 6];
        if (!c0288a.f1472i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1354i = new ArrayList<>(size);
        this.f1355j = new int[size];
        this.f1356k = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            AbstractC0301g0.a aVar = c0288a.f1466c.get(i10);
            int i12 = i11 + 1;
            this.f1353h[i11] = aVar.f1483a;
            ArrayList<String> arrayList = this.f1354i;
            Fragment fragment = aVar.f1484b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f1353h;
            int i13 = i12 + 1;
            iArr[i12] = aVar.f1485c ? 1 : 0;
            int i14 = i13 + 1;
            iArr[i13] = aVar.f1486d;
            int i15 = i14 + 1;
            iArr[i14] = aVar.f1487e;
            int i16 = i15 + 1;
            iArr[i15] = aVar.f1488f;
            iArr[i16] = aVar.f1489g;
            this.f1355j[i10] = aVar.f1490h.ordinal();
            this.f1356k[i10] = aVar.f1491i.ordinal();
            i10++;
            i11 = i16 + 1;
        }
        this.f1357l = c0288a.f1471h;
        this.f1358m = c0288a.f1474k;
        this.f1359n = c0288a.f1343v;
        this.f1360o = c0288a.f1475l;
        this.f1361p = c0288a.f1476m;
        this.f1362q = c0288a.f1477n;
        this.f1363r = c0288a.f1478o;
        this.f1364s = c0288a.f1479p;
        this.f1365t = c0288a.f1480q;
        this.f1366u = c0288a.f1481r;
    }

    /* renamed from: a */
    public final void m1390a(C0288a c0288a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f1353h.length) {
                c0288a.f1471h = this.f1357l;
                c0288a.f1474k = this.f1358m;
                c0288a.f1472i = true;
                c0288a.f1475l = this.f1360o;
                c0288a.f1476m = this.f1361p;
                c0288a.f1477n = this.f1362q;
                c0288a.f1478o = this.f1363r;
                c0288a.f1479p = this.f1364s;
                c0288a.f1480q = this.f1365t;
                c0288a.f1481r = this.f1366u;
                return;
            }
            AbstractC0301g0.a aVar = new AbstractC0301g0.a();
            int i12 = i10 + 1;
            aVar.f1483a = this.f1353h[i10];
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0288a + " op #" + i11 + " base fragment #" + this.f1353h[i12]);
            }
            aVar.f1490h = AbstractC0344f.b.values()[this.f1355j[i11]];
            aVar.f1491i = AbstractC0344f.b.values()[this.f1356k[i11]];
            int[] iArr = this.f1353h;
            int i13 = i12 + 1;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f1485c = z10;
            int i14 = i13 + 1;
            int i15 = iArr[i13];
            aVar.f1486d = i15;
            int i16 = i14 + 1;
            int i17 = iArr[i14];
            aVar.f1487e = i17;
            int i18 = i16 + 1;
            int i19 = iArr[i16];
            aVar.f1488f = i19;
            int i20 = iArr[i18];
            aVar.f1489g = i20;
            c0288a.f1467d = i15;
            c0288a.f1468e = i17;
            c0288a.f1469f = i19;
            c0288a.f1470g = i20;
            c0288a.m1488e(aVar);
            i11++;
            i10 = i18 + 1;
        }
    }

    /* renamed from: b */
    public C0288a m1391b(AbstractC0326x abstractC0326x) {
        C0288a c0288a = new C0288a(abstractC0326x);
        m1390a(c0288a);
        c0288a.f1343v = this.f1359n;
        for (int i10 = 0; i10 < this.f1354i.size(); i10++) {
            String str = this.f1354i.get(i10);
            if (str != null) {
                c0288a.f1466c.get(i10).f1484b = abstractC0326x.m1691g0(str);
            }
        }
        c0288a.m1365n(1);
        return c0288a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f1353h);
        parcel.writeStringList(this.f1354i);
        parcel.writeIntArray(this.f1355j);
        parcel.writeIntArray(this.f1356k);
        parcel.writeInt(this.f1357l);
        parcel.writeString(this.f1358m);
        parcel.writeInt(this.f1359n);
        parcel.writeInt(this.f1360o);
        TextUtils.writeToParcel(this.f1361p, parcel, 0);
        parcel.writeInt(this.f1362q);
        TextUtils.writeToParcel(this.f1363r, parcel, 0);
        parcel.writeStringList(this.f1364s);
        parcel.writeStringList(this.f1365t);
        parcel.writeInt(this.f1366u ? 1 : 0);
    }
}
