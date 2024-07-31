.class public final synthetic Lcom/google/android/gms/internal/measurement/zzhh;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field private synthetic zza:Lcom/google/android/gms/internal/measurement/zzhe;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/zzhe;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhh;->zza:Lcom/google/android/gms/internal/measurement/zzhe;

    return-void
.end method


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhh;->zza:Lcom/google/android/gms/internal/measurement/zzhe;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzhe;->zza(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    return-void
.end method
