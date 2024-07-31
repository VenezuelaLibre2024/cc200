package p034c7;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzjf;
import java.util.ArrayList;
import java.util.List;
import p108h6.C2394s;

/* renamed from: c7.bd */
/* loaded from: classes.dex */
public final class C0646bd {

    /* renamed from: a */
    public zzfi.zze f2803a;

    /* renamed from: b */
    public Long f2804b;

    /* renamed from: c */
    public long f2805c;

    /* renamed from: d */
    public final /* synthetic */ C0955xc f2806d;

    public C0646bd(C0955xc c0955xc) {
        this.f2806d = c0955xc;
    }

    /* renamed from: a */
    public final zzfi.zze m3113a(String str, zzfi.zze zzeVar) {
        C0947x4 m3916D;
        String str2;
        Object obj;
        String zzg = zzeVar.zzg();
        List<zzfi.zzg> zzh = zzeVar.zzh();
        this.f2806d.mo3120j();
        Long l10 = (Long) C0745ic.m3448c0(zzeVar, "_eid");
        boolean z10 = l10 != null;
        if (z10 && zzg.equals("_ep")) {
            C2394s.m9619l(l10);
            this.f2806d.mo3120j();
            zzg = (String) C0745ic.m3448c0(zzeVar, "_en");
            if (TextUtils.isEmpty(zzg)) {
                this.f2806d.zzj().m3916D().m3996b("Extra parameter without an event name. eventId", l10);
                return null;
            }
            if (this.f2803a == null || this.f2804b == null || l10.longValue() != this.f2804b.longValue()) {
                Pair<zzfi.zze, Long> m3547C = this.f2806d.mo3122l().m3547C(str, l10);
                if (m3547C == null || (obj = m3547C.first) == null) {
                    this.f2806d.zzj().m3916D().m3997c("Extra parameter without existing main event. eventName, eventId", zzg, l10);
                    return null;
                }
                this.f2803a = (zzfi.zze) obj;
                this.f2805c = ((Long) m3547C.second).longValue();
                this.f2806d.mo3120j();
                this.f2804b = (Long) C0745ic.m3448c0(this.f2803a, "_eid");
            }
            long j10 = this.f2805c - 1;
            this.f2805c = j10;
            if (j10 <= 0) {
                C0788m mo3122l = this.f2806d.mo3122l();
                mo3122l.mo3099i();
                mo3122l.zzj().m3918F().m3996b("Clearing complex main event info. appId", str);
                try {
                    mo3122l.m3599w().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e10) {
                    mo3122l.zzj().m3914B().m3996b("Error clearing complex main event", e10);
                }
            } else {
                this.f2806d.mo3122l().m3588e0(str, l10, this.f2805c, this.f2803a);
            }
            ArrayList arrayList = new ArrayList();
            for (zzfi.zzg zzgVar : this.f2803a.zzh()) {
                this.f2806d.mo3120j();
                if (C0745ic.m3434D(zzeVar, zzgVar.zzg()) == null) {
                    arrayList.add(zzgVar);
                }
            }
            if (arrayList.isEmpty()) {
                m3916D = this.f2806d.zzj().m3916D();
                str2 = "No unique parameters in main event. eventName";
                m3916D.m3996b(str2, zzg);
            } else {
                arrayList.addAll(zzh);
                zzh = arrayList;
            }
        } else if (z10) {
            this.f2804b = l10;
            this.f2803a = zzeVar;
            this.f2806d.mo3120j();
            Object m3448c0 = C0745ic.m3448c0(zzeVar, "_epc");
            long longValue = ((Long) (m3448c0 != null ? m3448c0 : 0L)).longValue();
            this.f2805c = longValue;
            if (longValue <= 0) {
                m3916D = this.f2806d.zzj().m3916D();
                str2 = "Complex event with zero extra param count. eventName";
                m3916D.m3996b(str2, zzg);
            } else {
                this.f2806d.mo3122l().m3588e0(str, (Long) C2394s.m9619l(l10), this.f2805c, zzeVar);
            }
        }
        return (zzfi.zze) ((zzjf) zzeVar.zzby().zza(zzg).zzd().zza(zzh).zzah());
    }
}
