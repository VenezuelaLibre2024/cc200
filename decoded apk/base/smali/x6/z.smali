.class public final Lx6/z;
.super Ly6/l0;
.source ""


# instance fields
.field public final synthetic a:Lx6/c$b;


# direct methods
.method public constructor <init>(Lx6/c;Lx6/c$b;)V
    .locals 0

    iput-object p2, p0, Lx6/z;->a:Lx6/c$b;

    invoke-direct {p0}, Ly6/l0;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb()V
    .locals 1

    iget-object v0, p0, Lx6/z;->a:Lx6/c$b;

    invoke-interface {v0}, Lx6/c$b;->onCameraIdle()V

    return-void
.end method
