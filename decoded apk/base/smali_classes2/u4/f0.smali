.class public final synthetic Lu4/f0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lu4/g0;

.field public final synthetic i:Lx3/z;


# direct methods
.method public synthetic constructor <init>(Lu4/g0;Lx3/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/f0;->h:Lu4/g0;

    iput-object p2, p0, Lu4/f0;->i:Lx3/z;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu4/f0;->h:Lu4/g0;

    iget-object v1, p0, Lu4/f0;->i:Lx3/z;

    invoke-static {v0, v1}, Lu4/g0;->w(Lu4/g0;Lx3/z;)V

    return-void
.end method
