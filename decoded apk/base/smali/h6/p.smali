.class public Lh6/p;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh6/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:J

.field public final l:J

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:I

.field public final p:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh6/m0;

    invoke-direct {v0}, Lh6/m0;-><init>()V

    sput-object v0, Lh6/p;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Lh6/p;->h:I

    iput p2, p0, Lh6/p;->i:I

    iput p3, p0, Lh6/p;->j:I

    iput-wide p4, p0, Lh6/p;->k:J

    iput-wide p6, p0, Lh6/p;->l:J

    iput-object p8, p0, Lh6/p;->m:Ljava/lang/String;

    iput-object p9, p0, Lh6/p;->n:Ljava/lang/String;

    iput p10, p0, Lh6/p;->o:I

    iput p11, p0, Lh6/p;->p:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lh6/p;->h:I

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget v0, p0, Lh6/p;->i:I

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget v0, p0, Lh6/p;->j:I

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-wide v0, p0, Lh6/p;->k:J

    const/4 v2, 0x4

    invoke-static {p1, v2, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-wide v0, p0, Lh6/p;->l:J

    const/4 v2, 0x5

    invoke-static {p1, v2, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-object v0, p0, Lh6/p;->m:Ljava/lang/String;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lh6/p;->n:Ljava/lang/String;

    const/4 v1, 0x7

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget v0, p0, Lh6/p;->o:I

    const/16 v1, 0x8

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget v0, p0, Lh6/p;->p:I

    const/16 v1, 0x9

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
