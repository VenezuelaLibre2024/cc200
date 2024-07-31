.class public Lc7/yb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc7/l7;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc7/yb$b;,
        Lc7/yb$a;
    }
.end annotation


# static fields
.field public static volatile H:Lc7/yb;


# instance fields
.field public A:J

.field public final B:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc7/n7;",
            ">;"
        }
    .end annotation
.end field

.field public final C:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc7/w;",
            ">;"
        }
    .end annotation
.end field

.field public final D:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc7/yb$b;",
            ">;"
        }
    .end annotation
.end field

.field public E:Lc7/q9;

.field public F:Ljava/lang/String;

.field public final G:Lc7/pc;

.field public a:Lc7/u5;

.field public b:Lc7/c5;

.field public c:Lc7/m;

.field public d:Lc7/f5;

.field public e:Lc7/sb;

.field public f:Lc7/xc;

.field public final g:Lc7/ic;

.field public h:Lc7/o9;

.field public i:Lc7/xa;

.field public final j:Lc7/wb;

.field public k:Lc7/r5;

.field public final l:Lc7/k6;

.field public m:Z

.field public n:Z

.field public o:J

.field public p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public r:I

.field public s:I

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Ljava/nio/channels/FileLock;

.field public x:Ljava/nio/channels/FileChannel;

.field public y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc7/kc;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lc7/yb;-><init>(Lc7/kc;Lc7/k6;)V

    return-void
.end method

