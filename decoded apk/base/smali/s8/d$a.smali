.class public Ls8/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls8/d;->i()Lq8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ls8/d;


# direct methods
.method public constructor <init>(Ls8/d;)V
    .locals 0

    iput-object p1, p0, Ls8/d$a;->a:Ls8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/io/Writer;)V
    .locals 7

    new-instance v6, Ls8/e;

    iget-object v0, p0, Ls8/d$a;->a:Ls8/d;

    invoke-static {v0}, Ls8/d;->e(Ls8/d;)Ljava/util/Map;

    move-result-object v2

    iget-object v0, p0, Ls8/d$a;->a:Ls8/d;

    invoke-static {v0}, Ls8/d;->f(Ls8/d;)Ljava/util/Map;

    move-result-object v3

    iget-object v0, p0, Ls8/d$a;->a:Ls8/d;

    invoke-static {v0}, Ls8/d;->g(Ls8/d;)Lq8/e;

    move-result-object v4

    iget-object v0, p0, Ls8/d$a;->a:Ls8/d;

    invoke-static {v0}, Ls8/d;->h(Ls8/d;)Z

    move-result v5

    move-object v0, v6

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Ls8/e;-><init>(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;Lq8/e;Z)V

    const/4 p2, 0x0

    invoke-virtual {v6, p1, p2}, Ls8/e;->k(Ljava/lang/Object;Z)Ls8/e;

    invoke-virtual {v6}, Ls8/e;->u()V

    return-void
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1, v0}, Ls8/d$a;->a(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
