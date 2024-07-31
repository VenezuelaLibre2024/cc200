.class public final Lc7/jb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:J

.field public final synthetic i:Lc7/gb;


# direct methods
.method public constructor <init>(Lc7/gb;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-wide p2, p0, Lc7/jb;->h:J

    iput-object p1, p0, Lc7/jb;->i:Lc7/gb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/jb;->i:Lc7/gb;

    iget-wide v1, p0, Lc7/jb;->h:J

    invoke-static {v0, v1, v2}, Lc7/gb;->x(Lc7/gb;J)V

    return-void
.end method
