.class public final synthetic Ls3/r2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ls3/s2$a;

.field public final synthetic i:Landroid/util/Pair;

.field public final synthetic j:Lu4/n;

.field public final synthetic k:Lu4/q;

.field public final synthetic l:Ljava/io/IOException;

.field public final synthetic m:Z


# direct methods
.method public synthetic constructor <init>(Ls3/s2$a;Landroid/util/Pair;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/r2;->h:Ls3/s2$a;

    iput-object p2, p0, Ls3/r2;->i:Landroid/util/Pair;

    iput-object p3, p0, Ls3/r2;->j:Lu4/n;

    iput-object p4, p0, Ls3/r2;->k:Lu4/q;

    iput-object p5, p0, Ls3/r2;->l:Ljava/io/IOException;

    iput-boolean p6, p0, Ls3/r2;->m:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Ls3/r2;->h:Ls3/s2$a;

    iget-object v1, p0, Ls3/r2;->i:Landroid/util/Pair;

    iget-object v2, p0, Ls3/r2;->j:Lu4/n;

    iget-object v3, p0, Ls3/r2;->k:Lu4/q;

    iget-object v4, p0, Ls3/r2;->l:Ljava/io/IOException;

    iget-boolean v5, p0, Ls3/r2;->m:Z

    invoke-static/range {v0 .. v5}, Ls3/s2$a;->Q(Ls3/s2$a;Landroid/util/Pair;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V

    return-void
.end method
