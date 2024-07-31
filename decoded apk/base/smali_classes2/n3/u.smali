.class public final synthetic Ln3/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ln3/w;


# direct methods
.method public synthetic constructor <init>(Ln3/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/u;->h:Ln3/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ln3/u;->h:Ln3/w;

    invoke-static {v0}, Ln3/w;->b(Ln3/w;)V

    return-void
.end method
