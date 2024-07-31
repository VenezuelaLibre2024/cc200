.class public final synthetic Lp9/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lp9/e0;


# direct methods
.method public synthetic constructor <init>(Lp9/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/a0;->h:Lp9/e0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lp9/a0;->h:Lp9/e0;

    invoke-static {v0}, Lp9/e0;->f(Lp9/e0;)V

    return-void
.end method
