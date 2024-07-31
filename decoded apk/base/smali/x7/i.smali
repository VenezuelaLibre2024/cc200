.class public Lx7/i;
.super Lw7/a0;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lx7/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public h:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

.field public i:Lx7/e;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lx7/e;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/Boolean;

.field public p:Lx7/k;

.field public q:Z

.field public r:Lw7/z1;

.field public s:Lx7/n0;

.field public t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx7/h;

    invoke-direct {v0}, Lx7/h;-><init>()V

    sput-object v0, Lx7/i;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzafm;Lx7/e;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lx7/k;ZLw7/z1;Lx7/n0;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafm;",
            "Lx7/e;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lx7/e;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lx7/k;",
            "Z",
            "Lw7/z1;",
            "Lx7/n0;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafp;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lw7/a0;-><init>()V

    iput-object p1, p0, Lx7/i;->h:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    iput-object p2, p0, Lx7/i;->i:Lx7/e;

    iput-object p3, p0, Lx7/i;->j:Ljava/lang/String;

    iput-object p4, p0, Lx7/i;->k:Ljava/lang/String;

    iput-object p5, p0, Lx7/i;->l:Ljava/util/List;

    iput-object p6, p0, Lx7/i;->m:Ljava/util/List;

    iput-object p7, p0, Lx7/i;->n:Ljava/lang/String;

    iput-object p8, p0, Lx7/i;->o:Ljava/lang/Boolean;

    iput-object p9, p0, Lx7/i;->p:Lx7/k;

    iput-boolean p10, p0, Lx7/i;->q:Z

    iput-object p11, p0, Lx7/i;->r:Lw7/z1;

    iput-object p12, p0, Lx7/i;->s:Lx7/n0;

    iput-object p13, p0, Lx7/i;->t:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ln7/g;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ljava/util/List<",
            "+",
            "Lw7/b1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lw7/a0;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ln7/g;->q()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lx7/i;->j:Ljava/lang/String;

    const-string p1, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    iput-object p1, p0, Lx7/i;->k:Ljava/lang/String;

    const-string p1, "2"

    iput-object p1, p0, Lx7/i;->n:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lw7/a0;->e0(Ljava/util/List;)Lw7/a0;

    return-void
.end method


# virtual methods
.method public C()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx7/i;->i:Lx7/e;

    invoke-virtual {v0}, Lx7/e;->C()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public K()Lw7/b0;
    .locals 1

    iget-object v0, p0, Lx7/i;->p:Lx7/k;

    return-object v0
.end method

.method public synthetic L()Lw7/h0;
    .locals 1

    new-instance v0, Lx7/m;

    invoke-direct {v0, p0}, Lx7/m;-><init>(Lx7/i;)V

    return-object v0
.end method

.method public M()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lw7/b1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx7/i;->l:Ljava/util/List;

    return-object v0
.end method

.method public N()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lx7/i;->h:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzc()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx7/i;->h:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx7/m0;->a(Ljava/lang/String;)Lw7/c0;

    move-result-object v0

    invoke-virtual {v0}, Lw7/c0;->b()Ljava/util/Map;

    move-result-object v0

    const-string v2, "firebase"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string v1, "tenant"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v1, v0

    :cond_0
    return-object v1
.end method

.method public O()Z
    .locals 3

    iget-object v0, p0, Lx7/i;->o:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    iget-object v0, p0, Lx7/i;->h:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    const-string v1, ""

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx7/m0;->a(Ljava/lang/String;)Lw7/c0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lw7/c0;->e()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :cond_1
    invoke-virtual {p0}, Lw7/a0;->M()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_2

    if-eqz v1, :cond_3

    const-string v0, "custom"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :cond_3
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lx7/i;->o:Ljava/lang/Boolean;

    :cond_4
    iget-object v0, p0, Lx7/i;->o:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx7/i;->i:Lx7/e;

    invoke-virtual {v0}, Lx7/e;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx7/i;->i:Lx7/e;

    invoke-virtual {v0}, Lx7/e;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d0()Ln7/g;
    .locals 1

    iget-object v0, p0, Lx7/i;->j:Ljava/lang/String;

    invoke-static {v0}, Ln7/g;->p(Ljava/lang/String;)Ln7/g;

    move-result-object v0

    return-object v0
.end method

