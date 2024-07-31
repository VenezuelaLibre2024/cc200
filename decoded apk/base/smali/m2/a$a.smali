.class public Lm2/a$a;
.super Lm2/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm2/a;->b(Ljava/util/UUID;Ld2/i;)Lm2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic i:Ld2/i;

.field public final synthetic j:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ld2/i;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Lm2/a$a;->i:Ld2/i;

    iput-object p2, p0, Lm2/a$a;->j:Ljava/util/UUID;

    invoke-direct {p0}, Lm2/a;-><init>()V

    return-void
.end method


# virtual methods
.method public h()V
    .locals 3

    iget-object v0, p0, Lm2/a$a;->i:Ld2/i;

    invoke-virtual {v0}, Ld2/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lo1/e;->c()V

    :try_start_0
    iget-object v1, p0, Lm2/a$a;->i:Ld2/i;

    iget-object v2, p0, Lm2/a$a;->j:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lm2/a;->a(Ld2/i;Ljava/lang/String;)V

    invoke-virtual {v0}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lo1/e;->g()V

    iget-object v0, p0, Lm2/a$a;->i:Ld2/i;

    invoke-virtual {p0, v0}, Lm2/a;->g(Ld2/i;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lo1/e;->g()V

    throw v1
.end method
