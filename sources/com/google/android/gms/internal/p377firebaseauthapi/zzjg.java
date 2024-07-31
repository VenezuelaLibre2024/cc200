package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* loaded from: classes.dex */
final class zzjg extends zzna<zzto, zzts> {
    private final /* synthetic */ zzje zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjg(zzje zzjeVar, Class cls) {
        super(cls);
        this.zza = zzjeVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzna
    public final /* synthetic */ zzto zza(zzahm zzahmVar) {
        return zzto.zza(zzahmVar, zzaip.zza());
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzna
    public final /* synthetic */ zzts zza(zzto zztoVar) {
        zzto zztoVar2 = zztoVar;
        ECParameterSpec zza = zzwn.zza(zzku.zza(zztoVar2.zzc().zzf().zzd()));
        KeyPairGenerator zza2 = zzwr.zzd.zza("EC");
        zza2.initialize(zza);
        KeyPair generateKeyPair = zza2.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        ECPoint w10 = eCPublicKey.getW();
        return (zzts) ((zzaja) zzts.zzb().zza(0).zza((zztt) ((zzaja) zztt.zzc().zza(0).zza(zztoVar2.zzc()).zza(zzahm.zza(w10.getAffineX().toByteArray())).zzb(zzahm.zza(w10.getAffineY().toByteArray())).zzf())).zza(zzahm.zza(eCPrivateKey.getS().toByteArray())).zzf());
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzna
    public final /* synthetic */ void zzb(zzto zztoVar) {
        zzku.zza(zztoVar.zzc());
    }
}
