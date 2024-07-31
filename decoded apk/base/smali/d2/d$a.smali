.class public Ld2/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public h:Ld2/b;

.field public i:Ljava/lang/String;

.field public j:Ll7/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll7/f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ld2/b;Ljava/lang/String;Ll7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld2/b;",
            "Ljava/lang/String;",
            "Ll7/f<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld2/d$a;->h:Ld2/b;

    iput-object p2, p0, Ld2/d$a;->i:Ljava/lang/String;

    iput-object p3, p0, Ld2/d$a;->j:Ll7/f;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Ld2/d$a;->j:Ll7/f;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Ld2/d$a;->h:Ld2/b;

    iget-object v2, p0, Ld2/d$a;->i:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ld2/b;->c(Ljava/lang/String;Z)V

    return-void
.end method
