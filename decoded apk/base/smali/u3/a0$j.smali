.class public final Lu3/a0$j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu3/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation


# instance fields
.field public final a:Ls3/a3;

.field public final b:Z

.field public final c:J

.field public final d:J


# direct methods
.method public constructor <init>(Ls3/a3;ZJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/a0$j;->a:Ls3/a3;

    iput-boolean p2, p0, Lu3/a0$j;->b:Z

    iput-wide p3, p0, Lu3/a0$j;->c:J

    iput-wide p5, p0, Lu3/a0$j;->d:J

    return-void
.end method

.method public synthetic constructor <init>(Ls3/a3;ZJJLu3/a0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lu3/a0$j;-><init>(Ls3/a3;ZJJ)V

    return-void
.end method
