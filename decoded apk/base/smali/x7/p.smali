.class public final Lx7/p;
.super Lw7/l0;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lx7/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw7/r0;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw7/x0;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lx7/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx7/s;

    invoke-direct {v0}, Lx7/s;-><init>()V

    sput-object v0, Lx7/p;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lw7/l0;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lx7/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lw7/r0;",
            ">;",
            "Ljava/util/List<",
            "Lw7/x0;",
            ">;",
            "Lx7/i;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lw7/l0;-><init>()V

    iput-object p1, p0, Lx7/p;->h:Ljava/lang/String;

    iput-object p2, p0, Lx7/p;->i:Ljava/lang/String;

    iput-object p3, p0, Lx7/p;->j:Ljava/util/List;

    iput-object p4, p0, Lx7/p;->k:Ljava/util/List;

    iput-object p5, p0, Lx7/p;->l:Lx7/i;

    return-void
.end method

.method public static J(Ljava/lang/String;Lx7/i;)Lx7/p;
    .locals 1

    invoke-static {p0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lx7/p;

    invoke-direct {v0}, Lx7/p;-><init>()V

    iput-object p0, v0, Lx7/p;->h:Ljava/lang/String;

    iput-object p1, v0, Lx7/p;->l:Lx7/i;

    return-object v0
.end method

.method public static K(Ljava/util/List;Ljava/lang/String;)Lx7/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw7/j0;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lx7/p;"
        }
    .end annotation

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lx7/p;

    invoke-direct {v0}, Lx7/p;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lx7/p;->j:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lx7/p;->k:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw7/j0;

    instance-of v2, v1, Lw7/r0;

    if-eqz v2, :cond_0

    iget-object v2, v0, Lx7/p;->j:Ljava/util/List;

    check-cast v1, Lw7/r0;

    :goto_1
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v2, v1, Lw7/x0;

    if-eqz v2, :cond_1

    iget-object v2, v0, Lx7/p;->k:Ljava/util/List;

    check-cast v1, Lw7/x0;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Lw7/j0;->J()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iput-object p1, v0, Lx7/p;->i:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final I()Lx7/i;
    .locals 1

    iget-object v0, p0, Lx7/p;->l:Lx7/i;

    return-object v0
.end method

.method public final L()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx7/p;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final M()Z
    .locals 1

    iget-object v0, p0, Lx7/p;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lx7/p;->h:Ljava/lang/String;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lx7/p;->i:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lx7/p;->j:Ljava/util/List;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v1, p0, Lx7/p;->k:Ljava/util/List;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v1, p0, Lx7/p;->l:Lx7/i;

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx7/p;->i:Ljava/lang/String;

    return-object v0
.end method
