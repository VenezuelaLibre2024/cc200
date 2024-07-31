.class public final Lh9/b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lh9/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lh9/b$a;->a:Lh9/a;

    return-void
.end method


# virtual methods
.method public a()Lh9/b;
    .locals 2

    new-instance v0, Lh9/b;

    iget-object v1, p0, Lh9/b$a;->a:Lh9/a;

    invoke-direct {v0, v1}, Lh9/b;-><init>(Lh9/a;)V

    return-object v0
.end method

.method public b(Lh9/a;)Lh9/b$a;
    .locals 0

    iput-object p1, p0, Lh9/b$a;->a:Lh9/a;

    return-object p0
.end method
