.class public final Lg6/i0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lg6/j0;


# direct methods
.method public constructor <init>(Lg6/j0;)V
    .locals 0

    iput-object p1, p0, Lg6/i0;->h:Lg6/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lg6/i0;->h:Lg6/j0;

    iget-object v0, v0, Lg6/j0;->a:Lg6/k0;

    invoke-static {v0}, Lg6/k0;->u(Lg6/k0;)Lf6/a$f;

    move-result-object v1

    invoke-static {v0}, Lg6/k0;->u(Lg6/k0;)Lf6/a$f;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, " disconnecting because it was signed out."

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lf6/a$f;->disconnect(Ljava/lang/String;)V

    return-void
.end method
