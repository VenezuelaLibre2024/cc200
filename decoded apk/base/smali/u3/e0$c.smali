.class public final Lu3/e0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/t$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu3/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lu3/e0;


# direct methods
.method public constructor <init>(Lu3/e0;)V
    .locals 0

    iput-object p1, p0, Lu3/e0$c;->a:Lu3/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lu3/e0;Lu3/e0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lu3/e0$c;-><init>(Lu3/e0;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio sink error"

    invoke-static {v0, v1, p1}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lu3/e0$c;->a:Lu3/e0;

    invoke-static {v0}, Lu3/e0;->z1(Lu3/e0;)Lu3/s$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu3/s$a;->l(Ljava/lang/Exception;)V

    return-void
.end method

.method public b(J)V
    .locals 1

    iget-object v0, p0, Lu3/e0$c;->a:Lu3/e0;

    invoke-static {v0}, Lu3/e0;->z1(Lu3/e0;)Lu3/s$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lu3/s$a;->B(J)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lu3/e0$c;->a:Lu3/e0;

    invoke-static {v0}, Lu3/e0;->A1(Lu3/e0;)Ls3/i3$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/e0$c;->a:Lu3/e0;

    invoke-static {v0}, Lu3/e0;->A1(Lu3/e0;)Ls3/i3$a;

    move-result-object v0

    invoke-interface {v0}, Ls3/i3$a;->a()V

    :cond_0
    return-void
.end method

.method public d(IJJ)V
    .locals 7

    iget-object v0, p0, Lu3/e0$c;->a:Lu3/e0;

    invoke-static {v0}, Lu3/e0;->z1(Lu3/e0;)Lu3/s$a;

    move-result-object v1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lu3/s$a;->D(IJJ)V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lu3/e0$c;->a:Lu3/e0;

    invoke-virtual {v0}, Lu3/e0;->H1()V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lu3/e0$c;->a:Lu3/e0;

    invoke-static {v0}, Lu3/e0;->A1(Lu3/e0;)Ls3/i3$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/e0$c;->a:Lu3/e0;

    invoke-static {v0}, Lu3/e0;->A1(Lu3/e0;)Ls3/i3$a;

    move-result-object v0

    invoke-interface {v0}, Ls3/i3$a;->b()V

    :cond_0
    return-void
.end method

.method public onSkipSilenceEnabledChanged(Z)V
    .locals 1

    iget-object v0, p0, Lu3/e0$c;->a:Lu3/e0;

    invoke-static {v0}, Lu3/e0;->z1(Lu3/e0;)Lu3/s$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu3/s$a;->C(Z)V

    return-void
.end method
