.class public abstract Lhe/w$a;
.super Lhe/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhe/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhe/b<",
        "Lhe/w;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lhe/w;

.field public c:Lhe/w;


# direct methods
.method public constructor <init>(Lhe/w;)V
    .locals 0

    invoke-direct {p0}, Lhe/b;-><init>()V

    iput-object p1, p0, Lhe/w$a;->b:Lhe/w;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhe/w;

    invoke-virtual {p0, p1, p2}, Lhe/w$a;->e(Lhe/w;Ljava/lang/Object;)V

    return-void
.end method

.method public e(Lhe/w;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Lhe/w$a;->b:Lhe/w;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lhe/w$a;->c:Lhe/w;

    :goto_1
    if-eqz v0, :cond_2

    invoke-static {}, Lhe/w;->g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p1, p0, v0}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lhe/w$a;->b:Lhe/w;

    iget-object p2, p0, Lhe/w$a;->c:Lhe/w;

    invoke-static {p2}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Lhe/w;->f(Lhe/w;Lhe/w;)V

    :cond_2
    return-void
.end method
