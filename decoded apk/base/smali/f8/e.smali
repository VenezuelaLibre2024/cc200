.class public Lf8/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/e$b;
    }
.end annotation


# static fields
.field public static final c:Lf8/e$b;


# instance fields
.field public final a:Lj8/f;

.field public b:Lf8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf8/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf8/e$b;-><init>(Lf8/e$a;)V

    sput-object v0, Lf8/e;->c:Lf8/e$b;

    return-void
.end method

.method public constructor <init>(Lj8/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8/e;->a:Lj8/f;

    sget-object p1, Lf8/e;->c:Lf8/e$b;

    iput-object p1, p0, Lf8/e;->b:Lf8/c;

    return-void
.end method

.method public constructor <init>(Lj8/f;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lf8/e;-><init>(Lj8/f;)V

    invoke-virtual {p0, p2}, Lf8/e;->e(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lf8/e;->b:Lf8/c;

    invoke-interface {v0}, Lf8/c;->d()V

    return-void
.end method

.method public b()[B
    .locals 1

    iget-object v0, p0, Lf8/e;->b:Lf8/c;

    invoke-interface {v0}, Lf8/c;->c()[B

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf8/e;->b:Lf8/c;

    invoke-interface {v0}, Lf8/c;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    iget-object v0, p0, Lf8/e;->a:Lj8/f;

    const-string v1, "userlog"

    invoke-virtual {v0, p1, v1}, Lj8/f;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lf8/e;->b:Lf8/c;

    invoke-interface {v0}, Lf8/c;->a()V

    sget-object v0, Lf8/e;->c:Lf8/e$b;

    iput-object v0, p0, Lf8/e;->b:Lf8/c;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lf8/e;->d(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    const/high16 v0, 0x10000

    invoke-virtual {p0, p1, v0}, Lf8/e;->f(Ljava/io/File;I)V

    return-void
.end method

.method public f(Ljava/io/File;I)V
    .locals 1

    new-instance v0, Lf8/h;

    invoke-direct {v0, p1, p2}, Lf8/h;-><init>(Ljava/io/File;I)V

    iput-object v0, p0, Lf8/e;->b:Lf8/c;

    return-void
.end method

.method public g(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lf8/e;->b:Lf8/c;

    invoke-interface {v0, p1, p2, p3}, Lf8/c;->e(JLjava/lang/String;)V

    return-void
.end method
