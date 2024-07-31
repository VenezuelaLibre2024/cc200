.class public final Lc9/a$b;
.super Lc9/d$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Lc9/f;

.field public e:Lc9/d$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc9/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lc9/d;
    .locals 8

    new-instance v7, Lc9/a;

    iget-object v1, p0, Lc9/a$b;->a:Ljava/lang/String;

    iget-object v2, p0, Lc9/a$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lc9/a$b;->c:Ljava/lang/String;

    iget-object v4, p0, Lc9/a$b;->d:Lc9/f;

    iget-object v5, p0, Lc9/a$b;->e:Lc9/d$b;

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lc9/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc9/f;Lc9/d$b;Lc9/a$a;)V

    return-object v7
.end method

.method public b(Lc9/f;)Lc9/d$a;
    .locals 0

    iput-object p1, p0, Lc9/a$b;->d:Lc9/f;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lc9/d$a;
    .locals 0

    iput-object p1, p0, Lc9/a$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lc9/d$a;
    .locals 0

    iput-object p1, p0, Lc9/a$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public e(Lc9/d$b;)Lc9/d$a;
    .locals 0

    iput-object p1, p0, Lc9/a$b;->e:Lc9/d$b;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lc9/d$a;
    .locals 0

    iput-object p1, p0, Lc9/a$b;->a:Ljava/lang/String;

    return-object p0
.end method
