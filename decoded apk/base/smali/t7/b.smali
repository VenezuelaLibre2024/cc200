.class public final Lt7/b;
.super Ls7/c;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ln7/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln7/m;)V
    .locals 0

    invoke-direct {p0}, Ls7/c;-><init>()V

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, Lt7/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lt7/b;->b:Ln7/m;

    return-void
.end method

.method public static c(Ls7/b;)Lt7/b;
    .locals 2

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lt7/b;

    invoke-virtual {p0}, Ls7/b;->b()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt7/b;-><init>(Ljava/lang/String;Ln7/m;)V

    return-object v0
.end method

.method public static d(Ln7/m;)Lt7/b;
    .locals 2

    new-instance v0, Lt7/b;

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln7/m;

    const-string v1, "eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ=="

    invoke-direct {v0, v1, p0}, Lt7/b;-><init>(Ljava/lang/String;Ln7/m;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lt7/b;->b:Ln7/m;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt7/b;->a:Ljava/lang/String;

    return-object v0
.end method
