.class public final Ls3/w0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Ls3/w0;Z)Lt3/s1;
    .locals 0

    invoke-static {p0}, Lt3/q1;->A0(Landroid/content/Context;)Lt3/q1;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, "ExoPlayerImpl"

    const-string p1, "MediaMetricsService unavailable."

    invoke-static {p0, p1}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Lt3/s1;

    sget-object p1, Landroid/media/metrics/LogSessionId;->LOG_SESSION_ID_NONE:Landroid/media/metrics/LogSessionId;

    invoke-direct {p0, p1}, Lt3/s1;-><init>(Landroid/media/metrics/LogSessionId;)V

    return-object p0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p1, p0}, Ls3/w0;->P0(Lt3/b;)V

    :cond_1
    new-instance p1, Lt3/s1;

    invoke-virtual {p0}, Lt3/q1;->H0()Landroid/media/metrics/LogSessionId;

    move-result-object p0

    invoke-direct {p1, p0}, Lt3/s1;-><init>(Landroid/media/metrics/LogSessionId;)V

    return-object p1
.end method
