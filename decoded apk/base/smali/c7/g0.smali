.class public final Lc7/g0;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc7/g0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Lc7/a0;

.field public final j:Ljava/lang/String;

.field public final k:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc7/f0;

    invoke-direct {v0}, Lc7/f0;-><init>()V

    sput-object v0, Lc7/g0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lc7/g0;J)V
    .locals 1

    invoke-direct {p0}, Li6/a;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lc7/g0;->h:Ljava/lang/String;

    iput-object v0, p0, Lc7/g0;->h:Ljava/lang/String;

    iget-object v0, p1, Lc7/g0;->i:Lc7/a0;

    iput-object v0, p0, Lc7/g0;->i:Lc7/a0;

    iget-object p1, p1, Lc7/g0;->j:Ljava/lang/String;

    iput-object p1, p0, Lc7/g0;->j:Ljava/lang/String;

    iput-wide p2, p0, Lc7/g0;->k:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lc7/a0;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-object p1, p0, Lc7/g0;->h:Ljava/lang/String;

    iput-object p2, p0, Lc7/g0;->i:Lc7/a0;

    iput-object p3, p0, Lc7/g0;->j:Ljava/lang/String;

    iput-wide p4, p0, Lc7/g0;->k:J

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lc7/g0;->j:Ljava/lang/String;

    iget-object v1, p0, Lc7/g0;->h:Ljava/lang/String;

    iget-object v2, p0, Lc7/g0;->i:Lc7/a0;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "origin="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",name="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",params="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lc7/g0;->h:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lc7/g0;->i:Lc7/a0;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lc7/g0;->j:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-wide v1, p0, Lc7/g0;->k:J

    const/4 p2, 0x5

    invoke-static {p1, p2, v1, v2}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