.method public e()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lx7/i;->i:Lx7/e;

    invoke-virtual {v0}, Lx7/e;->e()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized e0(Ljava/util/List;)Lw7/a0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lw7/b1;",
            ">;)",
            "Lw7/a0;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lx7/i;->l:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lx7/i;->m:Ljava/util/List;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw7/b1;

    invoke-interface {v2}, Lw7/b1;->c()Ljava/lang/String;

    move-result-object v3

    const-string v4, "firebase"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lx7/e;

    iput-object v3, p0, Lx7/i;->i:Lx7/e;

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lx7/i;->m:Ljava/util/List;

    invoke-interface {v2}, Lw7/b1;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v3, p0, Lx7/i;->l:Ljava/util/List;

    check-cast v2, Lx7/e;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lx7/i;->i:Lx7/e;

    if-nez p1, :cond_2

    iget-object p1, p0, Lx7/i;->l:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx7/e;

    iput-object p1, p0, Lx7/i;->i:Lx7/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final f0(Lcom/google/android/gms/internal/firebase-auth-api/zzafm;)V
    .locals 0

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    iput-object p1, p0, Lx7/i;->h:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    return-void
.end method

.method public final synthetic g0()Lw7/a0;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lx7/i;->o:Ljava/lang/Boolean;

    return-object p0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lx7/i;->i:Lx7/e;

    invoke-virtual {v0}, Lx7/e;->h()Z

    move-result v0

    return v0
.end method

.method public final h0(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw7/j0;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lx7/n0;->J(Ljava/util/List;)Lx7/n0;

    move-result-object p1

    iput-object p1, p0, Lx7/i;->s:Lx7/n0;

    return-void
.end method

.method public final i0()Lcom/google/android/gms/internal/firebase-auth-api/zzafm;
    .locals 1

    iget-object v0, p0, Lx7/i;->h:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    return-object v0
.end method

.method public final j0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx7/i;->m:Ljava/util/List;

    return-object v0
.end method

.method public final k0(Ljava/lang/String;)Lx7/i;
    .locals 0

    iput-object p1, p0, Lx7/i;->n:Ljava/lang/String;

    return-object p0
.end method

.method public final l0(Lw7/z1;)V
    .locals 0

    iput-object p1, p0, Lx7/i;->r:Lw7/z1;

    return-void
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx7/i;->i:Lx7/e;

    invoke-virtual {v0}, Lx7/e;->m()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m0(Lx7/k;)V
    .locals 0

    iput-object p1, p0, Lx7/i;->p:Lx7/k;

    return-void
.end method

.method public final n0(Z)V
    .locals 0

    iput-boolean p1, p0, Lx7/i;->q:Z

    return-void
.end method

.method public final o0(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafp;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lx7/i;->t:Ljava/util/List;

    return-void
.end method

.method public final p0()Lw7/z1;
    .locals 1

    iget-object v0, p0, Lx7/i;->r:Lw7/z1;

    return-object v0
.end method

.method public final q0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx7/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx7/i;->l:Ljava/util/List;

    return-object v0
.end method

.method public final r0()Z
    .locals 1

    iget-boolean v0, p0, Lx7/i;->q:Z

    return v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx7/i;->i:Lx7/e;

    invoke-virtual {v0}, Lx7/e;->s()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lw7/a0;->i0()Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lx7/i;->i:Lx7/e;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lx7/i;->j:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lx7/i;->k:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lx7/i;->l:Ljava/util/List;

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-virtual {p0}, Lw7/a0;->j0()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {p1, v2, v1, v3}, Li6/c;->H(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v1, p0, Lx7/i;->n:Ljava/lang/String;

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lw7/a0;->O()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {p1, v2, v1, v3}, Li6/c;->i(Landroid/os/Parcel;ILjava/lang/Boolean;Z)V

    invoke-virtual {p0}, Lw7/a0;->K()Lw7/b0;

    move-result-object v1

    const/16 v2, 0x9

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-boolean v1, p0, Lx7/i;->q:Z

    const/16 v2, 0xa

    invoke-static {p1, v2, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, Lx7/i;->r:Lw7/z1;

    const/16 v2, 0xb

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lx7/i;->s:Lx7/n0;

    const/16 v2, 0xc

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lx7/i;->t:Ljava/util/List;

    const/16 v1, 0xd

    invoke-static {p1, v1, p2, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lw7/a0;->i0()Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzc()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx7/i;->h:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzf()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzh()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw7/j0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx7/i;->s:Lx7/n0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx7/n0;->I()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method
