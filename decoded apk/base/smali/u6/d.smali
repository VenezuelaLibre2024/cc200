.class public Lu6/d;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu6/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Lu6/r;

.field public final i:Lu6/b2;

.field public final j:Lu6/f0;

.field public final k:Lu6/h2;

.field public final l:Lu6/k0;

.field public final m:Lu6/m0;

.field public final n:Lu6/d2;

.field public final o:Lu6/p0;

.field public final p:Lu6/s;

.field public final q:Lu6/r0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu6/m1;

    invoke-direct {v0}, Lu6/m1;-><init>()V

    sput-object v0, Lu6/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lu6/r;Lu6/b2;Lu6/f0;Lu6/h2;Lu6/k0;Lu6/m0;Lu6/d2;Lu6/p0;Lu6/s;Lu6/r0;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-object p1, p0, Lu6/d;->h:Lu6/r;

    iput-object p3, p0, Lu6/d;->j:Lu6/f0;

    iput-object p2, p0, Lu6/d;->i:Lu6/b2;

    iput-object p4, p0, Lu6/d;->k:Lu6/h2;

    iput-object p5, p0, Lu6/d;->l:Lu6/k0;

    iput-object p6, p0, Lu6/d;->m:Lu6/m0;

    iput-object p7, p0, Lu6/d;->n:Lu6/d2;

    iput-object p8, p0, Lu6/d;->o:Lu6/p0;

    iput-object p9, p0, Lu6/d;->p:Lu6/s;

    iput-object p10, p0, Lu6/d;->q:Lu6/r0;

    return-void
.end method


# virtual methods
.method public I()Lu6/r;
    .locals 1

    iget-object v0, p0, Lu6/d;->h:Lu6/r;

    return-object v0
.end method

.method public J()Lu6/f0;
    .locals 1

    iget-object v0, p0, Lu6/d;->j:Lu6/f0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lu6/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lu6/d;

    iget-object v0, p0, Lu6/d;->h:Lu6/r;

    iget-object v2, p1, Lu6/d;->h:Lu6/r;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/d;->i:Lu6/b2;

    iget-object v2, p1, Lu6/d;->i:Lu6/b2;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/d;->j:Lu6/f0;

    iget-object v2, p1, Lu6/d;->j:Lu6/f0;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/d;->k:Lu6/h2;

    iget-object v2, p1, Lu6/d;->k:Lu6/h2;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/d;->l:Lu6/k0;

    iget-object v2, p1, Lu6/d;->l:Lu6/k0;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/d;->m:Lu6/m0;

    iget-object v2, p1, Lu6/d;->m:Lu6/m0;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/d;->n:Lu6/d2;

    iget-object v2, p1, Lu6/d;->n:Lu6/d2;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/d;->o:Lu6/p0;

    iget-object v2, p1, Lu6/d;->o:Lu6/p0;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/d;->p:Lu6/s;

    iget-object v2, p1, Lu6/d;->p:Lu6/s;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/d;->q:Lu6/r0;

    iget-object p1, p1, Lu6/d;->q:Lu6/r0;

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

    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lu6/d;->h:Lu6/r;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/d;->i:Lu6/b2;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/d;->j:Lu6/f0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/d;->k:Lu6/h2;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/d;->l:Lu6/k0;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/d;->m:Lu6/m0;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/d;->n:Lu6/d2;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/d;->o:Lu6/p0;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/d;->p:Lu6/s;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/d;->q:Lu6/r0;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lu6/d;->I()Lu6/r;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lu6/d;->i:Lu6/b2;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lu6/d;->J()Lu6/f0;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lu6/d;->k:Lu6/h2;

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lu6/d;->l:Lu6/k0;

    const/4 v2, 0x6

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lu6/d;->m:Lu6/m0;

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lu6/d;->n:Lu6/d2;

    const/16 v2, 0x8

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lu6/d;->o:Lu6/p0;

    const/16 v2, 0x9

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lu6/d;->p:Lu6/s;

    const/16 v2, 0xa

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lu6/d;->q:Lu6/r0;

    const/16 v2, 0xb

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
