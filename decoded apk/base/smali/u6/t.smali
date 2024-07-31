.class public Lu6/t;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu6/t;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:[B

.field public final k:Lu6/h;

.field public final l:Lu6/g;

.field public final m:Lu6/i;

.field public final n:Lu6/e;

.field public final o:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu6/u0;

    invoke-direct {v0}, Lu6/u0;-><init>()V

    sput-object v0, Lu6/t;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[BLu6/h;Lu6/g;Lu6/i;Lu6/e;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Li6/a;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p4, :cond_0

    if-nez p5, :cond_0

    if-eqz p6, :cond_3

    :cond_0
    if-nez p4, :cond_1

    if-eqz p5, :cond_1

    if-eqz p6, :cond_3

    :cond_1
    if-nez p4, :cond_2

    if-nez p5, :cond_2

    if-eqz p6, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :cond_3
    :goto_0
    invoke-static {v0}, Lh6/s;->a(Z)V

    iput-object p1, p0, Lu6/t;->h:Ljava/lang/String;

    iput-object p2, p0, Lu6/t;->i:Ljava/lang/String;

    iput-object p3, p0, Lu6/t;->j:[B

    iput-object p4, p0, Lu6/t;->k:Lu6/h;

    iput-object p5, p0, Lu6/t;->l:Lu6/g;

    iput-object p6, p0, Lu6/t;->m:Lu6/i;

    iput-object p7, p0, Lu6/t;->n:Lu6/e;

    iput-object p8, p0, Lu6/t;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu6/t;->o:Ljava/lang/String;

    return-object v0
.end method

.method public J()Lu6/e;
    .locals 1

    iget-object v0, p0, Lu6/t;->n:Lu6/e;

    return-object v0
.end method

.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu6/t;->h:Ljava/lang/String;

    return-object v0
.end method

.method public L()[B
    .locals 1

    iget-object v0, p0, Lu6/t;->j:[B

    return-object v0
.end method

.method public M()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu6/t;->i:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lu6/t;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lu6/t;

    iget-object v0, p0, Lu6/t;->h:Ljava/lang/String;

    iget-object v2, p1, Lu6/t;->h:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/t;->i:Ljava/lang/String;

    iget-object v2, p1, Lu6/t;->i:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/t;->j:[B

    iget-object v2, p1, Lu6/t;->j:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/t;->k:Lu6/h;

    iget-object v2, p1, Lu6/t;->k:Lu6/h;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/t;->l:Lu6/g;

    iget-object v2, p1, Lu6/t;->l:Lu6/g;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/t;->m:Lu6/i;

    iget-object v2, p1, Lu6/t;->m:Lu6/i;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/t;->n:Lu6/e;

    iget-object v2, p1, Lu6/t;->n:Lu6/e;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/t;->o:Ljava/lang/String;

    iget-object p1, p1, Lu6/t;->o:Ljava/lang/String;

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

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lu6/t;->h:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/t;->i:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/t;->j:[B

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/t;->l:Lu6/g;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/t;->k:Lu6/h;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/t;->m:Lu6/i;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/t;->n:Lu6/e;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/t;->o:Ljava/lang/String;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lu6/t;->K()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lu6/t;->M()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lu6/t;->L()[B

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Li6/c;->l(Landroid/os/Parcel;I[BZ)V

    iget-object v1, p0, Lu6/t;->k:Lu6/h;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lu6/t;->l:Lu6/g;

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lu6/t;->m:Lu6/i;

    const/4 v2, 0x6

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lu6/t;->J()Lu6/e;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lu6/t;->I()Ljava/lang/String;

    move-result-object p2

    const/16 v1, 0x8

    invoke-static {p1, v1, p2, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
