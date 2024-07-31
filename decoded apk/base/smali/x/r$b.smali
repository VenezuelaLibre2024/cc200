.class public Lx/r$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/CharSequence;

.field public b:Landroidx/core/graphics/drawable/IconCompat;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lx/r;
    .locals 1

    new-instance v0, Lx/r;

    invoke-direct {v0, p0}, Lx/r;-><init>(Lx/r$b;)V

    return-object v0
.end method

.method public b(Z)Lx/r$b;
    .locals 0

    iput-boolean p1, p0, Lx/r$b;->e:Z

    return-object p0
.end method

.method public c(Landroidx/core/graphics/drawable/IconCompat;)Lx/r$b;
    .locals 0

    iput-object p1, p0, Lx/r$b;->b:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0
.end method

.method public d(Z)Lx/r$b;
    .locals 0

    iput-boolean p1, p0, Lx/r$b;->f:Z

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lx/r$b;
    .locals 0

    iput-object p1, p0, Lx/r$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/lang/CharSequence;)Lx/r$b;
    .locals 0

    iput-object p1, p0, Lx/r$b;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lx/r$b;
    .locals 0

    iput-object p1, p0, Lx/r$b;->c:Ljava/lang/String;

    return-object p0
.end method
