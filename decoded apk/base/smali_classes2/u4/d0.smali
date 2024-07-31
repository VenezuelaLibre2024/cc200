.class public final synthetic Lu4/d0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lu4/g0;


# direct methods
.method public synthetic constructor <init>(Lu4/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/d0;->h:Lu4/g0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lu4/d0;->h:Lu4/g0;

    invoke-static {v0}, Lu4/g0;->v(Lu4/g0;)V

    return-void
.end method
