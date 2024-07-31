package p180m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p152k4.C3348a;
import p222p5.C4041n0;
import p264s3.C4463m1;

/* renamed from: m4.a */
/* loaded from: classes.dex */
public final class C3523a implements C3348a.b {

    /* renamed from: h */
    public final String f12353h;

    /* renamed from: i */
    public final String f12354i;

    /* renamed from: j */
    public final long f12355j;

    /* renamed from: k */
    public final long f12356k;

    /* renamed from: l */
    public final byte[] f12357l;

    /* renamed from: m */
    public int f12358m;

    /* renamed from: n */
    public static final C4463m1 f12351n = new C4463m1.b().m17474g0("application/id3").m17448G();

    /* renamed from: o */
    public static final C4463m1 f12352o = new C4463m1.b().m17474g0("application/x-scte35").m17448G();
    public static final Parcelable.Creator<C3523a> CREATOR = new a();

    /* renamed from: m4.a$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C3523a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3523a createFromParcel(Parcel parcel) {
            return new C3523a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3523a[] newArray(int i10) {
            return new C3523a[i10];
        }
    }

    public C3523a(Parcel parcel) {
        this.f12353h = (String) C4041n0.m15463j(parcel.readString());
        this.f12354i = (String) C4041n0.m15463j(parcel.readString());
        this.f12355j = parcel.readLong();
        this.f12356k = parcel.readLong();
        this.f12357l = (byte[]) C4041n0.m15463j(parcel.createByteArray());
    }

    public C3523a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f12353h = str;
        this.f12354i = str2;
        this.f12355j = j10;
        this.f12356k = j11;
        this.f12357l = bArr;
    }

    @Override // p152k4.C3348a.b
    /* renamed from: G */
    public byte[] mo12417G() {
        if (mo12418n() != null) {
            return this.f12357l;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3523a.class != obj.getClass()) {
            return false;
        }
        C3523a c3523a = (C3523a) obj;
        return this.f12355j == c3523a.f12355j && this.f12356k == c3523a.f12356k && C4041n0.m15449c(this.f12353h, c3523a.f12353h) && C4041n0.m15449c(this.f12354i, c3523a.f12354i) && Arrays.equals(this.f12357l, c3523a.f12357l);
    }

    public int hashCode() {
        if (this.f12358m == 0) {
            String str = this.f12353h;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f12354i;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f12355j;
            int i10 = (((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f12356k;
            this.f12358m = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f12357l);
        }
        return this.f12358m;
    }

    @Override // p152k4.C3348a.b
    /* renamed from: n */
    public C4463m1 mo12418n() {
        String str = this.f12353h;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f12352o;
            case 1:
            case 2:
                return f12351n;
            default:
                return null;
        }
    }

    public String toString() {
        return "EMSG: scheme=" + this.f12353h + ", id=" + this.f12356k + ", durationMs=" + this.f12355j + ", value=" + this.f12354i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12353h);
        parcel.writeString(this.f12354i);
        parcel.writeLong(this.f12355j);
        parcel.writeLong(this.f12356k);
        parcel.writeByteArray(this.f12357l);
    }
}
