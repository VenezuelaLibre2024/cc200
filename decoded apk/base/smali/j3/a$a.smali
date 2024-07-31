.class public final Lj3/a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lj3/f;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj3/d;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lj3/b;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lj3/a$a;->a:Lj3/f;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lj3/a$a;->b:Ljava/util/List;

    iput-object v0, p0, Lj3/a$a;->c:Lj3/b;

    const-string v0, ""

    iput-object v0, p0, Lj3/a$a;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lj3/d;)Lj3/a$a;
    .locals 1

    iget-object v0, p0, Lj3/a$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Lj3/a;
    .locals 5

    new-instance v0, Lj3/a;

    iget-object v1, p0, Lj3/a$a;->a:Lj3/f;

    iget-object v2, p0, Lj3/a$a;->b:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lj3/a$a;->c:Lj3/b;

    iget-object v4, p0, Lj3/a$a;->d:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lj3/a;-><init>(Lj3/f;Ljava/util/List;Lj3/b;Ljava/lang/String;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lj3/a$a;
    .locals 0

    iput-object p1, p0, Lj3/a$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public d(Lj3/b;)Lj3/a$a;
    .locals 0

    iput-object p1, p0, Lj3/a$a;->c:Lj3/b;

    return-object p0
.end method

.method public e(Lj3/f;)Lj3/a$a;
    .locals 0

    iput-object p1, p0, Lj3/a$a;->a:Lj3/f;

    return-object p0
.end method
