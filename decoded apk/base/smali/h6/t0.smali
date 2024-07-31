.class public final Lh6/t0;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh6/t0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:Landroid/os/IBinder;

.field public final j:Le6/b;

.field public final k:Z

.field public final l:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh6/u0;

    invoke-direct {v0}, Lh6/u0;-><init>()V

    sput-object v0, Lh6/t0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILandroid/os/IBinder;Le6/b;ZZ)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Lh6/t0;->h:I

    iput-object p2, p0, Lh6/t0;->i:Landroid/os/IBinder;

    iput-object p3, p0, Lh6/t0;->j:Le6/b;

    iput-boolean p4, p0, Lh6/t0;->k:Z

    iput-boolean p5, p0, Lh6/t0;->l:Z

    return-void
.end method


# virtual methods
.method public final I()Le6/b;
    .locals 1

    iget-object v0, p0, Lh6/t0;->j:Le6/b;

    return-object v0
.end method

.method public final J()Lh6/k;
    .locals 1

    iget-object v0, p0, Lh6/t0;->i:Landroid/os/IBinder;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Lh6/k$a;->c(Landroid/os/IBinder;)Lh6/k;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-ne p0, p1, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, Lh6/t0;

    if-nez v2, :cond_2

    return v0

    :cond_2
    check-cast p1, Lh6/t0;

    iget-object v2, p0, Lh6/t0;->j:Le6/b;

    iget-object v3, p1, Lh6/t0;->j:Le6/b;

    invoke-virtual {v2, v3}, Le6/b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lh6/t0;->J()Lh6/k;

    move-result-object v2

    invoke-virtual {p1}, Lh6/t0;->J()Lh6/k;

    move-result-object p1

    invoke-static {v2, p1}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lh6/t0;->h:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lh6/t0;->i:Landroid/os/IBinder;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object v1, p0, Lh6/t0;->j:Le6/b;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-boolean p2, p0, Lh6/t0;->k:Z

    const/4 v1, 0x4

    invoke-static {p1, v1, p2}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-boolean p2, p0, Lh6/t0;->l:Z

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
