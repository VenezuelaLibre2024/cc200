.class public final synthetic Ly7/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ly7/x;

.field public final synthetic i:Ly8/b;


# direct methods
.method public synthetic constructor <init>(Ly7/x;Ly8/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/j;->h:Ly7/x;

    iput-object p2, p0, Ly7/j;->i:Ly8/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly7/j;->h:Ly7/x;

    iget-object v1, p0, Ly7/j;->i:Ly8/b;

    invoke-static {v0, v1}, Ly7/n;->j(Ly7/x;Ly8/b;)V

    return-void
.end method
