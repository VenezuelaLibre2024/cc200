.class public final Lc7/ka;
.super Lc7/u;
.source ""


# instance fields
.field public final synthetic e:Lc7/y9;


# direct methods
.method public constructor <init>(Lc7/y9;Lc7/l7;)V
    .locals 0

    iput-object p1, p0, Lc7/ka;->e:Lc7/y9;

    invoke-direct {p0, p2}, Lc7/u;-><init>(Lc7/l7;)V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    iget-object v0, p0, Lc7/ka;->e:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    const-string v1, "Tasks have been queued for a long time"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void
.end method
