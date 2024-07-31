.class public abstract Lb4/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb4/e$a;
    }
.end annotation


# instance fields
.field public final a:Lx3/b0;


# direct methods
.method public constructor <init>(Lx3/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/e;->a:Lx3/b0;

    return-void
.end method


# virtual methods
.method public final a(Lp5/a0;J)Z
    .locals 1

    invoke-virtual {p0, p1}, Lb4/e;->b(Lp5/a0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lb4/e;->c(Lp5/a0;J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public abstract b(Lp5/a0;)Z
.end method

.method public abstract c(Lp5/a0;J)Z
.end method
