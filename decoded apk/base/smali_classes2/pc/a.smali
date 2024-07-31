.class public abstract Lpc/a;
.super Lpc/b;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lpc/b;-><init>()V

    return-void
.end method


# virtual methods
.method public error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lpc/a;->m()Lpc/f;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lpc/f;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public abstract m()Lpc/f;
.end method

.method public success(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lpc/a;->m()Lpc/f;

    move-result-object v0

    invoke-interface {v0, p1}, Lpc/f;->success(Ljava/lang/Object;)V

    return-void
.end method
