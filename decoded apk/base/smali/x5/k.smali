.class public final Lx5/k;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final c(Lx5/l;)Lx5/k;
    .locals 1

    invoke-virtual {p0}, Lx5/l;->b()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lx5/k;

    invoke-direct {v0}, Lx5/k;-><init>()V

    if-eqz p0, :cond_0

    invoke-static {p0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lx5/k;->a:Ljava/lang/String;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lx5/k;
    .locals 0

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lx5/k;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final b()Lx5/l;
    .locals 2

    new-instance v0, Lx5/l;

    iget-object v1, p0, Lx5/k;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Lx5/l;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
