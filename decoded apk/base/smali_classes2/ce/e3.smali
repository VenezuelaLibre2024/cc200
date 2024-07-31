.class public final Lce/e3;
.super Lhe/h0;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        "T::TU;>",
        "Lhe/h0<",
        "TT;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final l:J


# direct methods
.method public constructor <init>(JLjd/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljd/d<",
            "-TU;>;)V"
        }
    .end annotation

    invoke-interface {p3}, Ljd/d;->getContext()Ljd/g;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Lhe/h0;-><init>(Ljd/g;Ljd/d;)V

    iput-wide p1, p0, Lce/e3;->l:J

    return-void
.end method


# virtual methods
.method public m0()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lce/a;->m0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "(timeMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lce/e3;->l:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public run()V
    .locals 3

    iget-wide v0, p0, Lce/e3;->l:J

    invoke-virtual {p0}, Lce/a;->getContext()Ljd/g;

    move-result-object v2

    invoke-static {v2}, Lce/a1;->a(Ljd/g;)Lce/z0;

    move-result-object v2

    invoke-static {v0, v1, v2, p0}, Lce/f3;->a(JLce/z0;Lce/c2;)Lce/d3;

    move-result-object v0

    invoke-virtual {p0, v0}, Lce/j2;->u(Ljava/lang/Throwable;)Z

    return-void
.end method
