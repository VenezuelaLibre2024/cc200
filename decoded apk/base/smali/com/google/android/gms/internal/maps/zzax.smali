.class final Lcom/google/android/gms/internal/maps/zzax;
.super Lcom/google/android/gms/internal/maps/zzau;
.source ""


# instance fields
.field private final zza:Lcom/google/android/gms/internal/maps/zzaz;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/maps/zzaz;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/maps/zzau;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/maps/zzax;->zza:Lcom/google/android/gms/internal/maps/zzaz;

    return-void
.end method


# virtual methods
.method public final zza(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/maps/zzax;->zza:Lcom/google/android/gms/internal/maps/zzaz;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method