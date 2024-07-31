.class public final Lr0/m$g$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfe/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/m$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfe/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic h:Lfe/b;


# direct methods
.method public constructor <init>(Lfe/b;)V
    .locals 0

    iput-object p1, p0, Lr0/m$g$b;->h:Lfe/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lfe/c;Ljd/d;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lr0/m$g$b;->h:Lfe/b;

    new-instance v1, Lr0/m$g$b$a;

    invoke-direct {v1, p1}, Lr0/m$g$b$a;-><init>(Lfe/c;)V

    invoke-interface {v0, v1, p2}, Lfe/b;->a(Lfe/c;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
