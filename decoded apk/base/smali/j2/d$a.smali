.class public Lj2/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj2/d;->d(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lj2/d;


# direct methods
.method public constructor <init>(Lj2/d;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lj2/d$a;->i:Lj2/d;

    iput-object p2, p0, Lj2/d$a;->h:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lj2/d$a;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/a;

    iget-object v2, p0, Lj2/d$a;->i:Lj2/d;

    iget-object v2, v2, Lj2/d;->e:Ljava/lang/Object;

    invoke-interface {v1, v2}, Lh2/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method
