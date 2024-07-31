.class public Lz5/c;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz5/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:Landroid/app/PendingIntent;

.field public final j:I

.field public final k:[B

.field public final l:I

.field public final m:Landroid/os/Bundle;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz5/e;

    invoke-direct {v0}, Lz5/e;-><init>()V

    sput-object v0, Lz5/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILandroid/app/PendingIntent;ILandroid/os/Bundle;[B)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Lz5/c;->l:I

    iput p2, p0, Lz5/c;->h:I

    iput p4, p0, Lz5/c;->j:I

    iput-object p5, p0, Lz5/c;->m:Landroid/os/Bundle;

    iput-object p6, p0, Lz5/c;->k:[B

    iput-object p3, p0, Lz5/c;->i:Landroid/app/PendingIntent;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lz5/c;->h:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lz5/c;->i:Landroid/app/PendingIntent;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget p2, p0, Lz5/c;->j:I

    const/4 v1, 0x3

    invoke-static {p1, v1, p2}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-object p2, p0, Lz5/c;->m:Landroid/os/Bundle;

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v3}, Li6/c;->j(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    iget-object p2, p0, Lz5/c;->k:[B

    const/4 v1, 0x5

    invoke-static {p1, v1, p2, v3}, Li6/c;->l(Landroid/os/Parcel;I[BZ)V

    iget p2, p0, Lz5/c;->l:I

    const/16 v1, 0x3e8

    invoke-static {p1, v1, p2}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
