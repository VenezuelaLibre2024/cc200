.class public final Lg3/d;
.super Lg3/p;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg3/d$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[B

.field public final c:Ld3/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;[BLd3/e;)V
    .locals 0

    invoke-direct {p0}, Lg3/p;-><init>()V

    iput-object p1, p0, Lg3/d;->a:Ljava/lang/String;

    iput-object p2, p0, Lg3/d;->b:[B

    iput-object p3, p0, Lg3/d;->c:Ld3/e;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;[BLd3/e;Lg3/d$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lg3/d;-><init>(Ljava/lang/String;[BLd3/e;)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg3/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()[B
    .locals 1

    iget-object v0, p0, Lg3/d;->b:[B

    return-object v0
.end method

.method public d()Ld3/e;
    .locals 1

    iget-object v0, p0, Lg3/d;->c:Ld3/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lg3/p;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p1, Lg3/p;

    iget-object v1, p0, Lg3/d;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lg3/p;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lg3/d;->b:[B

    instance-of v3, p1, Lg3/d;

    if-eqz v3, :cond_1

    move-object v3, p1

    check-cast v3, Lg3/d;

    iget-object v3, v3, Lg3/d;->b:[B

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lg3/p;->c()[B

    move-result-object v3

    :goto_0
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lg3/d;->c:Ld3/e;

    invoke-virtual {p1}, Lg3/p;->d()Ld3/e;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    return v0

    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lg3/d;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lg3/d;->b:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lg3/d;->c:Ld3/e;

    invoke-virtual {v1}, Ljava/lang/Enum;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
