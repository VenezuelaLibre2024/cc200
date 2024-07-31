.class public final Lg0/o;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ljd/d;)Landroid/os/OutcomeReceiver;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "E:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljd/d<",
            "-TR;>;)",
            "Landroid/os/OutcomeReceiver<",
            "TR;TE;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg0/g;

    invoke-direct {v0, p0}, Lg0/g;-><init>(Ljd/d;)V

    return-object v0
.end method
