.class public final synthetic Ls3/q3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ls3/p3;


# direct methods
.method public synthetic constructor <init>(Ls3/p3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/q3;->h:Ls3/p3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ls3/q3;->h:Ls3/p3;

    invoke-static {v0}, Ls3/p3$c;->a(Ls3/p3;)V

    return-void
.end method
