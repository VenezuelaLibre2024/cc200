.class public Lz6/x;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz6/x;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Lz6/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/z0;

    invoke-direct {v0}, Lz6/z0;-><init>()V

    sput-object v0, Lz6/x;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Li6/a;-><init>()V

    new-instance v0, Lz6/b;

    invoke-static {p1}, Lr6/b$a;->c(Landroid/os/IBinder;)Lr6/b;

    move-result-object p1

    invoke-direct {v0, p1}, Lz6/b;-><init>(Lr6/b;)V

    iput-object v0, p0, Lz6/x;->h:Lz6/b;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, Lz6/x;->h:Lz6/b;

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p2}, Lz6/b;->a()Lr6/b;

    move-result-object p2

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Li6/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
