.class public abstract Lza/f;
.super Lza/i;
.source ""


# direct methods
.method public constructor <init>(Loa/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lza/i;-><init>(Loa/a;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lza/j;->c()Loa/a;

    move-result-object v0

    invoke-virtual {v0}, Loa/a;->i()I

    move-result v0

    const/16 v1, 0x3c

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, Lza/h;->f(Ljava/lang/StringBuilder;I)V

    const/16 v1, 0x2d

    const/16 v2, 0xf

    invoke-virtual {p0, v0, v1, v2}, Lza/i;->j(Ljava/lang/StringBuilder;II)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object v0

    throw v0
.end method
