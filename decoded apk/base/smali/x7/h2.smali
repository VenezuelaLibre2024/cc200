.class public final Lx7/h2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw7/i;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lx7/h2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public h:Lx7/i;

.field public i:Lx7/f2;

.field public j:Lw7/z1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx7/g2;

    invoke-direct {v0}, Lx7/g2;-><init>()V

    sput-object v0, Lx7/h2;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lx7/i;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/i;

    iput-object v0, p0, Lx7/h2;->h:Lx7/i;

    invoke-virtual {v0}, Lx7/i;->q0()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, Lx7/h2;->i:Lx7/f2;

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx7/e;

    invoke-virtual {v2}, Lx7/e;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Lx7/f2;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx7/e;

    invoke-virtual {v3}, Lx7/e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx7/e;

    invoke-virtual {v4}, Lx7/e;->zza()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lx7/i;->r0()Z

    move-result v5

    invoke-direct {v2, v3, v4, v5}, Lx7/f2;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v2, p0, Lx7/h2;->i:Lx7/f2;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lx7/h2;->i:Lx7/f2;

    if-nez v0, :cond_2

    new-instance v0, Lx7/f2;

    invoke-virtual {p1}, Lx7/i;->r0()Z

    move-result v1

    invoke-direct {v0, v1}, Lx7/f2;-><init>(Z)V

    iput-object v0, p0, Lx7/h2;->i:Lx7/f2;

    :cond_2
    invoke-virtual {p1}, Lx7/i;->p0()Lw7/z1;

    move-result-object p1

    iput-object p1, p0, Lx7/h2;->j:Lw7/z1;

    return-void
.end method

.method public constructor <init>(Lx7/i;Lx7/f2;Lw7/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/h2;->h:Lx7/i;

    iput-object p2, p0, Lx7/h2;->i:Lx7/f2;

    iput-object p3, p0, Lx7/h2;->j:Lw7/z1;

    return-void
.end method


# virtual methods
.method public final B()Lw7/a0;
    .locals 1

    iget-object v0, p0, Lx7/h2;->h:Lx7/i;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final v()Lw7/g;
    .locals 1

    iget-object v0, p0, Lx7/h2;->i:Lx7/f2;

    return-object v0
.end method

.method public final w()Lw7/h;
    .locals 1

    iget-object v0, p0, Lx7/h2;->j:Lw7/z1;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lx7/h2;->B()Lw7/a0;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lx7/h2;->v()Lw7/g;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lx7/h2;->j:Lw7/z1;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
