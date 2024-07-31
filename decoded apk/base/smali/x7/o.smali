.class public final Lx7/o;
.super Lw7/k0;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lx7/o;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw7/r0;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lx7/p;

.field public final j:Ljava/lang/String;

.field public final k:Lw7/z1;

.field public final l:Lx7/i;

.field public final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw7/x0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx7/q;

    invoke-direct {v0}, Lx7/q;-><init>()V

    sput-object v0, Lx7/o;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lx7/p;Ljava/lang/String;Lw7/z1;Lx7/i;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw7/r0;",
            ">;",
            "Lx7/p;",
            "Ljava/lang/String;",
            "Lw7/z1;",
            "Lx7/i;",
            "Ljava/util/List<",
            "Lw7/x0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lw7/k0;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lx7/o;->h:Ljava/util/List;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx7/p;

    iput-object p1, p0, Lx7/o;->i:Lx7/p;

    invoke-static {p3}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lx7/o;->j:Ljava/lang/String;

    iput-object p4, p0, Lx7/o;->k:Lw7/z1;

    iput-object p5, p0, Lx7/o;->l:Lx7/i;

    invoke-static {p6}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lx7/o;->m:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic M(Lx7/o;)Lw7/z1;
    .locals 0

    iget-object p0, p0, Lx7/o;->k:Lw7/z1;

    return-object p0
.end method

.method public static N(Lcom/google/android/gms/internal/firebase-auth-api/zzyi;Lcom/google/firebase/auth/FirebaseAuth;Lw7/a0;)Lx7/o;
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzyi;->zzc()Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw7/j0;

    instance-of v3, v1, Lw7/r0;

    if-eqz v3, :cond_0

    check-cast v1, Lw7/r0;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzyi;->zzc()Ljava/util/List;

    move-result-object v0

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw7/j0;

    instance-of v3, v1, Lw7/x0;

    if-eqz v3, :cond_2

    check-cast v1, Lw7/x0;

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzyi;->zzc()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzyi;->zzb()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lx7/p;->K(Ljava/util/List;Ljava/lang/String;)Lx7/p;

    move-result-object v3

    new-instance v0, Lx7/o;

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->i()Ln7/g;

    move-result-object p1

    invoke-virtual {p1}, Ln7/g;->q()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzyi;->zza()Lw7/z1;

    move-result-object v5

    move-object v6, p2

    check-cast v6, Lx7/i;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lx7/o;-><init>(Ljava/util/List;Lx7/p;Ljava/lang/String;Lw7/z1;Lx7/i;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public final I()Lcom/google/firebase/auth/FirebaseAuth;
    .locals 1

    iget-object v0, p0, Lx7/o;->j:Ljava/lang/String;

    invoke-static {v0}, Ln7/g;->p(Ljava/lang/String;)Ln7/g;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ln7/g;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    return-object v0
.end method

.method public final J()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw7/j0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lx7/o;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw7/r0;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lx7/o;->m:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw7/x0;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public final K()Lw7/l0;
    .locals 1

    iget-object v0, p0, Lx7/o;->i:Lx7/p;

    return-object v0
.end method

.method public final L(Lw7/i0;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/i0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lw7/k0;->I()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    iget-object v1, p0, Lx7/o;->i:Lx7/p;

    iget-object v2, p0, Lx7/o;->l:Lx7/i;

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/firebase/auth/FirebaseAuth;->X(Lw7/i0;Lx7/p;Lw7/a0;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lx7/n;

    invoke-direct {v0, p0}, Lx7/n;-><init>(Lx7/o;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lx7/o;->h:Ljava/util/List;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-virtual {p0}, Lw7/k0;->K()Lw7/l0;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lx7/o;->j:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lx7/o;->k:Lw7/z1;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lx7/o;->l:Lx7/i;

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lx7/o;->m:Ljava/util/List;

    const/4 v1, 0x6

    invoke-static {p1, v1, p2, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
