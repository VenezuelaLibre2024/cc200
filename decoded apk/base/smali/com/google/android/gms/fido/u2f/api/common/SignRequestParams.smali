.class public Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;
.super Lcom/google/android/gms/fido/u2f/api/common/RequestParams;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/lang/Integer;

.field public final i:Ljava/lang/Double;

.field public final j:Landroid/net/Uri;

.field public final k:[B

.field public final l:Ljava/util/List;

.field public final m:Lv6/a;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv6/m;

    invoke-direct {v0}, Lv6/m;-><init>()V

    sput-object v0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Double;Landroid/net/Uri;[BLjava/util/List;Lv6/a;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/fido/u2f/api/common/RequestParams;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->h:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->i:Ljava/lang/Double;

    iput-object p3, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->j:Landroid/net/Uri;

    iput-object p4, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->k:[B

    const/4 p1, 0x0

    const/4 p2, 0x1

    if-eqz p5, :cond_0

    invoke-interface {p5}, Ljava/util/List;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_0

    move p4, p2

    goto :goto_0

    :cond_0
    move p4, p1

    :goto_0
    const-string v0, "registeredKeys must not be null or empty"

    invoke-static {p4, v0}, Lh6/s;->b(ZLjava/lang/Object;)V

    iput-object p5, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->l:Ljava/util/List;

    iput-object p6, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->m:Lv6/a;

    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    if-eqz p3, :cond_1

    invoke-interface {p4, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :cond_2
    :goto_1
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_5

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lv6/e;

    invoke-virtual {p6}, Lv6/e;->I()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    if-eqz p3, :cond_3

    goto :goto_2

    :cond_3
    move v0, p1

    goto :goto_3

    :cond_4
    :goto_2
    move v0, p2

    :goto_3
    const-string v1, "registered key has null appId and no request appId is provided"

    invoke-static {v0, v1}, Lh6/s;->b(ZLjava/lang/Object;)V

    invoke-virtual {p6}, Lv6/e;->J()Ljava/lang/String;

    move-result-object v0

    const-string v0, "register request has null challenge and no default challenge isprovided"

    invoke-static {p2, v0}, Lh6/s;->b(ZLjava/lang/Object;)V

    invoke-virtual {p6}, Lv6/e;->I()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p6}, Lv6/e;->I()Ljava/lang/String;

    move-result-object p6

    invoke-static {p6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p6

    invoke-interface {p4, p6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    iput-object p4, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->o:Ljava/util/Set;

    if-eqz p7, :cond_6

    invoke-virtual {p7}, Ljava/lang/String;->length()I

    move-result p3

    const/16 p4, 0x50

    if-gt p3, p4, :cond_7

    :cond_6
    move p1, p2

    :cond_7
    const-string p2, "Display Hint cannot be longer than 80 characters"

    invoke-static {p1, p2}, Lh6/s;->b(ZLjava/lang/Object;)V

    iput-object p7, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->n:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public I()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->j:Landroid/net/Uri;

    return-object v0
.end method

.method public J()Lv6/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->m:Lv6/a;

    return-object v0
.end method

.method public K()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->k:[B

    return-object v0
.end method

.method public L()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->n:Ljava/lang/String;

    return-object v0
.end method

.method public M()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lv6/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->l:Ljava/util/List;

    return-object v0
.end method

.method public N()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method public O()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->i:Ljava/lang/Double;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->h:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->h:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->i:Ljava/lang/Double;

    iget-object v3, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->i:Ljava/lang/Double;

    invoke-static {v1, v3}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->j:Landroid/net/Uri;

    iget-object v3, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->j:Landroid/net/Uri;

    invoke-static {v1, v3}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->k:[B

    iget-object v3, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->k:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->l:Ljava/util/List;

    iget-object v3, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->l:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->l:Ljava/util/List;

    iget-object v3, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->l:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->m:Lv6/a;

    iget-object v3, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->m:Lv6/a;

    invoke-static {v1, v3}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->n:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->n:Ljava/lang/String;

    invoke-static {v1, p1}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->h:Ljava/lang/Integer;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->j:Landroid/net/Uri;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->i:Ljava/lang/Double;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->l:Ljava/util/List;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->m:Lv6/a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->n:Ljava/lang/String;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->k:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->N()Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->w(Landroid/os/Parcel;ILjava/lang/Integer;Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->O()Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Li6/c;->p(Landroid/os/Parcel;ILjava/lang/Double;Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->I()Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->K()[B

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, v3}, Li6/c;->l(Landroid/os/Parcel;I[BZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->M()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {p1, v2, v1, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->J()Lv6/a;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;->L()Ljava/lang/String;

    move-result-object p2

    const/16 v1, 0x8

    invoke-static {p1, v1, p2, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
