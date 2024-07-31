.class public final synthetic Ly7/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ly7/c0;

.field public final synthetic i:Ly8/b;


# direct methods
.method public synthetic constructor <init>(Ly7/c0;Ly8/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/k;->h:Ly7/c0;

    iput-object p2, p0, Ly7/k;->i:Ly8/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly7/k;->h:Ly7/c0;

    iget-object v1, p0, Ly7/k;->i:Ly8/b;

    invoke-static {v0, v1}, Ly7/n;->k(Ly7/c0;Ly8/b;)V

    return-void
.end method
