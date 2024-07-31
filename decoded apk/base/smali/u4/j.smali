.class public final Lu4/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/t$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu4/j$a;
    }
.end annotation


# instance fields
.field public final a:Lu4/j$a;

.field public b:Lo5/j$a;

.field public c:J

.field public d:J

.field public e:J

.field public f:F

.field public g:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Lx3/p;)V
    .locals 1

    new-instance v0, Lo5/r$a;

    invoke-direct {v0, p1}, Lo5/r$a;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Lu4/j;-><init>(Lo5/j$a;Lx3/p;)V

    return-void
.end method

.method public constructor <init>(Lo5/j$a;Lx3/p;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/j;->b:Lo5/j$a;

    new-instance v0, Lu4/j$a;

    invoke-direct {v0, p2}, Lu4/j$a;-><init>(Lx3/p;)V

    iput-object v0, p0, Lu4/j;->a:Lu4/j$a;

    invoke-virtual {v0, p1}, Lu4/j$a;->a(Lo5/j$a;)V

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lu4/j;->c:J

    iput-wide p1, p0, Lu4/j;->d:J

    iput-wide p1, p0, Lu4/j;->e:J

    const p1, -0x800001

    iput p1, p0, Lu4/j;->f:F

    iput p1, p0, Lu4/j;->g:F

    return-void
.end method
