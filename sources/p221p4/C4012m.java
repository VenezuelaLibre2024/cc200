package p221p4;

import android.os.Parcel;
import android.os.Parcelable;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.List;
import p126i7.AbstractC2651u;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4528z1;

/* renamed from: p4.m */
/* loaded from: classes.dex */
public final class C4012m extends AbstractC4008i {
    public static final Parcelable.Creator<C4012m> CREATOR = new a();

    /* renamed from: i */
    public final String f14439i;

    /* renamed from: j */
    @Deprecated
    public final String f14440j;

    /* renamed from: k */
    public final AbstractC2651u<String> f14441k;

    /* renamed from: p4.m$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4012m> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4012m createFromParcel(Parcel parcel) {
            return new C4012m(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4012m[] newArray(int i10) {
            return new C4012m[i10];
        }
    }

    public C4012m(Parcel parcel) {
        this((String) C4014a.m15199e(parcel.readString()), parcel.readString(), AbstractC2651u.m10769q((String[]) C4014a.m15199e(parcel.createStringArray())));
    }

    public /* synthetic */ C4012m(Parcel parcel, a aVar) {
        this(parcel);
    }

    public C4012m(String str, String str2, List<String> list) {
        super(str);
        C4014a.m15195a(!list.isEmpty());
        this.f14439i = str2;
        AbstractC2651u<String> m10768p = AbstractC2651u.m10768p(list);
        this.f14441k = m10768p;
        this.f14440j = m10768p.get(0);
    }

    /* renamed from: a */
    public static List<Integer> m15190a(String str) {
        int parseInt;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                parseInt = Integer.parseInt(str.substring(8, 10));
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        parseInt = Integer.parseInt(str.substring(0, 4));
                    }
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                parseInt = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(parseInt));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4012m.class != obj.getClass()) {
            return false;
        }
        C4012m c4012m = (C4012m) obj;
        return C4041n0.m15449c(this.f14428h, c4012m.f14428h) && C4041n0.m15449c(this.f14439i, c4012m.f14439i) && this.f14441k.equals(c4012m.f14441k);
    }

    public int hashCode() {
        int hashCode = (527 + this.f14428h.hashCode()) * 31;
        String str = this.f14439i;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f14441k.hashCode();
    }

    @Override // p221p4.AbstractC4008i
    public String toString() {
        return this.f14428h + ": description=" + this.f14439i + ": values=" + this.f14441k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14428h);
        parcel.writeString(this.f14439i);
        parcel.writeStringArray((String[]) this.f14441k.toArray(new String[0]));
    }

    @Override // p152k4.C3348a.b
    /* renamed from: z */
    public void mo12419z(C4528z1.b bVar) {
        String str = this.f14428h;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    bVar.m17913N(this.f14441k.get(0));
                    return;
                case 1:
                case 11:
                    bVar.m17918S(this.f14441k.get(0));
                    return;
                case 2:
                case '\f':
                    String str2 = this.f14441k.get(0);
                    bVar.m17931f0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).m17930e0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    bVar.m17914O(this.f14441k.get(0));
                    return;
                case 4:
                case 18:
                    bVar.m17912M(this.f14441k.get(0));
                    return;
                case 5:
                case 19:
                    bVar.m17919T(this.f14441k.get(0));
                    return;
                case 6:
                case 20:
                    String[] m15426Q0 = C4041n0.m15426Q0(this.f14441k.get(0), FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
                    bVar.m17941p0(Integer.valueOf(Integer.parseInt(m15426Q0[0]))).m17940o0(m15426Q0.length > 1 ? Integer.valueOf(Integer.parseInt(m15426Q0[1])) : null);
                    return;
                case 7:
                case 16:
                    bVar.m17938m0(this.f14441k.get(0));
                    return;
                case '\b':
                case 15:
                    bVar.m17943r0(this.f14441k.get(0));
                    return;
                case '\t':
                case 21:
                    bVar.m17932g0(Integer.valueOf(Integer.parseInt(this.f14441k.get(0))));
                    return;
                case '\r':
                    List<Integer> m15190a = m15190a(this.f14441k.get(0));
                    int size = m15190a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            } else {
                                bVar.m17930e0(m15190a.get(2));
                            }
                        }
                        bVar.m17931f0(m15190a.get(1));
                    }
                    bVar.m17932g0(m15190a.get(0));
                    return;
                case 14:
                    List<Integer> m15190a2 = m15190a(this.f14441k.get(0));
                    int size2 = m15190a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            } else {
                                bVar.m17933h0(m15190a2.get(2));
                            }
                        }
                        bVar.m17934i0(m15190a2.get(1));
                    }
                    bVar.m17935j0(m15190a2.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
