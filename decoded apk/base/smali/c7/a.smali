.class public final Lc7/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:J

.field public final synthetic j:Lc7/b0;


# direct methods
.method public constructor <init>(Lc7/b0;Ljava/lang/String;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/a;->h:Ljava/lang/String;

    iput-wide p3, p0, Lc7/a;->i:J

    iput-object p1, p0, Lc7/a;->j:Lc7/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc7/a;->j:Lc7/b0;

    iget-object v1, p0, Lc7/a;->h:Ljava/lang/String;

    iget-wide v2, p0, Lc7/a;->i:J

    invoke-static {v0, v1, v2, v3}, Lc7/b0;->t(Lc7/b0;Ljava/lang/String;J)V

    return-void
.end method
