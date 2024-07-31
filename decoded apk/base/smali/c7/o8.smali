.class public final Lc7/o8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:J

.field public final synthetic k:Landroid/os/Bundle;

.field public final synthetic l:Z

.field public final synthetic m:Z

.field public final synthetic n:Z

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/o8;->h:Ljava/lang/String;

    iput-object p3, p0, Lc7/o8;->i:Ljava/lang/String;

    iput-wide p4, p0, Lc7/o8;->j:J

    iput-object p6, p0, Lc7/o8;->k:Landroid/os/Bundle;

    iput-boolean p7, p0, Lc7/o8;->l:Z

    iput-boolean p8, p0, Lc7/o8;->m:Z

    iput-boolean p9, p0, Lc7/o8;->n:Z

    iput-object p10, p0, Lc7/o8;->o:Ljava/lang/String;

    iput-object p1, p0, Lc7/o8;->p:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lc7/o8;->p:Lc7/w7;

    iget-object v1, p0, Lc7/o8;->h:Ljava/lang/String;

    iget-object v2, p0, Lc7/o8;->i:Ljava/lang/String;

    iget-wide v3, p0, Lc7/o8;->j:J

    iget-object v5, p0, Lc7/o8;->k:Landroid/os/Bundle;

    iget-boolean v6, p0, Lc7/o8;->l:Z

    iget-boolean v7, p0, Lc7/o8;->m:Z

    iget-boolean v8, p0, Lc7/o8;->n:Z

    iget-object v9, p0, Lc7/o8;->o:Ljava/lang/String;

    invoke-virtual/range {v0 .. v9}, Lc7/w7;->R(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    return-void
.end method
