.class public final Lc7/t7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc7/t4;


# instance fields
.field public final synthetic a:Lc7/k6;


# direct methods
.method public constructor <init>(Lc7/u7;Lc7/k6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/t7;->a:Lc7/k6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 2

    iget-object v0, p0, Lc7/t7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/t7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lc7/v4;->x(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
