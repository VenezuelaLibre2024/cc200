.class public Lh6/c$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh6/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:Lh6/c;


# direct methods
.method public constructor <init>(Lh6/c;)V
    .locals 0

    iput-object p1, p0, Lh6/c$d;->a:Lh6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Le6/b;)V
    .locals 2

    invoke-virtual {p1}, Le6/b;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iget-object v0, p0, Lh6/c$d;->a:Lh6/c;

    invoke-virtual {v0}, Lh6/c;->getScopes()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lh6/c;->getRemoteService(Lh6/k;Ljava/util/Set;)V

    return-void

    :cond_0
    iget-object v0, p0, Lh6/c$d;->a:Lh6/c;

    invoke-static {v0}, Lh6/c;->zzc(Lh6/c;)Lh6/c$b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh6/c$d;->a:Lh6/c;

    invoke-static {v0}, Lh6/c;->zzc(Lh6/c;)Lh6/c$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lh6/c$b;->e(Le6/b;)V

    :cond_1
    return-void
.end method
