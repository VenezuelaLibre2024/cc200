.class public final Ll6/b;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ll6/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:Ll6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll6/c;

    invoke-direct {v0}, Ll6/c;-><init>()V

    sput-object v0, Ll6/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILl6/a;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Ll6/b;->h:I

    iput-object p2, p0, Ll6/b;->i:Ll6/a;

    return-void
.end method

.method public constructor <init>(Ll6/a;)V
    .locals 1

    invoke-direct {p0}, Li6/a;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Ll6/b;->h:I

    iput-object p1, p0, Ll6/b;->i:Ll6/a;

    return-void
.end method

.method public static I(Lm6/a$b;)Ll6/b;
    .locals 1

    instance-of v0, p0, Ll6/a;

    if-eqz v0, :cond_0

    new-instance v0, Ll6/b;

    check-cast p0, Ll6/a;

    invoke-direct {v0, p0}, Ll6/b;-><init>(Ll6/a;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported safe parcelable field converter class."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final J()Lm6/a$b;
    .locals 2

    iget-object v0, p0, Ll6/b;->i:Ll6/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "There was no converter wrapped in this ConverterWrapper."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Ll6/b;->h:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-object v1, p0, Ll6/b;->i:Ll6/a;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
