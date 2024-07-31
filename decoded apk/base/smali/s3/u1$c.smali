.class public final Ls3/u1$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/net/Uri;

.field public c:Ljava/lang/String;

.field public d:Ls3/u1$d$a;

.field public e:Ls3/u1$f$a;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lt4/c;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/lang/String;

.field public h:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Ls3/u1$l;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ls3/u1$b;

.field public j:Ljava/lang/Object;

.field public k:Ls3/z1;

.field public l:Ls3/u1$g$a;

.field public m:Ls3/u1$j;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls3/u1$d$a;

    invoke-direct {v0}, Ls3/u1$d$a;-><init>()V

    iput-object v0, p0, Ls3/u1$c;->d:Ls3/u1$d$a;

    new-instance v0, Ls3/u1$f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls3/u1$f$a;-><init>(Ls3/u1$a;)V

    iput-object v0, p0, Ls3/u1$c;->e:Ls3/u1$f$a;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ls3/u1$c;->f:Ljava/util/List;

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v0

    iput-object v0, p0, Ls3/u1$c;->h:Li7/u;

    new-instance v0, Ls3/u1$g$a;

    invoke-direct {v0}, Ls3/u1$g$a;-><init>()V

    iput-object v0, p0, Ls3/u1$c;->l:Ls3/u1$g$a;

    sget-object v0, Ls3/u1$j;->k:Ls3/u1$j;

    iput-object v0, p0, Ls3/u1$c;->m:Ls3/u1$j;

    return-void
.end method

.method public constructor <init>(Ls3/u1;)V
    .locals 1

    invoke-direct {p0}, Ls3/u1$c;-><init>()V

    iget-object v0, p1, Ls3/u1;->m:Ls3/u1$d;

    invoke-virtual {v0}, Ls3/u1$d;->b()Ls3/u1$d$a;

    move-result-object v0

    iput-object v0, p0, Ls3/u1$c;->d:Ls3/u1$d$a;

    iget-object v0, p1, Ls3/u1;->h:Ljava/lang/String;

    iput-object v0, p0, Ls3/u1$c;->a:Ljava/lang/String;

    iget-object v0, p1, Ls3/u1;->l:Ls3/z1;

    iput-object v0, p0, Ls3/u1$c;->k:Ls3/z1;

    iget-object v0, p1, Ls3/u1;->k:Ls3/u1$g;

    invoke-virtual {v0}, Ls3/u1$g;->b()Ls3/u1$g$a;

    move-result-object v0

    iput-object v0, p0, Ls3/u1$c;->l:Ls3/u1$g$a;

    iget-object v0, p1, Ls3/u1;->o:Ls3/u1$j;

    iput-object v0, p0, Ls3/u1$c;->m:Ls3/u1$j;

    iget-object p1, p1, Ls3/u1;->i:Ls3/u1$h;

    if-eqz p1, :cond_1

    iget-object v0, p1, Ls3/u1$h;->f:Ljava/lang/String;

    iput-object v0, p0, Ls3/u1$c;->g:Ljava/lang/String;

    iget-object v0, p1, Ls3/u1$h;->b:Ljava/lang/String;

    iput-object v0, p0, Ls3/u1$c;->c:Ljava/lang/String;

    iget-object v0, p1, Ls3/u1$h;->a:Landroid/net/Uri;

    iput-object v0, p0, Ls3/u1$c;->b:Landroid/net/Uri;

    iget-object v0, p1, Ls3/u1$h;->e:Ljava/util/List;

    iput-object v0, p0, Ls3/u1$c;->f:Ljava/util/List;

    iget-object v0, p1, Ls3/u1$h;->g:Li7/u;

    iput-object v0, p0, Ls3/u1$c;->h:Li7/u;

    iget-object v0, p1, Ls3/u1$h;->i:Ljava/lang/Object;

    iput-object v0, p0, Ls3/u1$c;->j:Ljava/lang/Object;

    iget-object p1, p1, Ls3/u1$h;->c:Ls3/u1$f;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ls3/u1$f;->b()Ls3/u1$f$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ls3/u1$f$a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ls3/u1$f$a;-><init>(Ls3/u1$a;)V

    :goto_0
    iput-object p1, p0, Ls3/u1$c;->e:Ls3/u1$f$a;

    :cond_1
    return-void
