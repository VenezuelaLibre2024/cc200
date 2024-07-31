.class public final Lm6/g;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lm6/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:Ljava/lang/String;

.field public final j:Lm6/a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm6/e;

    invoke-direct {v0}, Lm6/e;-><init>()V

    sput-object v0, Lm6/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lm6/a$a;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Lm6/g;->h:I

    iput-object p2, p0, Lm6/g;->i:Ljava/lang/String;

    iput-object p3, p0, Lm6/g;->j:Lm6/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lm6/a$a;)V
    .locals 1

    invoke-direct {p0}, Li6/a;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lm6/g;->h:I

    iput-object p1, p0, Lm6/g;->i:Ljava/lang/String;

    iput-object p2, p0, Lm6/g;->j:Lm6/a$a;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lm6/g;->h:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lm6/g;->i:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lm6/g;->j:Lm6/a$a;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
