.class public final synthetic Lu3/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lu3/s$a;

.field public final synthetic i:J


# direct methods
.method public synthetic constructor <init>(Lu3/s$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/j;->h:Lu3/s$a;

    iput-wide p2, p0, Lu3/j;->i:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lu3/j;->h:Lu3/s$a;

    iget-wide v1, p0, Lu3/j;->i:J

    invoke-static {v0, v1, v2}, Lu3/s$a;->h(Lu3/s$a;J)V

    return-void
.end method