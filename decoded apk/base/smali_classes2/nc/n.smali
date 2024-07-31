.class public interface abstract Lnc/n;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static b(Ljava/lang/String;II)Lnc/n;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    new-instance p1, Lnc/r;

    invoke-direct {p1, p0, p2}, Lnc/r;-><init>(Ljava/lang/String;I)V

    return-object p1

    :cond_0
    new-instance v0, Lnc/p;

    invoke-direct {v0, p0, p1, p2}, Lnc/p;-><init>(Ljava/lang/String;II)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Lnc/k;)V
.end method

.method public abstract c()V
.end method

.method public d(Lnc/i;Ljava/lang/Runnable;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lnc/n$a;

    invoke-direct {v0, p0, p1}, Lnc/n$a;-><init>(Lnc/n;Lnc/i;)V

    move-object p1, v0

    :goto_0
    new-instance v0, Lnc/k;

    invoke-direct {v0, p1, p2}, Lnc/k;-><init>(Lnc/j;Ljava/lang/Runnable;)V

    invoke-interface {p0, v0}, Lnc/n;->a(Lnc/k;)V

    return-void
.end method

.method public abstract start()V
.end method
