.class public final Lx6/m;
.super Ly6/o;
.source ""


# instance fields
.field public final synthetic a:Lx6/f;


# direct methods
.method public constructor <init>(Lx6/n;Lx6/f;)V
    .locals 0

    iput-object p2, p0, Lx6/m;->a:Lx6/f;

    invoke-direct {p0}, Ly6/o;-><init>()V

    return-void
.end method


# virtual methods
.method public final J(Ly6/b;)V
    .locals 1

    new-instance v0, Lx6/c;

    invoke-direct {v0, p1}, Lx6/c;-><init>(Ly6/b;)V

    iget-object p1, p0, Lx6/m;->a:Lx6/f;

    invoke-interface {p1, v0}, Lx6/f;->onMapReady(Lx6/c;)V

    return-void
.end method
