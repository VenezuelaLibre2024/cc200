.class public final synthetic Lib/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lib/g;

.field public final synthetic i:Lib/p;


# direct methods
.method public synthetic constructor <init>(Lib/g;Lib/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lib/e;->h:Lib/g;

    iput-object p2, p0, Lib/e;->i:Lib/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lib/e;->h:Lib/g;

    iget-object v1, p0, Lib/e;->i:Lib/p;

    invoke-static {v0, v1}, Lib/g;->c(Lib/g;Lib/p;)V

    return-void
.end method
