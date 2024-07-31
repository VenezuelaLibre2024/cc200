.class public final synthetic Lu3/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lu3/s$a;

.field public final synthetic i:I

.field public final synthetic j:J

.field public final synthetic k:J


# direct methods
.method public synthetic constructor <init>(Lu3/s$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/i;->h:Lu3/s$a;

    iput p2, p0, Lu3/i;->i:I

    iput-wide p3, p0, Lu3/i;->j:J

    iput-wide p5, p0, Lu3/i;->k:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lu3/i;->h:Lu3/s$a;

    iget v1, p0, Lu3/i;->i:I

    iget-wide v2, p0, Lu3/i;->j:J

    iget-wide v4, p0, Lu3/i;->k:J

    invoke-static/range {v0 .. v5}, Lu3/s$a;->i(Lu3/s$a;IJJ)V

    return-void
.end method
