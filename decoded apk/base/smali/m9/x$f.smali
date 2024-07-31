.class public final Lm9/x$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfe/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/x;-><init>(Landroid/content/Context;Ljd/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfe/b<",
        "Lm9/l;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic h:Lfe/b;

.field public final synthetic i:Lm9/x;


# direct methods
.method public constructor <init>(Lfe/b;Lm9/x;)V
    .locals 0

    iput-object p1, p0, Lm9/x$f;->h:Lfe/b;

    iput-object p2, p0, Lm9/x$f;->i:Lm9/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lfe/c;Ljd/d;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lm9/x$f;->h:Lfe/b;

    new-instance v1, Lm9/x$f$a;

    iget-object v2, p0, Lm9/x$f;->i:Lm9/x;

    invoke-direct {v1, p1, v2}, Lm9/x$f$a;-><init>(Lfe/c;Lm9/x;)V

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