.end method

.method public synthetic constructor <init>(Ls3/u1;Ls3/u1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/u1$c;-><init>(Ls3/u1;)V

    return-void
.end method


# virtual methods
.method public a()Ls3/u1;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Ls3/u1$c;->e:Ls3/u1$f$a;

    invoke-static {v1}, Ls3/u1$f$a;->e(Ls3/u1$f$a;)Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Ls3/u1$c;->e:Ls3/u1$f$a;

    invoke-static {v1}, Ls3/u1$f$a;->f(Ls3/u1$f$a;)Ljava/util/UUID;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lp5/a;->f(Z)V

    iget-object v3, v0, Ls3/u1$c;->b:Landroid/net/Uri;

    const/4 v1, 0x0

    if-eqz v3, :cond_3

    new-instance v12, Ls3/u1$i;

    iget-object v4, v0, Ls3/u1$c;->c:Ljava/lang/String;

    iget-object v2, v0, Ls3/u1$c;->e:Ls3/u1$f$a;

    invoke-static {v2}, Ls3/u1$f$a;->f(Ls3/u1$f$a;)Ljava/util/UUID;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v1, v0, Ls3/u1$c;->e:Ls3/u1$f$a;

    invoke-virtual {v1}, Ls3/u1$f$a;->i()Ls3/u1$f;

    move-result-object v1

    :cond_2
    move-object v5, v1

    iget-object v6, v0, Ls3/u1$c;->i:Ls3/u1$b;

    iget-object v7, v0, Ls3/u1$c;->f:Ljava/util/List;

    iget-object v8, v0, Ls3/u1$c;->g:Ljava/lang/String;

    iget-object v9, v0, Ls3/u1$c;->h:Li7/u;

    iget-object v10, v0, Ls3/u1$c;->j:Ljava/lang/Object;

    const/4 v11, 0x0

    move-object v2, v12

    invoke-direct/range {v2 .. v11}, Ls3/u1$i;-><init>(Landroid/net/Uri;Ljava/lang/String;Ls3/u1$f;Ls3/u1$b;Ljava/util/List;Ljava/lang/String;Li7/u;Ljava/lang/Object;Ls3/u1$a;)V

    move-object/from16 v16, v12

    goto :goto_2

    :cond_3
    move-object/from16 v16, v1

    :goto_2
    new-instance v1, Ls3/u1;

    iget-object v2, v0, Ls3/u1$c;->a:Ljava/lang/String;

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    const-string v2, ""

    :goto_3
    move-object v14, v2

    iget-object v2, v0, Ls3/u1$c;->d:Ls3/u1$d$a;

    invoke-virtual {v2}, Ls3/u1$d$a;->g()Ls3/u1$e;

    move-result-object v15

    iget-object v2, v0, Ls3/u1$c;->l:Ls3/u1$g$a;

    invoke-virtual {v2}, Ls3/u1$g$a;->f()Ls3/u1$g;

    move-result-object v17

    iget-object v2, v0, Ls3/u1$c;->k:Ls3/z1;

    if-eqz v2, :cond_5

    goto :goto_4

    :cond_5
    sget-object v2, Ls3/z1;->P:Ls3/z1;

    :goto_4
    move-object/from16 v18, v2

    iget-object v2, v0, Ls3/u1$c;->m:Ls3/u1$j;

    const/16 v20, 0x0

    move-object v13, v1

    move-object/from16 v19, v2

    invoke-direct/range {v13 .. v20}, Ls3/u1;-><init>(Ljava/lang/String;Ls3/u1$e;Ls3/u1$i;Ls3/u1$g;Ls3/z1;Ls3/u1$j;Ls3/u1$a;)V

    return-object v1
.end method

.method public b(Ljava/lang/String;)Ls3/u1$c;
    .locals 0

    iput-object p1, p0, Ls3/u1$c;->g:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Ls3/u1$c;
    .locals 0

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Ls3/u1$c;->a:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/Object;)Ls3/u1$c;
    .locals 0

    iput-object p1, p0, Ls3/u1$c;->j:Ljava/lang/Object;

    return-object p0
.end method

.method public e(Landroid/net/Uri;)Ls3/u1$c;
    .locals 0

    iput-object p1, p0, Ls3/u1$c;->b:Landroid/net/Uri;

    return-object p0
.end method
