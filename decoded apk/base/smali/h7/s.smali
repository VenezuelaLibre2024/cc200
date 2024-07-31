.class public final Lh7/s;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh7/s$b;,
        Lh7/s$c;
    }
.end annotation


# instance fields
.field public final a:Lh7/d;

.field public final b:Z

.field public final c:Lh7/s$c;

.field public final d:I


# direct methods
.method public constructor <init>(Lh7/s$c;)V
    .locals 3

    invoke-static {}, Lh7/d;->f()Lh7/d;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7fffffff

    invoke-direct {p0, p1, v1, v0, v2}, Lh7/s;-><init>(Lh7/s$c;ZLh7/d;I)V

    return-void
.end method

.method public constructor <init>(Lh7/s$c;ZLh7/d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/s;->c:Lh7/s$c;

    iput-boolean p2, p0, Lh7/s;->b:Z

    iput-object p3, p0, Lh7/s;->a:Lh7/d;

    iput p4, p0, Lh7/s;->d:I

    return-void
.end method

.method public static synthetic a(Lh7/s;)Lh7/d;
    .locals 0

    iget-object p0, p0, Lh7/s;->a:Lh7/d;

    return-object p0
.end method

.method public static synthetic b(Lh7/s;)Z
    .locals 0

    iget-boolean p0, p0, Lh7/s;->b:Z

    return p0
.end method

.method public static synthetic c(Lh7/s;)I
    .locals 0

    iget p0, p0, Lh7/s;->d:I

    return p0
.end method

.method public static d(C)Lh7/s;
    .locals 0

    invoke-static {p0}, Lh7/d;->d(C)Lh7/d;

    move-result-object p0

    invoke-static {p0}, Lh7/s;->e(Lh7/d;)Lh7/s;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lh7/d;)Lh7/s;
    .locals 2

    invoke-static {p0}, Lh7/o;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lh7/s;

    new-instance v1, Lh7/s$a;

    invoke-direct {v1, p0}, Lh7/s$a;-><init>(Lh7/d;)V

    invoke-direct {v0, v1}, Lh7/s;-><init>(Lh7/s$c;)V

    return-object v0
.end method


# virtual methods
.method public f(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh7/o;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lh7/s;->g(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lh7/s;->c:Lh7/s$c;

    invoke-interface {v0, p0, p1}, Lh7/s$c;->a(Lh7/s;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
