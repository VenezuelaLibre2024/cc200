.class public final Lx5/b$b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx5/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Z

.field public e:Ljava/lang/String;

.field public f:Ljava/util/List;

.field public g:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx5/b$b$a;->a:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lx5/b$b$a;->b:Ljava/lang/String;

    iput-object v1, p0, Lx5/b$b$a;->c:Ljava/lang/String;

    const/4 v2, 0x1

    iput-boolean v2, p0, Lx5/b$b$a;->d:Z

    iput-object v1, p0, Lx5/b$b$a;->e:Ljava/lang/String;

    iput-object v1, p0, Lx5/b$b$a;->f:Ljava/util/List;

    iput-boolean v0, p0, Lx5/b$b$a;->g:Z

    return-void
.end method


# virtual methods
.method public a()Lx5/b$b;
    .locals 9

    new-instance v8, Lx5/b$b;

    iget-boolean v1, p0, Lx5/b$b$a;->a:Z

    iget-object v2, p0, Lx5/b$b$a;->b:Ljava/lang/String;

    iget-object v3, p0, Lx5/b$b$a;->c:Ljava/lang/String;

    iget-boolean v4, p0, Lx5/b$b$a;->d:Z

    iget-object v5, p0, Lx5/b$b$a;->e:Ljava/lang/String;

    iget-object v6, p0, Lx5/b$b$a;->f:Ljava/util/List;

    iget-boolean v7, p0, Lx5/b$b$a;->g:Z

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lx5/b$b;-><init>(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Z)V

    return-object v8
.end method

.method public b(Z)Lx5/b$b$a;
    .locals 0

    iput-boolean p1, p0, Lx5/b$b$a;->a:Z

    return-object p0
.end method
