.class public final Ll1/a$a;
.super Ll1/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final b:Lm1/b;


# direct methods
.method public constructor <init>(Lm1/b;)V
    .locals 1

    const-string v0, "mMeasurementManager"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ll1/a;-><init>()V

    iput-object p1, p0, Ll1/a$a;->b:Lm1/b;

    return-void
.end method

.method public static final synthetic d(Ll1/a$a;)Lm1/b;
    .locals 0

    iget-object p0, p0, Ll1/a$a;->b:Lm1/b;

    return-object p0
.end method


# virtual methods
.method public b()Ll7/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll7/f<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lce/g1;->a()Lce/k0;

    move-result-object v0

    invoke-static {v0}, Lce/q0;->a(Ljd/g;)Lce/p0;

    move-result-object v1

    new-instance v4, Ll1/a$a$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Ll1/a$a$b;-><init>(Ll1/a$a;Ljd/d;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lce/i;->b(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/x0;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v0}, Lk1/b;->c(Lce/x0;Ljava/lang/Object;ILjava/lang/Object;)Ll7/f;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/net/Uri;)Ll7/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Ll7/f<",
            "Lgd/s;",
            ">;"
        }
    .end annotation

    const-string v0, "trigger"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lce/g1;->a()Lce/k0;

    move-result-object v0

    invoke-static {v0}, Lce/q0;->a(Ljd/g;)Lce/p0;

    move-result-object v1

    new-instance v4, Ll1/a$a$d;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Ll1/a$a$d;-><init>(Ll1/a$a;Landroid/net/Uri;Ljd/d;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lce/i;->b(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/x0;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lk1/b;->c(Lce/x0;Ljava/lang/Object;ILjava/lang/Object;)Ll7/f;

    move-result-object p1

    return-object p1
.end method

.method public e(Lm1/a;)Ll7/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm1/a;",
            ")",
            "Ll7/f<",
            "Lgd/s;",
            ">;"
        }
    .end annotation

    const-string v0, "deletionRequest"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lce/g1;->a()Lce/k0;

    move-result-object v0

    invoke-static {v0}, Lce/q0;->a(Ljd/g;)Lce/p0;

    move-result-object v1

    new-instance v4, Ll1/a$a$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Ll1/a$a$a;-><init>(Ll1/a$a;Lm1/a;Ljd/d;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lce/i;->b(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/x0;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lk1/b;->c(Lce/x0;Ljava/lang/Object;ILjava/lang/Object;)Ll7/f;

    move-result-object p1

    return-object p1
.end method

.method public f(Landroid/net/Uri;Landroid/view/InputEvent;)Ll7/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            ")",
            "Ll7/f<",
            "Lgd/s;",
            ">;"
        }
    .end annotation

    const-string v0, "attributionSource"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lce/g1;->a()Lce/k0;

    move-result-object v0

    invoke-static {v0}, Lce/q0;->a(Ljd/g;)Lce/p0;

    move-result-object v1

    new-instance v4, Ll1/a$a$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Ll1/a$a$c;-><init>(Ll1/a$a;Landroid/net/Uri;Landroid/view/InputEvent;Ljd/d;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lce/i;->b(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/x0;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, v0, p2, v0}, Lk1/b;->c(Lce/x0;Ljava/lang/Object;ILjava/lang/Object;)Ll7/f;

    move-result-object p1

    return-object p1
.end method

.method public g(Lm1/c;)Ll7/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm1/c;",
            ")",
            "Ll7/f<",
            "Lgd/s;",
            ">;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lce/g1;->a()Lce/k0;

    move-result-object v0

    invoke-static {v0}, Lce/q0;->a(Ljd/g;)Lce/p0;

    move-result-object v1

    new-instance v4, Ll1/a$a$e;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Ll1/a$a$e;-><init>(Ll1/a$a;Lm1/c;Ljd/d;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lce/i;->b(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/x0;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lk1/b;->c(Lce/x0;Ljava/lang/Object;ILjava/lang/Object;)Ll7/f;

    move-result-object p1

    return-object p1
.end method

.method public h(Lm1/d;)Ll7/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm1/d;",
            ")",
            "Ll7/f<",
            "Lgd/s;",
            ">;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lce/g1;->a()Lce/k0;

    move-result-object v0

    invoke-static {v0}, Lce/q0;->a(Ljd/g;)Lce/p0;

    move-result-object v1

    new-instance v4, Ll1/a$a$f;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Ll1/a$a$f;-><init>(Ll1/a$a;Lm1/d;Ljd/d;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lce/i;->b(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/x0;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lk1/b;->c(Lce/x0;Ljava/lang/Object;ILjava/lang/Object;)Ll7/f;

    move-result-object p1

    return-object p1
.end method
