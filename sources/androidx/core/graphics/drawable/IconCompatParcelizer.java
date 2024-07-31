package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import p362z1.AbstractC5943b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC5943b abstractC5943b) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1160a = abstractC5943b.m23825p(iconCompat.f1160a, 1);
        iconCompat.f1162c = abstractC5943b.m23819j(iconCompat.f1162c, 2);
        iconCompat.f1163d = abstractC5943b.m23827r(iconCompat.f1163d, 3);
        iconCompat.f1164e = abstractC5943b.m23825p(iconCompat.f1164e, 4);
        iconCompat.f1165f = abstractC5943b.m23825p(iconCompat.f1165f, 5);
        iconCompat.f1166g = (ColorStateList) abstractC5943b.m23827r(iconCompat.f1166g, 6);
        iconCompat.f1168i = abstractC5943b.m23829t(iconCompat.f1168i, 7);
        iconCompat.f1169j = abstractC5943b.m23829t(iconCompat.f1169j, 8);
        iconCompat.m1141v();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC5943b abstractC5943b) {
        abstractC5943b.m23833x(true, true);
        iconCompat.m1142w(abstractC5943b.m23815f());
        int i10 = iconCompat.f1160a;
        if (-1 != i10) {
            abstractC5943b.m23801F(i10, 1);
        }
        byte[] bArr = iconCompat.f1162c;
        if (bArr != null) {
            abstractC5943b.m23797B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1163d;
        if (parcelable != null) {
            abstractC5943b.m23803H(parcelable, 3);
        }
        int i11 = iconCompat.f1164e;
        if (i11 != 0) {
            abstractC5943b.m23801F(i11, 4);
        }
        int i12 = iconCompat.f1165f;
        if (i12 != 0) {
            abstractC5943b.m23801F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1166g;
        if (colorStateList != null) {
            abstractC5943b.m23803H(colorStateList, 6);
        }
        String str = iconCompat.f1168i;
        if (str != null) {
            abstractC5943b.m23805J(str, 7);
        }
        String str2 = iconCompat.f1169j;
        if (str2 != null) {
            abstractC5943b.m23805J(str2, 8);
        }
    }
}
