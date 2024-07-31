.class public Lj/a$d;
.super Lj/a$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:Ly1/b;


# direct methods
.method public constructor <init>(Ly1/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lj/a$g;-><init>(Lj/a$a;)V

    iput-object p1, p0, Lj/a$d;->a:Ly1/b;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    iget-object v0, p0, Lj/a$d;->a:Ly1/b;

    invoke-virtual {v0}, Ly1/b;->start()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lj/a$d;->a:Ly1/b;

    invoke-virtual {v0}, Ly1/b;->stop()V

    return-void
.end method
