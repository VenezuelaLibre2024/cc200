.class public Lo5/y;
.super Lo5/k;
.source ""


# instance fields
.field public final i:Lo5/n;

.field public final j:I


# direct methods
.method public constructor <init>(Ljava/io/IOException;Lo5/n;II)V
    .locals 0

    invoke-static {p3, p4}, Lo5/y;->b(II)I

    move-result p3

    invoke-direct {p0, p1, p3}, Lo5/k;-><init>(Ljava/lang/Throwable;I)V

    iput-object p2, p0, Lo5/y;->i:Lo5/n;

    iput p4, p0, Lo5/y;->j:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/IOException;Lo5/n;II)V
    .locals 0

    invoke-static {p4, p5}, Lo5/y;->b(II)I

    move-result p4

    invoke-direct {p0, p1, p2, p4}, Lo5/k;-><init>(Ljava/lang/String;Ljava/lang/Throwable;I)V

    iput-object p3, p0, Lo5/y;->i:Lo5/n;

    iput p5, p0, Lo5/y;->j:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lo5/n;II)V
    .locals 0

    invoke-static {p3, p4}, Lo5/y;->b(II)I

    move-result p3

    invoke-direct {p0, p1, p3}, Lo5/k;-><init>(Ljava/lang/String;I)V

    iput-object p2, p0, Lo5/y;->i:Lo5/n;

    iput p4, p0, Lo5/y;->j:I

    return-void
.end method

.method public constructor <init>(Lo5/n;II)V
    .locals 0

    invoke-static {p2, p3}, Lo5/y;->b(II)I

    move-result p2

    invoke-direct {p0, p2}, Lo5/k;-><init>(I)V

    iput-object p1, p0, Lo5/y;->i:Lo5/n;

    iput p3, p0, Lo5/y;->j:I

    return-void
.end method

.method public static b(II)I
    .locals 1

    const/16 v0, 0x7d0

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/16 p0, 0x7d1

    :cond_0
    return p0
.end method

.method public static c(Ljava/io/IOException;Lo5/n;I)Lo5/y;
    .locals 3

    invoke-virtual {p0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    instance-of v1, p0, Ljava/net/SocketTimeoutException;

    const/16 v2, 0x7d7

    if-eqz v1, :cond_0

    const/16 v0, 0x7d2

    goto :goto_0

    :cond_0
    instance-of v1, p0, Ljava/io/InterruptedIOException;

    if-eqz v1, :cond_1

    const/16 v0, 0x3ec

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    invoke-static {v0}, Lh7/c;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "cleartext.*not permitted.*"

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    const/16 v0, 0x7d1

    :goto_0
    if-ne v0, v2, :cond_3

    new-instance p2, Lo5/x;

    invoke-direct {p2, p0, p1}, Lo5/x;-><init>(Ljava/io/IOException;Lo5/n;)V

    goto :goto_1

    :cond_3
    new-instance v1, Lo5/y;

    invoke-direct {v1, p0, p1, v0, p2}, Lo5/y;-><init>(Ljava/io/IOException;Lo5/n;II)V

    move-object p2, v1

    :goto_1
    return-object p2
.end method
