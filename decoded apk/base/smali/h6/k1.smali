.class public final Lh6/k1;
.super Lh6/v0;
.source ""


# instance fields
.field public final synthetic g:Lh6/c;


# direct methods
.method public constructor <init>(Lh6/c;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lh6/k1;->g:Lh6/c;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lh6/v0;-><init>(Lh6/c;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final f(Le6/b;)V
    .locals 1

    iget-object v0, p0, Lh6/k1;->g:Lh6/c;

    invoke-virtual {v0}, Lh6/c;->enableLocalFallback()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh6/k1;->g:Lh6/c;

    invoke-static {v0}, Lh6/c;->zzo(Lh6/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lh6/k1;->g:Lh6/c;

    const/16 v0, 0x10

    invoke-static {p1, v0}, Lh6/c;->zzk(Lh6/c;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lh6/k1;->g:Lh6/c;

    iget-object v0, v0, Lh6/c;->zzc:Lh6/c$c;

    invoke-interface {v0, p1}, Lh6/c$c;->b(Le6/b;)V

    iget-object v0, p0, Lh6/k1;->g:Lh6/c;

    invoke-virtual {v0, p1}, Lh6/c;->onConnectionFailed(Le6/b;)V

    return-void
.end method

.method public final g()Z
    .locals 2

    iget-object v0, p0, Lh6/k1;->g:Lh6/c;

    iget-object v0, v0, Lh6/c;->zzc:Lh6/c$c;

    sget-object v1, Le6/b;->l:Le6/b;

    invoke-interface {v0, v1}, Lh6/c$c;->b(Le6/b;)V

    const/4 v0, 0x1

    return v0
.end method
