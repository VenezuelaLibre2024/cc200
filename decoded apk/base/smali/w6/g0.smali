.class public final Lw6/g0;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw6/g0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:J

.field public final i:Z

.field public final j:Landroid/os/WorkSource;

.field public final k:Ljava/lang/String;

.field public final l:[I

.field public final m:Z

.field public final n:Ljava/lang/String;

.field public final o:J

.field public p:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw6/h0;

    invoke-direct {v0}, Lw6/h0;-><init>()V

    sput-object v0, Lw6/g0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JZLandroid/os/WorkSource;Ljava/lang/String;[IZLjava/lang/String;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-wide p1, p0, Lw6/g0;->h:J

    iput-boolean p3, p0, Lw6/g0;->i:Z

    iput-object p4, p0, Lw6/g0;->j:Landroid/os/WorkSource;

    iput-object p5, p0, Lw6/g0;->k:Ljava/lang/String;

    iput-object p6, p0, Lw6/g0;->l:[I

    iput-boolean p7, p0, Lw6/g0;->m:Z

    iput-object p8, p0, Lw6/g0;->n:Ljava/lang/String;

    iput-wide p9, p0, Lw6/g0;->o:J

    iput-object p11, p0, Lw6/g0;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final I(Ljava/lang/String;)Lw6/g0;
    .locals 0

    iput-object p1, p0, Lw6/g0;->p:Ljava/lang/String;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-wide v1, p0, Lw6/g0;->h:J

    const/4 v3, 0x1

    invoke-static {p1, v3, v1, v2}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-boolean v1, p0, Lw6/g0;->i:Z

    const/4 v2, 0x2

    invoke-static {p1, v2, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, Lw6/g0;->j:Landroid/os/WorkSource;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lw6/g0;->k:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object p2, p0, Lw6/g0;->l:[I

    const/4 v1, 0x5

    invoke-static {p1, v1, p2, v3}, Li6/c;->v(Landroid/os/Parcel;I[IZ)V

    iget-boolean p2, p0, Lw6/g0;->m:Z

    const/4 v1, 0x6

    invoke-static {p1, v1, p2}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-object p2, p0, Lw6/g0;->n:Ljava/lang/String;

    const/4 v1, 0x7

    invoke-static {p1, v1, p2, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-wide v1, p0, Lw6/g0;->o:J

    const/16 p2, 0x8

    invoke-static {p1, p2, v1, v2}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-object p2, p0, Lw6/g0;->p:Ljava/lang/String;

    const/16 v1, 0x9

    invoke-static {p1, v1, p2, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
