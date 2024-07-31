.class public final Lr0/l$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/l;-><init>(Lce/p0;Lsd/l;Lsd/p;Lsd/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/l<",
        "Ljava/lang/Throwable;",
        "Lgd/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic h:Lsd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/l<",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Lr0/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/l<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic j:Lsd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/p<",
            "TT;",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsd/l;Lr0/l;Lsd/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;",
            "Lr0/l<",
            "TT;>;",
            "Lsd/p<",
            "-TT;-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr0/l$a;->h:Lsd/l;

    iput-object p2, p0, Lr0/l$a;->i:Lr0/l;

    iput-object p3, p0, Lr0/l$a;->j:Lsd/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lr0/l$a;->h:Lsd/l;

    invoke-interface {v0, p1}, Lsd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lr0/l$a;->i:Lr0/l;

    invoke-static {v0}, Lr0/l;->b(Lr0/l;)Lee/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lee/n;->b(Ljava/lang/Throwable;)Z

    :cond_0
    iget-object v0, p0, Lr0/l$a;->i:Lr0/l;

    invoke-static {v0}, Lr0/l;->b(Lr0/l;)Lee/d;

    move-result-object v0

    invoke-interface {v0}, Lee/m;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lee/g;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lr0/l$a;->j:Lsd/p;

    invoke-interface {v1, v0, p1}, Lsd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lgd/s;->a:Lgd/s;

    :goto_0
    if-nez v0, :cond_0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lr0/l$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
