.class public interface abstract Lw3/n;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw3/n$a;
    }
.end annotation


# direct methods
.method public static g(Lw3/n;Lw3/n;)V
    .locals 1

    if-ne p0, p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1, v0}, Lw3/n;->c(Lw3/u$a;)V

    :cond_1
    if-eqz p0, :cond_2

    invoke-interface {p0, v0}, Lw3/n;->d(Lw3/u$a;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public abstract a()Lw3/n$a;
.end method

.method public abstract b()Ljava/util/UUID;
.end method

.method public abstract c(Lw3/u$a;)V
.end method

.method public abstract d(Lw3/u$a;)V
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract f()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getState()I
.end method

.method public abstract h(Ljava/lang/String;)Z
.end method

.method public abstract i()Lv3/b;
.end method
