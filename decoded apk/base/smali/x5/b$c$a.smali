.class public final Lx5/b$c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx5/b$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx5/b$c$a;->a:Z

    return-void
.end method


# virtual methods
.method public a()Lx5/b$c;
    .locals 3

    new-instance v0, Lx5/b$c;

    iget-boolean v1, p0, Lx5/b$c$a;->a:Z

    iget-object v2, p0, Lx5/b$c$a;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lx5/b$c;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method

.method public b(Z)Lx5/b$c$a;
    .locals 0

    iput-boolean p1, p0, Lx5/b$c$a;->a:Z

    return-object p0
.end method
