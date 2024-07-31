.class public final Lce/p1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a()Lce/m1;
    .locals 2

    new-instance v0, Lce/h;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-direct {v0, v1}, Lce/h;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method
