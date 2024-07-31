.class public final synthetic Lca/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx6/c$j;


# instance fields
.field public final synthetic h:Lca/f;


# direct methods
.method public synthetic constructor <init>(Lca/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca/e;->h:Lca/f;

    return-void
.end method


# virtual methods
.method public final onMarkerClick(Lz6/m;)Z
    .locals 1

    iget-object v0, p0, Lca/e;->h:Lca/f;

    invoke-static {v0, p1}, Lca/f;->b(Lca/f;Lz6/m;)Z

    move-result p1

    return p1
.end method
