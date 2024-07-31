.class public final synthetic Lu3/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lu3/s$a;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:J

.field public final synthetic k:J


# direct methods
.method public synthetic constructor <init>(Lu3/s$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/n;->h:Lu3/s$a;

    iput-object p2, p0, Lu3/n;->i:Ljava/lang/String;

    iput-wide p3, p0, Lu3/n;->j:J

    iput-wide p5, p0, Lu3/n;->k:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lu3/n;->h:Lu3/s$a;

    iget-object v1, p0, Lu3/n;->i:Ljava/lang/String;

    iget-wide v2, p0, Lu3/n;->j:J

    iget-wide v4, p0, Lu3/n;->k:J

    invoke-static/range {v0 .. v5}, Lu3/s$a;->f(Lu3/s$a;Ljava/lang/String;JJ)V

    return-void
.end method
