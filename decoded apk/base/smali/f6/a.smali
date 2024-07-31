.class public final Lf6/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf6/a$a;,
        Lf6/a$g;,
        Lf6/a$f;,
        Lf6/a$b;,
        Lf6/a$c;,
        Lf6/a$d;,
        Lf6/a$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lf6/a$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lf6/a$a;

.field public final b:Lf6/a$g;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lf6/a$f;",
            ">(",
            "Ljava/lang/String;",
            "Lf6/a$a<",
            "TC;TO;>;",
            "Lf6/a$g<",
            "TC;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Cannot construct an Api with a null ClientBuilder"

    invoke-static {p2, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Cannot construct an Api with a null ClientKey"

    invoke-static {p3, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lf6/a;->c:Ljava/lang/String;

    iput-object p2, p0, Lf6/a;->a:Lf6/a$a;

    iput-object p3, p0, Lf6/a;->b:Lf6/a$g;

    return-void
.end method


# virtual methods
.method public final a()Lf6/a$a;
    .locals 1

    iget-object v0, p0, Lf6/a;->a:Lf6/a$a;

    return-object v0
.end method

.method public final b()Lf6/a$c;
    .locals 1

    iget-object v0, p0, Lf6/a;->b:Lf6/a$g;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf6/a;->c:Ljava/lang/String;

    return-object v0
.end method
