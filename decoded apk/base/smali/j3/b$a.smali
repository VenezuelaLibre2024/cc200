.class public final Lj3/b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lj3/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lj3/b$a;->a:Lj3/e;

    return-void
.end method


# virtual methods
.method public a()Lj3/b;
    .locals 2

    new-instance v0, Lj3/b;

    iget-object v1, p0, Lj3/b$a;->a:Lj3/e;

    invoke-direct {v0, v1}, Lj3/b;-><init>(Lj3/e;)V

    return-object v0
.end method

.method public b(Lj3/e;)Lj3/b$a;
    .locals 0

    iput-object p1, p0, Lj3/b$a;->a:Lj3/e;

    return-object p0
.end method
