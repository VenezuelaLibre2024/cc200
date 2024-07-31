.class public final Lvd/b;
.super Lvd/a;
.source ""


# instance fields
.field public final j:Lvd/b$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lvd/a;-><init>()V

    new-instance v0, Lvd/b$a;

    invoke-direct {v0}, Lvd/b$a;-><init>()V

    iput-object v0, p0, Lvd/b;->j:Lvd/b$a;

    return-void
.end method


# virtual methods
.method public c()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, Lvd/b;->j:Lvd/b$a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "implStorage.get()"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