.method public constructor <init>(Lc7/kc;Lc7/k6;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lc7/yb;->m:Z

    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    iput-object p2, p0, Lc7/yb;->q:Ljava/util/Set;

    new-instance p2, Lc7/fc;

    invoke-direct {p2, p0}, Lc7/fc;-><init>(Lc7/yb;)V

    iput-object p2, p0, Lc7/yb;->G:Lc7/pc;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p1, Lc7/kc;->a:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p2, v0, v0}, Lc7/k6;->a(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lc7/k6;

    move-result-object p2

    iput-object p2, p0, Lc7/yb;->l:Lc7/k6;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lc7/yb;->A:J

    new-instance p2, Lc7/wb;

    invoke-direct {p2, p0}, Lc7/wb;-><init>(Lc7/yb;)V

    iput-object p2, p0, Lc7/yb;->j:Lc7/wb;

    new-instance p2, Lc7/ic;

    invoke-direct {p2, p0}, Lc7/ic;-><init>(Lc7/yb;)V

    invoke-virtual {p2}, Lc7/xb;->q()V

    iput-object p2, p0, Lc7/yb;->g:Lc7/ic;

    new-instance p2, Lc7/c5;

    invoke-direct {p2, p0}, Lc7/c5;-><init>(Lc7/yb;)V

    invoke-virtual {p2}, Lc7/xb;->q()V

    iput-object p2, p0, Lc7/yb;->b:Lc7/c5;

    new-instance p2, Lc7/u5;

    invoke-direct {p2, p0}, Lc7/u5;-><init>(Lc7/yb;)V

    invoke-virtual {p2}, Lc7/xb;->q()V

    iput-object p2, p0, Lc7/yb;->a:Lc7/u5;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lc7/yb;->B:Ljava/util/Map;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lc7/yb;->C:Ljava/util/Map;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lc7/yb;->D:Ljava/util/Map;

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object p2

    new-instance v0, Lc7/bc;

    invoke-direct {v0, p0, p1}, Lc7/bc;-><init>(Lc7/yb;Lc7/kc;)V

    invoke-virtual {p2, v0}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static Z(Lc7/rc;)Z
    .locals 1

    iget-object v0, p0, Lc7/rc;->i:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p0, Lc7/rc;->x:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static bridge synthetic e(Lc7/yb;)Lc7/k6;
    .locals 0

    iget-object p0, p0, Lc7/yb;->l:Lc7/k6;

    return-object p0
.end method

.method public static f(Lc7/xb;)Lc7/xb;
    .locals 3

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lc7/xb;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Component not initialized: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Upload Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g(Landroid/content/Context;)Lc7/yb;
    .locals 2

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lc7/yb;->H:Lc7/yb;

    if-nez v0, :cond_1

    const-class v0, Lc7/yb;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lc7/yb;->H:Lc7/yb;

    if-nez v1, :cond_0

    new-instance v1, Lc7/kc;

    invoke-direct {v1, p0}, Lc7/kc;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc7/kc;

    new-instance v1, Lc7/yb;

    invoke-direct {v1, p0}, Lc7/yb;-><init>(Lc7/kc;)V

    sput-object v1, Lc7/yb;->H:Lc7/yb;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lc7/yb;->H:Lc7/yb;

    return-object p0
.end method

.method public static synthetic o(Lc7/yb;Lc7/kc;)V
    .locals 3

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object p1

    invoke-virtual {p1}, Lc7/j7;->i()V

    new-instance p1, Lc7/r5;

    invoke-direct {p1, p0}, Lc7/r5;-><init>(Lc7/yb;)V

    iput-object p1, p0, Lc7/yb;->k:Lc7/r5;

    new-instance p1, Lc7/m;

    invoke-direct {p1, p0}, Lc7/m;-><init>(Lc7/yb;)V

    invoke-virtual {p1}, Lc7/xb;->q()V

    iput-object p1, p0, Lc7/yb;->c:Lc7/m;

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object p1

    iget-object v0, p0, Lc7/yb;->a:Lc7/u5;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/j;

    invoke-virtual {p1, v0}, Lc7/h;->n(Lc7/j;)V

    new-instance p1, Lc7/xa;

    invoke-direct {p1, p0}, Lc7/xa;-><init>(Lc7/yb;)V

    invoke-virtual {p1}, Lc7/xb;->q()V

    iput-object p1, p0, Lc7/yb;->i:Lc7/xa;

    new-instance p1, Lc7/xc;

    invoke-direct {p1, p0}, Lc7/xc;-><init>(Lc7/yb;)V

    invoke-virtual {p1}, Lc7/xb;->q()V

    iput-object p1, p0, Lc7/yb;->f:Lc7/xc;

    new-instance p1, Lc7/o9;

    invoke-direct {p1, p0}, Lc7/o9;-><init>(Lc7/yb;)V

    invoke-virtual {p1}, Lc7/xb;->q()V

    iput-object p1, p0, Lc7/yb;->h:Lc7/o9;

    new-instance p1, Lc7/sb;

    invoke-direct {p1, p0}, Lc7/sb;-><init>(Lc7/yb;)V

    invoke-virtual {p1}, Lc7/xb;->q()V

    iput-object p1, p0, Lc7/yb;->e:Lc7/sb;

    new-instance p1, Lc7/f5;

    invoke-direct {p1, p0}, Lc7/f5;-><init>(Lc7/yb;)V

    iput-object p1, p0, Lc7/yb;->d:Lc7/f5;

    iget p1, p0, Lc7/yb;->r:I

    iget v0, p0, Lc7/yb;->s:I

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    iget v0, p0, Lc7/yb;->r:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lc7/yb;->s:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Not all upload components initialized"

    invoke-virtual {p1, v2, v0, v1}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lc7/yb;->m:Z

    return-void
.end method

.method public static q(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;ILjava/lang/String;)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzf()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const-string v3, "_err"

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v0

    int-to-long v1, p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(J)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v0

    const-string v1, "_ev"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast p2, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzg;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzg;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    return-void
.end method

.method public static r(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzf()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;)V
    .locals 5

    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/u5;->M(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzd(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_0
    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/u5;->W(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzi()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_1
    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/u5;->Z(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v0

    sget-object v2, Lc7/i0;->x0:Lc7/m4;

    invoke-virtual {v0, p1, v2}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzy()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-eq v2, v1, :cond_3

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzn()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/u5;->a0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "_id"

    invoke-static {p2, v0}, Lc7/ic;->t(Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;Ljava/lang/String;)I

    move-result v0

    if-eq v0, v1, :cond_4

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc(I)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_4
    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/u5;->Y(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzj()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_5
    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/u5;->V(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzg()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    iget-object v0, p0, Lc7/yb;->D:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/yb$b;

    if-eqz v0, :cond_6

    iget-wide v1, v0, Lc7/yb$b;->b:J

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v3

    sget-object v4, Lc7/i0;->W:Lc7/m4;

    invoke-virtual {v3, p1, v4}, Lc7/h;->u(Ljava/lang/String;Lc7/m4;)J

    move-result-wide v3

    add-long/2addr v1, v3

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v3

    invoke-interface {v3}, Lo6/d;->b()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gez v1, :cond_7

    :cond_6
    new-instance v0, Lc7/yb$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lc7/yb$b;-><init>(Lc7/yb;Lc7/hc;)V

    iget-object v1, p0, Lc7/yb;->D:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v0, v0, Lc7/yb$b;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_8
    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/u5;->X(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzr()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_9
    return-void
.end method

.method public final B(Ljava/lang/String;Z)V
    .locals 1

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Lc7/g5;->H(Z)V

    invoke-virtual {p1}, Lc7/g5;->t()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p2

    invoke-virtual {p2, p1}, Lc7/m;->Q(Lc7/g5;)V

    :cond_0
    return-void
.end method

.method public final C(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lh6/s;->a(Z)V

    iget-object v0, p0, Lc7/yb;->y:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string v0, "Set uploading progress before finishing the previous upload"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lc7/yb;->y:Ljava/util/List;

    return-void
.end method

.method public final D(Z)V
    .locals 0

    invoke-virtual {p0}, Lc7/yb;->J()V

    return-void
.end method

.method public final E(ZILjava/lang/Throwable;[BLjava/lang/String;)V
    .locals 8

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object p5

    invoke-virtual {p5}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    const/4 p5, 0x0

    if-nez p4, :cond_0

    :try_start_0
    new-array p4, p5, [B

    :cond_0
    iget-object v0, p0, Lc7/yb;->y:Ljava/util/List;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    iput-object v1, p0, Lc7/yb;->y:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v2

    sget-object v4, Lc7/i0;->V0:Lc7/m4;

    invoke-virtual {v2, v4}, Lc7/h;->o(Lc7/m4;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_1

    if-eqz p1, :cond_3

    :cond_1
    const/16 v2, 0xc8

    if-eq p2, v2, :cond_2

    const/16 v2, 0xcc

    if-ne p2, v2, :cond_d

    :cond_2
    if-nez p3, :cond_d

    :cond_3
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object p3

    sget-object v2, Lc7/i0;->V0:Lc7/m4;

    invoke-virtual {p3, v2}, Lc7/h;->o(Lc7/m4;)Z

    move-result p3

    if-eqz p3, :cond_4

    if-eqz p1, :cond_5

    :cond_4
    iget-object p3, p0, Lc7/yb;->i:Lc7/xa;

    iget-object p3, p3, Lc7/xa;->g:Lc7/n5;

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v2

    invoke-interface {v2}, Lo6/d;->a()J

    move-result-wide v4

    invoke-virtual {p3, v4, v5}, Lc7/n5;->b(J)V

    :cond_5
    iget-object p3, p0, Lc7/yb;->i:Lc7/xa;

    iget-object p3, p3, Lc7/xa;->h:Lc7/n5;

    const-wide/16 v4, 0x0

    invoke-virtual {p3, v4, v5}, Lc7/n5;->b(J)V

    invoke-virtual {p0}, Lc7/yb;->J()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object p3

    sget-object v2, Lc7/i0;->V0:Lc7/m4;

    invoke-virtual {p3, v2}, Lc7/h;->o(Lc7/m4;)Z

    move-result p3

    if-eqz p3, :cond_7

    if-eqz p1, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object p1

    invoke-virtual {p1, v2}, Lc7/h;->o(Lc7/m4;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    const-string p2, "Purged empty bundles"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    :goto_0
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    const-string p3, "Successful upload. Got network response. code, size"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    array-length p4, p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p1, p3, p2, p4}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_8
    :goto_1
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1}, Lc7/m;->L0()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {p3}, Lc7/j7;->i()V

    invoke-virtual {p3}, Lc7/xb;->p()V

    invoke-virtual {p3}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p4

    new-array v0, v3, [Ljava/lang/String;

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, p5
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    const-string v2, "queue"

    const-string v6, "rowid=?"

    invoke-virtual {p4, v2, v6, v0}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p4

    if-ne p4, v3, :cond_9

    goto :goto_2

    :cond_9
    new-instance p4, Landroid/database/sqlite/SQLiteException;

    const-string v0, "Deleted fewer rows from queue than expected"

    invoke-direct {p4, v0}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw p4
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_0
    move-exception p4

    :try_start_5
    invoke-virtual {p3}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->B()Lc7/x4;

    move-result-object p3

    const-string v0, "Failed to delete a bundle in a queue table"

    invoke-virtual {p3, v0, p4}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw p4
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_1
    move-exception p3

    :try_start_6
    iget-object p4, p0, Lc7/yb;->z:Ljava/util/List;

    if-eqz p4, :cond_a

    invoke-interface {p4, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    goto :goto_2

    :cond_a
    throw p3

    :cond_b
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1}, Lc7/m;->O0()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1}, Lc7/m;->M0()V

    iput-object v1, p0, Lc7/yb;->z:Ljava/util/List;

    invoke-virtual {p0}, Lc7/yb;->c0()Lc7/c5;

    move-result-object p1

    invoke-virtual {p1}, Lc7/c5;->v()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Lc7/yb;->K()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Lc7/yb;->p0()V

    goto :goto_3

    :cond_c
    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lc7/yb;->A:J

    invoke-virtual {p0}, Lc7/yb;->J()V

    :goto_3
    iput-wide v4, p0, Lc7/yb;->o:J

    goto/16 :goto_5

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p2

    invoke-virtual {p2}, Lc7/m;->M0()V

    throw p1
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catch_2
    move-exception p1

    :try_start_8
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    const-string p3, "Database error while trying to delete uploaded bundles"

    invoke-virtual {p2, p3, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object p1

    invoke-interface {p1}, Lo6/d;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lc7/yb;->o:J

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    const-string p2, "Disable upload, time"

    iget-wide p3, p0, Lc7/yb;->o:J

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    :cond_d
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    const-string p4, "Network upload failed. Will retry later. code, error"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, p4, v1, p3}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lc7/yb;->i:Lc7/xa;

    iget-object p1, p1, Lc7/xa;->h:Lc7/n5;

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object p3

    invoke-interface {p3}, Lo6/d;->a()J

    move-result-wide p3

    invoke-virtual {p1, p3, p4}, Lc7/n5;->b(J)V

    const/16 p1, 0x1f7

    if-eq p2, p1, :cond_f

    const/16 p1, 0x1ad

    if-ne p2, p1, :cond_e

    goto :goto_4

    :cond_e
    move v3, p5

    :cond_f
    :goto_4
    if-eqz v3, :cond_10

    iget-object p1, p0, Lc7/yb;->i:Lc7/xa;

    iget-object p1, p1, Lc7/xa;->f:Lc7/n5;

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object p2

    invoke-interface {p2}, Lo6/d;->a()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lc7/n5;->b(J)V

    :cond_10
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1, v0}, Lc7/m;->V(Ljava/util/List;)V

    invoke-virtual {p0}, Lc7/yb;->J()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_5
    iput-boolean p5, p0, Lc7/yb;->u:Z

    invoke-virtual {p0}, Lc7/yb;->I()V

    return-void

    :catchall_1
    move-exception p1

    iput-boolean p5, p0, Lc7/yb;->u:Z

    invoke-virtual {p0}, Lc7/yb;->I()V

    throw p1
.end method

.method public final F(ILjava/nio/channels/FileChannel;)Z
    .locals 5

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->isOpen()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    const-wide/16 v2, 0x0

    :try_start_0
    invoke-virtual {p2, v2, v3}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {p2, v1}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    const/4 p1, 0x1

    invoke-virtual {p2, p1}, Ljava/nio/channels/FileChannel;->force(Z)V

    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v1

    const-wide/16 v3, 0x4

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Error writing to channel. Bytes written"

    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v1, v2, p2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return p1

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    const-string v1, "Failed to write to channel"

    invoke-virtual {p2, v1, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return v0

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Bad channel to read from"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return v0
.end method

.method public final G(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;)Z
    .locals 8

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_e"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lh6/s;->a(Z)V

    invoke-virtual {p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    const-string v2, "_sc"

    invoke-static {v0, v2}, Lc7/ic;->D(Lcom/google/android/gms/internal/measurement/zzfi$zze;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzh()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    const-string v4, "_pc"

    invoke-static {v3, v4}, Lc7/ic;->D(Lcom/google/android/gms/internal/measurement/zzfi$zze;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzh()Ljava/lang/String;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_5

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lh6/s;->a(Z)V

    invoke-virtual {p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    const-string v1, "_et"

    invoke-static {v0, v1}, Lc7/ic;->D(Lcom/google/android/gms/internal/measurement/zzfi$zze;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzl()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzd()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gtz v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzd()J

    move-result-wide v2

    invoke-virtual {p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-static {v0, v1}, Lc7/ic;->D(Lcom/google/android/gms/internal/measurement/zzfi$zze;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzd()J

    move-result-wide v6

    cmp-long v4, v6, v4

    if-lez v4, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzd()J

    move-result-wide v4

    add-long/2addr v2, v4

    :cond_3
    invoke-virtual {p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p2, v1, v0}, Lc7/ic;->O(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/yb;->i0()Lc7/ic;

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string v0, "_fr"

    invoke-static {p1, v0, p2}, Lc7/ic;->O(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method public final H(Ljava/lang/String;J)Z
    .locals 41

    move-object/from16 v1, p0

    const-string v2, "_ai"

    const-string v3, "items"

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v4

    invoke-virtual {v4}, Lc7/m;->L0()V

    :try_start_0
    new-instance v4, Lc7/yb$a;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Lc7/yb$a;-><init>(Lc7/yb;Lc7/gc;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v6

    iget-wide v7, v1, Lc7/yb;->A:J

    invoke-static {v4}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6}, Lc7/j7;->i()V

    invoke-virtual {v6}, Lc7/xb;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const-wide/16 v10, -0x1

    const/4 v12, 0x2

    const/4 v13, 0x1

    const/4 v14, 0x0

    :try_start_1
    invoke-virtual {v6}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v15

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v17, ""

    if-eqz v16, :cond_3

    cmp-long v16, v7, v10

    if-eqz v16, :cond_0

    :try_start_2
    new-array v9, v12, [Ljava/lang/String;

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v18

    aput-object v18, v9, v14

    invoke-static/range {p2 .. p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v18

    aput-object v18, v9, v13
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v7, v0

    move-object v9, v5

    goto/16 :goto_6

    :cond_0
    :try_start_3
    new-array v9, v13, [Ljava/lang/String;

    invoke-static/range {p2 .. p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v18

    aput-object v18, v9, v14
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    if-eqz v16, :cond_1

    :try_start_4
    const-string v17, "rowid <= ? and "
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_1
    move-object/from16 v5, v17

    :try_start_5
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v10, "select app_id, metadata_fingerprint from raw_events where "

    invoke-direct {v12, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v5, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v9
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-nez v9, :cond_2

    :goto_1
    :try_start_7
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto/16 :goto_7

    :cond_2
    :try_start_8
    invoke-interface {v5, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    invoke-interface {v5, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_3

    :cond_3
    move-wide v9, v10

    cmp-long v5, v7, v9

    if-eqz v5, :cond_4

    const/4 v9, 0x2

    :try_start_a
    new-array v10, v9, [Ljava/lang/String;

    const/4 v9, 0x0

    aput-object v9, v10, v14

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v10, v13

    goto :goto_2

    :cond_4
    const/4 v9, 0x0

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v10

    :goto_2
    if-eqz v5, :cond_5

    const-string v17, " and rowid <= ?"

    :cond_5
    move-object/from16 v5, v17

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v11, "select metadata_fingerprint from raw_events where app_id = ?"

    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " order by rowid limit 1;"

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v5, v10}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_1

    :cond_6
    invoke-interface {v5, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    const/4 v9, 0x0

    :goto_3
    :try_start_c
    const-string v16, "raw_events_metadata"

    const-string v11, "metadata"

    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v17

    const-string v18, "app_id = ? and metadata_fingerprint = ?"

    const/4 v11, 0x2

    new-array v12, v11, [Ljava/lang/String;

    aput-object v9, v12, v14

    aput-object v10, v12, v13

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-string v22, "rowid"

    const-string v23, "2"

    move-object v11, v15

    move-object v15, v11

    move-object/from16 v19, v12

    invoke-virtual/range {v15 .. v23}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v12

    if-nez v12, :cond_7

    invoke-virtual {v6}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v7

    invoke-virtual {v7}, Lc7/v4;->B()Lc7/x4;

    move-result-object v7

    const-string v8, "Raw event metadata record is missing. appId"

    invoke-static {v9}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v7, v8, v10}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_7
    invoke-interface {v5, v14}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v12
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    :try_start_d
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzu()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v15

    invoke-static {v15, v12}, Lc7/ic;->E(Lcom/google/android/gms/internal/measurement/zzku;[B)Lcom/google/android/gms/internal/measurement/zzku;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v12, Lcom/google/android/gms/internal/measurement/zzfi$zzj;
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    :try_start_e
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-virtual {v6}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v15

    invoke-virtual {v15}, Lc7/v4;->G()Lc7/x4;

    move-result-object v15

    const-string v13, "Get multiple raw event metadata records, expected one. appId"

    invoke-static {v9}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v15, v13, v14}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    invoke-interface {v4, v12}, Lc7/q;->a(Lcom/google/android/gms/internal/measurement/zzfi$zzj;)V

    const-wide/16 v12, -0x1

    cmp-long v14, v7, v12

    if-eqz v14, :cond_9

    const-string v12, "app_id = ? and metadata_fingerprint = ? and rowid <= ?"

    const/4 v13, 0x3

    new-array v14, v13, [Ljava/lang/String;

    const/4 v13, 0x0

    aput-object v9, v14, v13

    const/4 v13, 0x1

    aput-object v10, v14, v13

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x2

    aput-object v7, v14, v8

    move-object/from16 v18, v12

    move-object/from16 v19, v14

    goto :goto_4

    :cond_9
    const-string v7, "app_id = ? and metadata_fingerprint = ?"

    const/4 v8, 0x2

    new-array v12, v8, [Ljava/lang/String;

    const/4 v8, 0x0

    aput-object v9, v12, v8

    const/4 v8, 0x1

    aput-object v10, v12, v8

    move-object/from16 v18, v7

    move-object/from16 v19, v12

    :goto_4
    const-string v16, "raw_events"

    const-string v7, "rowid"

    const-string v8, "name"

    const-string v10, "timestamp"

    const-string v12, "data"

    filled-new-array {v7, v8, v10, v12}, [Ljava/lang/String;

    move-result-object v17

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-string v22, "rowid"

    const/16 v23, 0x0

    move-object v15, v11

    invoke-virtual/range {v15 .. v23}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v7

    if-nez v7, :cond_a

    invoke-virtual {v6}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v7

    invoke-virtual {v7}, Lc7/v4;->G()Lc7/x4;

    move-result-object v7

    const-string v8, "Raw event data disappeared while in transaction. appId"

    invoke-static {v9}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v7, v8, v10}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_a
    const/4 v7, 0x0

    invoke-interface {v5, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    const/4 v7, 0x3

    invoke-interface {v5, v7}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v8
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_3
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    :try_start_f
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    move-result-object v7

    invoke-static {v7, v8}, Lc7/ic;->E(Lcom/google/android/gms/internal/measurement/zzku;[B)Lcom/google/android/gms/internal/measurement/zzku;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    const/4 v8, 0x1

    :try_start_10
    invoke-interface {v5, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7, v12}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    move-result-object v8

    const/4 v12, 0x2

    invoke-interface {v5, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v13

    invoke-virtual {v8, v13, v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzb(J)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-interface {v4, v10, v11, v7}, Lc7/q;->b(JLcom/google/android/gms/internal/measurement/zzfi$zze;)Z

    move-result v7

    if-nez v7, :cond_b

    goto/16 :goto_1

    :catch_1
    move-exception v0

    move-object v7, v0

    invoke-virtual {v6}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v8

    invoke-virtual {v8}, Lc7/v4;->B()Lc7/x4;

    move-result-object v8

    const-string v10, "Data loss. Failed to merge raw event. appId"

    invoke-static {v9}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v8, v10, v11, v7}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v7

    if-nez v7, :cond_a

    goto/16 :goto_1

    :catch_2
    move-exception v0

    move-object v7, v0

    invoke-virtual {v6}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v8

    invoke-virtual {v8}, Lc7/v4;->B()Lc7/x4;

    move-result-object v8

    const-string v10, "Data loss. Failed to merge raw event metadata. appId"

    invoke-static {v9}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v8, v10, v11, v7}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_3
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    goto/16 :goto_1

    :catch_3
    move-exception v0

    move-object v7, v0

    goto :goto_6

    :catch_4
    move-exception v0

    move-object v7, v0

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object v1, v0

    const/4 v5, 0x0

    goto/16 :goto_4c

    :catch_5
    move-exception v0

    move-object v7, v0

    const/4 v5, 0x0

    :goto_5
    const/4 v9, 0x0

    :goto_6
    :try_start_11
    invoke-virtual {v6}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v6

    invoke-virtual {v6}, Lc7/v4;->B()Lc7/x4;

    move-result-object v6

    const-string v8, "Data loss. Error selecting raw event. appId"

    invoke-static {v9}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v6, v8, v9, v7}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    if-eqz v5, :cond_c

    goto/16 :goto_1

    :cond_c
    :goto_7
    :try_start_12
    iget-object v5, v4, Lc7/yb$a;->c:Ljava/util/List;

    if-eqz v5, :cond_e

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_d

    goto :goto_8

    :cond_d
    const/4 v5, 0x0

    goto :goto_9

    :cond_e
    :goto_8
    const/4 v5, 0x1

    :goto_9
    if-nez v5, :cond_7e

    iget-object v5, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzk()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, -0x1

    const/4 v13, -0x1

    :goto_a
    iget-object v14, v4, Lc7/yb$a;->c:Ljava/util/List;

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v14
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    const-string v15, "_fr"

    const-string v6, "_et"

    move/from16 v16, v10

    const-string v10, "_e"

    move/from16 p3, v11

    const-string v11, "_c"

    move-object/from16 v18, v6

    move-object/from16 v17, v7

    if-ge v9, v14, :cond_3f

    :try_start_13
    iget-object v14, v4, Lc7/yb$a;->c:Ljava/util/List;

    invoke-interface {v14, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v6

    iget-object v7, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v7

    move/from16 v21, v9

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v7, v9}, Lc7/u5;->J(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    const-string v7, "_err"

    if-eqz v6, :cond_12

    :try_start_14
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v6

    invoke-virtual {v6}, Lc7/v4;->G()Lc7/x4;

    move-result-object v6

    const-string v9, "Dropping blocked raw event. appId"

    iget-object v10, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    iget-object v11, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v11}, Lc7/k6;->y()Lc7/u4;

    move-result-object v11

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v11, v15}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v9, v10, v11}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v6

    iget-object v9, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Lc7/u5;->S(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_10

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v6

    iget-object v9, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Lc7/u5;->U(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_f

    goto :goto_b

    :cond_f
    const/4 v6, 0x0

    goto :goto_c

    :cond_10
    :goto_b
    const/4 v6, 0x1

    :goto_c
    if-nez v6, :cond_11

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v6, v1, Lc7/yb;->G:Lc7/pc;

    iget-object v7, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v25

    const/16 v26, 0xb

    const-string v27, "_ev"

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v28

    const/16 v29, 0x0

    move-object/from16 v24, v6

    invoke-static/range {v24 .. v29}, Lc7/qc;->N(Lc7/pc;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    :cond_11
    move-object/from16 v23, v2

    move-object v11, v3

    move/from16 v10, v16

    move-object/from16 v7, v17

    move/from16 v6, v21

    move/from16 v2, p3

    goto/16 :goto_28

    :cond_12
    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2}, Lc7/o7;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v6

    invoke-virtual {v6}, Lc7/v4;->F()Lc7/x4;

    move-result-object v6

    const-string v9, "Renaming ad_impression to _ai"

    invoke-virtual {v6, v9}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v6

    const/4 v9, 0x5

    invoke-virtual {v6, v9}, Lc7/v4;->x(I)Z

    move-result v6

    if-eqz v6, :cond_14

    const/4 v6, 0x0

    :goto_d
    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza()I

    move-result v9

    if-ge v6, v9, :cond_14

    const-string v9, "ad_platform"

    invoke-virtual {v14, v6}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzb(I)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v22

    move-object/from16 v23, v2

    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual {v14, v6}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzb(I)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzh()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_13

    const-string v2, "admob"

    invoke-virtual {v14, v6}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzb(I)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzh()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->H()Lc7/x4;

    move-result-object v2

    const-string v9, "AdMob ad impression logged from app. Potentially duplicative."

    invoke-virtual {v2, v9}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_13
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v2, v23

    goto :goto_d

    :cond_14
    move-object/from16 v23, v2

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v2

    iget-object v6, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v6, v9}, Lc7/u5;->H(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_19

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v9

    move-object/from16 v22, v3

    const v3, 0x17333

    if-eq v9, v3, :cond_15

    goto :goto_e

    :cond_15
    const-string v3, "_ui"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    const/4 v3, 0x0

    goto :goto_f

    :cond_16
    :goto_e
    const/4 v3, -0x1

    :goto_f
    if-eqz v3, :cond_17

    const/4 v3, 0x0

    goto :goto_10

    :cond_17
    const/4 v3, 0x1

    :goto_10
    if-eqz v3, :cond_18

    goto :goto_11

    :cond_18
    move-object/from16 v25, v5

    move-object v6, v8

    move/from16 v24, v12

    move/from16 v26, v13

    goto/16 :goto_17

    :cond_19
    move-object/from16 v22, v3

    :goto_11
    move/from16 v24, v12

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    :goto_12
    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza()I

    move-result v12
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    move-object/from16 v25, v5

    const-string v5, "_r"

    if-ge v9, v12, :cond_1c

    :try_start_15
    invoke-virtual {v14, v9}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzb(I)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1a

    invoke-virtual {v14, v9}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzb(I)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move/from16 v26, v13

    const-wide/16 v12, 0x1

    invoke-virtual {v3, v12, v13}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(J)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v14, v9, v3}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(ILcom/google/android/gms/internal/measurement/zzfi$zzg;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    const/4 v3, 0x1

    goto :goto_13

    :cond_1a
    move/from16 v26, v13

    invoke-virtual {v14, v9}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzb(I)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-virtual {v14, v9}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzb(I)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    const-wide/16 v12, 0x1

    invoke-virtual {v5, v12, v13}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(J)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v14, v9, v5}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(ILcom/google/android/gms/internal/measurement/zzfi$zzg;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    const/4 v6, 0x1

    :cond_1b
    :goto_13
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v5, v25

    move/from16 v13, v26

    goto :goto_12

    :cond_1c
    move/from16 v26, v13

    if-nez v3, :cond_1d

    if-eqz v2, :cond_1d

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->F()Lc7/x4;

    move-result-object v3

    const-string v9, "Marking event as conversion"

    iget-object v12, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v12}, Lc7/k6;->y()Lc7/u4;

    move-result-object v12

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v9, v12}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v3

    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v3

    const-wide/16 v12, 0x1

    invoke-virtual {v3, v12, v13}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(J)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v3

    invoke-virtual {v14, v3}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    :cond_1d
    if-nez v6, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->F()Lc7/x4;

    move-result-object v3

    const-string v6, "Marking event as real-time"

    iget-object v9, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v9}, Lc7/k6;->y()Lc7/u4;

    move-result-object v9

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v6, v9}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v3

    const-wide/16 v12, 0x1

    invoke-virtual {v3, v12, v13}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(J)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v3

    invoke-virtual {v14, v3}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    :cond_1e
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v27

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->q0()J

    move-result-wide v28

    iget-object v3, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v30

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x1

    invoke-virtual/range {v27 .. v35}, Lc7/m;->E(JLjava/lang/String;ZZZZZ)Lc7/r;

    move-result-object v3

    iget-wide v12, v3, Lc7/r;->e:J

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v3

    iget-object v6, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lc7/h;->t(Ljava/lang/String;)I

    move-result v3

    move-object v6, v8

    int-to-long v8, v3

    cmp-long v3, v12, v8

    if-lez v3, :cond_1f

    invoke-static {v14, v5}, Lc7/yb;->r(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Ljava/lang/String;)V

    goto :goto_14

    :cond_1f
    const/16 v16, 0x1

    :goto_14
    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lc7/qc;->E0(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_25

    if-eqz v2, :cond_25

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v27

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->q0()J

    move-result-wide v28

    iget-object v3, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v30

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x1

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-virtual/range {v27 .. v35}, Lc7/m;->E(JLjava/lang/String;ZZZZZ)Lc7/r;

    move-result-object v3

    iget-wide v8, v3, Lc7/r;->c:J

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v3

    iget-object v5, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v5

    sget-object v12, Lc7/i0;->p:Lc7/m4;

    invoke-virtual {v3, v5, v12}, Lc7/h;->q(Ljava/lang/String;Lc7/m4;)I

    move-result v3

    int-to-long v12, v3

    cmp-long v3, v8, v12

    if-lez v3, :cond_25

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->G()Lc7/x4;

    move-result-object v3

    const-string v5, "Too many conversions. Not logging as conversion. appId"

    iget-object v8, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v3, v5, v8}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v3, -0x1

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_15
    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza()I

    move-result v12

    if-ge v9, v12, :cond_22

    invoke-virtual {v14, v9}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzb(I)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_20

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-object v5, v3

    move v3, v9

    goto :goto_16

    :cond_20
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_21

    const/4 v8, 0x1

    :cond_21
    :goto_16
    add-int/lit8 v9, v9, 0x1

    goto :goto_15

    :cond_22
    if-eqz v8, :cond_23

    if-eqz v5, :cond_23

    invoke-virtual {v14, v3}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    goto :goto_17

    :cond_23
    if-eqz v5, :cond_24

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhn;->clone()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v5

    const-wide/16 v7, 0xa

    invoke-virtual {v5, v7, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(J)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v14, v3, v5}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(ILcom/google/android/gms/internal/measurement/zzfi$zzg;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    goto :goto_17

    :cond_24
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    const-string v5, "Did not find conversion parameter. appId"

    iget-object v7, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v3, v5, v7}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_25
    :goto_17
    if-eqz v2, :cond_2e

    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzf()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v3, 0x0

    const/4 v5, -0x1

    const/4 v7, -0x1

    :goto_18
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    const-string v9, "currency"

    const-string v12, "value"

    if-ge v3, v8, :cond_28

    :try_start_16
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_26

    move v5, v3

    goto :goto_19

    :cond_26
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_27

    move v7, v3

    :cond_27
    :goto_19
    add-int/lit8 v3, v3, 0x1

    goto :goto_18

    :cond_28
    const/4 v3, -0x1

    if-eq v5, v3, :cond_2f

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzl()Z

    move-result v3

    if-nez v3, :cond_29

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzj()Z

    move-result v3

    if-nez v3, :cond_29

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->H()Lc7/x4;

    move-result-object v2

    const-string v3, "Value must be specified with a numeric type."

    invoke-virtual {v2, v3}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {v14, v5}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-static {v14, v11}, Lc7/yb;->r(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Ljava/lang/String;)V

    const/16 v2, 0x12

    invoke-static {v14, v2, v12}, Lc7/yb;->q(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;ILjava/lang/String;)V

    goto :goto_1d

    :cond_29
    const/4 v3, -0x1

    if-ne v7, v3, :cond_2a

    const/4 v2, 0x1

    const/4 v8, 0x3

    goto :goto_1c

    :cond_2a
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzh()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v8, 0x3

    if-eq v7, v8, :cond_2b

    :goto_1a
    const/4 v2, 0x1

    goto :goto_1c

    :cond_2b
    const/4 v7, 0x0

    :goto_1b
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v12

    if-ge v7, v12, :cond_2d

    invoke-virtual {v2, v7}, Ljava/lang/String;->codePointAt(I)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Character;->isLetter(I)Z

    move-result v13

    if-nez v13, :cond_2c

    goto :goto_1a

    :cond_2c
    invoke-static {v12}, Ljava/lang/Character;->charCount(I)I

    move-result v12

    add-int/2addr v7, v12

    goto :goto_1b

    :cond_2d
    const/4 v2, 0x0

    :goto_1c
    if-eqz v2, :cond_30

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->H()Lc7/x4;

    move-result-object v2

    const-string v7, "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."

    invoke-virtual {v2, v7}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {v14, v5}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-static {v14, v11}, Lc7/yb;->r(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Ljava/lang/String;)V

    const/16 v2, 0x13

    invoke-static {v14, v2, v9}, Lc7/yb;->q(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;ILjava/lang/String;)V

    goto :goto_1e

    :cond_2e
    :goto_1d
    const/4 v3, -0x1

    :cond_2f
    const/4 v8, 0x3

    :cond_30
    :goto_1e
    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_33

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-static {v2, v15}, Lc7/ic;->D(Lcom/google/android/gms/internal/measurement/zzfi$zze;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v2

    if-nez v2, :cond_32

    if-eqz v6, :cond_31

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzc()J

    move-result-wide v9

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzc()J

    move-result-wide v11

    sub-long/2addr v9, v11

    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    const-wide/16 v11, 0x3e8

    cmp-long v2, v9, v11

    if-gtz v2, :cond_31

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzhn;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-virtual {v1, v14, v2}, Lc7/yb;->G(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;)Z

    move-result v5

    if-eqz v5, :cond_31

    move-object/from16 v5, v25

    move/from16 v7, v26

    invoke-virtual {v5, v7, v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(ILcom/google/android/gms/internal/measurement/zzfi$zze$zza;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move v13, v7

    move/from16 v12, v24

    :goto_1f
    const/4 v6, 0x0

    const/16 v17, 0x0

    goto/16 :goto_21

    :cond_31
    move-object/from16 v5, v25

    move/from16 v7, v26

    move/from16 v12, p3

    move v13, v7

    move-object/from16 v17, v14

    goto/16 :goto_21

    :cond_32
    move-object/from16 v5, v25

    move/from16 v7, v26

    goto :goto_20

    :cond_33
    move-object/from16 v5, v25

    move/from16 v7, v26

    const-string v2, "_vs"

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_35

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    move-object/from16 v9, v18

    invoke-static {v2, v9}, Lc7/ic;->D(Lcom/google/android/gms/internal/measurement/zzfi$zze;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v2

    if-nez v2, :cond_35

    if-eqz v17, :cond_34

    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzc()J

    move-result-wide v9

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzc()J

    move-result-wide v11

    sub-long/2addr v9, v11

    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    const-wide/16 v11, 0x3e8

    cmp-long v2, v9, v11

    if-gtz v2, :cond_34

    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzhn;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-virtual {v1, v2, v14}, Lc7/yb;->G(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;)Z

    move-result v6

    if-eqz v6, :cond_34

    move/from16 v9, v24

    invoke-virtual {v5, v9, v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(ILcom/google/android/gms/internal/measurement/zzfi$zze$zza;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move v13, v7

    move v12, v9

    goto :goto_1f

    :cond_34
    move/from16 v9, v24

    move/from16 v13, p3

    move v12, v9

    move-object v6, v14

    goto :goto_21

    :cond_35
    :goto_20
    move/from16 v9, v24

    move v13, v7

    move v12, v9

    :goto_21
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoq;->zza()Z

    move-result v2

    if-eqz v2, :cond_3d

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v2

    sget-object v7, Lc7/i0;->Y0:Lc7/m4;

    invoke-virtual {v2, v7}, Lc7/h;->o(Lc7/m4;)Z

    move-result v2

    if-eqz v2, :cond_3d

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza()I

    move-result v2

    if-eqz v2, :cond_3d

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzf()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lc7/ic;->w(Ljava/util/List;)Landroid/os/Bundle;

    move-result-object v2

    const/4 v7, 0x0

    :goto_22
    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza()I

    move-result v9

    if-ge v7, v9, :cond_3a

    invoke-virtual {v14, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzb(I)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v11, v22

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_38

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzi()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_38

    iget-object v10, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzi()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v15

    new-array v15, v15, [Landroid/os/Bundle;

    const/4 v3, 0x0

    :goto_23
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v8

    if-ge v3, v8, :cond_37

    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzi()Ljava/util/List;

    move-result-object v18

    move-object/from16 v19, v6

    invoke-static/range {v18 .. v18}, Lc7/ic;->w(Ljava/util/List;)Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzi()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_24
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_36

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-object/from16 v20, v8

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v18

    move-object/from16 v22, v9

    move-object/from16 v9, v18

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    invoke-virtual {v1, v8, v9, v6, v10}, Lc7/yb;->z(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;Landroid/os/Bundle;Ljava/lang/String;)V

    move-object/from16 v8, v20

    move-object/from16 v9, v22

    goto :goto_24

    :cond_36
    move-object/from16 v22, v9

    aput-object v6, v15, v3

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v6, v19

    move-object/from16 v9, v22

    goto :goto_23

    :cond_37
    move-object/from16 v19, v6

    invoke-virtual {v2, v11, v15}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto :goto_25

    :cond_38
    move-object/from16 v19, v6

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_39

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    iget-object v8, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v3, v6, v2, v8}, Lc7/yb;->z(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;Landroid/os/Bundle;Ljava/lang/String;)V

    :cond_39
    :goto_25
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v22, v11

    move-object/from16 v6, v19

    const/4 v3, -0x1

    const/4 v8, 0x3

    goto/16 :goto_22

    :cond_3a
    move-object/from16 v19, v6

    move-object/from16 v11, v22

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzd()Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v3

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3b
    :goto_26
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v9

    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v9

    invoke-virtual {v2, v8}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_3b

    invoke-virtual {v3, v9, v8}, Lc7/ic;->P(Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;Ljava/lang/Object;)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_26

    :cond_3c
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_27
    if-ge v3, v2, :cond_3e

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v3, v3, 0x1

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v14, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzg;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    goto :goto_27

    :cond_3d
    move-object/from16 v19, v6

    move-object/from16 v11, v22

    :cond_3e
    iget-object v2, v4, Lc7/yb$a;->c:Ljava/util/List;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    move/from16 v6, v21

    invoke-interface {v2, v6, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, p3, 0x1

    invoke-virtual {v5, v14}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move/from16 v10, v16

    move-object/from16 v7, v17

    move-object/from16 v8, v19

    :goto_28
    add-int/lit8 v9, v6, 0x1

    move-object v3, v11

    move v11, v2

    move-object/from16 v2, v23

    goto/16 :goto_a

    :cond_3f
    move-object/from16 v9, v18

    const-wide/16 v2, 0x0

    move/from16 v6, p3

    move-wide v12, v2

    const/4 v7, 0x0

    :goto_29
    if-ge v7, v6, :cond_43

    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfi$zze;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zzg()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_40

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-static {v8, v15}, Lc7/ic;->D(Lcom/google/android/gms/internal/measurement/zzfi$zze;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v14

    if-eqz v14, :cond_40

    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzb(I)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    add-int/lit8 v6, v6, -0x1

    add-int/lit8 v7, v7, -0x1

    goto :goto_2b

    :cond_40
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-static {v8, v9}, Lc7/ic;->D(Lcom/google/android/gms/internal/measurement/zzfi$zze;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-result-object v8

    if-eqz v8, :cond_42

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzl()Z

    move-result v14

    if-eqz v14, :cond_41

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzd()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    goto :goto_2a

    :cond_41
    const/4 v8, 0x0

    :goto_2a
    if-eqz v8, :cond_42

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    cmp-long v14, v17, v2

    if-lez v14, :cond_42

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    add-long v12, v12, v17

    :cond_42
    :goto_2b
    const/4 v8, 0x1

    add-int/2addr v7, v8

    goto :goto_29

    :cond_43
    const/4 v6, 0x0

    invoke-virtual {v1, v5, v12, v13, v6}, Lc7/yb;->s(Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;JZ)V

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzaa()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_44
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_45

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    const-string v8, "_s"

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zzg()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    if-eqz v7, :cond_44

    const/4 v6, 0x1

    goto :goto_2c

    :cond_45
    const/4 v6, 0x0

    :goto_2c
    const-string v7, "_se"

    if-eqz v6, :cond_46

    :try_start_17
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v6

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzt()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8, v7}, Lc7/m;->G0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_46
    const-string v6, "_sid"

    invoke-static {v5, v6}, Lc7/ic;->t(Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;Ljava/lang/String;)I

    move-result v6

    if-ltz v6, :cond_47

    const/4 v6, 0x1

    goto :goto_2d

    :cond_47
    const/4 v6, 0x0

    :goto_2d
    if-eqz v6, :cond_48

    const/4 v6, 0x1

    invoke-virtual {v1, v5, v12, v13, v6}, Lc7/yb;->s(Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;JZ)V

    goto :goto_2e

    :cond_48
    invoke-static {v5, v7}, Lc7/ic;->t(Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;Ljava/lang/String;)I

    move-result v6

    if-ltz v6, :cond_49

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc(I)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v6

    invoke-virtual {v6}, Lc7/v4;->B()Lc7/x4;

    move-result-object v6

    const-string v7, "Session engagement user property is in the bundle without session ID. appId"

    iget-object v8, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_49
    :goto_2e
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v6

    invoke-virtual {v6, v5}, Lc7/ic;->Q(Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v6

    if-eqz v6, :cond_4b

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v6

    sget-object v7, Lc7/i0;->Q0:Lc7/m4;

    invoke-virtual {v6, v7}, Lc7/h;->o(Lc7/m4;)Z

    move-result v6

    if-eqz v6, :cond_4b

    iget-object v6, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v7

    invoke-virtual {v7}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->l0()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v7

    if-eqz v7, :cond_4b

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v7

    invoke-virtual {v7, v6}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object v7

    if-nez v7, :cond_4a

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v7

    invoke-virtual {v7}, Lc7/v4;->B()Lc7/x4;

    move-result-object v7

    const-string v8, "Cannot fix consent fields without appInfo. appId"

    invoke-static {v6}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v7, v8, v6}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2f

    :cond_4a
    invoke-virtual {v1, v7, v5}, Lc7/yb;->n(Lc7/g5;Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;)V

    :cond_4b
    :goto_2f
    const-wide v6, 0x7fffffffffffffffL

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzi(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v6

    const-wide/high16 v7, -0x8000000000000000L

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zze(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    const/4 v6, 0x0

    :goto_30
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc()I

    move-result v7

    if-ge v6, v7, :cond_4e

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfi$zze;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zzd()J

    move-result-wide v8

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzf()J

    move-result-wide v12

    cmp-long v8, v8, v12

    if-gez v8, :cond_4c

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zzd()J

    move-result-wide v8

    invoke-virtual {v5, v8, v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzi(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_4c
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zzd()J

    move-result-wide v8

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zze()J

    move-result-wide v12

    cmp-long v8, v8, v12

    if-lez v8, :cond_4d

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zzd()J

    move-result-wide v7

    invoke-virtual {v5, v7, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zze(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_4d
    add-int/lit8 v6, v6, 0x1

    goto :goto_30

    :cond_4e
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzs()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zza()Z

    move-result v6

    if-eqz v6, :cond_55

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v6

    iget-object v7, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lc7/i0;->H0:Lc7/m4;

    invoke-virtual {v6, v7, v8}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v6

    if-eqz v6, :cond_55

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v6, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lc7/qc;->y0(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_55

    iget-object v6, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v6

    invoke-virtual {v6}, Lc7/n7;->x()Z

    move-result v6

    if-eqz v6, :cond_55

    iget-object v6, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzar()Z

    move-result v6

    if-eqz v6, :cond_55

    const/4 v6, 0x0

    :goto_31
    iget-object v7, v4, Lc7/yb$a;->c:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_55

    iget-object v7, v4, Lc7/yb$a;->c:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzf()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_4f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_50

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4f

    const/4 v8, 0x1

    goto :goto_32

    :cond_50
    const/4 v8, 0x0

    :goto_32
    if-eqz v8, :cond_54

    iget-object v8, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zza()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v9

    iget-object v10, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v10

    sget-object v12, Lc7/i0;->X:Lc7/m4;

    invoke-virtual {v9, v10, v12}, Lc7/h;->q(Ljava/lang/String;Lc7/m4;)I

    move-result v9

    if-lt v8, v9, :cond_53

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v8

    iget-object v9, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lc7/i0;->J0:Lc7/m4;

    invoke-virtual {v8, v9, v10}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v8

    if-eqz v8, :cond_51

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v8

    invoke-virtual {v8}, Lc7/qc;->N0()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v9

    const-string v10, "_tu"

    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v9

    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v7, v9}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzg;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    goto :goto_33

    :cond_51
    const/4 v8, 0x0

    :goto_33
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v9

    const-string v10, "_tr"

    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v9

    const-wide/16 v12, 0x1

    invoke-virtual {v9, v12, v13}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(J)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v7, v9}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzg;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v9

    iget-object v10, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v10

    sget-object v12, Lc7/i0;->M0:Lc7/m4;

    invoke-virtual {v9, v10, v12}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v9

    if-eqz v9, :cond_52

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v9

    iget-object v10, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10, v5, v7, v8}, Lc7/ic;->A(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Ljava/lang/String;)Lc7/qb;

    move-result-object v8

    goto :goto_34

    :cond_52
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v9

    iget-object v10, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v10

    iget-object v12, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v9, v10, v12, v7, v8}, Lc7/ic;->B(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfi$zzj;Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Ljava/lang/String;)Lc7/qb;

    move-result-object v8

    :goto_34
    if-eqz v8, :cond_53

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v9

    invoke-virtual {v9}, Lc7/v4;->F()Lc7/x4;

    move-result-object v9

    const-string v10, "Generated trigger URI. appId, uri"

    iget-object v12, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v12

    iget-object v13, v8, Lc7/qb;->h:Ljava/lang/String;

    invoke-virtual {v9, v10, v12, v13}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v9

    iget-object v10, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10, v8}, Lc7/m;->d0(Ljava/lang/String;Lc7/qb;)Z

    iget-object v8, v1, Lc7/yb;->q:Ljava/util/Set;

    iget-object v9, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_53
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(ILcom/google/android/gms/internal/measurement/zzfi$zze;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_54
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_31

    :cond_55
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzh()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->T()Lc7/xc;

    move-result-object v7

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzt()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzaa()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzab()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzf()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zze()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual/range {v7 .. v12}, Lc7/xc;->u(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v6

    iget-object v7, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lc7/h;->G(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_70

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v8

    invoke-virtual {v8}, Lc7/qc;->P0()Ljava/security/SecureRandom;

    move-result-object v8

    const/4 v9, 0x0

    :goto_35
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc()I

    move-result v10

    if-ge v9, v10, :cond_6d

    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfi$zze;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v11

    const-string v12, "_ep"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    const-string v12, "_sr"

    if-eqz v11, :cond_5a

    :try_start_18
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v11, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    const-string v13, "_en"

    invoke-static {v11, v13}, Lc7/ic;->c0(Lcom/google/android/gms/internal/measurement/zzfi$zze;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v6, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lc7/c0;

    if-nez v13, :cond_56

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v13

    iget-object v14, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v14

    invoke-static {v11}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v13, v14, v15}, Lc7/m;->x0(Ljava/lang/String;Ljava/lang/String;)Lc7/c0;

    move-result-object v13

    if-eqz v13, :cond_56

    invoke-interface {v6, v11, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_56
    if-eqz v13, :cond_59

    iget-object v11, v13, Lc7/c0;->i:Ljava/lang/Long;

    if-nez v11, :cond_59

    iget-object v11, v13, Lc7/c0;->j:Ljava/lang/Long;

    if-eqz v11, :cond_57

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    const-wide/16 v17, 0x1

    cmp-long v11, v14, v17

    if-lez v11, :cond_57

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    iget-object v11, v13, Lc7/c0;->j:Ljava/lang/Long;

    invoke-static {v10, v12, v11}, Lc7/ic;->O(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_57
    iget-object v11, v13, Lc7/c0;->k:Ljava/lang/Boolean;

    if-eqz v11, :cond_58

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_58

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    const-string v11, "_efs"

    const-wide/16 v12, 0x1

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-static {v10, v11, v14}, Lc7/ic;->O(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_58
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v11, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_59
    :goto_36
    invoke-virtual {v5, v9, v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(ILcom/google/android/gms/internal/measurement/zzfi$zze$zza;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-object v15, v4

    move-object v1, v5

    move-object/from16 p3, v8

    move v2, v9

    const-wide/16 v8, 0x1

    goto/16 :goto_40

    :cond_5a
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v11

    iget-object v13, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v13}, Lc7/u5;->t(Ljava/lang/String;)J

    move-result-wide v13

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzc()J

    move-result-wide v2

    invoke-static {v2, v3, v13, v14}, Lc7/qc;->t(JJ)J

    move-result-wide v2

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v11, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    const-string v15, "_dbg"

    const-wide/16 v17, 0x1

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v17

    if-nez v17, :cond_5f

    if-nez v1, :cond_5b

    goto :goto_38

    :cond_5b
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zzh()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_37
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_5f

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    move-object/from16 p3, v11

    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v15, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5e

    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzd()J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5d

    instance-of v11, v1, Ljava/lang/String;

    if-eqz v11, :cond_5c

    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzh()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5d

    :cond_5c
    instance-of v11, v1, Ljava/lang/Double;

    if-eqz v11, :cond_5f

    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zza()D

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5f

    :cond_5d
    const/4 v1, 0x1

    goto :goto_39

    :cond_5e
    move-object/from16 v11, p3

    goto :goto_37

    :cond_5f
    :goto_38
    const/4 v1, 0x0

    :goto_39
    if-nez v1, :cond_60

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v1

    iget-object v11, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1, v11, v15}, Lc7/u5;->D(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    goto :goto_3a

    :cond_60
    const/4 v1, 0x1

    :goto_3a
    if-gtz v1, :cond_61

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->G()Lc7/x4;

    move-result-object v2

    const-string v3, "Sample rate must be positive. event, rate"

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v3, v11, v1}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_36

    :cond_61
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v6, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lc7/c0;

    if-nez v11, :cond_62

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v11

    iget-object v15, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v15

    move-wide/from16 v17, v13

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v15, v13}, Lc7/m;->x0(Ljava/lang/String;Ljava/lang/String;)Lc7/c0;

    move-result-object v11

    if-nez v11, :cond_63

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v11

    invoke-virtual {v11}, Lc7/v4;->G()Lc7/x4;

    move-result-object v11

    const-string v13, "Event being bundled has no eventAggregate. appId, eventName"

    iget-object v14, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v11, v13, v14, v15}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v11, Lc7/c0;

    iget-object v13, v4, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v26

    const-wide/16 v27, 0x1

    const-wide/16 v29, 0x1

    const-wide/16 v31, 0x1

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzc()J

    move-result-wide v33

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    move-object/from16 v24, v11

    invoke-direct/range {v24 .. v40}, Lc7/c0;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    goto :goto_3b

    :cond_62
    move-wide/from16 v17, v13

    :cond_63
    :goto_3b
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v13, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    const-string v14, "_eid"

    invoke-static {v13, v14}, Lc7/ic;->c0(Lcom/google/android/gms/internal/measurement/zzfi$zze;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Long;

    if-eqz v13, :cond_64

    const/4 v14, 0x1

    goto :goto_3c

    :cond_64
    const/4 v14, 0x0

    :goto_3c
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    const/4 v15, 0x1

    if-ne v1, v15, :cond_66

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_59

    iget-object v1, v11, Lc7/c0;->i:Ljava/lang/Long;

    if-nez v1, :cond_65

    iget-object v1, v11, Lc7/c0;->j:Ljava/lang/Long;

    if-nez v1, :cond_65

    iget-object v1, v11, Lc7/c0;->k:Ljava/lang/Boolean;

    if-eqz v1, :cond_59

    :cond_65
    const/4 v1, 0x0

    invoke-virtual {v11, v1, v1, v1}, Lc7/c0;->c(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lc7/c0;

    move-result-object v2

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_36

    :cond_66
    invoke-virtual {v8, v1}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v15

    if-nez v15, :cond_68

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    move-object v15, v4

    move-object/from16 v25, v5

    int-to-long v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v10, v12, v1}, Lc7/ic;->O(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_67

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v4, 0x0

    invoke-virtual {v11, v4, v1, v4}, Lc7/c0;->c(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lc7/c0;

    move-result-object v11

    :cond_67
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzc()J

    move-result-wide v4

    invoke-virtual {v11, v4, v5, v2, v3}, Lc7/c0;->b(JJ)Lc7/c0;

    move-result-object v2

    invoke-interface {v6, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 p3, v8

    move v2, v9

    move-object/from16 v1, v25

    const-wide/16 v8, 0x1

    goto/16 :goto_3f

    :cond_68
    move-object v15, v4

    move-object/from16 v25, v5

    iget-object v4, v11, Lc7/c0;->h:Ljava/lang/Long;

    if-eqz v4, :cond_69

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    move-object/from16 p3, v8

    move/from16 v21, v9

    goto :goto_3d

    :cond_69
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzb()J

    move-result-wide v4

    move-object/from16 p3, v8

    move/from16 v21, v9

    move-wide/from16 v8, v17

    invoke-static {v4, v5, v8, v9}, Lc7/qc;->t(JJ)J

    move-result-wide v4

    :goto_3d
    cmp-long v4, v4, v2

    if-eqz v4, :cond_6b

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    const-string v4, "_efs"

    const-wide/16 v8, 0x1

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v10, v4, v5}, Lc7/ic;->O(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    int-to-long v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v10, v12, v1}, Lc7/ic;->O(Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_6a

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v5, 0x0

    invoke-virtual {v11, v5, v1, v4}, Lc7/c0;->c(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lc7/c0;

    move-result-object v11

    :cond_6a
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzc()J

    move-result-wide v4

    invoke-virtual {v11, v4, v5, v2, v3}, Lc7/c0;->b(JJ)Lc7/c0;

    move-result-object v2

    invoke-interface {v6, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3e

    :cond_6b
    const-wide/16 v8, 0x1

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_6c

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zze()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v11, v13, v2, v2}, Lc7/c0;->c(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lc7/c0;

    move-result-object v3

    invoke-interface {v6, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6c
    :goto_3e
    move/from16 v2, v21

    move-object/from16 v1, v25

    :goto_3f
    invoke-virtual {v1, v2, v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(ILcom/google/android/gms/internal/measurement/zzfi$zze$zza;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :goto_40
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v8, p3

    move-object v5, v1

    move v9, v2

    move-object v4, v15

    const-wide/16 v2, 0x0

    move-object/from16 v1, p0

    goto/16 :goto_35

    :cond_6d
    move-object v15, v4

    move-object v1, v5

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc()I

    move-result v3

    if-ge v2, v3, :cond_6e

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzk()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzb(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_6e
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_41
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc7/c0;

    invoke-virtual {v4, v3}, Lc7/m;->P(Lc7/c0;)V

    goto :goto_41

    :cond_6f
    move-object v2, v15

    goto :goto_42

    :cond_70
    move-object v1, v5

    move-object v2, v4

    :goto_42
    iget-object v3, v2, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v4

    invoke-virtual {v4, v3}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object v4

    if-nez v4, :cond_71

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v4

    invoke-virtual {v4}, Lc7/v4;->B()Lc7/x4;

    move-result-object v4

    const-string v5, "Bundling raw events w/o app info. appId"

    iget-object v6, v2, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_47

    :cond_71
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc()I

    move-result v5

    if-lez v5, :cond_76

    invoke-virtual {v4}, Lc7/g5;->k0()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-eqz v9, :cond_72

    invoke-virtual {v1, v5, v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzg(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    goto :goto_43

    :cond_72
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzo()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :goto_43
    invoke-virtual {v4}, Lc7/g5;->o0()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v11, v7, v9

    if-nez v11, :cond_73

    goto :goto_44

    :cond_73
    move-wide v5, v7

    :goto_44
    cmp-long v7, v5, v9

    if-eqz v7, :cond_74

    invoke-virtual {v1, v5, v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzh(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    goto :goto_45

    :cond_74
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzp()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :goto_45
    invoke-virtual {v4}, Lc7/g5;->q()V

    invoke-virtual {v4}, Lc7/g5;->m0()J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzf(I)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzf()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lc7/g5;->l0(J)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zze()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lc7/g5;->h0(J)V

    invoke-virtual {v4}, Lc7/g5;->u0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_75

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    goto :goto_46

    :cond_75
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzl()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :goto_46
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v5

    invoke-virtual {v5, v4}, Lc7/m;->Q(Lc7/g5;)V

    :cond_76
    :goto_47
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc()I

    move-result v4

    if-lez v4, :cond_7a

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v4

    iget-object v5, v2, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lc7/u5;->G(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    move-result-object v4

    if-eqz v4, :cond_78

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzs()Z

    move-result v5

    if-nez v5, :cond_77

    goto :goto_48

    :cond_77
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzc()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzb(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    goto :goto_49

    :cond_78
    :goto_48
    iget-object v4, v2, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzah()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_79

    const-wide/16 v4, -0x1

    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzb(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    goto :goto_49

    :cond_79
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v4

    invoke-virtual {v4}, Lc7/v4;->G()Lc7/x4;

    move-result-object v4

    const-string v5, "Did not find measurement config or missing version info. appId"

    iget-object v6, v2, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_49
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    move/from16 v10, v16

    invoke-virtual {v4, v1, v10}, Lc7/m;->Z(Lcom/google/android/gms/internal/measurement/zzfi$zzj;Z)Z

    :cond_7a
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    iget-object v2, v2, Lc7/yb$a;->b:Ljava/util/List;

    invoke-static {v2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lc7/j7;->i()V

    invoke-virtual {v1}, Lc7/xb;->p()V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "rowid in ("

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x0

    :goto_4a
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_7c

    if-eqz v5, :cond_7b

    const-string v6, ","

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7b
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_4a

    :cond_7c
    const-string v5, ")"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    const-string v6, "raw_events"

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v4, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-eq v4, v5, :cond_7d

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v5, "Deleted fewer rows from raw events table than expected"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v5, v4, v2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_7d
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    invoke-virtual {v1}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    :try_start_19
    const-string v4, "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    const/4 v6, 0x1

    aput-object v3, v5, v6

    invoke-virtual {v2, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_19
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_19 .. :try_end_19} :catch_6
    .catchall {:try_start_19 .. :try_end_19} :catchall_2

    goto :goto_4b

    :catch_6
    move-exception v0

    move-object v2, v0

    :try_start_1a
    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v4, "Failed to remove unused event metadata. appId"

    invoke-static {v3}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v4, v3, v2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_4b
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    invoke-virtual {v1}, Lc7/m;->O0()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    invoke-virtual {v1}, Lc7/m;->M0()V

    const/4 v1, 0x1

    return v1

    :cond_7e
    :try_start_1b
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    invoke-virtual {v1}, Lc7/m;->O0()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_2

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    invoke-virtual {v1}, Lc7/m;->M0()V

    const/4 v1, 0x0

    return v1

    :catchall_1
    move-exception v0

    move-object v1, v0

    :goto_4c
    if-eqz v5, :cond_7f

    :try_start_1c
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_7f
    throw v1
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_2

    :catchall_2
    move-exception v0

    move-object v1, v0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->M0()V

    throw v1
.end method

.method public final I()V
    .locals 5

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/yb;->t:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lc7/yb;->u:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lc7/yb;->v:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v1, "Stopping uploading service(s)"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lc7/yb;->p:Ljava/util/List;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lc7/yb;->p:Ljava/util/List;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    iget-boolean v1, p0, Lc7/yb;->t:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p0, Lc7/yb;->u:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-boolean v3, p0, Lc7/yb;->v:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "Not stopping services. fetch, network, upload"

    invoke-virtual {v0, v4, v1, v2, v3}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final J()V
    .locals 21

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v1

    invoke-virtual {v1}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->l0()V

    iget-wide v1, v0, Lc7/yb;->o:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->b()J

    move-result-wide v1

    const-wide/32 v5, 0x36ee80

    iget-wide v7, v0, Lc7/yb;->o:J

    sub-long/2addr v1, v7

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    sub-long/2addr v5, v1

    cmp-long v1, v5, v3

    if-lez v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "Upload has been suspended. Will update scheduling later in approximately ms"

    invoke-virtual {v1, v3, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->r0()Lc7/f5;

    move-result-object v1

    invoke-virtual {v1}, Lc7/f5;->c()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->s0()Lc7/sb;

    move-result-object v1

    invoke-virtual {v1}, Lc7/sb;->u()V

    return-void

    :cond_0
    iput-wide v3, v0, Lc7/yb;->o:J

    :cond_1
    iget-object v1, v0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->n()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->K()Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_5

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->a()J

    move-result-wide v1

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    sget-object v5, Lc7/i0;->C:Lc7/m4;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v5

    invoke-virtual {v5}, Lc7/m;->R0()Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v5

    invoke-virtual {v5}, Lc7/m;->Q0()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v5, 0x1

    :goto_1
    if-eqz v5, :cond_6

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v10

    invoke-virtual {v10}, Lc7/h;->I()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_5

    const-string v11, ".none."

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    sget-object v10, Lc7/i0;->x:Lc7/m4;

    goto :goto_2

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    sget-object v10, Lc7/i0;->w:Lc7/m4;

    goto :goto_2

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    sget-object v10, Lc7/i0;->v:Lc7/m4;

    :goto_2
    invoke-virtual {v10, v6}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-static {v3, v4, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    iget-object v12, v0, Lc7/yb;->i:Lc7/xa;

    iget-object v12, v12, Lc7/xa;->g:Lc7/n5;

    invoke-virtual {v12}, Lc7/n5;->a()J

    move-result-wide v12

    iget-object v14, v0, Lc7/yb;->i:Lc7/xa;

    iget-object v14, v14, Lc7/xa;->h:Lc7/n5;

    invoke-virtual {v14}, Lc7/n5;->a()J

    move-result-wide v14

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v16

    move-wide/from16 v17, v10

    invoke-virtual/range {v16 .. v16}, Lc7/m;->u()J

    move-result-wide v9

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v11

    move-wide/from16 v19, v7

    invoke-virtual {v11}, Lc7/m;->v()J

    move-result-wide v6

    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    cmp-long v8, v6, v3

    if-nez v8, :cond_8

    :cond_7
    move-wide v10, v3

    goto/16 :goto_4

    :cond_8
    sub-long/2addr v6, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    move-result-wide v6

    sub-long v6, v1, v6

    sub-long/2addr v12, v1

    invoke-static {v12, v13}, Ljava/lang/Math;->abs(J)J

    move-result-wide v8

    sub-long v8, v1, v8

    sub-long/2addr v14, v1

    invoke-static {v14, v15}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    sub-long/2addr v1, v10

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    add-long v10, v6, v19

    if-eqz v5, :cond_9

    cmp-long v5, v8, v3

    if-lez v5, :cond_9

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    add-long v10, v10, v17

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v5

    move-wide/from16 v12, v17

    invoke-virtual {v5, v8, v9, v12, v13}, Lc7/ic;->Y(JJ)Z

    move-result v5

    if-nez v5, :cond_a

    add-long v10, v8, v12

    :cond_a
    cmp-long v5, v1, v3

    if-eqz v5, :cond_c

    cmp-long v5, v1, v6

    if-ltz v5, :cond_c

    const/4 v5, 0x0

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    const/16 v6, 0x14

    sget-object v7, Lc7/i0;->E:Lc7/m4;

    const/4 v8, 0x0

    invoke-virtual {v7, v8}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v9, 0x0

    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    if-ge v5, v6, :cond_7

    const-wide/16 v6, 0x1

    shl-long/2addr v6, v5

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    sget-object v12, Lc7/i0;->D:Lc7/m4;

    invoke-virtual {v12, v8}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Long;

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-static {v3, v4, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    mul-long/2addr v12, v6

    add-long/2addr v10, v12

    cmp-long v6, v10, v1

    if-lez v6, :cond_b

    goto :goto_4

    :cond_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_c
    :goto_4
    cmp-long v1, v10, v3

    if-nez v1, :cond_d

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    const-string v2, "Next upload time is 0"

    invoke-virtual {v1, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->r0()Lc7/f5;

    move-result-object v1

    invoke-virtual {v1}, Lc7/f5;->c()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->s0()Lc7/sb;

    move-result-object v1

    invoke-virtual {v1}, Lc7/sb;->u()V

    return-void

    :cond_d
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->c0()Lc7/c5;

    move-result-object v1

    invoke-virtual {v1}, Lc7/c5;->v()Z

    move-result v1

    if-nez v1, :cond_e

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    const-string v2, "No network"

    invoke-virtual {v1, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->r0()Lc7/f5;

    move-result-object v1

    invoke-virtual {v1}, Lc7/f5;->b()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->s0()Lc7/sb;

    move-result-object v1

    invoke-virtual {v1}, Lc7/sb;->u()V

    return-void

    :cond_e
    iget-object v1, v0, Lc7/yb;->i:Lc7/xa;

    iget-object v1, v1, Lc7/xa;->f:Lc7/n5;

    invoke-virtual {v1}, Lc7/n5;->a()J

    move-result-wide v1

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    sget-object v5, Lc7/i0;->t:Lc7/m4;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v7

    invoke-virtual {v7, v1, v2, v5, v6}, Lc7/ic;->Y(JJ)Z

    move-result v7

    if-nez v7, :cond_f

    add-long/2addr v1, v5

    invoke-static {v10, v11, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    :cond_f
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->r0()Lc7/f5;

    move-result-object v1

    invoke-virtual {v1}, Lc7/f5;->c()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->a()J

    move-result-wide v1

    sub-long/2addr v10, v1

    cmp-long v1, v10, v3

    if-gtz v1, :cond_10

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    sget-object v1, Lc7/i0;->y:Lc7/m4;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    iget-object v1, v0, Lc7/yb;->i:Lc7/xa;

    iget-object v1, v1, Lc7/xa;->g:Lc7/n5;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v2

    invoke-interface {v2}, Lo6/d;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lc7/n5;->b(J)V

    :cond_10
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "Upload scheduled in approximately ms"

    invoke-virtual {v1, v3, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->s0()Lc7/sb;

    move-result-object v1

    invoke-virtual {v1, v10, v11}, Lc7/sb;->t(J)V

    return-void

    :cond_11
    :goto_5
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    const-string v2, "Nothing to upload or uploading impossible"

    invoke-virtual {v1, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->r0()Lc7/f5;

    move-result-object v1

    invoke-virtual {v1}, Lc7/f5;->c()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->s0()Lc7/sb;

    move-result-object v1

    invoke-virtual {v1}, Lc7/sb;->u()V

    return-void
.end method

.method public final K()Z
    .locals 1

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0}, Lc7/m;->P0()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0}, Lc7/m;->x()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final L()Z
    .locals 5

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/yb;->w:Ljava/nio/channels/FileLock;

    const/4 v1, 0x1

    const-string v2, "Storage concurrent access okay"

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    invoke-virtual {v0, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    return v1

    :cond_0
    iget-object v0, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    new-instance v3, Ljava/io/File;

    const-string v4, "google_app_measurement.db"

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v4, "rw"

    invoke-direct {v0, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    iput-object v0, p0, Lc7/yb;->x:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object v0

    iput-object v0, p0, Lc7/yb;->w:Ljava/nio/channels/FileLock;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    invoke-virtual {v0, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    return v1

    :cond_1
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Storage concurrent data access panic"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->G()Lc7/x4;

    move-result-object v1

    const-string v2, "Storage lock already acquired"

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Failed to access storage lock file"

    goto :goto_0

    :catch_2
    move-exception v0

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Failed to acquire storage lock"

    :goto_0
    invoke-virtual {v1, v2, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public final M(Ljava/lang/String;)Lc7/n7;
    .locals 1

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    iget-object v0, p0, Lc7/yb;->B:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/n7;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/m;->D0(Ljava/lang/String;)Lc7/n7;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lc7/n7;->c:Lc7/n7;

    :cond_0
    invoke-virtual {p0, p1, v0}, Lc7/yb;->w(Ljava/lang/String;Lc7/n7;)V

    :cond_1
    return-object v0
.end method

.method public final N(Lc7/rc;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/cc;

    invoke-direct {v1, p0, p1}, Lc7/cc;-><init>(Lc7/yb;Lc7/rc;)V

    invoke-virtual {v0, v1}, Lc7/d6;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    const-wide/16 v1, 0x7530

    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    iget-object p1, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Failed to get app instance id. appId"

    invoke-virtual {v1, v2, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final O(Lc7/f;)V
    .locals 1

    iget-object v0, p1, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lc7/yb;->S(Ljava/lang/String;)Lc7/rc;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0}, Lc7/yb;->P(Lc7/f;Lc7/rc;)V

    :cond_0
    return-void
.end method

.method public final P(Lc7/f;Lc7/rc;)V
    .locals 10

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lc7/f;->i:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lc7/f;->j:Lc7/lc;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lc7/f;->j:Lc7/lc;

    iget-object v0, v0, Lc7/lc;->i:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-static {p2}, Lc7/yb;->Z(Lc7/rc;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lc7/rc;->o:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p2}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    return-void

    :cond_1
    new-instance v0, Lc7/f;

    invoke-direct {v0, p1}, Lc7/f;-><init>(Lc7/f;)V

    const/4 p1, 0x0

    iput-boolean p1, v0, Lc7/f;->l:Z

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    invoke-virtual {v1}, Lc7/m;->L0()V

    :try_start_0
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    iget-object v2, v0, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lc7/f;->j:Lc7/lc;

    iget-object v3, v3, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lc7/m;->w0(Ljava/lang/String;Ljava/lang/String;)Lc7/f;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, v1, Lc7/f;->i:Ljava/lang/String;

    iget-object v3, v0, Lc7/f;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->G()Lc7/x4;

    move-result-object v2

    const-string v3, "Updating a conditional user property with different origin. name, origin, origin (from DB)"

    iget-object v4, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v4}, Lc7/k6;->y()Lc7/u4;

    move-result-object v4

    iget-object v5, v0, Lc7/f;->j:Lc7/lc;

    iget-object v5, v5, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lc7/f;->i:Ljava/lang/String;

    iget-object v6, v1, Lc7/f;->i:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5, v6}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    const/4 v2, 0x1

    if-eqz v1, :cond_3

    iget-boolean v3, v1, Lc7/f;->l:Z

    if-eqz v3, :cond_3

    iget-object v2, v1, Lc7/f;->i:Ljava/lang/String;

    iput-object v2, v0, Lc7/f;->i:Ljava/lang/String;

    iget-wide v4, v1, Lc7/f;->k:J

    iput-wide v4, v0, Lc7/f;->k:J

    iget-wide v4, v1, Lc7/f;->o:J

    iput-wide v4, v0, Lc7/f;->o:J

    iget-object v2, v1, Lc7/f;->m:Ljava/lang/String;

    iput-object v2, v0, Lc7/f;->m:Ljava/lang/String;

    iget-object v2, v1, Lc7/f;->p:Lc7/g0;

    iput-object v2, v0, Lc7/f;->p:Lc7/g0;

    iput-boolean v3, v0, Lc7/f;->l:Z

    new-instance v2, Lc7/lc;

    iget-object v3, v0, Lc7/f;->j:Lc7/lc;

    iget-object v5, v3, Lc7/lc;->i:Ljava/lang/String;

    iget-object v4, v1, Lc7/f;->j:Lc7/lc;

    iget-wide v6, v4, Lc7/lc;->j:J

    invoke-virtual {v3}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object v8

    iget-object v1, v1, Lc7/f;->j:Lc7/lc;

    iget-object v9, v1, Lc7/lc;->n:Ljava/lang/String;

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Lc7/lc;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lc7/f;->j:Lc7/lc;

    goto :goto_0

    :cond_3
    iget-object v1, v0, Lc7/f;->m:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance p1, Lc7/lc;

    iget-object v1, v0, Lc7/f;->j:Lc7/lc;

    iget-object v4, v1, Lc7/lc;->i:Ljava/lang/String;

    iget-wide v5, v0, Lc7/f;->k:J

    invoke-virtual {v1}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object v7

    iget-object v1, v0, Lc7/f;->j:Lc7/lc;

    iget-object v8, v1, Lc7/lc;->n:Ljava/lang/String;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lc7/lc;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v0, Lc7/f;->j:Lc7/lc;

    iput-boolean v2, v0, Lc7/f;->l:Z

    move p1, v2

    :cond_4
    :goto_0
    iget-boolean v1, v0, Lc7/f;->l:Z

    if-eqz v1, :cond_6

    iget-object v1, v0, Lc7/f;->j:Lc7/lc;

    new-instance v9, Lc7/nc;

    iget-object v2, v0, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    iget-object v4, v0, Lc7/f;->i:Ljava/lang/String;

    iget-object v5, v1, Lc7/lc;->i:Ljava/lang/String;

    iget-wide v6, v1, Lc7/lc;->j:J

    invoke-virtual {v1}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lc7/nc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    invoke-virtual {v1, v9}, Lc7/m;->Y(Lc7/nc;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->A()Lc7/x4;

    move-result-object v1

    const-string v2, "User property updated immediately"

    iget-object v3, v0, Lc7/f;->h:Ljava/lang/String;

    iget-object v4, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v4}, Lc7/k6;->y()Lc7/u4;

    move-result-object v4

    iget-object v5, v9, Lc7/nc;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v9, Lc7/nc;->e:Ljava/lang/Object;

    :goto_1
    invoke-virtual {v1, v2, v3, v4, v5}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "(2)Too many active user properties, ignoring"

    iget-object v3, v0, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v3}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v4}, Lc7/k6;->y()Lc7/u4;

    move-result-object v4

    iget-object v5, v9, Lc7/nc;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v9, Lc7/nc;->e:Ljava/lang/Object;

    goto :goto_1

    :goto_2
    if-eqz p1, :cond_6

    iget-object p1, v0, Lc7/f;->p:Lc7/g0;

    if-eqz p1, :cond_6

    new-instance p1, Lc7/g0;

    iget-object v1, v0, Lc7/f;->p:Lc7/g0;

    iget-wide v2, v0, Lc7/f;->k:J

    invoke-direct {p1, v1, v2, v3}, Lc7/g0;-><init>(Lc7/g0;J)V

    invoke-virtual {p0, p1, p2}, Lc7/yb;->U(Lc7/g0;Lc7/rc;)V

    :cond_6
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1, v0}, Lc7/m;->W(Lc7/f;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->A()Lc7/x4;

    move-result-object p1

    const-string p2, "Conditional property added"

    iget-object v1, v0, Lc7/f;->h:Ljava/lang/String;

    iget-object v2, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v2}, Lc7/k6;->y()Lc7/u4;

    move-result-object v2

    iget-object v3, v0, Lc7/f;->j:Lc7/lc;

    iget-object v3, v3, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lc7/f;->j:Lc7/lc;

    invoke-virtual {v0}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-virtual {p1, p2, v1, v2, v0}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Too many conditional properties, ignoring"

    iget-object v1, v0, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v2}, Lc7/k6;->y()Lc7/u4;

    move-result-object v2

    iget-object v3, v0, Lc7/f;->j:Lc7/lc;

    iget-object v3, v3, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lc7/f;->j:Lc7/lc;

    invoke-virtual {v0}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :goto_4
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1}, Lc7/m;->O0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1}, Lc7/m;->M0()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p2

    invoke-virtual {p2}, Lc7/m;->M0()V

    throw p1
.end method

.method public final Q(Lc7/g0;Lc7/rc;)V
    .locals 11

    iget-object v0, p2, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p1}, Lc7/z4;->b(Lc7/g0;)Lc7/z4;

    move-result-object p1

    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v0

    iget-object v1, p1, Lc7/z4;->d:Landroid/os/Bundle;

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    iget-object v3, p2, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lc7/m;->v0(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lc7/qc;->I(Landroid/os/Bundle;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v0

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v1

    iget-object v2, p2, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lc7/h;->p(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lc7/qc;->K(Lc7/z4;I)V

    invoke-virtual {p1}, Lc7/z4;->a()Lc7/g0;

    move-result-object p1

    iget-object v0, p1, Lc7/g0;->h:Ljava/lang/String;

    const-string v1, "_cmp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "_cis"

    const-string v3, "referrer API v2"

    if-eqz v0, :cond_0

    iget-object v0, p1, Lc7/g0;->i:Lc7/a0;

    invoke-virtual {v0, v2}, Lc7/a0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lc7/g0;->i:Lc7/a0;

    const-string v4, "gclid"

    invoke-virtual {v0, v4}, Lc7/a0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lc7/lc;

    iget-wide v7, p1, Lc7/g0;->k:J

    const-string v6, "_lgclid"

    const-string v10, "auto"

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Lc7/lc;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2}, Lc7/yb;->p(Lc7/lc;Lc7/rc;)V

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzok;->zza()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzok;->zzc()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lc7/g0;->h:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lc7/g0;->i:Lc7/a0;

    invoke-virtual {v0, v2}, Lc7/a0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lc7/g0;->i:Lc7/a0;

    const-string v1, "gbraid"

    invoke-virtual {v0, v1}, Lc7/a0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lc7/lc;

    iget-wide v4, p1, Lc7/g0;->k:J

    const-string v3, "_gbraid"

    const-string v7, "auto"

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lc7/lc;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2}, Lc7/yb;->p(Lc7/lc;Lc7/rc;)V

    :cond_1
    invoke-virtual {p0, p1, p2}, Lc7/yb;->l(Lc7/g0;Lc7/rc;)V

    return-void
.end method

.method public final R(Lc7/g5;)V
    .locals 11

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p1}, Lc7/g5;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lc7/g5;->t0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0xcc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lc7/yb;->u(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void

    :cond_0
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    invoke-virtual {p1}, Lc7/g5;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lc7/g5;->t0()Ljava/lang/String;

    move-result-object v1

    :cond_1
    sget-object v2, Lc7/i0;->g:Lc7/m4;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    sget-object v4, Lc7/i0;->h:Lc7/m4;

    invoke-virtual {v4, v3}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "config/app/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "platform"

    const-string v4, "android"

    invoke-virtual {v1, v2, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "gmp_version"

    const-string v4, "84002"

    invoke-virtual {v1, v2, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "runtime_version"

    const-string v4, "0"

    invoke-virtual {v1, v2, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    new-instance v7, Ljava/net/URL;

    invoke-direct {v7, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    const-string v2, "Fetching remote configuration"

    invoke-virtual {v1, v2, v6}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v1

    invoke-virtual {v1, v6}, Lc7/u5;->G(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    move-result-object v1

    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v2

    invoke-virtual {v2, v6}, Lc7/u5;->K(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_4

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v3, Lu/a;

    invoke-direct {v3}, Lu/a;-><init>()V

    const-string v1, "If-Modified-Since"

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v1

    invoke-virtual {v1, v6}, Lc7/u5;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    if-nez v3, :cond_3

    new-instance v2, Lu/a;

    invoke-direct {v2}, Lu/a;-><init>()V

    move-object v3, v2

    :cond_3
    const-string v2, "If-None-Match"

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    move-object v9, v3

    const/4 v1, 0x1

    iput-boolean v1, p0, Lc7/yb;->t:Z

    invoke-virtual {p0}, Lc7/yb;->c0()Lc7/c5;

    move-result-object v5

    new-instance v10, Lc7/dc;

    invoke-direct {v10, p0}, Lc7/dc;-><init>(Lc7/yb;)V

    invoke-virtual {v5}, Lc7/j7;->i()V

    invoke-virtual {v5}, Lc7/xb;->p()V

    invoke-static {v7}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v10}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v1

    new-instance v2, Lc7/h5;

    const/4 v8, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, Lc7/h5;-><init>(Lc7/c5;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lc7/b5;)V

    invoke-virtual {v1, v2}, Lc7/d6;->u(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    invoke-virtual {p1}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Failed to parse config URL. Not fetching. appId"

    invoke-virtual {v1, v2, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final S(Ljava/lang/String;)Lc7/rc;
    .locals 41

    move-object/from16 v1, p1

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object v15

    const/4 v0, 0x0

    if-eqz v15, :cond_3

    invoke-virtual {v15}, Lc7/g5;->h()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_2

    :cond_0
    move-object/from16 v14, p0

    invoke-virtual {v14, v15}, Lc7/yb;->h(Lc7/g5;)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v3, "App version does not match; dropping. appId"

    :goto_0
    invoke-virtual {v2, v3, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0

    :cond_1
    invoke-virtual/range {p0 .. p1}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v28

    const/16 v0, 0x64

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v2

    sget-object v3, Lc7/i0;->Q0:Lc7/m4;

    invoke-virtual {v2, v3}, Lc7/h;->o(Lc7/m4;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual/range {p0 .. p1}, Lc7/yb;->W(Ljava/lang/String;)Lc7/w;

    move-result-object v0

    invoke-virtual {v0}, Lc7/w;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {v28 .. v28}, Lc7/n7;->b()I

    move-result v2

    move-object/from16 v35, v0

    move/from16 v34, v2

    goto :goto_1

    :cond_2
    const-string v2, ""

    move/from16 v34, v0

    move-object/from16 v35, v2

    :goto_1
    new-instance v40, Lc7/rc;

    move-object/from16 v0, v40

    invoke-virtual {v15}, Lc7/g5;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15}, Lc7/g5;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15}, Lc7/g5;->A()J

    move-result-wide v4

    invoke-virtual {v15}, Lc7/g5;->x0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v15}, Lc7/g5;->i0()J

    move-result-wide v7

    invoke-virtual {v15}, Lc7/g5;->c0()J

    move-result-wide v9

    const/4 v11, 0x0

    invoke-virtual {v15}, Lc7/g5;->s()Z

    move-result v12

    const/4 v13, 0x0

    invoke-virtual {v15}, Lc7/g5;->i()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v14, v16

    invoke-virtual {v15}, Lc7/g5;->w()J

    move-result-wide v16

    move-object/from16 v29, v15

    move-wide/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    invoke-virtual/range {v29 .. v29}, Lc7/g5;->r()Z

    move-result v20

    const/16 v21, 0x0

    invoke-virtual/range {v29 .. v29}, Lc7/g5;->t0()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v29 .. v29}, Lc7/g5;->s0()Ljava/lang/Boolean;

    move-result-object v23

    invoke-virtual/range {v29 .. v29}, Lc7/g5;->e0()J

    move-result-wide v24

    invoke-virtual/range {v29 .. v29}, Lc7/g5;->o()Ljava/util/List;

    move-result-object v26

    const/16 v27, 0x0

    invoke-virtual/range {v28 .. v28}, Lc7/n7;->v()Ljava/lang/String;

    move-result-object v28

    const/16 v30, 0x0

    invoke-virtual/range {v29 .. v29}, Lc7/g5;->u()Z

    move-result v31

    invoke-virtual/range {v29 .. v29}, Lc7/g5;->r0()J

    move-result-wide v32

    invoke-virtual/range {v29 .. v29}, Lc7/g5;->a()I

    move-result v36

    invoke-virtual/range {v29 .. v29}, Lc7/g5;->E()J

    move-result-wide v37

    invoke-virtual/range {v29 .. v29}, Lc7/g5;->n()Ljava/lang/String;

    move-result-object v39

    const-string v29, ""

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v39}, Lc7/rc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;)V

    return-object v40

    :cond_3
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->A()Lc7/x4;

    move-result-object v2

    const-string v3, "No app data available; dropping"

    goto/16 :goto_0
.end method

.method public final T()Lc7/xc;
    .locals 1

    iget-object v0, p0, Lc7/yb;->f:Lc7/xc;

    invoke-static {v0}, Lc7/yb;->f(Lc7/xb;)Lc7/xb;

    move-result-object v0

    check-cast v0, Lc7/xc;

    return-object v0
.end method

.method public final U(Lc7/g0;Lc7/rc;)V
    .locals 28

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v4, "_fx"

    const-string v5, "_sno"

    invoke-static/range {p2 .. p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v6}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v8

    invoke-virtual {v8}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->l0()V

    iget-object v8, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-static/range {p1 .. p2}, Lc7/ic;->Z(Lc7/g0;Lc7/rc;)Z

    move-result v9

    if-nez v9, :cond_0

    return-void

    :cond_0
    iget-boolean v9, v3, Lc7/rc;->o:Z

    if-nez v9, :cond_1

    invoke-virtual {v1, v3}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    return-void

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v9

    iget-object v10, v2, Lc7/g0;->h:Ljava/lang/String;

    invoke-virtual {v9, v8, v10}, Lc7/u5;->J(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    const-string v15, "_err"

    const/4 v14, 0x0

    if-eqz v9, :cond_6

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->G()Lc7/x4;

    move-result-object v3

    invoke-static {v8}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v5}, Lc7/k6;->y()Lc7/u4;

    move-result-object v5

    iget-object v6, v2, Lc7/g0;->h:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Dropping blocked event. appId"

    invoke-virtual {v3, v6, v4, v5}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v3

    invoke-virtual {v3, v8}, Lc7/u5;->S(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v3

    invoke-virtual {v3, v8}, Lc7/u5;->U(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-nez v3, :cond_4

    iget-object v4, v2, Lc7/g0;->h:Ljava/lang/String;

    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v9, v1, Lc7/yb;->G:Lc7/pc;

    const/16 v11, 0xb

    iget-object v13, v2, Lc7/g0;->h:Ljava/lang/String;

    const/4 v2, 0x0

    const-string v12, "_ev"

    move-object v10, v8

    move-object v4, v14

    move v14, v2

    invoke-static/range {v9 .. v14}, Lc7/qc;->N(Lc7/pc;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    goto :goto_2

    :cond_4
    move-object v4, v14

    :goto_2
    if-eqz v3, :cond_5

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2, v8}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lc7/g5;->g0()J

    move-result-wide v5

    invoke-virtual {v2}, Lc7/g5;->I()J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v3

    invoke-interface {v3}, Lo6/d;->a()J

    move-result-wide v7

    sub-long/2addr v7, v5

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    sget-object v3, Lc7/i0;->B:Lc7/m4;

    invoke-virtual {v3, v4}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v3, v5, v3

    if-lez v3, :cond_5

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->A()Lc7/x4;

    move-result-object v3

    const-string v4, "Fetching config for blocked app"

    invoke-virtual {v3, v4}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lc7/yb;->R(Lc7/g5;)V

    :cond_5
    return-void

    :cond_6
    invoke-static/range {p1 .. p1}, Lc7/z4;->b(Lc7/g0;)Lc7/z4;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v10

    invoke-virtual {v10, v8}, Lc7/h;->p(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v9, v2, v10}, Lc7/qc;->K(Lc7/z4;I)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzov;->zza()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v9

    sget-object v10, Lc7/i0;->F0:Lc7/m4;

    invoke-virtual {v9, v10}, Lc7/h;->o(Lc7/m4;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v9

    sget-object v10, Lc7/i0;->S:Lc7/m4;

    const/16 v11, 0xa

    const/16 v12, 0x23

    invoke-virtual {v9, v8, v10, v11, v12}, Lc7/h;->l(Ljava/lang/String;Lc7/m4;II)I

    move-result v9

    goto :goto_3

    :cond_7
    const/4 v9, 0x0

    :goto_3
    new-instance v10, Ljava/util/TreeSet;

    iget-object v11, v2, Lc7/z4;->d:Landroid/os/Bundle;

    invoke-virtual {v11}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const-string v12, "items"

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v12

    iget-object v13, v2, Lc7/z4;->d:Landroid/os/Bundle;

    invoke-virtual {v13, v11}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v11

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzov;->zza()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v13

    sget-object v14, Lc7/i0;->F0:Lc7/m4;

    invoke-virtual {v13, v14}, Lc7/h;->o(Lc7/m4;)Z

    move-result v13

    if-eqz v13, :cond_8

    const/4 v13, 0x1

    goto :goto_5

    :cond_8
    const/4 v13, 0x0

    :goto_5
    invoke-virtual {v12, v11, v9, v13}, Lc7/qc;->W([Landroid/os/Parcelable;IZ)V

    :cond_9
    const/4 v14, 0x0

    goto :goto_4

    :cond_a
    invoke-virtual {v2}, Lc7/z4;->a()Lc7/g0;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v9

    const/4 v10, 0x2

    invoke-virtual {v9, v10}, Lc7/v4;->x(I)Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v9

    invoke-virtual {v9}, Lc7/v4;->F()Lc7/x4;

    move-result-object v9

    iget-object v11, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v11}, Lc7/k6;->y()Lc7/u4;

    move-result-object v11

    invoke-virtual {v11, v2}, Lc7/u4;->b(Lc7/g0;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "Logging event"

    invoke-virtual {v9, v12, v11}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_b
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzop;->zza()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v9

    sget-object v11, Lc7/i0;->C0:Lc7/m4;

    invoke-virtual {v9, v11}, Lc7/h;->o(Lc7/m4;)Z

    :cond_c
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v9

    invoke-virtual {v9}, Lc7/m;->L0()V

    :try_start_0
    invoke-virtual {v1, v3}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    const-string v9, "ecommerce_purchase"

    iget-object v11, v2, Lc7/g0;->h:Ljava/lang/String;

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v11, "refund"

    if-nez v9, :cond_e

    :try_start_1
    const-string v9, "purchase"

    iget-object v12, v2, Lc7/g0;->h:Ljava/lang/String;

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    iget-object v9, v2, Lc7/g0;->h:Ljava/lang/String;

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    goto :goto_6

    :cond_d
    const/4 v9, 0x0

    goto :goto_7

    :cond_e
    :goto_6
    const/4 v9, 0x1

    :goto_7
    const-string v12, "_iap"

    iget-object v13, v2, Lc7/g0;->h:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_10

    if-eqz v9, :cond_f

    goto :goto_8

    :cond_f
    const/4 v12, 0x0

    goto :goto_9

    :cond_10
    :goto_8
    const/4 v12, 0x1

    :goto_9
    if-eqz v12, :cond_19

    iget-object v12, v2, Lc7/g0;->i:Lc7/a0;

    const-string v13, "currency"

    invoke-virtual {v12, v13}, Lc7/a0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v13, "value"

    if-eqz v9, :cond_13

    :try_start_2
    iget-object v9, v2, Lc7/g0;->i:Lc7/a0;

    invoke-virtual {v9, v13}, Lc7/a0;->K(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v19

    const-wide v21, 0x412e848000000000L    # 1000000.0

    mul-double v19, v19, v21

    const-wide/16 v23, 0x0

    cmpl-double v9, v19, v23

    if-nez v9, :cond_11

    iget-object v9, v2, Lc7/g0;->i:Lc7/a0;

    invoke-virtual {v9, v13}, Lc7/a0;->M(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    long-to-double v13, v13

    mul-double v19, v13, v21

    :cond_11
    const-wide/high16 v13, 0x43e0000000000000L    # 9.223372036854776E18

    cmpg-double v9, v19, v13

    if-gtz v9, :cond_12

    const-wide/high16 v13, -0x3c20000000000000L    # -9.223372036854776E18

    cmpl-double v9, v19, v13

    if-ltz v9, :cond_12

    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    iget-object v9, v2, Lc7/g0;->h:Ljava/lang/String;

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_14

    neg-long v13, v13

    goto :goto_a

    :cond_12
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v9

    invoke-virtual {v9}, Lc7/v4;->G()Lc7/x4;

    move-result-object v9

    const-string v10, "Data lost. Currency value is too big. appId"

    invoke-static {v8}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    invoke-virtual {v9, v10, v11, v12}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-wide/from16 v24, v6

    move-object/from16 v26, v15

    const/4 v7, 0x0

    const/4 v13, 0x0

    goto/16 :goto_10

    :cond_13
    iget-object v9, v2, Lc7/g0;->i:Lc7/a0;

    invoke-virtual {v9, v13}, Lc7/a0;->M(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    :cond_14
    :goto_a
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_17

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v12, v9}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v11, "[A-Z]{3}"

    invoke-virtual {v9, v11}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_17

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "_ltv_"

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v9

    invoke-virtual {v9, v8, v12}, Lc7/m;->A0(Ljava/lang/String;Ljava/lang/String;)Lc7/nc;

    move-result-object v9

    if-eqz v9, :cond_16

    iget-object v9, v9, Lc7/nc;->e:Ljava/lang/Object;

    instance-of v11, v9, Ljava/lang/Long;

    if-nez v11, :cond_15

    goto :goto_c

    :cond_15
    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    new-instance v19, Lc7/nc;

    iget-object v11, v2, Lc7/g0;->j:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, Lo6/d;->a()J

    move-result-wide v20

    add-long/2addr v9, v13

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    move-object/from16 v9, v19

    move-object v10, v8

    const/4 v13, 0x0

    move-wide/from16 v24, v6

    move v7, v13

    const/4 v6, 0x1

    move-wide/from16 v13, v20

    move-object/from16 v26, v15

    move-object/from16 v15, v22

    invoke-direct/range {v9 .. v15}, Lc7/nc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    :goto_b
    move-object/from16 v6, v19

    goto :goto_e

    :cond_16
    :goto_c
    move-wide/from16 v24, v6

    move-object/from16 v26, v15

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v11

    sget-object v15, Lc7/i0;->G:Lc7/m4;

    invoke-virtual {v11, v8, v15}, Lc7/h;->q(Ljava/lang/String;Lc7/m4;)I

    move-result v11

    sub-int/2addr v11, v6

    invoke-static {v8}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v9}, Lc7/j7;->i()V

    invoke-virtual {v9}, Lc7/xb;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v9}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v15

    const-string v10, "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'_ltv_%\' order by set_timestamp desc limit ?,10);"

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/String;

    aput-object v8, v6, v7

    const/16 v17, 0x1

    aput-object v8, v6, v17

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    const/16 v16, 0x2

    aput-object v11, v6, v16

    invoke-virtual {v15, v10, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_d

    :catch_0
    move-exception v0

    move-object v6, v0

    :try_start_4
    invoke-virtual {v9}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v9

    invoke-virtual {v9}, Lc7/v4;->B()Lc7/x4;

    move-result-object v9

    const-string v10, "Error pruning currencies. appId"

    invoke-static {v8}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v9, v10, v11, v6}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_d
    new-instance v19, Lc7/nc;

    iget-object v11, v2, Lc7/g0;->j:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v6

    invoke-interface {v6}, Lo6/d;->a()J

    move-result-wide v15

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move-object/from16 v9, v19

    move-object v10, v8

    move-wide v13, v15

    move-object v15, v6

    invoke-direct/range {v9 .. v15}, Lc7/nc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    goto :goto_b

    :goto_e
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v9

    invoke-virtual {v9, v6}, Lc7/m;->Y(Lc7/nc;)Z

    move-result v9

    if-nez v9, :cond_18

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v9

    invoke-virtual {v9}, Lc7/v4;->B()Lc7/x4;

    move-result-object v9

    const-string v10, "Too many unique user properties are set. Ignoring user property. appId"

    invoke-static {v8}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    iget-object v12, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v12}, Lc7/k6;->y()Lc7/u4;

    move-result-object v12

    iget-object v13, v6, Lc7/nc;->c:Ljava/lang/String;

    invoke-virtual {v12, v13}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    iget-object v6, v6, Lc7/nc;->e:Ljava/lang/Object;

    invoke-virtual {v9, v10, v11, v12, v6}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v9, v1, Lc7/yb;->G:Lc7/pc;

    const/16 v11, 0x9

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v10, v8

    invoke-static/range {v9 .. v14}, Lc7/qc;->N(Lc7/pc;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    goto :goto_f

    :cond_17
    move-wide/from16 v24, v6

    move-object/from16 v26, v15

    const/4 v7, 0x0

    :cond_18
    :goto_f
    const/4 v13, 0x1

    :goto_10
    if-nez v13, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->O0()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->M0()V

    return-void

    :cond_19
    move-wide/from16 v24, v6

    move-object/from16 v26, v15

    const/4 v7, 0x0

    :cond_1a
    :try_start_5
    iget-object v6, v2, Lc7/g0;->h:Ljava/lang/String;

    invoke-static {v6}, Lc7/qc;->E0(Ljava/lang/String;)Z

    move-result v6

    iget-object v9, v2, Lc7/g0;->h:Ljava/lang/String;

    move-object/from16 v10, v26

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v9, v2, Lc7/g0;->i:Lc7/a0;

    invoke-static {v9}, Lc7/qc;->v(Lc7/a0;)J

    move-result-wide v9

    const-wide/16 v13, 0x1

    add-long v15, v9, v13

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->q0()J

    move-result-wide v10

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v12, v8

    move-object/from16 v21, v8

    move-wide v7, v13

    move-wide v13, v15

    move/from16 v15, v17

    move/from16 v16, v6

    move/from16 v17, v18

    move/from16 v18, v20

    invoke-virtual/range {v9 .. v19}, Lc7/m;->D(JLjava/lang/String;JZZZZZ)Lc7/r;

    move-result-object v9

    iget-wide v10, v9, Lc7/r;->b:J

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    sget-object v12, Lc7/i0;->m:Lc7/m4;

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    int-to-long v12, v12

    sub-long/2addr v10, v12

    const-wide/16 v14, 0x0

    cmp-long v12, v10, v14

    const-wide/16 v16, 0x3e8

    if-lez v12, :cond_1c

    rem-long v10, v10, v16

    cmp-long v2, v10, v7

    if-nez v2, :cond_1b

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v3, "Data loss. Too many events logged. appId, count"

    invoke-static/range {v21 .. v21}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v5, v9, Lc7/r;->b:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1b
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->O0()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->M0()V

    return-void

    :cond_1c
    if-eqz v6, :cond_1e

    :try_start_6
    iget-wide v10, v9, Lc7/r;->a:J

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    sget-object v12, Lc7/i0;->o:Lc7/m4;

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    int-to-long v12, v12

    sub-long/2addr v10, v12

    cmp-long v12, v10, v14

    if-lez v12, :cond_1e

    rem-long v10, v10, v16

    cmp-long v3, v10, v7

    if-nez v3, :cond_1d

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    const-string v4, "Data loss. Too many public events logged. appId, count"

    invoke-static/range {v21 .. v21}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    iget-wide v6, v9, Lc7/r;->a:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v3, v4, v5, v6}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1d
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v9, v1, Lc7/yb;->G:Lc7/pc;

    const/16 v11, 0x10

    const-string v12, "_ev"

    iget-object v13, v2, Lc7/g0;->h:Ljava/lang/String;

    const/4 v14, 0x0

    move-object/from16 v10, v21

    invoke-static/range {v9 .. v14}, Lc7/qc;->N(Lc7/pc;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->O0()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->M0()V

    return-void

    :cond_1e
    if-eqz v20, :cond_20

    :try_start_7
    iget-wide v10, v9, Lc7/r;->d:J

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v12

    iget-object v13, v3, Lc7/rc;->h:Ljava/lang/String;

    sget-object v7, Lc7/i0;->n:Lc7/m4;

    invoke-virtual {v12, v13, v7}, Lc7/h;->q(Ljava/lang/String;Lc7/m4;)I

    move-result v7

    const v8, 0xf4240

    invoke-static {v8, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    int-to-long v7, v7

    sub-long/2addr v10, v7

    cmp-long v7, v10, v14

    if-lez v7, :cond_20

    const-wide/16 v7, 0x1

    cmp-long v2, v10, v7

    if-nez v2, :cond_1f

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v3, "Too many error events logged. appId, count"

    invoke-static/range {v21 .. v21}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v5, v9, Lc7/r;->d:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1f
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->O0()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->M0()V

    return-void

    :cond_20
    :try_start_8
    iget-object v7, v2, Lc7/g0;->i:Lc7/a0;

    invoke-virtual {v7}, Lc7/a0;->L()Landroid/os/Bundle;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v8

    const-string v9, "_o"

    iget-object v10, v2, Lc7/g0;->j:Ljava/lang/String;

    invoke-virtual {v8, v7, v9, v10}, Lc7/qc;->J(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v8

    move-object/from16 v13, v21

    invoke-virtual {v8, v13}, Lc7/qc;->A0(Ljava/lang/String;)Z

    move-result v8
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    const-string v12, "_r"

    if-eqz v8, :cond_21

    :try_start_9
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v8

    const-string v9, "_dbg"

    const-wide/16 v10, 0x1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-virtual {v8, v7, v9, v14}, Lc7/qc;->J(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v8

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v8, v7, v12, v9}, Lc7/qc;->J(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_21
    const-string v8, "_s"

    iget-object v9, v2, Lc7/g0;->h:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_22

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v8

    iget-object v9, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v8, v9, v5}, Lc7/m;->A0(Ljava/lang/String;Ljava/lang/String;)Lc7/nc;

    move-result-object v8

    if-eqz v8, :cond_22

    iget-object v9, v8, Lc7/nc;->e:Ljava/lang/Object;

    instance-of v9, v9, Ljava/lang/Long;

    if-eqz v9, :cond_22

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v9

    iget-object v8, v8, Lc7/nc;->e:Ljava/lang/Object;

    invoke-virtual {v9, v7, v5, v8}, Lc7/qc;->J(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_22
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v5

    invoke-virtual {v5, v13}, Lc7/m;->A(Ljava/lang/String;)J

    move-result-wide v8

    const-wide/16 v14, 0x0

    cmp-long v5, v8, v14

    if-lez v5, :cond_23

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v5

    invoke-virtual {v5}, Lc7/v4;->G()Lc7/x4;

    move-result-object v5

    const-string v10, "Data lost. Too many events stored on disk, deleted. appId"

    invoke-static {v13}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v5, v10, v11, v8}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_23
    new-instance v5, Lc7/y;

    iget-object v10, v1, Lc7/yb;->l:Lc7/k6;

    iget-object v11, v2, Lc7/g0;->j:Ljava/lang/String;

    iget-object v8, v2, Lc7/g0;->h:Ljava/lang/String;

    iget-wide v14, v2, Lc7/g0;->k:J

    const-wide/16 v18, 0x0

    move-object v9, v5

    move-object v2, v12

    move-object v12, v13

    move-object/from16 v27, v2

    move-object v2, v13

    move-object v13, v8

    move-wide/from16 v16, v18

    move-object/from16 v18, v7

    invoke-direct/range {v9 .. v18}, Lc7/y;-><init>(Lc7/k6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v7

    iget-object v8, v5, Lc7/y;->b:Ljava/lang/String;

    invoke-virtual {v7, v2, v8}, Lc7/m;->x0(Ljava/lang/String;Ljava/lang/String;)Lc7/c0;

    move-result-object v7

    if-nez v7, :cond_25

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v7

    invoke-virtual {v7, v2}, Lc7/m;->q0(Ljava/lang/String;)J

    move-result-wide v7

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v9

    invoke-virtual {v9, v2}, Lc7/h;->k(Ljava/lang/String;)I

    move-result v9

    int-to-long v9, v9

    cmp-long v7, v7, v9

    if-ltz v7, :cond_24

    if-eqz v6, :cond_24

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    const-string v4, "Too many event names used, ignoring event. appId, name, supported count"

    invoke-static {v2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    iget-object v7, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v7}, Lc7/k6;->y()Lc7/u4;

    move-result-object v7

    iget-object v5, v5, Lc7/y;->b:Ljava/lang/String;

    invoke-virtual {v7, v5}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v7

    invoke-virtual {v7, v2}, Lc7/h;->k(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v4, v6, v5, v7}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v9, v1, Lc7/yb;->G:Lc7/pc;

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v10, v2

    invoke-static/range {v9 .. v14}, Lc7/qc;->N(Lc7/pc;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->M0()V

    return-void

    :cond_24
    :try_start_a
    new-instance v6, Lc7/c0;

    iget-object v11, v5, Lc7/y;->b:Ljava/lang/String;

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    iget-wide v7, v5, Lc7/y;->d:J

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object v9, v6

    move-object v10, v2

    move-wide/from16 v16, v7

    invoke-direct/range {v9 .. v23}, Lc7/c0;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    goto :goto_11

    :cond_25
    iget-object v2, v1, Lc7/yb;->l:Lc7/k6;

    iget-wide v8, v7, Lc7/c0;->f:J

    invoke-virtual {v5, v2, v8, v9}, Lc7/y;->a(Lc7/k6;J)Lc7/y;

    move-result-object v5

    iget-wide v8, v5, Lc7/y;->d:J

    invoke-virtual {v7, v8, v9}, Lc7/c0;->a(J)Lc7/c0;

    move-result-object v6

    :goto_11
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2, v6}, Lc7/m;->P(Lc7/c0;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v2

    invoke-virtual {v2}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->l0()V

    invoke-static {v5}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v5, Lc7/y;->a:Ljava/lang/String;

    invoke-static {v2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v2, v5, Lc7/y;->a:Ljava/lang/String;

    iget-object v6, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Lh6/s;->a(Z)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzu()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v2

    const/4 v6, 0x1

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzg(I)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v2

    const-string v7, "android"

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzp(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v2

    iget-object v7, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_26

    iget-object v7, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_26
    iget-object v7, v3, Lc7/rc;->k:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_27

    iget-object v7, v3, Lc7/rc;->k:Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_27
    iget-object v7, v3, Lc7/rc;->j:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_28

    iget-object v7, v3, Lc7/rc;->j:Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_28
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpt;->zza()Z

    move-result v7

    if-eqz v7, :cond_2a

    iget-object v7, v3, Lc7/rc;->E:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2a

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v7

    sget-object v8, Lc7/i0;->r0:Lc7/m4;

    invoke-virtual {v7, v8}, Lc7/h;->o(Lc7/m4;)Z

    move-result v7

    if-nez v7, :cond_29

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v7

    iget-object v8, v3, Lc7/rc;->h:Ljava/lang/String;

    sget-object v9, Lc7/i0;->t0:Lc7/m4;

    invoke-virtual {v7, v8, v9}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v7

    if-eqz v7, :cond_2a

    :cond_29
    iget-object v7, v3, Lc7/rc;->E:Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzr(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_2a
    iget-wide v7, v3, Lc7/rc;->q:J

    const-wide/32 v9, -0x80000000

    cmp-long v9, v7, v9

    if-eqz v9, :cond_2b

    long-to-int v7, v7

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zze(I)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_2b
    iget-wide v7, v3, Lc7/rc;->l:J

    invoke-virtual {v2, v7, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzf(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    iget-object v7, v3, Lc7/rc;->i:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2c

    iget-object v7, v3, Lc7/rc;->i:Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_2c
    iget-object v7, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v7}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v1, v7}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v7

    iget-object v8, v3, Lc7/rc;->C:Ljava/lang/String;

    invoke-static {v8}, Lc7/n7;->e(Ljava/lang/String;)Lc7/n7;

    move-result-object v8

    invoke-virtual {v7, v8}, Lc7/n7;->d(Lc7/n7;)Lc7/n7;

    move-result-object v7

    invoke-virtual {v7}, Lc7/n7;->v()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzx()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_2d

    iget-object v8, v3, Lc7/rc;->x:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_2d

    iget-object v8, v3, Lc7/rc;->x:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_2d
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zza()Z

    move-result v8

    if-eqz v8, :cond_37

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v8

    iget-object v9, v3, Lc7/rc;->h:Ljava/lang/String;

    sget-object v10, Lc7/i0;->H0:Lc7/m4;

    invoke-virtual {v8, v9, v10}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v8

    if-eqz v8, :cond_37

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v8, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v8}, Lc7/qc;->y0(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_37

    iget v8, v3, Lc7/rc;->J:I

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzd(I)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    iget-wide v8, v3, Lc7/rc;->K:J

    invoke-virtual {v7}, Lc7/n7;->x()Z

    move-result v7

    const-wide/16 v10, 0x20

    const-wide/16 v12, 0x0

    if-nez v7, :cond_2e

    cmp-long v7, v8, v12

    if-eqz v7, :cond_2e

    const-wide/16 v14, -0x2

    and-long v7, v8, v14

    or-long v8, v7, v10

    :cond_2e
    const-wide/16 v14, 0x1

    cmp-long v7, v8, v14

    if-nez v7, :cond_2f

    move v7, v6

    goto :goto_12

    :cond_2f
    const/4 v7, 0x0

    :goto_12
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(Z)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    cmp-long v7, v8, v12

    if-eqz v7, :cond_38

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzb;->zza()Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;

    move-result-object v7

    const-wide/16 v14, 0x1

    and-long v16, v8, v14

    cmp-long v14, v16, v12

    if-eqz v14, :cond_30

    move v14, v6

    goto :goto_13

    :cond_30
    const/4 v14, 0x0

    :goto_13
    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;->zzc(Z)Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;

    const-wide/16 v14, 0x2

    and-long/2addr v14, v8

    cmp-long v14, v14, v12

    if-eqz v14, :cond_31

    move v14, v6

    goto :goto_14

    :cond_31
    const/4 v14, 0x0

    :goto_14
    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;->zze(Z)Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;

    const-wide/16 v14, 0x4

    and-long/2addr v14, v8

    cmp-long v14, v14, v12

    if-eqz v14, :cond_32

    move v14, v6

    goto :goto_15

    :cond_32
    const/4 v14, 0x0

    :goto_15
    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;->zzf(Z)Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;

    const-wide/16 v14, 0x8

    and-long/2addr v14, v8

    cmp-long v14, v14, v12

    if-eqz v14, :cond_33

    move v14, v6

    goto :goto_16

    :cond_33
    const/4 v14, 0x0

    :goto_16
    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;->zzg(Z)Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;

    const-wide/16 v14, 0x10

    and-long/2addr v14, v8

    cmp-long v14, v14, v12

    if-eqz v14, :cond_34

    move v14, v6

    goto :goto_17

    :cond_34
    const/4 v14, 0x0

    :goto_17
    invoke-virtual {v7, v14}, Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;->zzb(Z)Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;

    and-long/2addr v10, v8

    cmp-long v10, v10, v12

    if-eqz v10, :cond_35

    move v10, v6

    goto :goto_18

    :cond_35
    const/4 v10, 0x0

    :goto_18
    invoke-virtual {v7, v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;->zza(Z)Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;

    const-wide/16 v10, 0x40

    and-long/2addr v8, v10

    cmp-long v8, v8, v12

    if-eqz v8, :cond_36

    move v8, v6

    goto :goto_19

    :cond_36
    const/4 v8, 0x0

    :goto_19
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;->zzd(Z)Lcom/google/android/gms/internal/measurement/zzfi$zzb$zza;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfi$zzb;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzb;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    goto :goto_1a

    :cond_37
    const-wide/16 v12, 0x0

    :cond_38
    :goto_1a
    iget-wide v7, v3, Lc7/rc;->m:J

    cmp-long v9, v7, v12

    if-eqz v9, :cond_39

    invoke-virtual {v2, v7, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_39
    iget-wide v7, v3, Lc7/rc;->z:J

    invoke-virtual {v2, v7, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzd(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v7

    invoke-virtual {v7}, Lc7/ic;->i0()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_3a

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_3a
    iget-object v7, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v7}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v1, v7}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v7

    iget-object v8, v3, Lc7/rc;->C:Ljava/lang/String;

    invoke-static {v8}, Lc7/n7;->e(Ljava/lang/String;)Lc7/n7;

    move-result-object v8

    invoke-virtual {v7, v8}, Lc7/n7;->d(Lc7/n7;)Lc7/n7;

    move-result-object v7

    invoke-virtual {v7}, Lc7/n7;->x()Z

    move-result v8

    if-eqz v8, :cond_3c

    iget-boolean v8, v3, Lc7/rc;->v:Z

    if-eqz v8, :cond_3c

    iget-object v8, v1, Lc7/yb;->i:Lc7/xa;

    iget-object v9, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v8, v9, v7}, Lc7/xa;->u(Ljava/lang/String;Lc7/n7;)Landroid/util/Pair;

    move-result-object v8

    if-eqz v8, :cond_3c

    iget-object v9, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_3c

    iget-boolean v9, v3, Lc7/rc;->v:Z

    if-eqz v9, :cond_3c

    iget-object v9, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzq(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    iget-object v9, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v9, :cond_3b

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc(Z)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_3b
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    move-result v9

    if-eqz v9, :cond_3c

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v9

    sget-object v10, Lc7/i0;->V0:Lc7/m4;

    invoke-virtual {v9, v10}, Lc7/h;->o(Lc7/m4;)Z

    move-result v9

    if-eqz v9, :cond_3c

    iget-object v9, v5, Lc7/y;->b:Ljava/lang/String;

    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3c

    iget-object v8, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    const-string v9, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3c

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v8

    iget-object v9, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object v8

    if-eqz v8, :cond_3c

    invoke-virtual {v8}, Lc7/g5;->v()Z

    move-result v8

    if-eqz v8, :cond_3c

    iget-object v8, v3, Lc7/rc;->h:Ljava/lang/String;

    const/4 v9, 0x0

    invoke-virtual {v1, v8, v9}, Lc7/yb;->B(Ljava/lang/String;Z)V

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    move-object/from16 v10, v27

    const-wide/16 v14, 0x1

    invoke-virtual {v8, v10, v14, v15}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object v11, v1, Lc7/yb;->G:Lc7/pc;

    iget-object v14, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-interface {v11, v14, v4, v8}, Lc7/pc;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_1b

    :cond_3c
    move-object/from16 v10, v27

    const/4 v9, 0x0

    :goto_1b
    iget-object v4, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v4}, Lc7/k6;->v()Lc7/z;

    move-result-object v4

    invoke-virtual {v4}, Lc7/i7;->k()V

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzi(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v4

    iget-object v8, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v8}, Lc7/k6;->v()Lc7/z;

    move-result-object v8

    invoke-virtual {v8}, Lc7/i7;->k()V

    sget-object v8, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v4

    iget-object v8, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v8}, Lc7/k6;->v()Lc7/z;

    move-result-object v8

    invoke-virtual {v8}, Lc7/z;->q()J

    move-result-wide v14

    long-to-int v8, v14

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzi(I)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v4

    iget-object v8, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v8}, Lc7/k6;->v()Lc7/z;

    move-result-object v8

    invoke-virtual {v8}, Lc7/z;->r()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzs(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    iget-wide v14, v3, Lc7/rc;->G:J

    invoke-virtual {v2, v14, v15}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzj(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    iget-object v4, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v4}, Lc7/k6;->k()Z

    move-result v4

    if-eqz v4, :cond_3d

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzt()Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_3d

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzj(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_3d
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v4

    iget-object v8, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v4, v8}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object v4

    if-nez v4, :cond_3f

    new-instance v4, Lc7/g5;

    iget-object v8, v1, Lc7/yb;->l:Lc7/k6;

    iget-object v11, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-direct {v4, v8, v11}, Lc7/g5;-><init>(Lc7/k6;Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Lc7/yb;->i(Lc7/n7;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Lc7/g5;->y(Ljava/lang/String;)V

    iget-object v8, v3, Lc7/rc;->r:Ljava/lang/String;

    invoke-virtual {v4, v8}, Lc7/g5;->K(Ljava/lang/String;)V

    iget-object v8, v3, Lc7/rc;->i:Ljava/lang/String;

    invoke-virtual {v4, v8}, Lc7/g5;->N(Ljava/lang/String;)V

    invoke-virtual {v7}, Lc7/n7;->x()Z

    move-result v8

    if-eqz v8, :cond_3e

    iget-object v8, v1, Lc7/yb;->i:Lc7/xa;

    iget-object v11, v3, Lc7/rc;->h:Ljava/lang/String;

    iget-boolean v14, v3, Lc7/rc;->v:Z

    invoke-virtual {v8, v11, v14}, Lc7/xa;->v(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Lc7/g5;->T(Ljava/lang/String;)V

    :cond_3e
    invoke-virtual {v4, v12, v13}, Lc7/g5;->j0(J)V

    invoke-virtual {v4, v12, v13}, Lc7/g5;->l0(J)V

    invoke-virtual {v4, v12, v13}, Lc7/g5;->h0(J)V

    iget-object v8, v3, Lc7/rc;->j:Ljava/lang/String;

    invoke-virtual {v4, v8}, Lc7/g5;->G(Ljava/lang/String;)V

    iget-wide v14, v3, Lc7/rc;->q:J

    invoke-virtual {v4, v14, v15}, Lc7/g5;->c(J)V

    iget-object v8, v3, Lc7/rc;->k:Ljava/lang/String;

    invoke-virtual {v4, v8}, Lc7/g5;->C(Ljava/lang/String;)V

    iget-wide v14, v3, Lc7/rc;->l:J

    invoke-virtual {v4, v14, v15}, Lc7/g5;->f0(J)V

    iget-wide v14, v3, Lc7/rc;->m:J

    invoke-virtual {v4, v14, v15}, Lc7/g5;->Y(J)V

    iget-boolean v8, v3, Lc7/rc;->o:Z

    invoke-virtual {v4, v8}, Lc7/g5;->z(Z)V

    iget-wide v14, v3, Lc7/rc;->z:J

    invoke-virtual {v4, v14, v15}, Lc7/g5;->b0(J)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v8

    invoke-virtual {v8, v4}, Lc7/m;->Q(Lc7/g5;)V

    :cond_3f
    invoke-virtual {v7}, Lc7/n7;->y()Z

    move-result v7

    if-eqz v7, :cond_40

    invoke-virtual {v4}, Lc7/g5;->w0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_40

    invoke-virtual {v4}, Lc7/g5;->w0()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_40
    invoke-virtual {v4}, Lc7/g5;->i()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_41

    invoke-virtual {v4}, Lc7/g5;->i()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_41
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v7

    iget-object v8, v3, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v7, v8}, Lc7/m;->H0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    move v8, v9

    :goto_1c
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    if-ge v8, v11, :cond_43

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzn;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;

    move-result-object v11

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lc7/nc;

    iget-object v14, v14, Lc7/nc;->c:Ljava/lang/String;

    invoke-virtual {v11, v14}, Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;

    move-result-object v11

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lc7/nc;

    iget-wide v14, v14, Lc7/nc;->d:J

    invoke-virtual {v11, v14, v15}, Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;->zzb(J)Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v14

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lc7/nc;

    iget-object v15, v15, Lc7/nc;->e:Ljava/lang/Object;

    invoke-virtual {v14, v11, v15}, Lc7/ic;->R(Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;Ljava/lang/Object;)V

    invoke-virtual {v2, v11}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    const-string v11, "_sid"

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lc7/nc;

    iget-object v14, v14, Lc7/nc;->c:Ljava/lang/String;

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_42

    invoke-virtual {v4}, Lc7/g5;->q0()J

    move-result-wide v14

    cmp-long v11, v14, v12

    if-eqz v11, :cond_42

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v11

    iget-object v14, v3, Lc7/rc;->E:Ljava/lang/String;

    invoke-virtual {v11, v14}, Lc7/ic;->u(Ljava/lang/String;)J

    move-result-wide v14

    invoke-virtual {v4}, Lc7/g5;->q0()J

    move-result-wide v16

    cmp-long v11, v14, v16

    if-eqz v11, :cond_42

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzr()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :cond_42
    add-int/lit8 v8, v8, 0x1

    goto :goto_1c

    :cond_43
    :try_start_b
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v4, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v3, v4}, Lc7/m;->z(Lcom/google/android/gms/internal/measurement/zzfi$zzj;)J

    move-result-wide v2
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :try_start_c
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v4

    iget-object v7, v5, Lc7/y;->f:Lc7/a0;

    if-eqz v7, :cond_46

    invoke-virtual {v7}, Lc7/a0;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_44
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_45

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_44

    goto :goto_1d

    :cond_45
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v7

    iget-object v8, v5, Lc7/y;->a:Ljava/lang/String;

    iget-object v10, v5, Lc7/y;->b:Ljava/lang/String;

    invoke-virtual {v7, v8, v10}, Lc7/u5;->H(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->q0()J

    move-result-wide v15

    iget-object v8, v5, Lc7/y;->a:Ljava/lang/String;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v17, v8

    invoke-virtual/range {v14 .. v22}, Lc7/m;->E(JLjava/lang/String;ZZZZZ)Lc7/r;

    move-result-object v8

    if-eqz v7, :cond_46

    iget-wide v7, v8, Lc7/r;->e:J

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v10

    iget-object v11, v5, Lc7/y;->a:Ljava/lang/String;

    invoke-virtual {v10, v11}, Lc7/h;->t(Ljava/lang/String;)I

    move-result v10

    int-to-long v10, v10

    cmp-long v7, v7, v10

    if-gez v7, :cond_46

    goto :goto_1d

    :cond_46
    move v6, v9

    :goto_1d
    invoke-virtual {v4, v5, v2, v3, v6}, Lc7/m;->X(Lc7/y;JZ)Z

    move-result v2

    if-eqz v2, :cond_47

    iput-wide v12, v1, Lc7/yb;->o:J

    goto :goto_1e

    :catch_1
    move-exception v0

    move-object v3, v0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v4

    invoke-virtual {v4}, Lc7/v4;->B()Lc7/x4;

    move-result-object v4

    const-string v5, "Data loss. Failed to insert raw event metadata. appId"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzt()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v5, v2, v3}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_47
    :goto_1e
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->O0()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->M0()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->J()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->F()Lc7/x4;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    sub-long v3, v3, v24

    const-wide/32 v5, 0x7a120

    add-long/2addr v3, v5

    const-wide/32 v5, 0xf4240

    div-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "Background event processing time, ms"

    invoke-virtual {v2, v4, v3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v3

    invoke-virtual {v3}, Lc7/m;->M0()V

    throw v2
.end method

.method public final V(Lc7/rc;)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "_sysu"

    const-string v4, "_sys"

    const-string v5, "_pfo"

    const-string v6, "com.android.vending"

    const-string v0, "_npa"

    const-string v7, "_uwa"

    const-string v8, "app_id=?"

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v9

    invoke-virtual {v9}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->l0()V

    invoke-static/range {p1 .. p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v9, v2, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v9}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lc7/yb;->Z(Lc7/rc;)Z

    move-result v9

    if-nez v9, :cond_0

    return-void

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v9

    iget-object v10, v2, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v9, v10}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object v9

    const-wide/16 v10, 0x0

    if-eqz v9, :cond_1

    invoke-virtual {v9}, Lc7/g5;->j()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_1

    iget-object v12, v2, Lc7/rc;->i:Ljava/lang/String;

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v9, v10, v11}, Lc7/g5;->B(J)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v12

    invoke-virtual {v12, v9}, Lc7/m;->Q(Lc7/g5;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v9

    iget-object v12, v2, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v9, v12}, Lc7/u5;->P(Ljava/lang/String;)V

    :cond_1
    iget-boolean v9, v2, Lc7/rc;->o:Z

    if-nez v9, :cond_2

    invoke-virtual/range {p0 .. p1}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    return-void

    :cond_2
    iget-wide v12, v2, Lc7/rc;->t:J

    cmp-long v9, v12, v10

    if-nez v9, :cond_3

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v9

    invoke-interface {v9}, Lo6/d;->a()J

    move-result-wide v12

    :cond_3
    iget-object v9, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v9}, Lc7/k6;->v()Lc7/z;

    move-result-object v9

    invoke-virtual {v9}, Lc7/z;->s()V

    iget v9, v2, Lc7/rc;->u:I

    const/4 v15, 0x1

    if-eqz v9, :cond_4

    if-eq v9, v15, :cond_4

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lc7/v4;->G()Lc7/x4;

    move-result-object v14

    iget-object v15, v2, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v15}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const-string v10, "Incorrect app type, assuming installed app. appId, appType"

    invoke-virtual {v14, v10, v15, v9}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v9, 0x0

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v10

    invoke-virtual {v10}, Lc7/m;->L0()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v10

    iget-object v11, v2, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v10, v11, v0}, Lc7/m;->A0(Ljava/lang/String;Ljava/lang/String;)Lc7/nc;

    move-result-object v10

    if-eqz v10, :cond_6

    const-string v11, "auto"

    iget-object v14, v10, Lc7/nc;->b:Ljava/lang/String;

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    goto :goto_0

    :cond_5
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    const/4 v3, 0x0

    const/4 v4, 0x1

    goto :goto_2

    :cond_6
    :goto_0
    iget-object v11, v2, Lc7/rc;->y:Ljava/lang/Boolean;

    if-eqz v11, :cond_9

    new-instance v0, Lc7/lc;

    const-string v15, "_npa"

    iget-object v11, v2, Lc7/rc;->y:Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_7

    const-wide/16 v20, 0x1

    goto :goto_1

    :cond_7
    const-wide/16 v20, 0x0

    :goto_1
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    const-string v20, "auto"

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    const/4 v3, 0x0

    move-object v14, v0

    const/4 v4, 0x1

    move-wide/from16 v16, v12

    move-object/from16 v18, v11

    move-object/from16 v19, v20

    invoke-direct/range {v14 .. v19}, Lc7/lc;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    if-eqz v10, :cond_8

    iget-object v10, v10, Lc7/nc;->e:Ljava/lang/Object;

    iget-object v11, v0, Lc7/lc;->k:Ljava/lang/Long;

    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_8
    invoke-virtual {v1, v0, v2}, Lc7/yb;->p(Lc7/lc;Lc7/rc;)V

    goto :goto_2

    :cond_9
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v10, :cond_a

    invoke-virtual {v1, v0, v2}, Lc7/yb;->y(Ljava/lang/String;Lc7/rc;)V

    :cond_a
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    iget-object v10, v2, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v10}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v0, v10}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v11, v2, Lc7/rc;->i:Ljava/lang/String;

    invoke-virtual {v0}, Lc7/g5;->j()Ljava/lang/String;

    move-result-object v14

    iget-object v15, v2, Lc7/rc;->x:Ljava/lang/String;

    invoke-virtual {v0}, Lc7/g5;->t0()Ljava/lang/String;

    move-result-object v10

    invoke-static {v11, v14, v15, v10}, Lc7/qc;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v10

    invoke-virtual {v10}, Lc7/v4;->G()Lc7/x4;

    move-result-object v10

    const-string v11, "New GMP App Id passed in. Removing cached database data. appId"

    invoke-virtual {v0}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v10, v11, v14}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v10

    invoke-virtual {v0}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10}, Lc7/xb;->p()V

    invoke-virtual {v10}, Lc7/j7;->i()V

    invoke-static {v11}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v10}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-array v14, v4, [Ljava/lang/String;

    aput-object v11, v14, v3

    const-string v15, "events"

    invoke-virtual {v0, v15, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v15, v3

    const-string v3, "user_attributes"

    invoke-virtual {v0, v3, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    add-int/2addr v15, v3

    const-string v3, "conditional_properties"

    invoke-virtual {v0, v3, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    add-int/2addr v15, v3

    const-string v3, "apps"

    invoke-virtual {v0, v3, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    add-int/2addr v15, v3

    const-string v3, "raw_events"

    invoke-virtual {v0, v3, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    add-int/2addr v15, v3

    const-string v3, "raw_events_metadata"

    invoke-virtual {v0, v3, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    add-int/2addr v15, v3

    const-string v3, "event_filters"

    invoke-virtual {v0, v3, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    add-int/2addr v15, v3

    const-string v3, "property_filters"

    invoke-virtual {v0, v3, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    add-int/2addr v15, v3

    const-string v3, "audience_filter_values"

    invoke-virtual {v0, v3, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    add-int/2addr v15, v3

    const-string v3, "consent_settings"

    invoke-virtual {v0, v3, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    add-int/2addr v15, v3

    const-string v3, "default_event_params"

    invoke-virtual {v0, v3, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    add-int/2addr v15, v3

    const-string v3, "trigger_uris"

    invoke-virtual {v0, v3, v8, v14}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    add-int/2addr v15, v0

    if-lez v15, :cond_b

    invoke-virtual {v10}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v3, "Deleted application data. app, records"

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v0, v3, v11, v8}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v10}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    const-string v8, "Error deleting application data. appId, error"

    invoke-static {v11}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v3, v8, v10, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    :goto_3
    const/4 v0, 0x0

    :cond_c
    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lc7/g5;->A()J

    move-result-wide v10

    const-wide/32 v14, -0x80000000

    cmp-long v3, v10, v14

    if-eqz v3, :cond_d

    invoke-virtual {v0}, Lc7/g5;->A()J

    move-result-wide v10

    move-object v3, v5

    iget-wide v4, v2, Lc7/rc;->q:J

    cmp-long v4, v10, v4

    if-eqz v4, :cond_e

    const/4 v4, 0x1

    goto :goto_4

    :cond_d
    move-object v3, v5

    :cond_e
    const/4 v4, 0x0

    :goto_4
    invoke-virtual {v0}, Lc7/g5;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lc7/g5;->A()J

    move-result-wide v10

    cmp-long v0, v10, v14

    if-nez v0, :cond_f

    if-eqz v5, :cond_f

    iget-object v0, v2, Lc7/rc;->j:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    const/4 v15, 0x1

    goto :goto_5

    :cond_f
    const/4 v15, 0x0

    :goto_5
    or-int v0, v4, v15

    if-eqz v0, :cond_11

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v4, "_pv"

    invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lc7/g0;

    const-string v15, "_au"

    new-instance v5, Lc7/a0;

    invoke-direct {v5, v0}, Lc7/a0;-><init>(Landroid/os/Bundle;)V

    const-string v17, "auto"

    move-object v14, v4

    move-object/from16 v16, v5

    move-wide/from16 v18, v12

    invoke-direct/range {v14 .. v19}, Lc7/g0;-><init>(Ljava/lang/String;Lc7/a0;Ljava/lang/String;J)V

    invoke-virtual {v1, v4, v2}, Lc7/yb;->l(Lc7/g0;Lc7/rc;)V

    goto :goto_6

    :cond_10
    move-object v3, v5

    :cond_11
    :goto_6
    invoke-virtual/range {p0 .. p1}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    if-nez v9, :cond_12

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    iget-object v4, v2, Lc7/rc;->h:Ljava/lang/String;

    const-string v5, "_f"

    :goto_7
    invoke-virtual {v0, v4, v5}, Lc7/m;->x0(Ljava/lang/String;Ljava/lang/String;)Lc7/c0;

    move-result-object v0

    goto :goto_8

    :cond_12
    const/4 v4, 0x1

    if-ne v9, v4, :cond_13

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    iget-object v4, v2, Lc7/rc;->h:Ljava/lang/String;

    const-string v5, "_v"

    goto :goto_7

    :cond_13
    const/4 v0, 0x0

    :goto_8
    if-nez v0, :cond_29

    const-wide/32 v4, 0x36ee80

    div-long v10, v12, v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-wide/16 v14, 0x1

    add-long/2addr v10, v14

    mul-long/2addr v10, v4

    const-string v4, "_dac"

    const-string v5, "_et"

    const-string v15, "_r"

    const-string v14, "_c"

    if-nez v9, :cond_27

    :try_start_3
    new-instance v0, Lc7/lc;

    const-string v9, "_fot"

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    const-string v19, "auto"

    move-object v10, v14

    move-object v14, v0

    move-object v11, v15

    move-object v15, v9

    move-wide/from16 v16, v12

    invoke-direct/range {v14 .. v19}, Lc7/lc;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Lc7/yb;->p(Lc7/lc;Lc7/rc;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, v1, Lc7/yb;->k:Lc7/r5;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lc7/r5;

    iget-object v0, v2, Lc7/rc;->h:Ljava/lang/String;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_14

    goto/16 :goto_b

    :cond_14
    iget-object v14, v9, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v14}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v14

    invoke-virtual {v14}, Lc7/j7;->i()V

    invoke-virtual {v9}, Lc7/r5;->b()Z

    move-result v14

    if-nez v14, :cond_15

    iget-object v0, v9, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->E()Lc7/x4;

    move-result-object v0

    const-string v6, "Install Referrer Reporter is not available"

    :goto_9
    invoke-virtual {v0, v6}, Lc7/x4;->a(Ljava/lang/String;)V

    goto/16 :goto_c

    :cond_15
    new-instance v14, Lc7/q5;

    invoke-direct {v14, v9, v0}, Lc7/q5;-><init>(Lc7/r5;Ljava/lang/String;)V

    iget-object v0, v9, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    new-instance v0, Landroid/content/Intent;

    const-string v15, "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"

    invoke-direct {v0, v15}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v15, Landroid/content/ComponentName;

    const-string v8, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"

    invoke-direct {v15, v6, v8}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v15}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v8, v9, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v8}, Lc7/k6;->zza()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    if-nez v8, :cond_16

    iget-object v0, v9, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->I()Lc7/x4;

    move-result-object v0

    const-string v6, "Failed to obtain Package Manager to verify binding conditions for Install Referrer"

    goto :goto_9

    :cond_16
    const/4 v15, 0x0

    invoke-virtual {v8, v0, v15}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_19

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v17

    if-nez v17, :cond_19

    invoke-interface {v8, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/content/pm/ResolveInfo;

    iget-object v8, v8, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v8, :cond_1b

    iget-object v15, v8, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v8, v8, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    if-eqz v8, :cond_18

    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-virtual {v9}, Lc7/r5;->b()Z

    move-result v6

    if-eqz v6, :cond_18

    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-static {}, Ln6/a;->b()Ln6/a;

    move-result-object v0

    iget-object v8, v9, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v8}, Lc7/k6;->zza()Landroid/content/Context;

    move-result-object v8

    const/4 v15, 0x1

    invoke-virtual {v0, v8, v6, v14, v15}, Ln6/a;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    iget-object v6, v9, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v6}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v6

    invoke-virtual {v6}, Lc7/v4;->F()Lc7/x4;

    move-result-object v6

    const-string v14, "Install Referrer Service is"

    if-eqz v0, :cond_17

    const-string v0, "available"

    goto :goto_a

    :cond_17
    const-string v0, "not available"

    :goto_a
    invoke-virtual {v6, v14, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_c

    :catch_1
    move-exception v0

    :try_start_5
    iget-object v6, v9, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v6}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v6

    invoke-virtual {v6}, Lc7/v4;->B()Lc7/x4;

    move-result-object v6

    const-string v9, "Exception occurred while binding to Install Referrer Service"

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v9, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_c

    :cond_18
    iget-object v0, v9, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    const-string v6, "Play Store version 8.3.73 or higher required for Install Referrer"

    goto/16 :goto_9

    :cond_19
    iget-object v0, v9, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->E()Lc7/x4;

    move-result-object v0

    const-string v6, "Play Service for fetching Install Referrer is unavailable on device"

    goto/16 :goto_9

    :cond_1a
    :goto_b
    iget-object v0, v9, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->I()Lc7/x4;

    move-result-object v0

    const-string v6, "Install Referrer Reporter was called with invalid app package name"

    goto/16 :goto_9

    :cond_1b
    :goto_c
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->l0()V

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const-wide/16 v14, 0x1

    invoke-virtual {v6, v10, v14, v15}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v6, v11, v14, v15}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-wide/16 v9, 0x0

    invoke-virtual {v6, v7, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v6, v3, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    move-object/from16 v11, v22

    invoke-virtual {v6, v11, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    move-object/from16 v15, v21

    invoke-virtual {v6, v15, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-wide/16 v9, 0x1

    invoke-virtual {v6, v5, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-boolean v0, v2, Lc7/rc;->w:Z

    if-eqz v0, :cond_1c

    invoke-virtual {v6, v4, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_1c
    iget-object v0, v2, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-static {v4}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {v0}, Lc7/xb;->p()V

    const-string v5, "first_open_count"

    invoke-virtual {v0, v4, v5}, Lc7/m;->r0(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v9

    iget-object v0, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    if-nez v0, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v5, "PackageManager is null, first open report might be inaccurate. appId"

    invoke-static {v4}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v5, v4}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object/from16 v22, v3

    :cond_1d
    :goto_d
    const-wide/16 v3, 0x0

    goto/16 :goto_15

    :cond_1e
    :try_start_6
    iget-object v0, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lq6/c;->a(Landroid/content/Context;)Lq6/b;

    move-result-object v0

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v5}, Lq6/b;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_e

    :catch_2
    move-exception v0

    :try_start_7
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v5

    invoke-virtual {v5}, Lc7/v4;->B()Lc7/x4;

    move-result-object v5

    const-string v14, "Package info is null, first open report might be inaccurate. appId"

    invoke-static {v4}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v5, v14, v8, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_e
    if-eqz v0, :cond_24

    move-object v8, v15

    iget-wide v14, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    const-wide/16 v16, 0x0

    cmp-long v5, v14, v16

    move-object/from16 v22, v3

    if-eqz v5, :cond_23

    move-object v5, v4

    iget-wide v3, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v0, v14, v3

    if-eqz v0, :cond_21

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v0

    sget-object v3, Lc7/i0;->m0:Lc7/m4;

    invoke-virtual {v0, v3}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_1f

    const-wide/16 v3, 0x0

    cmp-long v0, v9, v3

    if-nez v0, :cond_20

    const-wide/16 v3, 0x1

    :goto_f
    invoke-virtual {v6, v7, v3, v4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    goto :goto_10

    :cond_1f
    const-wide/16 v3, 0x1

    goto :goto_f

    :cond_20
    :goto_10
    const/4 v15, 0x0

    goto :goto_11

    :cond_21
    const/4 v15, 0x1

    :goto_11
    new-instance v0, Lc7/lc;

    const-string v3, "_fi"

    if-eqz v15, :cond_22

    const-wide/16 v14, 0x1

    goto :goto_12

    :cond_22
    const-wide/16 v14, 0x0

    :goto_12
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    const-string v19, "auto"

    move-object v14, v0

    move-object v4, v8

    move-object v15, v3

    move-wide/from16 v16, v12

    invoke-direct/range {v14 .. v19}, Lc7/lc;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Lc7/yb;->p(Lc7/lc;Lc7/rc;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_13

    :cond_23
    move-object v5, v4

    move-object v4, v8

    goto :goto_13

    :cond_24
    move-object/from16 v22, v3

    move-object v5, v4

    move-object v4, v15

    :goto_13
    :try_start_8
    iget-object v0, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lq6/c;->a(Landroid/content/Context;)Lq6/b;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v5, v3}, Lq6/b;->c(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0
    :try_end_8
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_14

    :catch_3
    move-exception v0

    :try_start_9
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    const-string v7, "Application info is null, first open report might be inaccurate. appId"

    invoke-static {v5}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v7, v5, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_14
    if-eqz v0, :cond_1d

    iget v3, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v5, 0x1

    and-int/2addr v3, v5

    if-eqz v3, :cond_25

    const-wide/16 v7, 0x1

    invoke-virtual {v6, v11, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_25
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1d

    const-wide/16 v7, 0x1

    invoke-virtual {v6, v4, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    goto/16 :goto_d

    :goto_15
    cmp-long v0, v9, v3

    if-ltz v0, :cond_26

    move-object/from16 v3, v22

    invoke-virtual {v6, v3, v9, v10}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_26
    new-instance v0, Lc7/g0;

    const-string v15, "_f"

    new-instance v3, Lc7/a0;

    invoke-direct {v3, v6}, Lc7/a0;-><init>(Landroid/os/Bundle;)V

    const-string v17, "auto"

    move-object v14, v0

    move-object/from16 v16, v3

    move-wide/from16 v18, v12

    invoke-direct/range {v14 .. v19}, Lc7/g0;-><init>(Ljava/lang/String;Lc7/a0;Ljava/lang/String;J)V

    invoke-virtual {v1, v0, v2}, Lc7/yb;->Q(Lc7/g0;Lc7/rc;)V

    goto/16 :goto_17

    :cond_27
    move-object v6, v14

    move-object v3, v15

    const/4 v7, 0x1

    if-ne v9, v7, :cond_2a

    new-instance v0, Lc7/lc;

    const-string v15, "_fvt"

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    const-string v19, "auto"

    move-object v14, v0

    move-wide/from16 v16, v12

    invoke-direct/range {v14 .. v19}, Lc7/lc;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Lc7/yb;->p(Lc7/lc;Lc7/rc;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->l0()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-wide/16 v7, 0x1

    invoke-virtual {v0, v6, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0, v3, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0, v5, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-boolean v3, v2, Lc7/rc;->w:Z

    if-eqz v3, :cond_28

    invoke-virtual {v0, v4, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_28
    new-instance v3, Lc7/g0;

    const-string v15, "_v"

    new-instance v4, Lc7/a0;

    invoke-direct {v4, v0}, Lc7/a0;-><init>(Landroid/os/Bundle;)V

    const-string v17, "auto"

    move-object v14, v3

    move-object/from16 v16, v4

    move-wide/from16 v18, v12

    invoke-direct/range {v14 .. v19}, Lc7/g0;-><init>(Ljava/lang/String;Lc7/a0;Ljava/lang/String;J)V

    :goto_16
    invoke-virtual {v1, v3, v2}, Lc7/yb;->Q(Lc7/g0;Lc7/rc;)V

    goto :goto_17

    :cond_29
    iget-boolean v0, v2, Lc7/rc;->p:Z

    if-eqz v0, :cond_2a

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    new-instance v3, Lc7/g0;

    const-string v15, "_cd"

    new-instance v4, Lc7/a0;

    invoke-direct {v4, v0}, Lc7/a0;-><init>(Landroid/os/Bundle;)V

    const-string v17, "auto"

    move-object v14, v3

    move-object/from16 v16, v4

    move-wide/from16 v18, v12

    invoke-direct/range {v14 .. v19}, Lc7/g0;-><init>(Ljava/lang/String;Lc7/a0;Ljava/lang/String;J)V

    goto :goto_16

    :cond_2a
    :goto_17
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0}, Lc7/m;->O0()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0}, Lc7/m;->M0()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->M0()V

    throw v0
.end method

.method public final W(Ljava/lang/String;)Lc7/w;
    .locals 2

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc7/yb;->C:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/w;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/m;->B0(Ljava/lang/String;)Lc7/w;

    move-result-object v0

    iget-object v1, p0, Lc7/yb;->C:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0

    :cond_1
    sget-object p1, Lc7/w;->f:Lc7/w;

    return-object p1
.end method

.method public final X(Lc7/rc;)V
    .locals 7

    const-string v0, "app_id=?"

    iget-object v1, p0, Lc7/yb;->y:Ljava/util/List;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lc7/yb;->z:Ljava/util/List;

    iget-object v2, p0, Lc7/yb;->y:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    iget-object v2, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v1}, Lc7/j7;->i()V

    invoke-virtual {v1}, Lc7/xb;->p()V

    :try_start_0
    invoke-virtual {v1}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const-string v6, "apps"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v6, v5

    const-string v5, "events"

    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v6, v5

    const-string v5, "user_attributes"

    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v6, v5

    const-string v5, "conditional_properties"

    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v6, v5

    const-string v5, "raw_events"

    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v6, v5

    const-string v5, "raw_events_metadata"

    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v6, v5

    const-string v5, "queue"

    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v6, v5

    const-string v5, "audience_filter_values"

    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v6, v5

    const-string v5, "main_event_params"

    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v6, v5

    const-string v5, "default_event_params"

    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    add-int/2addr v6, v5

    const-string v5, "trigger_uris"

    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    add-int/2addr v6, v0

    if-lez v6, :cond_1

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v3, "Reset analytics data. app, records"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v2, v4}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    invoke-static {v2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Error resetting analytics data. appId, error"

    invoke-virtual {v1, v3, v2, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    iget-boolean v0, p1, Lc7/rc;->o:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lc7/yb;->V(Lc7/rc;)V

    :cond_2
    return-void
.end method

.method public final Y()Lc7/h;
    .locals 1

    iget-object v0, p0, Lc7/yb;->l:Lc7/k6;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->u()Lc7/h;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/nio/channels/FileChannel;)I
    .locals 5

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->isOpen()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x4

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    const-wide/16 v3, 0x0

    :try_start_0
    invoke-virtual {p1, v3, v4}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {p1, v2}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    if-eq p1, v1, :cond_2

    const/4 v1, -0x1

    if-eq p1, v1, :cond_1

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->G()Lc7/x4;

    move-result-object v1

    const-string v2, "Unexpected data length. Bytes read"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return v0

    :cond_2
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Failed to read from channel"

    invoke-virtual {v1, v2, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return v0

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string v1, "Bad channel to read from"

    invoke-virtual {p1, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return v0
.end method

.method public final a0()Lc7/m;
    .locals 1

    iget-object v0, p0, Lc7/yb;->c:Lc7/m;

    invoke-static {v0}, Lc7/yb;->f(Lc7/xb;)Lc7/xb;

    move-result-object v0

    check-cast v0, Lc7/m;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 5

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/u5;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfc$zza;

    move-result-object v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0, p1}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v1

    invoke-virtual {v1}, Lc7/n7;->o()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    invoke-virtual {p0, p1}, Lc7/yb;->W(Ljava/lang/String;)Lc7/w;

    move-result-object v2

    new-instance v3, Lc7/i;

    invoke-direct {v3}, Lc7/i;-><init>()V

    invoke-virtual {p0, p1, v2, v1, v3}, Lc7/yb;->c(Ljava/lang/String;Lc7/w;Lc7/n7;Lc7/i;)Lc7/w;

    move-result-object v1

    invoke-virtual {v1}, Lc7/w;->e()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v1

    invoke-virtual {v1, p1}, Lc7/ic;->g0(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    const-string v3, "_npa"

    invoke-virtual {v1, p1, v3}, Lc7/m;->A0(Ljava/lang/String;Ljava/lang/String;)Lc7/nc;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object p1, v1, Lc7/nc;->e:Ljava/lang/Object;

    const-wide/16 v3, 0x1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lc7/yb;->a:Lc7/u5;

    sget-object v3, Lc7/n7$a;->l:Lc7/n7$a;

    invoke-virtual {v1, p1, v3}, Lc7/u5;->F(Ljava/lang/String;Lc7/n7$a;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    move p1, v2

    :goto_0
    if-ne p1, v2, :cond_3

    const-string p1, "denied"

    goto :goto_1

    :cond_3
    const-string p1, "granted"

    :goto_1
    const-string v1, "ad_personalization"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_4
    return-object v1
.end method

.method public final b0()Lc7/u4;
    .locals 1

    iget-object v0, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->y()Lc7/u4;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;Lc7/w;Lc7/n7;Lc7/i;)Lc7/w;
    .locals 5

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/u5;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfc$zza;

    move-result-object v0

    const-string v1, "-"

    const/16 v2, 0x5a

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lc7/w;->f()Ljava/lang/Boolean;

    move-result-object p1

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    if-ne p1, p3, :cond_0

    invoke-virtual {p2}, Lc7/w;->a()I

    move-result v2

    sget-object p1, Lc7/n7$a;->k:Lc7/n7$a;

    invoke-virtual {p4, p1, v2}, Lc7/i;->c(Lc7/n7$a;I)V

    goto :goto_0

    :cond_0
    sget-object p1, Lc7/n7$a;->k:Lc7/n7$a;

    sget-object p2, Lc7/l;->q:Lc7/l;

    invoke-virtual {p4, p1, p2}, Lc7/i;->d(Lc7/n7$a;Lc7/l;)V

    :goto_0
    new-instance p1, Lc7/w;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p1, p3, v2, p2, v1}, Lc7/w;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    return-object p1

    :cond_1
    invoke-virtual {p2}, Lc7/w;->f()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lc7/w;->a()I

    move-result v2

    sget-object p2, Lc7/n7$a;->k:Lc7/n7$a;

    invoke-virtual {p4, p2, v2}, Lc7/i;->c(Lc7/n7$a;I)V

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lc7/yb;->a:Lc7/u5;

    sget-object v3, Lc7/n7$a;->k:Lc7/n7$a;

    invoke-virtual {p2, p1, v3}, Lc7/u5;->v(Ljava/lang/String;Lc7/n7$a;)Lc7/n7$a;

    move-result-object p2

    sget-object v4, Lc7/n7$a;->i:Lc7/n7$a;

    if-ne p2, v4, :cond_3

    invoke-virtual {p3}, Lc7/n7;->s()Ljava/lang/Boolean;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p3}, Lc7/n7;->s()Ljava/lang/Boolean;

    move-result-object v0

    sget-object p2, Lc7/l;->k:Lc7/l;

    invoke-virtual {p4, v3, p2}, Lc7/i;->d(Lc7/n7$a;Lc7/l;)V

    :cond_3
    if-nez v0, :cond_4

    iget-object p2, p0, Lc7/yb;->a:Lc7/u5;

    invoke-virtual {p2, p1, v3}, Lc7/u5;->F(Ljava/lang/String;Lc7/n7$a;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sget-object p2, Lc7/l;->j:Lc7/l;

    invoke-virtual {p4, v3, p2}, Lc7/i;->d(Lc7/n7$a;Lc7/l;)V

    :cond_4
    :goto_1
    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lc7/yb;->a:Lc7/u5;

    invoke-virtual {p2, p1}, Lc7/u5;->T(Ljava/lang/String;)Z

    move-result p2

    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object p3

    invoke-virtual {p3, p1}, Lc7/u5;->N(Ljava/lang/String;)Ljava/util/SortedSet;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-interface {p1}, Ljava/util/SortedSet;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_5

    goto :goto_2

    :cond_5
    new-instance p3, Lc7/w;

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, ""

    if-eqz p2, :cond_6

    invoke-static {v1, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    :cond_6
    invoke-direct {p3, p4, v2, v0, v1}, Lc7/w;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    return-object p3

    :cond_7
    :goto_2
    new-instance p1, Lc7/w;

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p1, p3, v2, p2, v1}, Lc7/w;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    return-object p1

    :cond_8
    sget-object p1, Lc7/w;->f:Lc7/w;

    return-object p1
.end method

.method public final c0()Lc7/c5;
    .locals 1

    iget-object v0, p0, Lc7/yb;->b:Lc7/c5;

    invoke-static {v0}, Lc7/yb;->f(Lc7/xb;)Lc7/xb;

    move-result-object v0

    check-cast v0, Lc7/c5;

    return-object v0
.end method

.method public final d(Lc7/rc;)Lc7/g5;
    .locals 10

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lc7/rc;->D:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lc7/yb;->D:Ljava/util/Map;

    iget-object v2, p1, Lc7/rc;->h:Ljava/lang/String;

    new-instance v3, Lc7/yb$b;

    iget-object v4, p1, Lc7/rc;->D:Ljava/lang/String;

    invoke-direct {v3, p0, v4, v1}, Lc7/yb$b;-><init>(Lc7/yb;Ljava/lang/String;Lc7/hc;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    iget-object v2, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object v0

    iget-object v2, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v2

    iget-object v3, p1, Lc7/rc;->C:Ljava/lang/String;

    invoke-static {v3}, Lc7/n7;->e(Ljava/lang/String;)Lc7/n7;

    move-result-object v3

    invoke-virtual {v2, v3}, Lc7/n7;->d(Lc7/n7;)Lc7/n7;

    move-result-object v2

    invoke-virtual {v2}, Lc7/n7;->x()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lc7/yb;->i:Lc7/xa;

    iget-object v4, p1, Lc7/rc;->h:Ljava/lang/String;

    iget-boolean v5, p1, Lc7/rc;->v:Z

    invoke-virtual {v3, v4, v5}, Lc7/xa;->v(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    const-string v3, ""

    :goto_0
    if-nez v0, :cond_3

    new-instance v0, Lc7/g5;

    iget-object v4, p0, Lc7/yb;->l:Lc7/k6;

    iget-object v5, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-direct {v0, v4, v5}, Lc7/g5;-><init>(Lc7/k6;Ljava/lang/String;)V

    invoke-virtual {v2}, Lc7/n7;->y()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p0, v2}, Lc7/yb;->i(Lc7/n7;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lc7/g5;->y(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v2}, Lc7/n7;->x()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0, v3}, Lc7/g5;->T(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v2}, Lc7/n7;->x()Z

    move-result v4

    if-eqz v4, :cond_4

    if-eqz v3, :cond_4

    invoke-virtual {v0}, Lc7/g5;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v0, v3}, Lc7/g5;->T(Ljava/lang/String;)V

    iget-boolean v3, p1, Lc7/rc;->v:Z

    if-eqz v3, :cond_5

    iget-object v3, p0, Lc7/yb;->i:Lc7/xa;

    iget-object v4, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Lc7/xa;->u(Ljava/lang/String;Lc7/n7;)Landroid/util/Pair;

    move-result-object v3

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    const-string v4, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {p0, v2}, Lc7/yb;->i(Lc7/n7;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lc7/g5;->y(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    iget-object v3, p1, Lc7/rc;->h:Ljava/lang/String;

    const-string v4, "_id"

    invoke-virtual {v2, v3, v4}, Lc7/m;->A0(Ljava/lang/String;Ljava/lang/String;)Lc7/nc;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    iget-object v3, p1, Lc7/rc;->h:Ljava/lang/String;

    const-string v4, "_lair"

    invoke-virtual {v2, v3, v4}, Lc7/m;->A0(Ljava/lang/String;Ljava/lang/String;)Lc7/nc;

    move-result-object v2

    if-nez v2, :cond_5

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v2

    invoke-interface {v2}, Lo6/d;->a()J

    move-result-wide v7

    new-instance v2, Lc7/nc;

    iget-object v4, p1, Lc7/rc;->h:Ljava/lang/String;

    const-wide/16 v5, 0x1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const-string v5, "auto"

    const-string v6, "_lair"

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, Lc7/nc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v3

    invoke-virtual {v3, v2}, Lc7/m;->Y(Lc7/nc;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lc7/g5;->w0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v2}, Lc7/n7;->y()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0, v2}, Lc7/yb;->i(Lc7/n7;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lc7/g5;->y(Ljava/lang/String;)V

    :cond_5
    :goto_1
    iget-object v2, p1, Lc7/rc;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lc7/g5;->N(Ljava/lang/String;)V

    iget-object v2, p1, Lc7/rc;->x:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lc7/g5;->e(Ljava/lang/String;)V

    iget-object v2, p1, Lc7/rc;->r:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, p1, Lc7/rc;->r:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lc7/g5;->K(Ljava/lang/String;)V

    :cond_6
    iget-wide v2, p1, Lc7/rc;->l:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_7

    invoke-virtual {v0, v2, v3}, Lc7/g5;->f0(J)V

    :cond_7
    iget-object v2, p1, Lc7/rc;->j:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p1, Lc7/rc;->j:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lc7/g5;->G(Ljava/lang/String;)V

    :cond_8
    iget-wide v2, p1, Lc7/rc;->q:J

    invoke-virtual {v0, v2, v3}, Lc7/g5;->c(J)V

    iget-object v2, p1, Lc7/rc;->k:Ljava/lang/String;

    if-eqz v2, :cond_9

    invoke-virtual {v0, v2}, Lc7/g5;->C(Ljava/lang/String;)V

    :cond_9
    iget-wide v2, p1, Lc7/rc;->m:J

    invoke-virtual {v0, v2, v3}, Lc7/g5;->Y(J)V

    iget-boolean v2, p1, Lc7/rc;->o:Z

    invoke-virtual {v0, v2}, Lc7/g5;->z(Z)V

    iget-object v2, p1, Lc7/rc;->n:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, p1, Lc7/rc;->n:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lc7/g5;->Q(Ljava/lang/String;)V

    :cond_a
    iget-boolean v2, p1, Lc7/rc;->v:Z

    invoke-virtual {v0, v2}, Lc7/g5;->g(Z)V

    iget-object v2, p1, Lc7/rc;->y:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lc7/g5;->d(Ljava/lang/Boolean;)V

    iget-wide v2, p1, Lc7/rc;->z:J

    invoke-virtual {v0, v2, v3}, Lc7/g5;->b0(J)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpt;->zza()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v2

    sget-object v3, Lc7/i0;->r0:Lc7/m4;

    invoke-virtual {v2, v3}, Lc7/h;->o(Lc7/m4;)Z

    move-result v2

    if-nez v2, :cond_b

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v2

    iget-object v3, p1, Lc7/rc;->h:Ljava/lang/String;

    sget-object v4, Lc7/i0;->t0:Lc7/m4;

    invoke-virtual {v2, v3, v4}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v2

    if-eqz v2, :cond_c

    :cond_b
    iget-object v2, p1, Lc7/rc;->E:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lc7/g5;->W(Ljava/lang/String;)V

    :cond_c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznx;->zza()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v2

    sget-object v3, Lc7/i0;->q0:Lc7/m4;

    invoke-virtual {v2, v3}, Lc7/h;->o(Lc7/m4;)Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v1, p1, Lc7/rc;->A:Ljava/util/List;

    :goto_2
    invoke-virtual {v0, v1}, Lc7/g5;->f(Ljava/util/List;)V

    goto :goto_3

    :cond_d
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznx;->zza()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v2

    sget-object v3, Lc7/i0;->p0:Lc7/m4;

    invoke-virtual {v2, v3}, Lc7/h;->o(Lc7/m4;)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_2

    :cond_e
    :goto_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqa;->zza()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v1

    sget-object v2, Lc7/i0;->v0:Lc7/m4;

    invoke-virtual {v1, v2}, Lc7/h;->o(Lc7/m4;)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-boolean v1, p1, Lc7/rc;->F:Z

    invoke-virtual {v0, v1}, Lc7/g5;->D(Z)V

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v1

    sget-object v2, Lc7/i0;->w0:Lc7/m4;

    invoke-virtual {v1, v2}, Lc7/h;->o(Lc7/m4;)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, p1, Lc7/rc;->L:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lc7/g5;->Z(Ljava/lang/String;)V

    :cond_f
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zza()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v1

    sget-object v2, Lc7/i0;->H0:Lc7/m4;

    invoke-virtual {v1, v2}, Lc7/h;->o(Lc7/m4;)Z

    move-result v1

    if-eqz v1, :cond_10

    iget v1, p1, Lc7/rc;->J:I

    invoke-virtual {v0, v1}, Lc7/g5;->b(I)V

    :cond_10
    iget-wide v1, p1, Lc7/rc;->G:J

    invoke-virtual {v0, v1, v2}, Lc7/g5;->p0(J)V

    invoke-virtual {v0}, Lc7/g5;->t()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1, v0}, Lc7/m;->Q(Lc7/g5;)V

    :cond_11
    return-object v0
.end method

.method public final d0()Lc7/u5;
    .locals 1

    iget-object v0, p0, Lc7/yb;->a:Lc7/u5;

    invoke-static {v0}, Lc7/yb;->f(Lc7/xb;)Lc7/xb;

    move-result-object v0

    check-cast v0, Lc7/u5;

    return-object v0
.end method

.method public final e0()Lc7/k6;
    .locals 1

    iget-object v0, p0, Lc7/yb;->l:Lc7/k6;

    return-object v0
.end method

.method public final f0()Lc7/o9;
    .locals 1

    iget-object v0, p0, Lc7/yb;->h:Lc7/o9;

    invoke-static {v0}, Lc7/yb;->f(Lc7/xb;)Lc7/xb;

    move-result-object v0

    check-cast v0, Lc7/o9;

    return-object v0
.end method

.method public final g0()Lc7/xa;
    .locals 1

    iget-object v0, p0, Lc7/yb;->i:Lc7/xa;

    return-object v0
.end method

.method public final h(Lc7/g5;)Ljava/lang/Boolean;
    .locals 5

    :try_start_0
    invoke-virtual {p1}, Lc7/g5;->A()J

    move-result-wide v0

    const-wide/32 v2, -0x80000000

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lq6/c;->a(Landroid/content/Context;)Lq6/b;

    move-result-object v0

    invoke-virtual {p1}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lq6/b;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {p1}, Lc7/g5;->A()J

    move-result-wide v1

    int-to-long v3, v0

    cmp-long p1, v1, v3

    if-nez p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    iget-object v0, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lq6/c;->a(Landroid/content/Context;)Lq6/b;

    move-result-object v0

    invoke-virtual {p1}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lq6/b;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {p1}, Lc7/g5;->h()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final h0()Lc7/wb;
    .locals 1

    iget-object v0, p0, Lc7/yb;->j:Lc7/wb;

    return-object v0
.end method

.method public final i(Lc7/n7;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p1}, Lc7/n7;->y()Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x10

    new-array p1, p1, [B

    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v0

    invoke-virtual {v0}, Lc7/qc;->P0()Ljava/security/SecureRandom;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    new-instance v4, Ljava/math/BigInteger;

    invoke-direct {v4, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    aput-object v4, v2, v3

    const-string p1, "%032x"

    invoke-static {v0, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final i0()Lc7/ic;
    .locals 1

    iget-object v0, p0, Lc7/yb;->g:Lc7/ic;

    invoke-static {v0}, Lc7/yb;->f(Lc7/xb;)Lc7/xb;

    move-result-object v0

    check-cast v0, Lc7/ic;

    return-object v0
.end method

.method public final j(Lc7/f;)V
    .locals 1

    iget-object v0, p1, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lc7/yb;->S(Ljava/lang/String;)Lc7/rc;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0}, Lc7/yb;->k(Lc7/f;Lc7/rc;)V

    :cond_0
    return-void
.end method

.method public final j0()Lc7/qc;
    .locals 1

    iget-object v0, p0, Lc7/yb;->l:Lc7/k6;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lc7/f;Lc7/rc;)V
    .locals 10

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lc7/f;->j:Lc7/lc;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lc7/f;->j:Lc7/lc;

    iget-object v0, v0, Lc7/lc;->i:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-static {p2}, Lc7/yb;->Z(Lc7/rc;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lc7/rc;->o:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p2}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    return-void

    :cond_1
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0}, Lc7/m;->L0()V

    :try_start_0
    invoke-virtual {p0, p2}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    iget-object v0, p1, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    iget-object v1, p1, Lc7/f;->j:Lc7/lc;

    iget-object v1, v1, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lc7/m;->w0(Ljava/lang/String;Ljava/lang/String;)Lc7/f;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->A()Lc7/x4;

    move-result-object v1

    const-string v3, "Removing conditional user property"

    iget-object v4, p1, Lc7/f;->h:Ljava/lang/String;

    iget-object v5, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v5}, Lc7/k6;->y()Lc7/u4;

    move-result-object v5

    iget-object v6, p1, Lc7/f;->j:Lc7/lc;

    iget-object v6, v6, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v3, v4, v5}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    iget-object v3, p1, Lc7/f;->j:Lc7/lc;

    iget-object v3, v3, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lc7/m;->y(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v1, v0, Lc7/f;->l:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    iget-object v3, p1, Lc7/f;->j:Lc7/lc;

    iget-object v3, v3, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lc7/m;->G0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v1, p1, Lc7/f;->r:Lc7/g0;

    if-eqz v1, :cond_5

    const/4 v3, 0x0

    iget-object v1, v1, Lc7/g0;->i:Lc7/a0;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lc7/a0;->L()Landroid/os/Bundle;

    move-result-object v1

    move-object v4, v1

    goto :goto_0

    :cond_3
    move-object v4, v3

    :goto_0
    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v1

    iget-object v3, p1, Lc7/f;->r:Lc7/g0;

    invoke-static {v3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc7/g0;

    iget-object v3, v3, Lc7/g0;->h:Ljava/lang/String;

    iget-object v5, v0, Lc7/f;->i:Ljava/lang/String;

    iget-object p1, p1, Lc7/f;->r:Lc7/g0;

    iget-wide v6, p1, Lc7/g0;->k:J

    const/4 v8, 0x1

    const/4 v9, 0x1

    invoke-virtual/range {v1 .. v9}, Lc7/qc;->C(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lc7/g0;

    move-result-object p1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc7/g0;

    invoke-virtual {p0, p1, p2}, Lc7/yb;->U(Lc7/g0;Lc7/rc;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->G()Lc7/x4;

    move-result-object p2

    const-string v0, "Conditional user property doesn\'t exist"

    iget-object v1, p1, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v2}, Lc7/k6;->y()Lc7/u4;

    move-result-object v2

    iget-object p1, p1, Lc7/f;->j:Lc7/lc;

    iget-object p1, p1, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, v1, p1}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    :goto_1
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1}, Lc7/m;->O0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1}, Lc7/m;->M0()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p2

    invoke-virtual {p2}, Lc7/m;->M0()V

    throw p1
.end method

.method public final k0()V
    .locals 4

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    iget-boolean v0, p0, Lc7/yb;->n:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc7/yb;->n:Z

    invoke-virtual {p0}, Lc7/yb;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc7/yb;->x:Ljava/nio/channels/FileChannel;

    invoke-virtual {p0, v0}, Lc7/yb;->a(Ljava/nio/channels/FileChannel;)I

    move-result v0

    iget-object v1, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->w()Lc7/p4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/p4;->y()I

    move-result v1

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v2

    invoke-virtual {v2}, Lc7/j7;->i()V

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Panic: can\'t downgrade version. Previous, current version"

    goto :goto_0

    :cond_0
    if-ge v0, v1, :cond_2

    iget-object v2, p0, Lc7/yb;->x:Ljava/nio/channels/FileChannel;

    invoke-virtual {p0, v1, v2}, Lc7/yb;->F(ILjava/nio/channels/FileChannel;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->F()Lc7/x4;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Storage version upgraded. Previous, current version"

    :goto_0
    invoke-virtual {v2, v3, v0, v1}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Storage version upgrade failed. Previous, current version"

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final l(Lc7/g0;Lc7/rc;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-static/range {p2 .. p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v2

    invoke-virtual {v2}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->l0()V

    iget-object v2, v0, Lc7/rc;->h:Ljava/lang/String;

    move-object/from16 v3, p1

    iget-wide v10, v3, Lc7/g0;->k:J

    invoke-static/range {p1 .. p1}, Lc7/z4;->b(Lc7/g0;)Lc7/z4;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v4

    invoke-virtual {v4}, Lc7/j7;->i()V

    iget-object v4, v1, Lc7/yb;->E:Lc7/q9;

    if-eqz v4, :cond_1

    iget-object v4, v1, Lc7/yb;->F:Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, v1, Lc7/yb;->E:Lc7/q9;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v4, 0x0

    :goto_1
    iget-object v5, v3, Lc7/z4;->d:Landroid/os/Bundle;

    const/4 v12, 0x0

    invoke-static {v4, v5, v12}, Lc7/qc;->L(Lc7/q9;Landroid/os/Bundle;Z)V

    invoke-virtual {v3}, Lc7/z4;->a()Lc7/g0;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-static {v3, v0}, Lc7/ic;->Z(Lc7/g0;Lc7/rc;)Z

    move-result v4

    if-nez v4, :cond_2

    return-void

    :cond_2
    iget-boolean v4, v0, Lc7/rc;->o:Z

    if-nez v4, :cond_3

    invoke-virtual {v1, v0}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    return-void

    :cond_3
    iget-object v4, v0, Lc7/rc;->A:Ljava/util/List;

    if-eqz v4, :cond_5

    iget-object v5, v3, Lc7/g0;->h:Ljava/lang/String;

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, v3, Lc7/g0;->i:Lc7/a0;

    invoke-virtual {v4}, Lc7/a0;->L()Landroid/os/Bundle;

    move-result-object v4

    const-wide/16 v5, 0x1

    const-string v7, "ga_safelisted"

    invoke-virtual {v4, v7, v5, v6}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance v5, Lc7/g0;

    iget-object v14, v3, Lc7/g0;->h:Ljava/lang/String;

    new-instance v15, Lc7/a0;

    invoke-direct {v15, v4}, Lc7/a0;-><init>(Landroid/os/Bundle;)V

    iget-object v4, v3, Lc7/g0;->j:Ljava/lang/String;

    iget-wide v6, v3, Lc7/g0;->k:J

    move-object v13, v5

    move-object/from16 v16, v4

    move-wide/from16 v17, v6

    invoke-direct/range {v13 .. v18}, Lc7/g0;-><init>(Ljava/lang/String;Lc7/a0;Ljava/lang/String;J)V

    goto :goto_2

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    iget-object v4, v3, Lc7/g0;->h:Ljava/lang/String;

    iget-object v3, v3, Lc7/g0;->j:Ljava/lang/String;

    const-string v5, "Dropping non-safelisted event. appId, event name, origin"

    invoke-virtual {v0, v5, v2, v4, v3}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_5
    move-object v13, v3

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v3

    invoke-virtual {v3}, Lc7/m;->L0()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v3

    invoke-static {v2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, Lc7/j7;->i()V

    invoke-virtual {v3}, Lc7/xb;->p()V

    const-wide/16 v4, 0x0

    cmp-long v4, v10, v4

    const/4 v5, 0x2

    const/4 v14, 0x1

    if-gez v4, :cond_6

    invoke-virtual {v3}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->G()Lc7/x4;

    move-result-object v3

    const-string v6, "Invalid time querying timed out conditional properties"

    invoke-static {v2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v3, v6, v7, v8}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_3

    :cond_6
    const-string v6, "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"

    new-array v7, v5, [Ljava/lang/String;

    aput-object v2, v7, v12

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v14

    invoke-virtual {v3, v6, v7}, Lc7/m;->N(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc7/f;

    if-eqz v6, :cond_7

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v7

    invoke-virtual {v7}, Lc7/v4;->F()Lc7/x4;

    move-result-object v7

    const-string v8, "User property timed out"

    iget-object v9, v6, Lc7/f;->h:Ljava/lang/String;

    iget-object v15, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v15}, Lc7/k6;->y()Lc7/u4;

    move-result-object v15

    iget-object v14, v6, Lc7/f;->j:Lc7/lc;

    iget-object v14, v14, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v15, v14}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    iget-object v15, v6, Lc7/f;->j:Lc7/lc;

    invoke-virtual {v15}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v7, v8, v9, v14, v15}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v7, v6, Lc7/f;->n:Lc7/g0;

    if-eqz v7, :cond_8

    new-instance v7, Lc7/g0;

    iget-object v8, v6, Lc7/f;->n:Lc7/g0;

    invoke-direct {v7, v8, v10, v11}, Lc7/g0;-><init>(Lc7/g0;J)V

    invoke-virtual {v1, v7, v0}, Lc7/yb;->U(Lc7/g0;Lc7/rc;)V

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v7

    iget-object v6, v6, Lc7/f;->j:Lc7/lc;

    iget-object v6, v6, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v7, v2, v6}, Lc7/m;->y(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v14, 0x1

    goto :goto_4

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v3

    invoke-static {v2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, Lc7/j7;->i()V

    invoke-virtual {v3}, Lc7/xb;->p()V

    if-gez v4, :cond_a

    invoke-virtual {v3}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->G()Lc7/x4;

    move-result-object v3

    const-string v6, "Invalid time querying expired conditional properties"

    invoke-static {v2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v3, v6, v7, v8}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_5

    :cond_a
    const-string v6, "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"

    new-array v7, v5, [Ljava/lang/String;

    aput-object v2, v7, v12

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    aput-object v8, v7, v9

    invoke-virtual {v3, v6, v7}, Lc7/m;->N(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    :goto_5
    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lc7/f;

    if-eqz v7, :cond_b

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v8

    invoke-virtual {v8}, Lc7/v4;->F()Lc7/x4;

    move-result-object v8

    const-string v9, "User property expired"

    iget-object v14, v7, Lc7/f;->h:Ljava/lang/String;

    iget-object v15, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v15}, Lc7/k6;->y()Lc7/u4;

    move-result-object v15

    iget-object v5, v7, Lc7/f;->j:Lc7/lc;

    iget-object v5, v5, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v15, v5}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v15, v7, Lc7/f;->j:Lc7/lc;

    invoke-virtual {v15}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v8, v9, v14, v5, v15}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v5

    iget-object v8, v7, Lc7/f;->j:Lc7/lc;

    iget-object v8, v8, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v5, v2, v8}, Lc7/m;->G0(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, v7, Lc7/f;->r:Lc7/g0;

    if-eqz v5, :cond_c

    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v5

    iget-object v7, v7, Lc7/f;->j:Lc7/lc;

    iget-object v7, v7, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v5, v2, v7}, Lc7/m;->y(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v5, 0x2

    goto :goto_6

    :cond_d
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v5, v12

    :goto_7
    if-ge v5, v3, :cond_e

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v5, v5, 0x1

    check-cast v7, Lc7/g0;

    new-instance v8, Lc7/g0;

    invoke-direct {v8, v7, v10, v11}, Lc7/g0;-><init>(Lc7/g0;J)V

    invoke-virtual {v1, v8, v0}, Lc7/yb;->U(Lc7/g0;Lc7/rc;)V

    goto :goto_7

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v3

    iget-object v5, v13, Lc7/g0;->h:Ljava/lang/String;

    invoke-static {v2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v5}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, Lc7/j7;->i()V

    invoke-virtual {v3}, Lc7/xb;->p()V

    if-gez v4, :cond_f

    invoke-virtual {v3}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v4

    invoke-virtual {v4}, Lc7/v4;->G()Lc7/x4;

    move-result-object v4

    const-string v6, "Invalid time querying triggered conditional properties"

    invoke-static {v2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3}, Lc7/j7;->d()Lc7/u4;

    move-result-object v3

    invoke-virtual {v3, v5}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v6, v2, v3, v5}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_8

    :cond_f
    const-string v4, "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/String;

    aput-object v2, v6, v12

    const/4 v2, 0x1

    aput-object v5, v6, v2

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, v6, v5

    invoke-virtual {v3, v4, v6}, Lc7/m;->N(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    :goto_8
    new-instance v14, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v14, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_10
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Lc7/f;

    if-eqz v15, :cond_10

    iget-object v3, v15, Lc7/f;->j:Lc7/lc;

    new-instance v9, Lc7/nc;

    iget-object v4, v15, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v4}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, v15, Lc7/f;->i:Ljava/lang/String;

    iget-object v6, v3, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v3}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object v3, v9

    move-wide v7, v10

    move-object v12, v9

    move-object/from16 v9, v16

    invoke-direct/range {v3 .. v9}, Lc7/nc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v3

    invoke-virtual {v3, v12}, Lc7/m;->Y(Lc7/nc;)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->F()Lc7/x4;

    move-result-object v3

    const-string v4, "User property triggered"

    iget-object v5, v15, Lc7/f;->h:Ljava/lang/String;

    iget-object v6, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v6}, Lc7/k6;->y()Lc7/u4;

    move-result-object v6

    iget-object v7, v12, Lc7/nc;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v12, Lc7/nc;->e:Ljava/lang/Object;

    :goto_a
    invoke-virtual {v3, v4, v5, v6, v7}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_b

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    const-string v4, "Too many active user properties, ignoring"

    iget-object v5, v15, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v5}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, v1, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v6}, Lc7/k6;->y()Lc7/u4;

    move-result-object v6

    iget-object v7, v12, Lc7/nc;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v12, Lc7/nc;->e:Ljava/lang/Object;

    goto :goto_a

    :goto_b
    iget-object v3, v15, Lc7/f;->p:Lc7/g0;

    if-eqz v3, :cond_12

    invoke-interface {v14, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_12
    new-instance v3, Lc7/lc;

    invoke-direct {v3, v12}, Lc7/lc;-><init>(Lc7/nc;)V

    iput-object v3, v15, Lc7/f;->j:Lc7/lc;

    const/4 v3, 0x1

    iput-boolean v3, v15, Lc7/f;->l:Z

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v4

    invoke-virtual {v4, v15}, Lc7/m;->W(Lc7/f;)Z

    const/4 v12, 0x0

    goto/16 :goto_9

    :cond_13
    invoke-virtual {v1, v13, v0}, Lc7/yb;->U(Lc7/g0;Lc7/rc;)V

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v12, 0x0

    :goto_c
    if-ge v12, v2, :cond_14

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v12, v12, 0x1

    check-cast v3, Lc7/g0;

    new-instance v4, Lc7/g0;

    invoke-direct {v4, v3, v10, v11}, Lc7/g0;-><init>(Lc7/g0;J)V

    invoke-virtual {v1, v4, v0}, Lc7/yb;->U(Lc7/g0;Lc7/rc;)V

    goto :goto_c

    :cond_14
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0}, Lc7/m;->O0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0}, Lc7/m;->M0()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2}, Lc7/m;->M0()V

    throw v0
.end method

.method public final l0()V
    .locals 2

    iget-boolean v0, p0, Lc7/yb;->m:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UploadController is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m(Lc7/g0;Ljava/lang/String;)V
    .locals 43

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v2

    invoke-virtual {v2, v3}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object v15

    if-eqz v15, :cond_4

    invoke-virtual {v15}, Lc7/g5;->h()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v0, v15}, Lc7/yb;->h(Lc7/g5;)Ljava/lang/Boolean;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, v1, Lc7/g0;->h:Ljava/lang/String;

    const-string v4, "_ui"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->G()Lc7/x4;

    move-result-object v2

    invoke-static/range {p2 .. p2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "Could not find package. appId"

    invoke-virtual {v2, v5, v4}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    invoke-static/range {p2 .. p2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "App version does not match; dropping event. appId"

    invoke-virtual {v1, v3, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_2
    :goto_0
    invoke-virtual {v0, v3}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v30

    const/16 v2, 0x64

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v4

    sget-object v5, Lc7/i0;->Q0:Lc7/m4;

    invoke-virtual {v4, v5}, Lc7/h;->o(Lc7/m4;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v0, v3}, Lc7/yb;->W(Ljava/lang/String;)Lc7/w;

    move-result-object v2

    invoke-virtual {v2}, Lc7/w;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {v30 .. v30}, Lc7/n7;->b()I

    move-result v4

    move-object/from16 v37, v2

    move/from16 v36, v4

    goto :goto_1

    :cond_3
    const-string v4, ""

    move/from16 v36, v2

    move-object/from16 v37, v4

    :goto_1
    new-instance v14, Lc7/rc;

    move-object v2, v14

    invoke-virtual {v15}, Lc7/g5;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15}, Lc7/g5;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15}, Lc7/g5;->A()J

    move-result-wide v6

    invoke-virtual {v15}, Lc7/g5;->x0()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v15}, Lc7/g5;->i0()J

    move-result-wide v9

    invoke-virtual {v15}, Lc7/g5;->c0()J

    move-result-wide v11

    const/4 v13, 0x0

    invoke-virtual {v15}, Lc7/g5;->s()Z

    move-result v16

    move-object/from16 v42, v14

    move/from16 v14, v16

    const/16 v16, 0x0

    move-object/from16 v31, v15

    move/from16 v15, v16

    invoke-virtual/range {v31 .. v31}, Lc7/g5;->i()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v31 .. v31}, Lc7/g5;->w()J

    move-result-wide v17

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    invoke-virtual/range {v31 .. v31}, Lc7/g5;->r()Z

    move-result v22

    const/16 v23, 0x0

    invoke-virtual/range {v31 .. v31}, Lc7/g5;->t0()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v31 .. v31}, Lc7/g5;->s0()Ljava/lang/Boolean;

    move-result-object v25

    invoke-virtual/range {v31 .. v31}, Lc7/g5;->e0()J

    move-result-wide v26

    invoke-virtual/range {v31 .. v31}, Lc7/g5;->o()Ljava/util/List;

    move-result-object v28

    const/16 v29, 0x0

    invoke-virtual/range {v30 .. v30}, Lc7/n7;->v()Ljava/lang/String;

    move-result-object v30

    const/16 v32, 0x0

    invoke-virtual/range {v31 .. v31}, Lc7/g5;->u()Z

    move-result v33

    invoke-virtual/range {v31 .. v31}, Lc7/g5;->r0()J

    move-result-wide v34

    invoke-virtual/range {v31 .. v31}, Lc7/g5;->a()I

    move-result v38

    invoke-virtual/range {v31 .. v31}, Lc7/g5;->E()J

    move-result-wide v39

    invoke-virtual/range {v31 .. v31}, Lc7/g5;->n()Ljava/lang/String;

    move-result-object v41

    const-string v31, ""

    move-object/from16 v3, p2

    invoke-direct/range {v2 .. v41}, Lc7/rc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;)V

    move-object/from16 v2, v42

    invoke-virtual {v0, v1, v2}, Lc7/yb;->Q(Lc7/g0;Lc7/rc;)V

    return-void

    :cond_4
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->A()Lc7/x4;

    move-result-object v1

    const-string v2, "No app data available; dropping event"

    invoke-virtual {v1, v2, v3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final m0()V
    .locals 1

    iget v0, p0, Lc7/yb;->s:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lc7/yb;->s:I

    return-void
.end method

.method public final n(Lc7/g5;Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;)V
    .locals 8

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzv()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc7/i;->a(Ljava/lang/String;)Lc7/i;

    move-result-object v0

    invoke-virtual {p1}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v2

    invoke-virtual {v2}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v2

    sget-object v3, Lc7/i0;->S0:Lc7/m4;

    invoke-virtual {v2, v3}, Lc7/h;->o(Lc7/m4;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lc7/n7;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_0
    invoke-virtual {v1}, Lc7/n7;->s()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_1

    sget-object v2, Lc7/n7$a;->i:Lc7/n7$a;

    invoke-virtual {v1}, Lc7/n7;->b()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lc7/i;->c(Lc7/n7$a;I)V

    goto :goto_0

    :cond_1
    sget-object v2, Lc7/n7$a;->i:Lc7/n7$a;

    sget-object v3, Lc7/l;->q:Lc7/l;

    invoke-virtual {v0, v2, v3}, Lc7/i;->d(Lc7/n7$a;Lc7/l;)V

    :goto_0
    invoke-virtual {v1}, Lc7/n7;->u()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_2

    sget-object v2, Lc7/n7$a;->j:Lc7/n7$a;

    invoke-virtual {v1}, Lc7/n7;->b()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lc7/i;->c(Lc7/n7$a;I)V

    goto :goto_1

    :cond_2
    sget-object v1, Lc7/n7$a;->j:Lc7/n7$a;

    sget-object v2, Lc7/l;->q:Lc7/l;

    invoke-virtual {v0, v1, v2}, Lc7/i;->d(Lc7/n7$a;Lc7/l;)V

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v2

    invoke-virtual {v2}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, Lc7/yb;->W(Ljava/lang/String;)Lc7/w;

    move-result-object v2

    invoke-virtual {p0, v1}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v3

    invoke-virtual {p0, v1, v2, v3, v0}, Lc7/yb;->c(Ljava/lang/String;Lc7/w;Lc7/n7;Lc7/i;)Lc7/w;

    move-result-object v1

    invoke-virtual {v1}, Lc7/w;->g()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzb(Z)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual {v1}, Lc7/w;->h()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Lc7/w;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzh(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_4
    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v1

    invoke-virtual {v1}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, 0x0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzab()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "_npa"

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfi$zzn;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfi$zzn;->zzg()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move-object v1, v3

    :cond_6
    if-eqz v1, :cond_c

    sget-object v2, Lc7/n7$a;->l:Lc7/n7$a;

    invoke-virtual {v0, v2}, Lc7/i;->b(Lc7/n7$a;)Lc7/l;

    move-result-object v3

    sget-object v5, Lc7/l;->i:Lc7/l;

    if-ne v3, v5, :cond_e

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqf;->zza()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v3

    sget-object v5, Lc7/i0;->b1:Lc7/m4;

    invoke-virtual {v3, v5}, Lc7/h;->o(Lc7/m4;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v3

    invoke-virtual {p1}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v4}, Lc7/m;->A0(Ljava/lang/String;Ljava/lang/String;)Lc7/nc;

    move-result-object v3

    if-eqz v3, :cond_8

    iget-object v1, v3, Lc7/nc;->b:Ljava/lang/String;

    const-string v4, "tcf"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Lc7/l;->p:Lc7/l;

    goto :goto_3

    :cond_7
    iget-object v1, v3, Lc7/nc;->b:Ljava/lang/String;

    const-string v3, "app"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_2

    :cond_8
    invoke-virtual {p1}, Lc7/g5;->s0()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_b

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-ne v3, v4, :cond_9

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzn;->zzc()J

    move-result-wide v4

    const-wide/16 v6, 0x1

    cmp-long v4, v4, v6

    if-nez v4, :cond_b

    :cond_9
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    if-ne v3, v4, :cond_a

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzn;->zzc()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    goto :goto_2

    :cond_a
    sget-object v1, Lc7/l;->l:Lc7/l;

    goto :goto_3

    :cond_b
    :goto_2
    sget-object v1, Lc7/l;->n:Lc7/l;

    :goto_3
    invoke-virtual {v0, v2, v1}, Lc7/i;->d(Lc7/n7$a;Lc7/l;)V

    goto :goto_5

    :cond_c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v1

    sget-object v2, Lc7/i0;->T0:Lc7/m4;

    invoke-virtual {v1, v2}, Lc7/h;->o(Lc7/m4;)Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, p0, Lc7/yb;->a:Lc7/u5;

    invoke-virtual {p1}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lc7/u5;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfc$zza;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_d

    sget-object v1, Lc7/n7$a;->l:Lc7/n7$a;

    sget-object v3, Lc7/l;->q:Lc7/l;

    invoke-virtual {v0, v1, v3}, Lc7/i;->d(Lc7/n7$a;Lc7/l;)V

    goto :goto_4

    :cond_d
    iget-object v1, p0, Lc7/yb;->a:Lc7/u5;

    invoke-virtual {p1}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lc7/n7$a;->l:Lc7/n7$a;

    invoke-virtual {v1, v3, v5}, Lc7/u5;->F(Ljava/lang/String;Lc7/n7$a;)Z

    move-result v1

    xor-int/2addr v2, v1

    sget-object v1, Lc7/l;->j:Lc7/l;

    invoke-virtual {v0, v5, v1}, Lc7/i;->d(Lc7/n7$a;Lc7/l;)V

    :goto_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzn;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;

    move-result-object v1

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v3

    invoke-interface {v3}, Lo6/d;->a()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;->zzb(J)Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;

    move-result-object v1

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;->zza(J)Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzfi$zzn;

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzn;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_e
    :goto_5
    invoke-virtual {v0}, Lc7/i;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzf(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqf;->zza()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v0

    sget-object v1, Lc7/i0;->b1:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lc7/yb;->a:Lc7/u5;

    invoke-virtual {p1}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc7/u5;->T(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzaa()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_12

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zzg()Ljava/lang/String;

    move-result-object v3

    const-string v4, "_tcf"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zzf()Ljava/util/List;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_10

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzg()Ljava/lang/String;

    move-result-object v4

    const-string v5, "_tcfd"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zzh()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lc7/ob;->d(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(ILcom/google/android/gms/internal/measurement/zzfi$zzg$zza;)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    goto :goto_8

    :cond_f
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_10
    :goto_8
    invoke-virtual {p2, v2, v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(ILcom/google/android/gms/internal/measurement/zzfi$zze$zza;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    return-void

    :cond_11
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_12
    return-void
.end method

.method public final n0()V
    .locals 1

    iget v0, p0, Lc7/yb;->r:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lc7/yb;->r:I

    return-void
.end method

.method public final o0()V
    .locals 4

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0}, Lc7/m;->N0()V

    iget-object v0, p0, Lc7/yb;->i:Lc7/xa;

    iget-object v0, v0, Lc7/xa;->g:Lc7/n5;

    invoke-virtual {v0}, Lc7/n5;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lc7/yb;->i:Lc7/xa;

    iget-object v0, v0, Lc7/xa;->g:Lc7/n5;

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lc7/n5;->b(J)V

    :cond_0
    invoke-virtual {p0}, Lc7/yb;->J()V

    return-void
.end method

.method public final p(Lc7/lc;Lc7/rc;)V
    .locals 13

    const-string v0, "_id"

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v1

    invoke-virtual {v1}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-static {p2}, Lc7/yb;->Z(Lc7/rc;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-boolean v1, p2, Lc7/rc;->o:Z

    if-nez v1, :cond_1

    invoke-virtual {p0, p2}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    return-void

    :cond_1
    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v1

    iget-object v2, p1, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lc7/qc;->m0(Ljava/lang/String;)I

    move-result v5

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x18

    if-eqz v5, :cond_3

    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v0, p1, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    invoke-static {v0, v3, v2}, Lc7/qc;->E(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v7

    iget-object p1, p1, Lc7/lc;->i:Ljava/lang/String;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    move v8, p1

    goto :goto_0

    :cond_2
    move v8, v1

    :goto_0
    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v3, p0, Lc7/yb;->G:Lc7/pc;

    iget-object v4, p2, Lc7/rc;->h:Ljava/lang/String;

    const-string v6, "_ev"

    invoke-static/range {v3 .. v8}, Lc7/qc;->N(Lc7/pc;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v4

    iget-object v5, p1, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {p1}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lc7/qc;->r(Ljava/lang/String;Ljava/lang/Object;)I

    move-result v9

    if-eqz v9, :cond_6

    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v0, p1, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    invoke-static {v0, v3, v2}, Lc7/qc;->E(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p1}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_4

    instance-of v0, p1, Ljava/lang/CharSequence;

    if-eqz v0, :cond_5

    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    :cond_5
    move v12, v1

    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v7, p0, Lc7/yb;->G:Lc7/pc;

    iget-object v8, p2, Lc7/rc;->h:Ljava/lang/String;

    const-string v10, "_ev"

    invoke-static/range {v7 .. v12}, Lc7/qc;->N(Lc7/pc;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_6
    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v1

    iget-object v2, p1, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {p1}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lc7/qc;->v0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_7

    return-void

    :cond_7
    iget-object v2, p1, Lc7/lc;->i:Ljava/lang/String;

    const-string v3, "_sid"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    iget-wide v6, p1, Lc7/lc;->j:J

    iget-object v9, p1, Lc7/lc;->n:Ljava/lang/String;

    iget-object v2, p2, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-wide/16 v4, 0x0

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v8

    const-string v10, "_sno"

    invoke-virtual {v8, v2, v10}, Lc7/m;->A0(Ljava/lang/String;Ljava/lang/String;)Lc7/nc;

    move-result-object v8

    if-eqz v8, :cond_8

    iget-object v10, v8, Lc7/nc;->e:Ljava/lang/Object;

    instance-of v11, v10, Ljava/lang/Long;

    if-eqz v11, :cond_8

    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_1

    :cond_8
    if-eqz v8, :cond_9

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v10

    invoke-virtual {v10}, Lc7/v4;->G()Lc7/x4;

    move-result-object v10

    iget-object v8, v8, Lc7/nc;->e:Ljava/lang/Object;

    const-string v11, "Retrieved last session number from database does not contain a valid (long) value"

    invoke-virtual {v10, v11, v8}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_9
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v8

    const-string v10, "_s"

    invoke-virtual {v8, v2, v10}, Lc7/m;->x0(Ljava/lang/String;Ljava/lang/String;)Lc7/c0;

    move-result-object v2

    if-eqz v2, :cond_a

    iget-wide v4, v2, Lc7/c0;->c:J

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->F()Lc7/x4;

    move-result-object v2

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const-string v10, "Backfill the session number. Last used session number"

    invoke-virtual {v2, v10, v8}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_a
    :goto_1
    const-wide/16 v10, 0x1

    add-long/2addr v4, v10

    new-instance v2, Lc7/lc;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const-string v5, "_sno"

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Lc7/lc;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v2, p2}, Lc7/yb;->p(Lc7/lc;Lc7/rc;)V

    :cond_b
    new-instance v2, Lc7/nc;

    iget-object v4, p2, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v4}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    iget-object v4, p1, Lc7/lc;->n:Ljava/lang/String;

    invoke-static {v4}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Ljava/lang/String;

    iget-object v7, p1, Lc7/lc;->i:Ljava/lang/String;

    iget-wide v8, p1, Lc7/lc;->j:J

    move-object v4, v2

    move-object v10, v1

    invoke-direct/range {v4 .. v10}, Lc7/nc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v4

    invoke-virtual {v4}, Lc7/v4;->F()Lc7/x4;

    move-result-object v4

    iget-object v5, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v5}, Lc7/k6;->y()Lc7/u4;

    move-result-object v5

    iget-object v6, v2, Lc7/nc;->c:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Setting user property"

    invoke-virtual {v4, v6, v5, v1}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    invoke-virtual {v1}, Lc7/m;->L0()V

    :try_start_0
    iget-object v1, v2, Lc7/nc;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    iget-object v4, p2, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v1, v4, v0}, Lc7/m;->A0(Ljava/lang/String;Ljava/lang/String;)Lc7/nc;

    move-result-object v0

    if-eqz v0, :cond_c

    iget-object v1, v2, Lc7/nc;->e:Ljava/lang/Object;

    iget-object v0, v0, Lc7/nc;->e:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    iget-object v1, p2, Lc7/rc;->h:Ljava/lang/String;

    const-string v4, "_lair"

    invoke-virtual {v0, v1, v4}, Lc7/m;->G0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    invoke-virtual {p0, p2}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0, v2}, Lc7/m;->Y(Lc7/nc;)Z

    move-result v0

    iget-object p1, p1, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-virtual {p0}, Lc7/yb;->i0()Lc7/ic;

    move-result-object p1

    iget-object v1, p2, Lc7/rc;->E:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lc7/ic;->u(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    iget-object v1, p2, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-virtual {p1, v3, v4}, Lc7/g5;->n0(J)V

    invoke-virtual {p1}, Lc7/g5;->t()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    invoke-virtual {v1, p1}, Lc7/m;->Q(Lc7/g5;)V

    :cond_d
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1}, Lc7/m;->O0()V

    if-nez v0, :cond_e

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string v0, "Too many unique user properties are set. Ignoring user property"

    iget-object v1, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->y()Lc7/u4;

    move-result-object v1

    iget-object v3, v2, Lc7/nc;->c:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v2, Lc7/nc;->e:Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    iget-object v3, p0, Lc7/yb;->G:Lc7/pc;

    iget-object v4, p2, Lc7/rc;->h:Ljava/lang/String;

    const/16 v5, 0x9

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lc7/qc;->N(Lc7/pc;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_e
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1}, Lc7/m;->M0()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p2

    invoke-virtual {p2}, Lc7/m;->M0()V

    throw p1
.end method

.method public final p0()V
    .locals 21

    move-object/from16 v7, p0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->l0()V

    const/4 v0, 0x1

    iput-boolean v0, v7, Lc7/yb;->v:Z

    const/4 v8, 0x0

    :try_start_0
    iget-object v1, v7, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->E()Lc7/y9;

    move-result-object v1

    invoke-virtual {v1}, Lc7/y9;->R()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    const-string v1, "Upload data called on the client side before use of service was decided"

    :goto_0
    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :goto_1
    iput-boolean v8, v7, Lc7/yb;->v:Z

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->I()V

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Upload called in the client side when service should be used"

    goto :goto_0

    :cond_1
    iget-wide v1, v7, Lc7/yb;->o:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_2

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->J()V

    goto :goto_1

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v1

    invoke-virtual {v1}, Lc7/j7;->i()V

    iget-object v1, v7, Lc7/yb;->y:Ljava/util/List;

    if-eqz v1, :cond_3

    move v1, v0

    goto :goto_4

    :cond_3
    move v1, v8

    :goto_4
    if-eqz v1, :cond_4

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v1, "Uploading requested multiple times"

    goto :goto_0

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->c0()Lc7/c5;

    move-result-object v1

    invoke-virtual {v1}, Lc7/c5;->v()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v1, "Network not connected, ignoring upload request"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->a()J

    move-result-wide v1

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v5

    sget-object v6, Lc7/i0;->U:Lc7/m4;

    const/4 v9, 0x0

    invoke-virtual {v5, v9, v6}, Lc7/h;->q(Ljava/lang/String;Lc7/m4;)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    invoke-static {}, Lc7/h;->D()J

    move-result-wide v10

    sub-long v10, v1, v10

    move v6, v8

    :goto_5
    if-ge v6, v5, :cond_6

    invoke-virtual {v7, v9, v10, v11}, Lc7/yb;->H(Ljava/lang/String;J)Z

    move-result v12

    if-eqz v12, :cond_6

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zza()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v5

    invoke-virtual {v5}, Lc7/j7;->i()V

    iget-object v5, v7, Lc7/yb;->q:Ljava/util/Set;

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zza()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v10

    sget-object v11, Lc7/i0;->H0:Lc7/m4;

    invoke-virtual {v10, v6, v11}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v10

    invoke-virtual {v10}, Lc7/v4;->A()Lc7/x4;

    move-result-object v10

    const-string v11, "Notifying app that trigger URIs are available. App ID"

    invoke-virtual {v10, v11, v6}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v10, Landroid/content/Intent;

    invoke-direct {v10}, Landroid/content/Intent;-><init>()V

    const-string v11, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    invoke-virtual {v10, v11}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v10, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v6, v7, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v6}, Lc7/k6;->zza()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6, v10}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_6

    :cond_8
    iget-object v5, v7, Lc7/yb;->q:Ljava/util/Set;

    invoke-interface {v5}, Ljava/util/Set;->clear()V

    :cond_9
    iget-object v5, v7, Lc7/yb;->i:Lc7/xa;

    iget-object v5, v5, Lc7/xa;->g:Lc7/n5;

    invoke-virtual {v5}, Lc7/n5;->a()J

    move-result-wide v5

    cmp-long v3, v5, v3

    if-eqz v3, :cond_a

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->A()Lc7/x4;

    move-result-object v3

    const-string v4, "Uploading events. Elapsed time since last upload attempt (ms)"

    sub-long v5, v1, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_a
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v3

    invoke-virtual {v3}, Lc7/m;->x()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const-wide/16 v4, -0x1

    if-nez v3, :cond_24

    iget-wide v10, v7, Lc7/yb;->A:J

    cmp-long v3, v10, v4

    if-nez v3, :cond_b

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v3

    invoke-virtual {v3}, Lc7/m;->t()J

    move-result-wide v3

    iput-wide v3, v7, Lc7/yb;->A:J

    :cond_b
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v3

    sget-object v4, Lc7/i0;->i:Lc7/m4;

    invoke-virtual {v3, v6, v4}, Lc7/h;->q(Ljava/lang/String;Lc7/m4;)I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v4

    sget-object v5, Lc7/i0;->j:Lc7/m4;

    invoke-virtual {v4, v6, v5}, Lc7/h;->q(Ljava/lang/String;Lc7/m4;)I

    move-result v4

    invoke-static {v8, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v5

    invoke-virtual {v5, v6, v3, v4}, Lc7/m;->L(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_25

    invoke-virtual {v7, v6}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v4

    invoke-virtual {v4}, Lc7/n7;->x()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/util/Pair;

    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzal()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_c

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzal()Ljava/lang/String;

    move-result-object v4

    goto :goto_7

    :cond_d
    move-object v4, v9

    :goto_7
    if-eqz v4, :cond_f

    move v5, v8

    :goto_8
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    if-ge v5, v10, :cond_f

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/util/Pair;

    iget-object v10, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzal()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_e

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzal()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    invoke-interface {v3, v8, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v3

    goto :goto_9

    :cond_e
    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_f
    :goto_9
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzi;->zzb()Lcom/google/android/gms/internal/measurement/zzfi$zzi$zza;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v11

    invoke-virtual {v11, v6}, Lc7/h;->F(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-virtual {v7, v6}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v11

    invoke-virtual {v11}, Lc7/n7;->x()Z

    move-result v11

    if-eqz v11, :cond_10

    move v11, v0

    goto :goto_a

    :cond_10
    move v11, v8

    :goto_a
    invoke-virtual {v7, v6}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v12

    invoke-virtual {v12}, Lc7/n7;->x()Z

    move-result v12

    invoke-virtual {v7, v6}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v13

    invoke-virtual {v13}, Lc7/n7;->y()Z

    move-result v13

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpt;->zza()Z

    move-result v14

    if-eqz v14, :cond_11

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v14

    sget-object v15, Lc7/i0;->t0:Lc7/m4;

    invoke-virtual {v14, v6, v15}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v14

    if-eqz v14, :cond_11

    move v14, v0

    goto :goto_b

    :cond_11
    move v14, v8

    :goto_b
    move v15, v8

    :goto_c
    if-ge v15, v5, :cond_20

    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v9, v16

    check-cast v9, Landroid/util/Pair;

    iget-object v9, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v0, v16

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-object v0, v3

    move-object/from16 v16, v4

    const-wide/32 v3, 0x14822

    invoke-virtual {v9, v3, v4}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzl(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzk(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v3

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzd(Z)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    if-nez v11, :cond_12

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzj()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_12
    if-nez v12, :cond_13

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzq()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzm()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_13
    if-nez v13, :cond_14

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzg()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_14
    invoke-virtual {v7, v6, v9}, Lc7/yb;->A(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;)V

    if-nez v14, :cond_15

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzr()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_15
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v3

    sget-object v4, Lc7/i0;->V0:Lc7/m4;

    invoke-virtual {v3, v4}, Lc7/h;->o(Lc7/m4;)Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzz()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_17

    const-string v4, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    goto :goto_d

    :cond_16
    move-object/from16 v20, v0

    goto :goto_f

    :cond_17
    :goto_d
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzaa()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move/from16 v17, v8

    move/from16 v18, v17

    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_1a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/google/android/gms/internal/measurement/zzfi$zze;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    const-string v8, "_fx"

    move-object/from16 v20, v0

    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zzg()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    move-object/from16 v0, v20

    const/4 v8, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x1

    goto :goto_e

    :cond_18
    const-string v0, "_f"

    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zzg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    const/16 v18, 0x1

    :cond_19
    move-object/from16 v0, v20

    const/4 v8, 0x0

    goto :goto_e

    :cond_1a
    move-object/from16 v20, v0

    if-eqz v17, :cond_1b

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzk()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual {v9, v3}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzb(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_1b
    if-eqz v18, :cond_1c

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzt()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v7, v0, v3}, Lc7/yb;->B(Ljava/lang/String;Z)V

    :cond_1c
    :goto_f
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc()I

    move-result v0

    if-eqz v0, :cond_1d

    goto :goto_10

    :cond_1d
    move-object/from16 v0, v16

    goto :goto_11

    :cond_1e
    move-object/from16 v20, v0

    :goto_10
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v0

    sget-object v3, Lc7/i0;->g0:Lc7/m4;

    invoke-virtual {v0, v6, v3}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhl;->zzbv()[B

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v3

    invoke-virtual {v3, v0}, Lc7/ic;->v([B)J

    move-result-wide v3

    invoke-virtual {v9, v3, v4}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_1f
    move-object/from16 v0, v16

    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/measurement/zzfi$zzi$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;)Lcom/google/android/gms/internal/measurement/zzfi$zzi$zza;

    :goto_11
    add-int/lit8 v15, v15, 0x1

    move-object v4, v0

    move-object/from16 v3, v20

    const/4 v0, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    goto/16 :goto_c

    :cond_20
    move-object v0, v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v3

    sget-object v4, Lc7/i0;->V0:Lc7/m4;

    invoke-virtual {v3, v4}, Lc7/h;->o(Lc7/m4;)Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzi$zza;->zza()I

    move-result v3

    if-nez v3, :cond_21

    invoke-virtual {v7, v10}, Lc7/yb;->C(Ljava/util/List;)V

    const/4 v2, 0x0

    const/16 v3, 0xcc

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lc7/yb;->E(ZILjava/lang/Throwable;[BLjava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v1, 0x0

    :goto_12
    iput-boolean v1, v7, Lc7/yb;->v:Z

    goto/16 :goto_2

    :cond_21
    :try_start_3
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Lc7/v4;->x(I)Z

    move-result v3

    if-eqz v3, :cond_22

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v4, Lcom/google/android/gms/internal/measurement/zzfi$zzi;

    invoke-virtual {v3, v4}, Lc7/ic;->H(Lcom/google/android/gms/internal/measurement/zzfi$zzi;)Ljava/lang/String;

    move-result-object v9

    goto :goto_13

    :cond_22
    const/4 v9, 0x0

    :goto_13
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->i0()Lc7/ic;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfi$zzi;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzhl;->zzbv()[B

    move-result-object v14

    iget-object v3, v7, Lc7/yb;->j:Lc7/wb;

    invoke-virtual {v3, v6}, Lc7/wb;->q(Ljava/lang/String;)Lc7/zb;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v7, v10}, Lc7/yb;->C(Ljava/util/List;)V

    iget-object v4, v7, Lc7/yb;->i:Lc7/xa;

    iget-object v4, v4, Lc7/xa;->h:Lc7/n5;

    invoke-virtual {v4, v1, v2}, Lc7/n5;->b(J)V

    const-string v1, "?"
    :try_end_4
    .catch Ljava/net/MalformedURLException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-lez v5, :cond_23

    const/4 v2, 0x0

    :try_start_5
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzi$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    move-result-object v0
    :try_end_5
    .catch Ljava/net/MalformedURLException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v1

    goto :goto_14

    :catchall_0
    move-exception v0

    move v1, v2

    goto/16 :goto_16

    :cond_23
    :goto_14
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v2, "Uploading data. app, uncompressed size, data"

    array-length v4, v14

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v2, v1, v4, v9}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, v7, Lc7/yb;->u:Z

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->c0()Lc7/c5;

    move-result-object v11

    new-instance v13, Ljava/net/URL;

    invoke-virtual {v3}, Lc7/zb;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v13, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lc7/zb;->b()Ljava/util/Map;

    move-result-object v15

    new-instance v0, Lc7/ac;

    invoke-direct {v0, v7, v6}, Lc7/ac;-><init>(Lc7/yb;Ljava/lang/String;)V

    invoke-virtual {v11}, Lc7/j7;->i()V

    invoke-virtual {v11}, Lc7/xb;->p()V

    invoke-static {v13}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v14}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v11}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v1

    new-instance v2, Lc7/h5;

    move-object v10, v2

    move-object v12, v6

    move-object/from16 v16, v0

    invoke-direct/range {v10 .. v16}, Lc7/h5;-><init>(Lc7/c5;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lc7/b5;)V

    invoke-virtual {v1, v2}, Lc7/d6;->u(Ljava/lang/Runnable;)V
    :try_end_6
    .catch Ljava/net/MalformedURLException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_15

    :catch_0
    :try_start_7
    invoke-virtual/range {p0 .. p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Failed to parse upload URL. Not uploading. appId"

    invoke-static {v6}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3}, Lc7/zb;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_15

    :cond_24
    iput-wide v4, v7, Lc7/yb;->A:J

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->Y()Lc7/h;

    invoke-static {}, Lc7/h;->D()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lc7/m;->J(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_25

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object v0

    if-eqz v0, :cond_25

    invoke-virtual {v7, v0}, Lc7/yb;->R(Lc7/g5;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :cond_25
    :goto_15
    const/4 v1, 0x0

    goto/16 :goto_12

    :catchall_1
    move-exception v0

    const/4 v1, 0x0

    goto :goto_16

    :catchall_2
    move-exception v0

    move v1, v8

    :goto_16
    iput-boolean v1, v7, Lc7/yb;->v:Z

    invoke-virtual/range {p0 .. p0}, Lc7/yb;->I()V

    throw v0
.end method

.method public final q0()J
    .locals 7

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v0

    iget-object v2, p0, Lc7/yb;->i:Lc7/xa;

    invoke-virtual {v2}, Lc7/xb;->p()V

    invoke-virtual {v2}, Lc7/j7;->i()V

    iget-object v3, v2, Lc7/xa;->i:Lc7/n5;

    invoke-virtual {v3}, Lc7/n5;->a()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v5, v3, v5

    if-nez v5, :cond_0

    const-wide/16 v3, 0x1

    invoke-virtual {v2}, Lc7/j7;->f()Lc7/qc;

    move-result-object v5

    invoke-virtual {v5}, Lc7/qc;->P0()Ljava/security/SecureRandom;

    move-result-object v5

    const v6, 0x5265c00

    invoke-virtual {v5, v6}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v3, v5

    iget-object v2, v2, Lc7/xa;->i:Lc7/n5;

    invoke-virtual {v2, v3, v4}, Lc7/n5;->b(J)V

    :cond_0
    add-long/2addr v0, v3

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    div-long/2addr v0, v2

    const-wide/16 v2, 0x18

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public final r0()Lc7/f5;
    .locals 2

    iget-object v0, p0, Lc7/yb;->d:Lc7/f5;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Network broadcast receiver not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final s(Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;JZ)V
    .locals 9

    if-eqz p4, :cond_0

    const-string v0, "_se"

    goto :goto_0

    :cond_0
    const-string v0, "_lte"

    :goto_0
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lc7/m;->A0(Ljava/lang/String;Ljava/lang/String;)Lc7/nc;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, v1, Lc7/nc;->e:Ljava/lang/Object;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v8, Lc7/nc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v3

    invoke-interface {v3}, Lo6/d;->a()J

    move-result-wide v5

    iget-object v1, v1, Lc7/nc;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    add-long/2addr v3, p2

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const-string v3, "auto"

    move-object v1, v8

    move-object v4, v0

    invoke-direct/range {v1 .. v7}, Lc7/nc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    goto :goto_2

    :cond_2
    :goto_1
    new-instance v8, Lc7/nc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->a()J

    move-result-wide v5

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const-string v3, "auto"

    move-object v1, v8

    move-object v4, v0

    invoke-direct/range {v1 .. v7}, Lc7/nc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    :goto_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzn;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;

    move-result-object v1

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v2

    invoke-interface {v2}, Lo6/d;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;->zzb(J)Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;

    move-result-object v1

    iget-object v2, v8, Lc7/nc;->e:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;->zza(J)Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzfi$zzn;

    const/4 v2, 0x0

    invoke-static {p1, v0}, Lc7/ic;->t(Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_3

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(ILcom/google/android/gms/internal/measurement/zzfi$zzn;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    const/4 v2, 0x1

    :cond_3
    if-nez v2, :cond_4

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzn;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_4
    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-lez p1, :cond_6

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1, v8}, Lc7/m;->Y(Lc7/nc;)Z

    if-eqz p4, :cond_5

    const-string p1, "session-scoped"

    goto :goto_3

    :cond_5
    const-string p1, "lifetime"

    :goto_3
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->F()Lc7/x4;

    move-result-object p2

    iget-object p3, v8, Lc7/nc;->e:Ljava/lang/Object;

    const-string p4, "Updated engagement user property. scope, value"

    invoke-virtual {p2, p4, p1, p3}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_6
    return-void
.end method

.method public final s0()Lc7/sb;
    .locals 1

    iget-object v0, p0, Lc7/yb;->e:Lc7/sb;

    invoke-static {v0}, Lc7/yb;->f(Lc7/xb;)Lc7/xb;

    move-result-object v0

    check-cast v0, Lc7/sb;

    return-object v0
.end method

.method public final t(Ljava/lang/Runnable;)V
    .locals 1

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/yb;->p:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc7/yb;->p:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lc7/yb;->p:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final u(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Throwable;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p4, :cond_0

    :try_start_0
    new-array p4, v0, [B

    :cond_0
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    const-string v2, "onConfigFetched. Response size"

    array-length v3, p4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    invoke-virtual {v1}, Lc7/m;->L0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v1

    invoke-virtual {v1, p1}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object v1

    const/16 v2, 0xc8

    const/16 v3, 0x130

    const/4 v4, 0x1

    if-eq p2, v2, :cond_1

    const/16 v2, 0xcc

    if-eq p2, v2, :cond_1

    if-ne p2, v3, :cond_2

    :cond_1
    if-nez p3, :cond_2

    move v2, v4

    goto :goto_0

    :cond_2
    move v2, v0

    :goto_0
    if-nez v1, :cond_3

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->G()Lc7/x4;

    move-result-object p2

    const-string p3, "App does not exist in onConfigFetched. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_3
    const/16 v5, 0x194

    if-nez v2, :cond_8

    if-ne p2, v5, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object p4

    invoke-interface {p4}, Lo6/d;->a()J

    move-result-wide p4

    invoke-virtual {v1, p4, p5}, Lc7/g5;->d0(J)V

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p4

    invoke-virtual {p4, v1}, Lc7/m;->Q(Lc7/g5;)V

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p4

    invoke-virtual {p4}, Lc7/v4;->F()Lc7/x4;

    move-result-object p4

    const-string p5, "Fetching config failed. code, error"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p4, p5, v1, p3}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object p3

    invoke-virtual {p3, p1}, Lc7/u5;->O(Ljava/lang/String;)V

    iget-object p1, p0, Lc7/yb;->i:Lc7/xa;

    iget-object p1, p1, Lc7/xa;->h:Lc7/n5;

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object p3

    invoke-interface {p3}, Lo6/d;->a()J

    move-result-wide p3

    invoke-virtual {p1, p3, p4}, Lc7/n5;->b(J)V

    const/16 p1, 0x1f7

    if-eq p2, p1, :cond_6

    const/16 p1, 0x1ad

    if-ne p2, p1, :cond_5

    goto :goto_1

    :cond_5
    move v4, v0

    :cond_6
    :goto_1
    if-eqz v4, :cond_7

    iget-object p1, p0, Lc7/yb;->i:Lc7/xa;

    iget-object p1, p1, Lc7/xa;->f:Lc7/n5;

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object p2

    invoke-interface {p2}, Lo6/d;->a()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lc7/n5;->b(J)V

    :cond_7
    invoke-virtual {p0}, Lc7/yb;->J()V

    goto/16 :goto_a

    :cond_8
    :goto_2
    const/4 p3, 0x0

    if-eqz p5, :cond_9

    const-string v2, "Last-Modified"

    invoke-interface {p5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    goto :goto_3

    :cond_9
    move-object v2, p3

    :goto_3
    if-eqz v2, :cond_a

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_a

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_4

    :cond_a
    move-object v2, p3

    :goto_4
    if-eqz p5, :cond_b

    const-string v4, "ETag"

    invoke-interface {p5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/util/List;

    goto :goto_5

    :cond_b
    move-object p5, p3

    :goto_5
    if-eqz p5, :cond_c

    invoke-interface {p5}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_c

    invoke-interface {p5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/String;

    goto :goto_6

    :cond_c
    move-object p5, p3

    :goto_6
    if-eq p2, v5, :cond_e

    if-ne p2, v3, :cond_d

    goto :goto_8

    :cond_d
    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object p3

    invoke-virtual {p3, p1, p4, v2, p5}, Lc7/u5;->C(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Z

    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p3, :cond_f

    :try_start_2
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    :goto_7
    invoke-virtual {p1}, Lc7/m;->M0()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iput-boolean v0, p0, Lc7/yb;->t:Z

    invoke-virtual {p0}, Lc7/yb;->I()V

    return-void

    :cond_e
    :goto_8
    :try_start_3
    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object p5

    invoke-virtual {p5, p1}, Lc7/u5;->G(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    move-result-object p5

    if-nez p5, :cond_f

    invoke-virtual {p0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object p5

    invoke-virtual {p5, p1, p3, p3, p3}, Lc7/u5;->C(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Z

    move-result p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez p3, :cond_f

    :try_start_4
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_7

    :cond_f
    :try_start_5
    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object p3

    invoke-interface {p3}, Lo6/d;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lc7/g5;->B(J)V

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p3

    invoke-virtual {p3, v1}, Lc7/m;->Q(Lc7/g5;)V

    if-ne p2, v5, :cond_10

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->H()Lc7/x4;

    move-result-object p2

    const-string p3, "Config not found. Using empty config. appId"

    invoke-virtual {p2, p3, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_9

    :cond_10
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    const-string p3, "Successfully fetched config. Got network response. code, size"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    array-length p4, p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p1, p3, p2, p4}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_9
    invoke-virtual {p0}, Lc7/yb;->c0()Lc7/c5;

    move-result-object p1

    invoke-virtual {p1}, Lc7/c5;->v()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lc7/yb;->K()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lc7/yb;->p0()V

    :goto_a
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1}, Lc7/m;->O0()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    goto :goto_7

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p2

    invoke-virtual {p2}, Lc7/m;->M0()V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception p1

    iput-boolean v0, p0, Lc7/yb;->t:Z

    invoke-virtual {p0}, Lc7/yb;->I()V

    throw p1
.end method

.method public final v(Ljava/lang/String;Lc7/w;)V
    .locals 1

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/yb;->C:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc7/m;->R(Ljava/lang/String;Lc7/w;)V

    :cond_0
    return-void
.end method

.method public final w(Ljava/lang/String;Lc7/n7;)V
    .locals 1

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    iget-object v0, p0, Lc7/yb;->B:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc7/m;->S(Ljava/lang/String;Lc7/n7;)V

    return-void
.end method

.method public final x(Ljava/lang/String;Lc7/q9;)V
    .locals 1

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/yb;->F:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_1

    :cond_0
    iput-object p1, p0, Lc7/yb;->F:Ljava/lang/String;

    iput-object p2, p0, Lc7/yb;->E:Lc7/q9;

    :cond_1
    return-void
.end method

.method public final y(Ljava/lang/String;Lc7/rc;)V
    .locals 7

    invoke-virtual {p0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/yb;->l0()V

    invoke-static {p2}, Lc7/yb;->Z(Lc7/rc;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lc7/rc;->o:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p2}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    return-void

    :cond_1
    const-string v0, "_npa"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p2, Lc7/rc;->y:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->A()Lc7/x4;

    move-result-object p1

    const-string v0, "Falling back to manifest metadata value for ad personalization"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    new-instance p1, Lc7/lc;

    invoke-virtual {p0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v3

    iget-object v0, p2, Lc7/rc;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    const-wide/16 v0, 0x1

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v2, "_npa"

    const-string v6, "auto"

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lc7/lc;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lc7/yb;->p(Lc7/lc;Lc7/rc;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    iget-object v1, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->y()Lc7/u4;

    move-result-object v1

    invoke-virtual {v1, p1}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Removing user property"

    invoke-virtual {v0, v2, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0}, Lc7/m;->L0()V

    :try_start_0
    invoke-virtual {p0, p2}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    const-string v0, "_id"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    iget-object v1, p2, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "_lair"

    invoke-virtual {v0, v1, v2}, Lc7/m;->G0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    iget-object p2, p2, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0, p2, p1}, Lc7/m;->G0(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p2

    invoke-virtual {p2}, Lc7/m;->O0()V

    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->A()Lc7/x4;

    move-result-object p2

    const-string v0, "User property removed"

    iget-object v1, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->y()Lc7/u4;

    move-result-object v1

    invoke-virtual {v1, p1}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p1

    invoke-virtual {p1}, Lc7/m;->M0()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lc7/yb;->a0()Lc7/m;

    move-result-object p2

    invoke-virtual {p2}, Lc7/m;->M0()V

    throw p1
.end method

.method public final z(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 9

    const-string v0, "_o"

    const-string v1, "_sn"

    const-string v2, "_sc"

    const-string v3, "_si"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo6/e;->b([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zzf()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc7/qc;->C0(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    invoke-static {p1}, Lc7/qc;->C0(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object p1

    invoke-virtual {p1, p4, v2}, Lc7/h;->m(Ljava/lang/String;Z)I

    move-result p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object p1

    invoke-virtual {p1, p4, v2}, Lc7/h;->r(Ljava/lang/String;Z)I

    move-result p1

    :goto_1
    int-to-long v3, p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zzg()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zzg()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {p1, v1, v5}, Ljava/lang/String;->codePointCount(II)I

    move-result p1

    int-to-long v5, p1

    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zzf()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    const/16 v1, 0x28

    invoke-static {p1, v1, v2}, Lc7/qc;->E(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object p1

    cmp-long v1, v5, v3

    if-lez v1, :cond_4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zzf()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zzf()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_ev"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lc7/yb;->j0()Lc7/qc;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zzg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lc7/yb;->Y()Lc7/h;

    move-result-object p2

    invoke-virtual {p2, p4, v2}, Lc7/h;->r(Ljava/lang/String;Z)I

    move-result p2

    invoke-static {p1, p2, v2}, Lc7/qc;->E(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p4

    invoke-virtual {p4}, Lc7/v4;->H()Lc7/x4;

    move-result-object p4

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v2, "Param value is too long; discarded. Name, value length"

    invoke-virtual {p4, v2, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p4, "_err"

    invoke-virtual {p3, p4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v7, 0x0

    cmp-long v0, v2, v7

    if-nez v0, :cond_3

    const-wide/16 v2, 0x4

    invoke-virtual {p3, p4, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {p3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    if-nez p4, :cond_3

    invoke-virtual {p3, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "_el"

    invoke-virtual {p3, p1, v5, v6}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zzf()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public final zza()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zza()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final zzb()Lo6/d;
    .locals 1

    iget-object v0, p0, Lc7/yb;->l:Lc7/k6;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzb()Lo6/d;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()Lc7/c;
    .locals 1

    iget-object v0, p0, Lc7/yb;->l:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzd()Lc7/c;

    move-result-object v0

    return-object v0
.end method

.method public final zzj()Lc7/v4;
    .locals 1

    iget-object v0, p0, Lc7/yb;->l:Lc7/k6;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    return-object v0
.end method

.method public final zzl()Lc7/d6;
    .locals 1

    iget-object v0, p0, Lc7/yb;->l:Lc7/k6;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    return-object v0
.end method
