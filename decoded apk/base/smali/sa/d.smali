.class public final Lsa/d;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lqa/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lqa/c;

    sget-object v1, Lqa/a;->m:Lqa/a;

    invoke-direct {v0, v1}, Lqa/c;-><init>(Lqa/a;)V

    iput-object v0, p0, Lsa/d;->a:Lqa/c;

    return-void
.end method


# virtual methods
.method public final a([BI)V
    .locals 5

    array-length v0, p1

    new-array v1, v0, [I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    aget-byte v4, p1, v3

    and-int/lit16 v4, v4, 0xff

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lsa/d;->a:Lqa/c;

    array-length v3, p1

    sub-int/2addr v3, p2

    invoke-virtual {v0, v1, v3}, Lqa/c;->a([II)V
    :try_end_0
    .catch Lqa/d; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    if-ge v2, p2, :cond_1

    aget v0, v1, v2

    int-to-byte v0, v0

    aput-byte v0, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :catch_0
    invoke-static {}, Lia/d;->a()Lia/d;

    move-result-object p1

    throw p1
.end method

.method public b(Loa/b;)Loa/e;
    .locals 9

    new-instance v0, Lsa/a;

    invoke-direct {v0, p1}, Lsa/a;-><init>(Loa/b;)V

    invoke-virtual {v0}, Lsa/a;->b()Lsa/e;

    move-result-object p1

    invoke-virtual {v0}, Lsa/a;->c()[B

    move-result-object v0

    invoke-static {v0, p1}, Lsa/b;->b([BLsa/e;)[Lsa/b;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v4, p1, v2

    invoke-virtual {v4}, Lsa/b;->c()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-array v0, v3, [B

    array-length v2, p1

    move v3, v1

    :goto_1
    if-ge v3, v2, :cond_2

    aget-object v4, p1, v3

    invoke-virtual {v4}, Lsa/b;->a()[B

    move-result-object v5

    invoke-virtual {v4}, Lsa/b;->c()I

    move-result v4

    invoke-virtual {p0, v5, v4}, Lsa/d;->a([BI)V

    move v6, v1

    :goto_2
    if-ge v6, v4, :cond_1

    mul-int v7, v6, v2

    add-int/2addr v7, v3

    aget-byte v8, v5, v6

    aput-byte v8, v0, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v0}, Lsa/c;->a([B)Loa/e;

    move-result-object p1

    return-object p1
.end method
