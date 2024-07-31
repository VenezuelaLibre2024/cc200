.class public final synthetic Lt7/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lt7/h;

.field public final synthetic i:Ls7/b;


# direct methods
.method public synthetic constructor <init>(Lt7/h;Ls7/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/g;->h:Lt7/h;

    iput-object p2, p0, Lt7/g;->i:Ls7/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lt7/g;->h:Lt7/h;

    iget-object v1, p0, Lt7/g;->i:Ls7/b;

    invoke-static {v0, v1}, Lt7/h;->f(Lt7/h;Ls7/b;)V

    return-void
.end method
