.class public final Ljd/g$a$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljd/g$a;->a(Ljd/g;Ljd/g;)Ljd/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/p<",
        "Ljd/g;",
        "Ljd/g$b;",
        "Ljd/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:Ljd/g$a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljd/g$a$a;

    invoke-direct {v0}, Ljd/g$a$a;-><init>()V

    sput-object v0, Ljd/g$a$a;->h:Ljd/g$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljd/g;Ljd/g$b;)Ljd/g;
    .locals 3

    const-string v0, "acc"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljd/g$b;->getKey()Ljd/g$c;

    move-result-object v0

    invoke-interface {p1, v0}, Ljd/g;->b0(Ljd/g$c;)Ljd/g;

    move-result-object p1

    sget-object v0, Ljd/h;->h:Ljd/h;

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Ljd/e;->e:Ljd/e$b;

    invoke-interface {p1, v1}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v2

    check-cast v2, Ljd/e;

    if-nez v2, :cond_1

    new-instance v0, Ljd/c;

    invoke-direct {v0, p1, p2}, Ljd/c;-><init>(Ljd/g;Ljd/g$b;)V

    :goto_0
    move-object p2, v0

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1}, Ljd/g;->b0(Ljd/g$c;)Ljd/g;

    move-result-object p1

    if-ne p1, v0, :cond_2

    new-instance p1, Ljd/c;

    invoke-direct {p1, p2, v2}, Ljd/c;-><init>(Ljd/g;Ljd/g$b;)V

    move-object p2, p1

    goto :goto_1

    :cond_2
    new-instance v0, Ljd/c;

    new-instance v1, Ljd/c;

    invoke-direct {v1, p1, p2}, Ljd/c;-><init>(Ljd/g;Ljd/g$b;)V

    invoke-direct {v0, v1, v2}, Ljd/c;-><init>(Ljd/g;Ljd/g$b;)V

    goto :goto_0

    :goto_1
    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljd/g;

    check-cast p2, Ljd/g$b;

    invoke-virtual {p0, p1, p2}, Ljd/g$a$a;->a(Ljd/g;Ljd/g$b;)Ljd/g;

    move-result-object p1

    return-object p1
.end method
