.class public Lw6/k;
.super Li6/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw6/k$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw6/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/util/List;

.field public final i:I

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw6/n0;

    invoke-direct {v0}, Lw6/n0;-><init>()V

    sput-object v0, Lw6/k;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-object p1, p0, Lw6/k;->h:Ljava/util/List;

    iput p2, p0, Lw6/k;->i:I

    iput-object p3, p0, Lw6/k;->j:Ljava/lang/String;

    iput-object p4, p0, Lw6/k;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public I()I
    .locals 1

    iget v0, p0, Lw6/k;->i:I

    return v0
.end method

.method public final J(Ljava/lang/String;)Lw6/k;
    .locals 4

    new-instance v0, Lw6/k;

    iget-object v1, p0, Lw6/k;->h:Ljava/util/List;

    iget v2, p0, Lw6/k;->i:I

    iget-object v3, p0, Lw6/k;->j:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p1}, Lw6/k;-><init>(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GeofencingRequest[geofences="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw6/k;->h:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", initialTrigger="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lw6/k;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw6/k;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", attributionTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw6/k;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lw6/k;->h:Ljava/util/List;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-virtual {p0}, Lw6/k;->I()I

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lw6/k;->j:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lw6/k;->k:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
