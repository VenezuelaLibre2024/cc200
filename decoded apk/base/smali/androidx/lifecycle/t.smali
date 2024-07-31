.class public final synthetic Landroidx/lifecycle/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Landroidx/lifecycle/u;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/t;->h:Landroidx/lifecycle/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/t;->h:Landroidx/lifecycle/u;

    invoke-static {v0}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/u;)V

    return-void
.end method
