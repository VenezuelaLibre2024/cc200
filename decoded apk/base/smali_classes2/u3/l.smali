.class public final synthetic Lu3/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lu3/s$a;

.field public final synthetic i:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lu3/s$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/l;->h:Lu3/s$a;

    iput-object p2, p0, Lu3/l;->i:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu3/l;->h:Lu3/s$a;

    iget-object v1, p0, Lu3/l;->i:Ljava/lang/Exception;

    invoke-static {v0, v1}, Lu3/s$a;->d(Lu3/s$a;Ljava/lang/Exception;)V

    return-void
.end method
