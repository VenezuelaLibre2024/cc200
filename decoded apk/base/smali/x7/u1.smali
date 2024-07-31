.class public final Lx7/u1;
.super Lx7/q1;
.source ""


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx7/q1;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lx7/q1;
    .locals 0

    iput-object p1, p0, Lx7/u1;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final b()Lx7/r1;
    .locals 5

    new-instance v0, Lx7/v1;

    iget-object v1, p0, Lx7/u1;->a:Ljava/lang/String;

    iget-object v2, p0, Lx7/u1;->b:Ljava/lang/String;

    iget-object v3, p0, Lx7/u1;->c:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lx7/v1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx7/x1;)V

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Lx7/q1;
    .locals 0

    iput-object p1, p0, Lx7/u1;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final d(Ljava/lang/String;)Lx7/q1;
    .locals 0

    iput-object p1, p0, Lx7/u1;->a:Ljava/lang/String;

    return-object p0
.end method
