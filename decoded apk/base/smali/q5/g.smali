.class public Lq5/g;
.super Lj4/m;
.source ""


# instance fields
.field public final j:I

.field public final k:Z


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Lj4/n;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj4/m;-><init>(Ljava/lang/Throwable;Lj4/n;)V

    invoke-static {p3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lq5/g;->j:I

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/view/Surface;->isValid()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Lq5/g;->k:Z

    return-void
.end method