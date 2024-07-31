.class public final Lx7/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lx7/w;


# direct methods
.method public constructor <init>(Lx7/w;)V
    .locals 0

    iput-object p1, p0, Lx7/v;->a:Lx7/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 2

    instance-of p1, p1, Ln7/o;

    if-eqz p1, :cond_0

    invoke-static {}, Lx7/t;->a()Lk6/a;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Failure to refresh token; scheduling refresh after failure"

    invoke-virtual {p1, v1, v0}, Lk6/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lx7/v;->a:Lx7/w;

    iget-object p1, p1, Lx7/w;->i:Lx7/t;

    invoke-virtual {p1}, Lx7/t;->d()V

    :cond_0
    return-void
.end method
