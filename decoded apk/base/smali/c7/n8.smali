.class public final Lc7/n8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:J

.field public final synthetic l:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/n8;->h:Ljava/lang/String;

    iput-object p3, p0, Lc7/n8;->i:Ljava/lang/String;

    iput-object p4, p0, Lc7/n8;->j:Ljava/lang/Object;

    iput-wide p5, p0, Lc7/n8;->k:J

    iput-object p1, p0, Lc7/n8;->l:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lc7/n8;->l:Lc7/w7;

    iget-object v1, p0, Lc7/n8;->h:Ljava/lang/String;

    iget-object v2, p0, Lc7/n8;->i:Ljava/lang/String;

    iget-object v3, p0, Lc7/n8;->j:Ljava/lang/Object;

    iget-wide v4, p0, Lc7/n8;->k:J

    invoke-virtual/range {v0 .. v5}, Lc7/w7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    return-void
.end method
