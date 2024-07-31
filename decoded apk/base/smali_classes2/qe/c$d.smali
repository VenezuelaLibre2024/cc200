.class public final Lqe/c$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lhb/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqe/c;->y(Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lia/a;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Lqe/c;


# direct methods
.method public constructor <init>(Ljava/util/List;Lqe/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lia/a;",
            ">;",
            "Lqe/c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lqe/c$d;->a:Ljava/util/List;

    iput-object p2, p0, Lqe/c$d;->b:Lqe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lia/p;",
            ">;)V"
        }
    .end annotation

    const-string v0, "resultPoints"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lhb/b;)V
    .locals 4

    const-string v0, "result"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqe/c$d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lqe/c$d;->a:Ljava/util/List;

    invoke-virtual {p1}, Lhb/b;->a()Lia/a;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x3

    new-array v0, v0, [Lgd/j;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lhb/b;->e()Ljava/lang/String;

    move-result-object v2

    const-string v3, "code"

    invoke-static {v3, v2}, Lgd/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lgd/j;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1}, Lhb/b;->a()Lia/a;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    const-string v3, "type"

    invoke-static {v3, v2}, Lgd/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lgd/j;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p1}, Lhb/b;->c()[B

    move-result-object p1

    const-string v2, "rawBytes"

    invoke-static {v2, p1}, Lgd/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lgd/j;

    move-result-object p1

    aput-object p1, v0, v1

    invoke-static {v0}, Lhd/e0;->e([Lgd/j;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lqe/c$d;->b:Lqe/c;

    invoke-static {v0}, Lqe/c;->c(Lqe/c;)Lio/flutter/plugin/common/MethodChannel;

    move-result-object v0

    const-string v1, "onRecognizeQR"

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
