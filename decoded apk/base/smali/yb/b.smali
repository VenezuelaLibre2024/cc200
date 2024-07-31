.class public Lyb/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lyb/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ShortBuffer;ILjava/nio/ShortBuffer;II)V
    .locals 8

    if-ge p2, p4, :cond_0

    sget-object v0, Lyb/a;->b:Lyb/a;

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lyb/a;->a(Ljava/nio/ShortBuffer;ILjava/nio/ShortBuffer;II)V

    goto :goto_0

    :cond_0
    if-le p2, p4, :cond_1

    sget-object v1, Lyb/a;->a:Lyb/a;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v1 .. v6}, Lyb/a;->a(Ljava/nio/ShortBuffer;ILjava/nio/ShortBuffer;II)V

    goto :goto_0

    :cond_1
    sget-object v2, Lyb/a;->c:Lyb/a;

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-interface/range {v2 .. v7}, Lyb/a;->a(Ljava/nio/ShortBuffer;ILjava/nio/ShortBuffer;II)V

    :goto_0
    return-void
.end method
