.class public final synthetic Lu3/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lu3/s$a;

.field public final synthetic i:Lv3/e;


# direct methods
.method public synthetic constructor <init>(Lu3/s$a;Lv3/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/q;->h:Lu3/s$a;

    iput-object p2, p0, Lu3/q;->i:Lv3/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu3/q;->h:Lu3/s$a;

    iget-object v1, p0, Lu3/q;->i:Lv3/e;

    invoke-static {v0, v1}, Lu3/s$a;->j(Lu3/s$a;Lv3/e;)V

    return-void
.end method
