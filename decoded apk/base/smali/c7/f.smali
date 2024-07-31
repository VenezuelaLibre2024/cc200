.class public final Lc7/f;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc7/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Lc7/lc;

.field public k:J

.field public l:Z

.field public m:Ljava/lang/String;

.field public n:Lc7/g0;

.field public o:J

.field public p:Lc7/g0;

.field public q:J

.field public r:Lc7/g0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc7/e;

    invoke-direct {v0}, Lc7/e;-><init>()V

    sput-object v0, Lc7/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lc7/f;)V
    .locals 2

    invoke-direct {p0}, Li6/a;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lc7/f;->h:Ljava/lang/String;

    iput-object v0, p0, Lc7/f;->h:Ljava/lang/String;

    iget-object v0, p1, Lc7/f;->i:Ljava/lang/String;

    iput-object v0, p0, Lc7/f;->i:Ljava/lang/String;

    iget-object v0, p1, Lc7/f;->j:Lc7/lc;

    iput-object v0, p0, Lc7/f;->j:Lc7/lc;

    iget-wide v0, p1, Lc7/f;->k:J

    iput-wide v0, p0, Lc7/f;->k:J

    iget-boolean v0, p1, Lc7/f;->l:Z

    iput-boolean v0, p0, Lc7/f;->l:Z

    iget-object v0, p1, Lc7/f;->m:Ljava/lang/String;

    iput-object v0, p0, Lc7/f;->m:Ljava/lang/String;

    iget-object v0, p1, Lc7/f;->n:Lc7/g0;

    iput-object v0, p0, Lc7/f;->n:Lc7/g0;

    iget-wide v0, p1, Lc7/f;->o:J

    iput-wide v0, p0, Lc7/f;->o:J

    iget-object v0, p1, Lc7/f;->p:Lc7/g0;

    iput-object v0, p0, Lc7/f;->p:Lc7/g0;

    iget-wide v0, p1, Lc7/f;->q:J

    iput-wide v0, p0, Lc7/f;->q:J

    iget-object p1, p1, Lc7/f;->r:Lc7/g0;

    iput-object p1, p0, Lc7/f;->r:Lc7/g0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lc7/lc;JZLjava/lang/String;Lc7/g0;JLc7/g0;JLc7/g0;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-object p1, p0, Lc7/f;->h:Ljava/lang/String;

    iput-object p2, p0, Lc7/f;->i:Ljava/lang/String;

    iput-object p3, p0, Lc7/f;->j:Lc7/lc;

    iput-wide p4, p0, Lc7/f;->k:J

    iput-boolean p6, p0, Lc7/f;->l:Z

    iput-object p7, p0, Lc7/f;->m:Ljava/lang/String;

    iput-object p8, p0, Lc7/f;->n:Lc7/g0;

    iput-wide p9, p0, Lc7/f;->o:J

    iput-object p11, p0, Lc7/f;->p:Lc7/g0;

    iput-wide p12, p0, Lc7/f;->q:J

    iput-object p14, p0, Lc7/f;->r:Lc7/g0;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lc7/f;->h:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lc7/f;->i:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lc7/f;->j:Lc7/lc;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-wide v1, p0, Lc7/f;->k:J

    const/4 v4, 0x5

    invoke-static {p1, v4, v1, v2}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-boolean v1, p0, Lc7/f;->l:Z

    const/4 v2, 0x6

    invoke-static {p1, v2, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, Lc7/f;->m:Ljava/lang/String;

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lc7/f;->n:Lc7/g0;

    const/16 v2, 0x8

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-wide v1, p0, Lc7/f;->o:J

    const/16 v4, 0x9

    invoke-static {p1, v4, v1, v2}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-object v1, p0, Lc7/f;->p:Lc7/g0;

    const/16 v2, 0xa

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-wide v1, p0, Lc7/f;->q:J

    const/16 v4, 0xb

    invoke-static {p1, v4, v1, v2}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-object v1, p0, Lc7/f;->r:Lc7/g0;

    const/16 v2, 0xc

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
