.class public final synthetic Lca/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lca/f$i;


# direct methods
.method public synthetic constructor <init>(Lca/f$i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca/g;->h:Lca/f$i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lca/g;->h:Lca/f$i;

    invoke-static {v0}, Lca/f$i;->a(Lca/f$i;)V

    return-void
.end method
