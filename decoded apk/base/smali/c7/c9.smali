.class public final Lc7/c9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/n7;

.field public final synthetic i:J

.field public final synthetic j:J

.field public final synthetic k:Z

.field public final synthetic l:Lc7/n7;

.field public final synthetic m:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;Lc7/n7;JJZLc7/n7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/c9;->h:Lc7/n7;

    iput-wide p3, p0, Lc7/c9;->i:J

    iput-wide p5, p0, Lc7/c9;->j:J

    iput-boolean p7, p0, Lc7/c9;->k:Z

    iput-object p8, p0, Lc7/c9;->l:Lc7/n7;

    iput-object p1, p0, Lc7/c9;->m:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lc7/c9;->m:Lc7/w7;

    iget-object v1, p0, Lc7/c9;->h:Lc7/n7;

    invoke-virtual {v0, v1}, Lc7/w7;->F(Lc7/n7;)V

    iget-object v0, p0, Lc7/c9;->m:Lc7/w7;

    iget-wide v1, p0, Lc7/c9;->i:J

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lc7/w7;->z(JZ)V

    iget-object v4, p0, Lc7/c9;->m:Lc7/w7;

    iget-object v5, p0, Lc7/c9;->h:Lc7/n7;

    iget-wide v6, p0, Lc7/c9;->j:J

    iget-boolean v9, p0, Lc7/c9;->k:Z

    const/4 v8, 0x1

    invoke-static/range {v4 .. v9}, Lc7/w7;->J(Lc7/w7;Lc7/n7;JZZ)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpt;->zza()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/c9;->m:Lc7/w7;

    invoke-virtual {v0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v1, Lc7/i0;->s0:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/c9;->m:Lc7/w7;

    iget-object v1, p0, Lc7/c9;->h:Lc7/n7;

    iget-object v2, p0, Lc7/c9;->l:Lc7/n7;

    invoke-static {v0, v1, v2}, Lc7/w7;->K(Lc7/w7;Lc7/n7;Lc7/n7;)V

    :cond_0
    return-void
.end method
