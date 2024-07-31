.class public final Lc7/ya;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/ra;


# direct methods
.method public constructor <init>(Lc7/ra;)V
    .locals 0

    iput-object p1, p0, Lc7/ya;->h:Lc7/ra;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc7/ya;->h:Lc7/ra;

    iget-object v0, v0, Lc7/ra;->j:Lc7/y9;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lc7/y9;->E(Lc7/y9;Lc7/o4;)V

    iget-object v0, p0, Lc7/ya;->h:Lc7/ra;

    iget-object v0, v0, Lc7/ra;->j:Lc7/y9;

    invoke-static {v0}, Lc7/y9;->f0(Lc7/y9;)V

    return-void
.end method
