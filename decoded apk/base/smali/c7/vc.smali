.class public final synthetic Lc7/vc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic h:Lc7/k6;


# direct methods
.method public synthetic constructor <init>(Lc7/k6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/vc;->h:Lc7/k6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/vc;->h:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v1

    invoke-virtual {v1}, Lc7/qc;->Q0()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    const-string v1, "registerTrigger called but app not eligible"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v1, Ljava/lang/Thread;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lc7/sc;

    invoke-direct {v2, v0}, Lc7/sc;-><init>(Lc7/w7;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method
