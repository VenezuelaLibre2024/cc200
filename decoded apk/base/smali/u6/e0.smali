.class public Lu6/e0;
.super Li6/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu6/e0$a;,
        Lu6/e0$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu6/e0;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Lu6/e0;

.field public static final k:Lu6/e0;


# instance fields
.field public final h:Lu6/e0$a;

.field public final i:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lu6/d1;

    invoke-direct {v0}, Lu6/d1;-><init>()V

    sput-object v0, Lu6/e0;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lu6/e0;

    sget-object v1, Lu6/e0$a;->j:Lu6/e0$a;

    invoke-virtual {v1}, Lu6/e0$a;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lu6/e0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lu6/e0;->j:Lu6/e0;

    new-instance v0, Lu6/e0;

    sget-object v1, Lu6/e0$a;->k:Lu6/e0$a;

    invoke-virtual {v1}, Lu6/e0$a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lu6/e0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lu6/e0;->k:Lu6/e0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-static {p1}, Lu6/e0$a;->b(Ljava/lang/String;)Lu6/e0$a;

    move-result-object p1

    iput-object p1, p0, Lu6/e0;->h:Lu6/e0$a;
    :try_end_0
    .catch Lu6/e0$b; {:try_start_0 .. :try_end_0} :catch_0

    iput-object p2, p0, Lu6/e0;->i:Ljava/lang/String;

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu6/e0;->i:Ljava/lang/String;

    return-object v0
.end method

.method public J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu6/e0;->h:Lu6/e0$a;

    invoke-virtual {v0}, Lu6/e0$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lu6/e0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lu6/e0;

    iget-object v0, p0, Lu6/e0;->h:Lu6/e0$a;

    iget-object v2, p1, Lu6/e0;->h:Lu6/e0$a;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/fido/zzal;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/e0;->i:Ljava/lang/String;

    iget-object p1, p1, Lu6/e0;->i:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/fido/zzal;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lu6/e0;->h:Lu6/e0$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/e0;->i:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lu6/e0;->J()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lu6/e0;->I()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
