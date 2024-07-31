.class public final Lc7/lb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public h:J

.field public i:J

.field public final synthetic j:Lc7/hb;


# direct methods
.method public constructor <init>(Lc7/hb;JJ)V
    .locals 0

    iput-object p1, p0, Lc7/lb;->j:Lc7/hb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lc7/lb;->h:J

    iput-wide p4, p0, Lc7/lb;->i:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc7/lb;->j:Lc7/hb;

    iget-object v0, v0, Lc7/hb;->b:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/kb;

    invoke-direct {v1, p0}, Lc7/kb;-><init>(Lc7/lb;)V

    invoke-virtual {v0, v1}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method
