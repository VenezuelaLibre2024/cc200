.class public final Le6/c0;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Le6/c0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Z

.field public final k:Landroid/content/Context;

.field public final l:Z

.field public final m:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le6/d0;

    invoke-direct {v0}, Le6/d0;-><init>()V

    sput-object v0, Le6/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLandroid/os/IBinder;ZZ)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-object p1, p0, Le6/c0;->h:Ljava/lang/String;

    iput-boolean p2, p0, Le6/c0;->i:Z

    iput-boolean p3, p0, Le6/c0;->j:Z

    invoke-static {p4}, Lr6/b$a;->c(Landroid/os/IBinder;)Lr6/b;

    move-result-object p1

    invoke-static {p1}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Le6/c0;->k:Landroid/content/Context;

    iput-boolean p5, p0, Le6/c0;->l:Z

    iput-boolean p6, p0, Le6/c0;->m:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, Le6/c0;->h:Ljava/lang/String;

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-boolean p2, p0, Le6/c0;->i:Z

    const/4 v1, 0x2

    invoke-static {p1, v1, p2}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-boolean p2, p0, Le6/c0;->j:Z

    const/4 v1, 0x3

    invoke-static {p1, v1, p2}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-object p2, p0, Le6/c0;->k:Landroid/content/Context;

    invoke-static {p2}, Lr6/d;->g(Ljava/lang/Object;)Lr6/b;

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v2}, Li6/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-boolean p2, p0, Le6/c0;->l:Z

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-boolean p2, p0, Le6/c0;->m:Z

    const/4 v1, 0x6

    invoke-static {p1, v1, p2}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
