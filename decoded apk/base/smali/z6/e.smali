.class public Lz6/e;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz6/e;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:Ljava/lang/String;


# instance fields
.field public final h:I

.field public final i:Lz6/b;

.field public final j:Ljava/lang/Float;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lz6/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lz6/e;->k:Ljava/lang/String;

    new-instance v0, Lz6/n0;

    invoke-direct {v0}, Lz6/n0;-><init>()V

    sput-object v0, Lz6/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0}, Lz6/e;-><init>(ILz6/b;Ljava/lang/Float;)V

    return-void
.end method

.method public constructor <init>(ILandroid/os/IBinder;Ljava/lang/Float;)V
    .locals 1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lr6/b$a;->c(Landroid/os/IBinder;)Lr6/b;

    move-result-object p2

    new-instance v0, Lz6/b;

    invoke-direct {v0, p2}, Lz6/b;-><init>(Lr6/b;)V

    move-object p2, v0

    :goto_0
    invoke-direct {p0, p1, p2, p3}, Lz6/e;-><init>(ILz6/b;Ljava/lang/Float;)V

    return-void
.end method

.method public constructor <init>(ILz6/b;Ljava/lang/Float;)V
    .locals 5

    invoke-direct {p0}, Li6/a;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const/4 v3, 0x3

    if-ne p1, v3, :cond_2

    if-eqz p2, :cond_1

    if-eqz v2, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    move p1, v3

    goto :goto_2

    :cond_2
    move v2, v0

    :goto_2
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    aput-object p2, v3, v0

    const/4 v0, 0x2

    aput-object p3, v3, v0

    const-string v0, "Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lh6/s;->b(ZLjava/lang/Object;)V

    iput p1, p0, Lz6/e;->h:I

    iput-object p2, p0, Lz6/e;->i:Lz6/b;

    iput-object p3, p0, Lz6/e;->j:Ljava/lang/Float;

    return-void
.end method

.method public constructor <init>(Lz6/b;F)V
    .locals 1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1, p2}, Lz6/e;-><init>(ILz6/b;Ljava/lang/Float;)V

    return-void
.end method


# virtual methods
.method public final I()Lz6/e;
    .locals 4

    iget v0, p0, Lz6/e;->h:I

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    sget-object v1, Lz6/e;->k:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown Cap type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object p0

    :cond_0
    iget-object v0, p0, Lz6/e;->i:Lz6/b;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    const-string v3, "bitmapDescriptor must not be null"

    invoke-static {v0, v3}, Lh6/s;->p(ZLjava/lang/Object;)V

    iget-object v0, p0, Lz6/e;->j:Ljava/lang/Float;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    const-string v0, "bitmapRefWidth must not be null"

    invoke-static {v1, v0}, Lh6/s;->p(ZLjava/lang/Object;)V

    iget-object v0, p0, Lz6/e;->i:Lz6/b;

    iget-object v1, p0, Lz6/e;->j:Ljava/lang/Float;

    new-instance v2, Lz6/h;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-direct {v2, v0, v1}, Lz6/h;-><init>(Lz6/b;F)V

    return-object v2

    :cond_3
    new-instance v0, Lz6/u;

    invoke-direct {v0}, Lz6/u;-><init>()V

    return-object v0

    :cond_4
    new-instance v0, Lz6/w;

    invoke-direct {v0}, Lz6/w;-><init>()V

    return-object v0

    :cond_5
    new-instance v0, Lz6/d;

    invoke-direct {v0}, Lz6/d;-><init>()V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lz6/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lz6/e;

    iget v1, p0, Lz6/e;->h:I

    iget v3, p1, Lz6/e;->h:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lz6/e;->i:Lz6/b;

    iget-object v3, p1, Lz6/e;->i:Lz6/b;

    invoke-static {v1, v3}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lz6/e;->j:Ljava/lang/Float;

    iget-object p1, p1, Lz6/e;->j:Ljava/lang/Float;

    invoke-static {v1, p1}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lz6/e;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lz6/e;->i:Lz6/b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lz6/e;->j:Ljava/lang/Float;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Cap: type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz6/e;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget p2, p0, Lz6/e;->h:I

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, p2}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-object p2, p0, Lz6/e;->i:Lz6/b;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lz6/b;->a()Lr6/b;

    move-result-object p2

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    :goto_0
    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Li6/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 p2, 0x4

    iget-object v1, p0, Lz6/e;->j:Ljava/lang/Float;

    invoke-static {p1, p2, v1, v2}, Li6/c;->s(Landroid/os/Parcel;ILjava/lang/Float;Z)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
