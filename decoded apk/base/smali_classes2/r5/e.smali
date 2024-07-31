.class public final synthetic Lr5/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lr5/f;


# direct methods
.method public synthetic constructor <init>(Lr5/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/e;->h:Lr5/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lr5/e;->h:Lr5/f;

    invoke-static {v0}, Lr5/f;->a(Lr5/f;)V

    return-void
.end method
