package p362z1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p285u.C4771a;

/* renamed from: z1.c */
/* loaded from: classes.dex */
public class C5944c extends AbstractC5943b {

    /* renamed from: d */
    public final SparseIntArray f22099d;

    /* renamed from: e */
    public final Parcel f22100e;

    /* renamed from: f */
    public final int f22101f;

    /* renamed from: g */
    public final int f22102g;

    /* renamed from: h */
    public final String f22103h;

    /* renamed from: i */
    public int f22104i;

    /* renamed from: j */
    public int f22105j;

    /* renamed from: k */
    public int f22106k;

    public C5944c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C4771a(), new C4771a(), new C4771a());
    }

    public C5944c(Parcel parcel, int i10, int i11, String str, C4771a<String, Method> c4771a, C4771a<String, Method> c4771a2, C4771a<String, Class> c4771a3) {
        super(c4771a, c4771a2, c4771a3);
        this.f22099d = new SparseIntArray();
        this.f22104i = -1;
        this.f22105j = 0;
        this.f22106k = -1;
        this.f22100e = parcel;
        this.f22101f = i10;
        this.f22102g = i11;
        this.f22105j = i10;
        this.f22103h = str;
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: A */
    public void mo23796A(byte[] bArr) {
        if (bArr == null) {
            this.f22100e.writeInt(-1);
        } else {
            this.f22100e.writeInt(bArr.length);
            this.f22100e.writeByteArray(bArr);
        }
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: C */
    public void mo23798C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f22100e, 0);
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: E */
    public void mo23800E(int i10) {
        this.f22100e.writeInt(i10);
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: G */
    public void mo23802G(Parcelable parcelable) {
        this.f22100e.writeParcelable(parcelable, 0);
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: I */
    public void mo23804I(String str) {
        this.f22100e.writeString(str);
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: a */
    public void mo23810a() {
        int i10 = this.f22104i;
        if (i10 >= 0) {
            int i11 = this.f22099d.get(i10);
            int dataPosition = this.f22100e.dataPosition();
            this.f22100e.setDataPosition(i11);
            this.f22100e.writeInt(dataPosition - i11);
            this.f22100e.setDataPosition(dataPosition);
        }
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: b */
    public AbstractC5943b mo23811b() {
        Parcel parcel = this.f22100e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f22105j;
        if (i10 == this.f22101f) {
            i10 = this.f22102g;
        }
        return new C5944c(parcel, dataPosition, i10, this.f22103h + "  ", this.f22096a, this.f22097b, this.f22098c);
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: g */
    public boolean mo23816g() {
        return this.f22100e.readInt() != 0;
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: i */
    public byte[] mo23818i() {
        int readInt = this.f22100e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f22100e.readByteArray(bArr);
        return bArr;
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: k */
    public CharSequence mo23820k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f22100e);
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: m */
    public boolean mo23822m(int i10) {
        while (this.f22105j < this.f22102g) {
            int i11 = this.f22106k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f22100e.setDataPosition(this.f22105j);
            int readInt = this.f22100e.readInt();
            this.f22106k = this.f22100e.readInt();
            this.f22105j += readInt;
        }
        return this.f22106k == i10;
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: o */
    public int mo23824o() {
        return this.f22100e.readInt();
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: q */
    public <T extends Parcelable> T mo23826q() {
        return (T) this.f22100e.readParcelable(getClass().getClassLoader());
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: s */
    public String mo23828s() {
        return this.f22100e.readString();
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: w */
    public void mo23832w(int i10) {
        mo23810a();
        this.f22104i = i10;
        this.f22099d.put(i10, this.f22100e.dataPosition());
        mo23800E(0);
        mo23800E(i10);
    }

    @Override // p362z1.AbstractC5943b
    /* renamed from: y */
    public void mo23834y(boolean z10) {
        this.f22100e.writeInt(z10 ? 1 : 0);
    }
}
