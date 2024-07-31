.class public final Lz4/i;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:La5/f;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final b:La5/h;

.field public final c:La5/g;


# direct methods
.method public constructor <init>(La5/h;La5/g;)V
    .locals 13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/i;->b:La5/h;

    iput-object p2, p0, Lz4/i;->c:La5/g;

    new-instance p2, La5/f;

    iget-object v1, p1, La5/i;->a:Ljava/lang/String;

    iget-object v2, p1, La5/i;->b:Ljava/util/List;

    iget-object v3, p1, La5/h;->e:Ljava/util/List;

    iget-object v4, p1, La5/h;->f:Ljava/util/List;

    iget-object v5, p1, La5/h;->g:Ljava/util/List;

    iget-object v6, p1, La5/h;->h:Ljava/util/List;

    iget-object v7, p1, La5/h;->i:Ljava/util/List;

    iget-object v8, p1, La5/h;->j:Ls3/m1;

    iget-object v9, p1, La5/h;->k:Ljava/util/List;

    iget-boolean v10, p1, La5/i;->c:Z

    iget-object v11, p1, La5/h;->l:Ljava/util/Map;

    iget-object v12, p1, La5/h;->m:Ljava/util/List;

    move-object v0, p2

    invoke-direct/range {v0 .. v12}, La5/f;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ls3/m1;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    iput-object p2, p0, Lz4/i;->a:La5/f;

    return-void
.end method
