.class public final synthetic Lma/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lma/b;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(Lma/b;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lma/a;->h:Lma/b;

    iput-boolean p2, p0, Lma/a;->i:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lma/a;->h:Lma/b;

    iget-boolean v1, p0, Lma/a;->i:Z

    invoke-static {v0, v1}, Lma/b;->a(Lma/b;Z)V

    return-void
.end method
