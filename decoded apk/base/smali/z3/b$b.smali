.class public Lz3/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:J

.field public final synthetic b:Lz3/b;


# direct methods
.method public constructor <init>(Lz3/b;J)V
    .locals 0

    iput-object p1, p0, Lz3/b$b;->b:Lz3/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lz3/b$b;->a:J

    return-void
.end method


# virtual methods
.method public d()J
    .locals 2

    iget-wide v0, p0, Lz3/b$b;->a:J

    return-wide v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public i(J)Lx3/z$a;
    .locals 7

    iget-object v0, p0, Lz3/b$b;->b:Lz3/b;

    invoke-static {v0}, Lz3/b;->a(Lz3/b;)[Lz3/e;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2}, Lz3/e;->i(J)Lx3/z$a;

    move-result-object v0

    const/4 v1, 0x1

    :goto_0
    iget-object v2, p0, Lz3/b$b;->b:Lz3/b;

    invoke-static {v2}, Lz3/b;->a(Lz3/b;)[Lz3/e;

    move-result-object v2

    array-length v2, v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lz3/b$b;->b:Lz3/b;

    invoke-static {v2}, Lz3/b;->a(Lz3/b;)[Lz3/e;

    move-result-object v2

    aget-object v2, v2, v1

    invoke-virtual {v2, p1, p2}, Lz3/e;->i(J)Lx3/z$a;

    move-result-object v2

    iget-object v3, v2, Lx3/z$a;->a:Lx3/a0;

    iget-wide v3, v3, Lx3/a0;->b:J

    iget-object v5, v0, Lx3/z$a;->a:Lx3/a0;

    iget-wide v5, v5, Lx3/a0;->b:J

    cmp-long v3, v3, v5

    if-gez v3, :cond_0

    move-object v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method
