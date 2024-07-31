.class public final synthetic Lib/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lib/g;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(Lib/g;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lib/f;->h:Lib/g;

    iput-boolean p2, p0, Lib/f;->i:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lib/f;->h:Lib/g;

    iget-boolean v1, p0, Lib/f;->i:Z

    invoke-static {v0, v1}, Lib/g;->b(Lib/g;Z)V

    return-void
.end method
