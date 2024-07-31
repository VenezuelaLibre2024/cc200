.class public Lgc/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:J

.field public c:Ljava/nio/ShortBuffer;

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lgc/a;->a:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lgc/a;->b:J

    const/4 v0, 0x0

    iput-object v0, p0, Lgc/a;->c:Ljava/nio/ShortBuffer;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lgc/a;->d:Z

    return-void
.end method
