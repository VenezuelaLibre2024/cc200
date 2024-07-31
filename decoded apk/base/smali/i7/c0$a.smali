.class public Li7/c0$a;
.super Li7/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/c0;->i(Ljava/util/Iterator;Lh7/p;)Li7/d1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li7/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic j:Ljava/util/Iterator;

.field public final synthetic k:Lh7/p;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Lh7/p;)V
    .locals 0

    iput-object p1, p0, Li7/c0$a;->j:Ljava/util/Iterator;

    iput-object p2, p0, Li7/c0$a;->k:Lh7/p;

    invoke-direct {p0}, Li7/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, Li7/c0$a;->j:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Li7/c0$a;->j:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Li7/c0$a;->k:Lh7/p;

    invoke-interface {v1, v0}, Lh7/p;->apply(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Li7/b;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
