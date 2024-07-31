.class public final Lp5/e0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/e0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo5/e0$b<",
        "Lo5/e0$e;",
        ">;"
    }
.end annotation


# instance fields
.field public final h:Lp5/e0$b;


# direct methods
.method public constructor <init>(Lp5/e0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/e0$c;->h:Lp5/e0$b;

    return-void
.end method


# virtual methods
.method public k(Lo5/e0$e;JJLjava/io/IOException;I)Lo5/e0$c;
    .locals 0

    iget-object p1, p0, Lp5/e0$c;->h:Lp5/e0$b;

    if-eqz p1, :cond_0

    invoke-interface {p1, p6}, Lp5/e0$b;->a(Ljava/io/IOException;)V

    :cond_0
    sget-object p1, Lo5/e0;->f:Lo5/e0$c;

    return-object p1
.end method

.method public o(Lo5/e0$e;JJ)V
    .locals 0

    iget-object p1, p0, Lp5/e0$c;->h:Lp5/e0$b;

    if-eqz p1, :cond_1

    invoke-static {}, Lp5/e0;->k()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lp5/e0$c;->h:Lp5/e0$b;

    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/util/ConcurrentModificationException;

    invoke-direct {p3}, Ljava/util/ConcurrentModificationException;-><init>()V

    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p1, p2}, Lp5/e0$b;->a(Ljava/io/IOException;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lp5/e0$c;->h:Lp5/e0$b;

    invoke-interface {p1}, Lp5/e0$b;->b()V

    :cond_1
    :goto_0
    return-void
.end method

.method public r(Lo5/e0$e;JJZ)V
    .locals 0

    return-void
.end method
