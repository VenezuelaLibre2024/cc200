.class public Lb8/k;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ly8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly8/a<",
            "Lk9/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ly8/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly8/a<",
            "Lk9/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/k;->a:Ly8/a;

    return-void
.end method

.method public static synthetic a(Lb8/e;Ly8/b;)V
    .locals 0

    invoke-static {p0, p1}, Lb8/k;->b(Lb8/e;Ly8/b;)V

    return-void
.end method

.method public static synthetic b(Lb8/e;Ly8/b;)V
    .locals 1

    invoke-interface {p1}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk9/a;

    const-string v0, "firebase"

    invoke-interface {p1, v0, p0}, Lk9/a;->a(Ljava/lang/String;Ll9/a;)V

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p0

    const-string p1, "Registering RemoteConfig Rollouts subscriber"

    invoke-virtual {p0, p1}, Lb8/g;->b(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Lf8/m;)V
    .locals 2

    if-nez p1, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string v0, "Didn\'t successfully register with UserMetadata for rollouts listener"

    invoke-virtual {p1, v0}, Lb8/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lb8/e;

    invoke-direct {v0, p1}, Lb8/e;-><init>(Lf8/m;)V

    iget-object p1, p0, Lb8/k;->a:Ly8/a;

    new-instance v1, Lb8/j;

    invoke-direct {v1, v0}, Lb8/j;-><init>(Lb8/e;)V

    invoke-interface {p1, v1}, Ly8/a;->a(Ly8/a$a;)V

    return-void
.end method
