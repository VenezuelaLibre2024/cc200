.class public final Lg3/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld3/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ld3/h<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lg3/p;

.field public final b:Ljava/lang/String;

.field public final c:Ld3/c;

.field public final d:Ld3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld3/g<",
            "TT;[B>;"
        }
    .end annotation
.end field

.field public final e:Lg3/t;


# direct methods
.method public constructor <init>(Lg3/p;Ljava/lang/String;Ld3/c;Ld3/g;Lg3/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg3/p;",
            "Ljava/lang/String;",
            "Ld3/c;",
            "Ld3/g<",
            "TT;[B>;",
            "Lg3/t;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg3/s;->a:Lg3/p;

    iput-object p2, p0, Lg3/s;->b:Ljava/lang/String;

    iput-object p3, p0, Lg3/s;->c:Ld3/c;

    iput-object p4, p0, Lg3/s;->d:Ld3/g;

    iput-object p5, p0, Lg3/s;->e:Lg3/t;

    return-void
.end method

.method public static synthetic c(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Lg3/s;->e(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic e(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Ld3/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld3/d<",
            "TT;>;)V"
        }
    .end annotation

    sget-object v0, Lg3/r;->a:Lg3/r;

    invoke-virtual {p0, p1, v0}, Lg3/s;->b(Ld3/d;Ld3/j;)V

    return-void
.end method

.method public b(Ld3/d;Ld3/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld3/d<",
            "TT;>;",
            "Ld3/j;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lg3/s;->e:Lg3/t;

    invoke-static {}, Lg3/o;->a()Lg3/o$a;

    move-result-object v1

    iget-object v2, p0, Lg3/s;->a:Lg3/p;

    invoke-virtual {v1, v2}, Lg3/o$a;->e(Lg3/p;)Lg3/o$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lg3/o$a;->c(Ld3/d;)Lg3/o$a;

    move-result-object p1

    iget-object v1, p0, Lg3/s;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lg3/o$a;->f(Ljava/lang/String;)Lg3/o$a;

    move-result-object p1

    iget-object v1, p0, Lg3/s;->d:Ld3/g;

    invoke-virtual {p1, v1}, Lg3/o$a;->d(Ld3/g;)Lg3/o$a;

    move-result-object p1

    iget-object v1, p0, Lg3/s;->c:Ld3/c;

    invoke-virtual {p1, v1}, Lg3/o$a;->b(Ld3/c;)Lg3/o$a;

    move-result-object p1

    invoke-virtual {p1}, Lg3/o$a;->a()Lg3/o;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lg3/t;->a(Lg3/o;Ld3/j;)V

    return-void
.end method

.method public d()Lg3/p;
    .locals 1

    iget-object v0, p0, Lg3/s;->a:Lg3/p;

    return-object v0
.end method
