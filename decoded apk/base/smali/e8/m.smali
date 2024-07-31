.class public Le8/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln9/b;


# instance fields
.field public final a:Le8/x;

.field public final b:Le8/l;


# direct methods
.method public constructor <init>(Le8/x;Lj8/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/m;->a:Le8/x;

    new-instance p1, Le8/l;

    invoke-direct {p1, p2}, Le8/l;-><init>(Lj8/f;)V

    iput-object p1, p0, Le8/m;->b:Le8/l;

    return-void
.end method


# virtual methods
.method public a(Ln9/b$b;)V
    .locals 3

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "App Quality Sessions session changed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    iget-object v0, p0, Le8/m;->b:Le8/l;

    invoke-virtual {p1}, Ln9/b$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le8/l;->h(Ljava/lang/String;)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Le8/m;->a:Le8/x;

    invoke-virtual {v0}, Le8/x;->d()Z

    move-result v0

    return v0
.end method

.method public c()Ln9/b$a;
    .locals 1

    sget-object v0, Ln9/b$a;->h:Ln9/b$a;

    return-object v0
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le8/m;->b:Le8/l;

    invoke-virtual {v0, p1}, Le8/l;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Le8/m;->b:Le8/l;

    invoke-virtual {v0, p1}, Le8/l;->i(Ljava/lang/String;)V

    return-void
.end method
