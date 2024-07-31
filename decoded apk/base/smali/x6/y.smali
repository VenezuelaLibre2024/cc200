.class public final Lx6/y;
.super Ly6/n0;
.source ""


# instance fields
.field public final synthetic a:Lx6/c$c;


# direct methods
.method public constructor <init>(Lx6/c;Lx6/c$c;)V
    .locals 0

    iput-object p2, p0, Lx6/y;->a:Lx6/c$c;

    invoke-direct {p0}, Ly6/n0;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb()V
    .locals 1

    iget-object v0, p0, Lx6/y;->a:Lx6/c$c;

    invoke-interface {v0}, Lx6/c$c;->onCameraMove()V

    return-void
.end method
