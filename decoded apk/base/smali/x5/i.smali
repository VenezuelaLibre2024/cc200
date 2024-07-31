.class public final Lx5/i;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lx5/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Landroid/net/Uri;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Lu6/t;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx5/b0;

    invoke-direct {v0}, Lx5/b0;-><init>()V

    sput-object v0, Lx5/i;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu6/t;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lx5/i;->h:Ljava/lang/String;

    iput-object p2, p0, Lx5/i;->i:Ljava/lang/String;

    iput-object p3, p0, Lx5/i;->j:Ljava/lang/String;

    iput-object p4, p0, Lx5/i;->k:Ljava/lang/String;

    iput-object p5, p0, Lx5/i;->l:Landroid/net/Uri;

    iput-object p6, p0, Lx5/i;->m:Ljava/lang/String;

    iput-object p7, p0, Lx5/i;->n:Ljava/lang/String;

    iput-object p8, p0, Lx5/i;->o:Ljava/lang/String;

    iput-object p9, p0, Lx5/i;->p:Lu6/t;

    return-void
.end method


# virtual methods
.method public I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx5/i;->k:Ljava/lang/String;

    return-object v0
.end method

.method public J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx5/i;->j:Ljava/lang/String;

    return-object v0
.end method

.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx5/i;->n:Ljava/lang/String;

    return-object v0
.end method

.method public L()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx5/i;->h:Ljava/lang/String;

    return-object v0
.end method

.method public M()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx5/i;->m:Ljava/lang/String;

    return-object v0
.end method

.method public N()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lx5/i;->l:Landroid/net/Uri;

    return-object v0
.end method

.method public O()Lu6/t;
    .locals 1

    iget-object v0, p0, Lx5/i;->p:Lu6/t;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lx5/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lx5/i;

    iget-object v0, p0, Lx5/i;->h:Ljava/lang/String;

    iget-object v2, p1, Lx5/i;->h:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/i;->i:Ljava/lang/String;

    iget-object v2, p1, Lx5/i;->i:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/i;->j:Ljava/lang/String;

    iget-object v2, p1, Lx5/i;->j:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/i;->k:Ljava/lang/String;

    iget-object v2, p1, Lx5/i;->k:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/i;->l:Landroid/net/Uri;

    iget-object v2, p1, Lx5/i;->l:Landroid/net/Uri;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/i;->m:Ljava/lang/String;

    iget-object v2, p1, Lx5/i;->m:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/i;->n:Ljava/lang/String;

    iget-object v2, p1, Lx5/i;->n:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/i;->o:Ljava/lang/String;

    iget-object v2, p1, Lx5/i;->o:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/i;->p:Lu6/t;

    iget-object p1, p1, Lx5/i;->p:Lu6/t;

    invoke-static {v0, p1}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lx5/i;->h:Ljava/lang/String;

    const/16 v1, 0x9

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/i;->i:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/i;->j:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/i;->k:Ljava/lang/String;

    const/4 v2, 0x3

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/i;->l:Landroid/net/Uri;

    const/4 v2, 0x4

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/i;->m:Ljava/lang/String;

    const/4 v2, 0x5

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/i;->n:Ljava/lang/String;

    const/4 v2, 0x6

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/i;->o:Ljava/lang/String;

    const/4 v2, 0x7

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/i;->p:Lu6/t;

    const/16 v2, 0x8

    aput-object v0, v1, v2

    invoke-static {v1}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public m()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lx5/i;->o:Ljava/lang/String;

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx5/i;->i:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lx5/i;->L()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lx5/i;->s()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lx5/i;->J()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lx5/i;->I()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lx5/i;->N()Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lx5/i;->M()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lx5/i;->K()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lx5/i;->m()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lx5/i;->O()Lu6/t;

    move-result-object v1

    const/16 v2, 0x9

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
