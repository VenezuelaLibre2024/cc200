.class public Lh0/f$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh0/f;->d(Landroid/content/Context;Lh0/e;ILjava/util/concurrent/Executor;Lh0/a;)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj0/a<",
        "Lh0/f$e;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lh0/a;


# direct methods
.method public constructor <init>(Lh0/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lh0/f$b;->a:Lh0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lh0/f$e;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Lh0/f$e;

    const/4 v0, -0x3

    invoke-direct {p1, v0}, Lh0/f$e;-><init>(I)V

    :cond_0
    iget-object v0, p0, Lh0/f$b;->a:Lh0/a;

    invoke-virtual {v0, p1}, Lh0/a;->b(Lh0/f$e;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lh0/f$e;

    invoke-virtual {p0, p1}, Lh0/f$b;->a(Lh0/f$e;)V

    return-void
.end method
