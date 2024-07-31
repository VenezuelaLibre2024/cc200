.class public Ldc/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ldc/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;I)V
    .locals 2

    invoke-virtual {p1}, Ljava/nio/ShortBuffer;->remaining()I

    move-result v0

    invoke-virtual {p2}, Ljava/nio/ShortBuffer;->remaining()I

    move-result v1

    if-ge v0, v1, :cond_0

    sget-object v0, Ldc/a;->c:Ldc/a;

    :goto_0
    invoke-interface {v0, p1, p2, p3}, Ldc/a;->a(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;I)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/nio/ShortBuffer;->remaining()I

    move-result v0

    invoke-virtual {p2}, Ljava/nio/ShortBuffer;->remaining()I

    move-result v1

    if-le v0, v1, :cond_1

    sget-object v0, Ldc/a;->b:Ldc/a;

    goto :goto_0

    :cond_1
    sget-object v0, Ldc/a;->a:Ldc/a;

    goto :goto_0

    :goto_1
    return-void
.end method
