.class public final synthetic Lu3/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lu3/s$a;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(Lu3/s$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/r;->h:Lu3/s$a;

    iput-boolean p2, p0, Lu3/r;->i:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu3/r;->h:Lu3/s$a;

    iget-boolean v1, p0, Lu3/r;->i:Z

    invoke-static {v0, v1}, Lu3/s$a;->a(Lu3/s$a;Z)V

    return-void
.end method
