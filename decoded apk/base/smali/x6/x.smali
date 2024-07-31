.class public final Lx6/x;
.super Ly6/p0;
.source ""


# instance fields
.field public final synthetic a:Lx6/c$d;


# direct methods
.method public constructor <init>(Lx6/c;Lx6/c$d;)V
    .locals 0

    iput-object p2, p0, Lx6/x;->a:Lx6/c$d;

    invoke-direct {p0}, Ly6/p0;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(I)V
    .locals 1

    iget-object v0, p0, Lx6/x;->a:Lx6/c$d;

    invoke-interface {v0, p1}, Lx6/c$d;->onCameraMoveStarted(I)V

    return-void
.end method
