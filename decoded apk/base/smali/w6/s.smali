.class public final Lw6/s;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw6/s;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw6/y;

    invoke-direct {v0}, Lw6/y;-><init>()V

    sput-object v0, Lw6/s;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-boolean p1, p0, Lw6/s;->h:Z

    iput-boolean p2, p0, Lw6/s;->i:Z

    iput-boolean p3, p0, Lw6/s;->j:Z

    iput-boolean p4, p0, Lw6/s;->k:Z

    iput-boolean p5, p0, Lw6/s;->l:Z

    iput-boolean p6, p0, Lw6/s;->m:Z

    return-void
.end method


# virtual methods
.method public I()Z
    .locals 1

    iget-boolean v0, p0, Lw6/s;->m:Z

    return v0
.end method

.method public J()Z
    .locals 1

    iget-boolean v0, p0, Lw6/s;->j:Z

    return v0
.end method

.method public K()Z
    .locals 1

    iget-boolean v0, p0, Lw6/s;->k:Z

    return v0
.end method

.method public L()Z
    .locals 1

    iget-boolean v0, p0, Lw6/s;->h:Z

    return v0
.end method

.method public M()Z
    .locals 1

    iget-boolean v0, p0, Lw6/s;->l:Z

    return v0
.end method

.method public N()Z
    .locals 1

    iget-boolean v0, p0, Lw6/s;->i:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lw6/s;->L()Z

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw6/s;->N()Z

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw6/s;->J()Z

    move-result v0

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw6/s;->K()Z

    move-result v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw6/s;->M()Z

    move-result v0

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw6/s;->I()Z

    move-result v0

    const/4 v1, 0x6

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
